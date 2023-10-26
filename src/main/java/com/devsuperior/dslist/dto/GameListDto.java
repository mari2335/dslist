package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

import java.util.Objects;

public class GameListDto {

    private Long id;
    private String name;

    public GameListDto() {}

    public GameListDto(GameList list) {
        this.id = list.getId();
        this.name = list.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameListDto that = (GameListDto) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

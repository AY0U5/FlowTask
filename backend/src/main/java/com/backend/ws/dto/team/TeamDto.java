package com.backend.ws.dto.team;

import java.util.List;


public class TeamDto {

    private Long id;
    private String name;
    private List<TeamUserDto> teamUsers;

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

    public List<TeamUserDto> getTeamUsers() {
        return teamUsers;
    }

    public void setTeamUsers(List<TeamUserDto> teamUsers) {
        this.teamUsers = teamUsers;
    }
}

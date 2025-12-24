package com.backend.ws.dto.chat;

import com.backend.ws.dto.team.TeamDto;

import java.util.List;

public class ChatDto {

    private Long id;
    private TeamDto team;
    private List<MessageDto> messages;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TeamDto getTeam() {
        return team;
    }

    public void setTeam(TeamDto team) {
        this.team = team;
    }

    public List<MessageDto> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageDto> messages) {
        this.messages = messages;
    }
}

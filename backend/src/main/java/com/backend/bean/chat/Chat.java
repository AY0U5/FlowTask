package com.backend.bean.chat;

import com.backend.bean.team.Team;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Chat {

    @Id
    @SequenceGenerator(name = "chat_sequence", sequenceName = "chat_sequence", allocationSize = 1)
    @GeneratedValue(generator = "chat_sequence",strategy = GenerationType.SEQUENCE)
    private Long id;
    @OneToOne
    private Team team;
    @OneToMany
    private List<Message> messages;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}

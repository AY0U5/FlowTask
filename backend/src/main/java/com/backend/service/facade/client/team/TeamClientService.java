package com.backend.service.facade.client.team;

import com.backend.bean.team.Team;
import com.backend.security.bean.User;

public interface TeamClientService {
    Team initializedTeam();

    Team addMember(Team team, User user);
}

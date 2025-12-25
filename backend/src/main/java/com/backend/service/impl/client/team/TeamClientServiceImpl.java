package com.backend.service.impl.client.team;

import com.backend.bean.team.Team;
import com.backend.bean.team.TeamUser;
import com.backend.dao.team.TeamDao;
import com.backend.security.bean.User;
import com.backend.service.facade.client.team.TeamClientService;
import com.backend.service.facade.client.team.TeamUserClientService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamClientServiceImpl implements TeamClientService {

    private final TeamDao dao;
    private final TeamUserClientService teamUserClientService;

    public TeamClientServiceImpl(
            TeamDao dao,
            TeamUserClientService teamUserClientService
    ) {
        this.dao = dao;
        this.teamUserClientService = teamUserClientService;
    }

    @Override
    public Team initializedTeam() {
        Team team = new Team("Untitled Team");
        dao.save(team);
        List<TeamUser> teamUsers = new ArrayList<>();
        TeamUser owner = teamUserClientService.addOwner(team);
        teamUsers.add(owner);
        team.setTeamUsers(teamUsers);
        return dao.save(team);
    }

    @Override
    public Team addMember(Team team, User user){
        Team teamById = dao.findById(team.getId()).orElse(null);
        TeamUser member = teamUserClientService.addMember(team,user);
        List<TeamUser> list = null;
        if (teamById != null) {
            list = teamById.getTeamUsers();
        }
        if (list != null) {
            list.add(member);
        }
        if (teamById != null) {
            teamById.setTeamUsers(list);
            return dao.save(teamById);
        }
        return null;
    }
}

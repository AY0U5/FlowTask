package com.backend.service.impl.client.team;

import com.backend.dao.team.TeamDao;
import com.backend.service.facade.client.team.TeamClientService;
import org.springframework.stereotype.Service;

@Service
public class TeamClientServiceImpl implements TeamClientService {

    private final TeamDao dao;

    public TeamClientServiceImpl(TeamDao dao) {
        this.dao = dao;
    }

}

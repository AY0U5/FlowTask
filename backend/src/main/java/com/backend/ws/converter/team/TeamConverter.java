package com.backend.ws.converter.team;

import com.backend.bean.team.Team;
import com.backend.ws.dto.team.TeamDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class TeamConverter {

    public Team toBean(TeamDto dto){
        if (dto == null) {
            return null;
        }
        Team bean = new Team();
        BeanUtils.copyProperties(dto,bean);
        return bean;
    }

    public TeamDto toDto(Team bean){
        if (bean == null) {
            return null;
        }
        TeamDto dto = new TeamDto();
        BeanUtils.copyProperties(bean,dto);
        return dto;
    }
}

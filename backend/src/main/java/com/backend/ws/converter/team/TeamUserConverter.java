package com.backend.ws.converter.team;

import com.backend.bean.team.TeamUser;
import com.backend.ws.dto.team.TeamUserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class TeamUserConverter {

    public TeamUser toBean(TeamUserDto dto){
        if (dto == null) {
            return null;
        }
        TeamUser bean = new TeamUser();
        BeanUtils.copyProperties(dto,bean);
        return bean;
    }

    public TeamUserDto toDto(TeamUser bean){
        if (bean == null) {
            return null;
        }
        TeamUserDto dto = new TeamUserDto();
        BeanUtils.copyProperties(bean,dto);
        return dto;
    }
}

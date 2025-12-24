package com.backend.ws.converter.project;

import com.backend.bean.project.Project;
import com.backend.ws.dto.project.ProjectDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ProjectConverter {

    public Project toBean(ProjectDto dto){
        if (dto == null) {
            return null;
        }
        Project bean = new Project();
        BeanUtils.copyProperties(dto,bean);
        return bean;
    }

    public ProjectDto toDto(Project bean){
        if (bean == null) {
            return null;
        }
        ProjectDto dto = new ProjectDto();
        BeanUtils.copyProperties(bean,dto);
        return dto;
    }
}

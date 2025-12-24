package com.backend.service.impl.client.project;

import com.backend.bean.project.Project;
import com.backend.dao.project.ProjectDao;
import com.backend.service.facade.client.project.ProjectClientService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectClientServiceImpl implements ProjectClientService {

    private final ProjectDao dao;

    public ProjectClientServiceImpl(ProjectDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Project> findByNameAndTeamIdOrderByCreatedDate(String name, Long teamId) {
        return dao.findByNameAndTeamIdOrderByCreatedDate(name, teamId);
    }

    @Override
    @Transactional
    public void deleteByNameAndTeamId(String name, Long teamId) {
        dao.deleteByNameAndTeamId(name, teamId);
    }

    @Override
    public List<Project> findAllByTeamIdOrderByCreatedDate(Long teamId) {
        return dao.findAllByTeamIdOrderByCreatedDate(teamId);
    }

    public Project createProject(Project project) {
        return dao.save(project);
    }
}

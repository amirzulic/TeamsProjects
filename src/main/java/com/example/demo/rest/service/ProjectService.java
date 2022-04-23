package com.example.demo.rest.service;

import com.example.demo.model.Project;
import com.example.demo.model.Team;
import com.example.demo.rest.ProjectAssignRequest;
import com.example.demo.store.ProjectRepository;
import com.example.demo.store.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private TeamRepository teamRepository;

    public ProjectService() {}

    public Project assingProject(ProjectAssignRequest projectAssignRequest) {
        List<Team> teams = teamRepository.findAll();
        Project project = new Project();
        int counter = 0;
        while(true) {
            if(teams.get(counter).getDevelopers() >= projectAssignRequest.getDevsNeeded()) {
                project.setProjectid(projectAssignRequest.getProjectId());
                project.setDevsNeeded(projectAssignRequest.getDevsNeeded());
                project.setActive(1);
                project.setTeamId(teams.get(counter).getTeamid());
                break;
            } else {
                counter++;
                if(counter == teams.size()) {
                    break;
                }
            }
        }

        teamRepository.assignDevelopers(projectAssignRequest.getDevsNeeded(), teams.get(counter).getTeamid());

        projectRepository.save(project);

        return project;
    }

    public Project completeProject(int projectId) {
        projectRepository.completeProject(projectId);
        return projectRepository.findById(projectId).get();
    }
}

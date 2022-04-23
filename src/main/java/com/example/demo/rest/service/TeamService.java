package com.example.demo.rest.service;

import com.example.demo.model.Team;
import com.example.demo.store.ProjectRepository;
import com.example.demo.store.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private TeamRepository teamRepository;

    public TeamService() {}

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public List<Team> handlePutTeams(List<Team> teams) {
        projectRepository.deleteAll();
        teamRepository.deleteAll();
        List<Team> response = teamRepository.saveAll(teams);
        return response;
    }

    public Team getTeamByProject(int id) {
        return teamRepository.getTeamByProject(id);
    }
}

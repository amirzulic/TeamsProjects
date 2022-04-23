package com.example.demo.rest.controller;

import com.example.demo.model.Team;
import com.example.demo.rest.ProjectRequest;
import com.example.demo.rest.TeamRequest;
import com.example.demo.rest.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeamController {
    @Autowired
    private TeamService teamService;

    // FINISHED
    @PutMapping("/teams")
    public ResponseEntity<List<Team>> getTeams(@RequestBody TeamRequest teamRequest) {
        return ResponseEntity.ok(new ArrayList<Team>(teamService.handlePutTeams(teamRequest.getTeams())));
    }

    // FINISHED
    @PostMapping("/assigned")
    public ResponseEntity<Team> giveTeam(@RequestBody ProjectRequest projectRequest) {
        return ResponseEntity.ok(teamService.getTeamByProject(projectRequest.getProjectId()));
    }
}

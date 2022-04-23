package com.example.demo.rest;

import com.example.demo.model.Team;

import java.util.List;

public class TeamRequest {
    private List<Team> teams;

    public TeamRequest() {}

    public TeamRequest(List<Team> teams) {
        this.teams = teams;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}

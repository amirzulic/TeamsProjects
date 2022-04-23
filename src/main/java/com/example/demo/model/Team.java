package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Team")
public class Team {
    @Id
    @Column(name = "teamid")
    private int teamid;

    @Column(name = "developers")
    private int developers;

    public Team() {
    }

    public Team(int teamid, int developers) {
        this.teamid = teamid;
        this.developers = developers;
    }

    public int getTeamid() {
        return teamid;
    }

    public void setTeamid(int teamid) {
        this.teamid = teamid;
    }

    public int getDevelopers() {
        return developers;
    }

    public void setDevelopers(int developers) {
        this.developers = developers;
    }
}

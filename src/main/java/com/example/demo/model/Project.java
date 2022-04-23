package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Project")
public class Project {
    @Id
    @Column(name = "projectid")
    private int projectid;

    @Column(name = "devs")
    private int devsNeeded;

    @Column(name = "active")
    private int active;

    @Column(name = "teamid")
    private int teamId;

    public Project() {
    }

    public Project(int projectid, int devsNeeded, int active, int teamId) {
        this.projectid = projectid;
        this.devsNeeded = devsNeeded;
        this.active = active;
        this.teamId = teamId;
    }

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public int getDevsNeeded() {
        return devsNeeded;
    }

    public void setDevsNeeded(int devsNeeded) {
        this.devsNeeded = devsNeeded;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}

package com.example.demo.rest;

public class ProjectRequest {
    private int projectId;

    public ProjectRequest() {}

    public ProjectRequest(int projectId) {
        this.projectId = projectId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
}

package com.example.demo.rest;

public class ProjectAssignRequest {
    private int projectId;
    private int devsNeeded;

    public ProjectAssignRequest() {
    }

    public ProjectAssignRequest(int projectId, int devsNeeded) {
        this.projectId = projectId;
        this.devsNeeded = devsNeeded;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getDevsNeeded() {
        return devsNeeded;
    }

    public void setDevsNeeded(int devsNeeded) {
        this.devsNeeded = devsNeeded;
    }
}

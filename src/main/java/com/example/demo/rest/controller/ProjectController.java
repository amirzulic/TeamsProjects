package com.example.demo.rest.controller;

import com.example.demo.model.Project;
import com.example.demo.rest.ProjectAssignRequest;
import com.example.demo.rest.ProjectRequest;
import com.example.demo.rest.service.ProjectService;
import com.example.demo.store.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    // FINISHED
    @GetMapping("/status")
    public ResponseEntity<String> getStatus() {
        return ResponseEntity.ok("Okay!");
    }

    // FINISHED
    @PostMapping("/project")
    public ResponseEntity<Project> giveProject(@RequestBody ProjectAssignRequest projectAssignRequest) {
        return ResponseEntity.ok(projectService.assingProject(projectAssignRequest));
    }

    // FINISHED
    @PostMapping("/completed")
    public ResponseEntity<Project> completeProject(@RequestBody ProjectRequest projectRequest) {
        return ResponseEntity.ok(projectService.completeProject(projectRequest.getProjectId()));
    }
}

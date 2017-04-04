package com.slav.site.entity;

import java.util.List;

public class Project {

    private String projectName;
    private List<Document> projectDocumentation;

    public Project() { }

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public Project(String projectName, List<Document> projectDocumentation) {

        this.projectName = projectName;
        this.projectDocumentation = projectDocumentation;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Document> getProjectDocumentation() {
        return projectDocumentation;
    }

    public void setProjectDocumentation(List<Document> projectDocumentation) {
        this.projectDocumentation = projectDocumentation;
    }
}

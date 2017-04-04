package com.slav.site.form;

import com.slav.site.entity.Document;

import java.util.List;

public class ProjectForm {

    private String projectName;
    private List<Document> projectDocumentation;

    public ProjectForm() { }

    public ProjectForm(String projectName) {
        this.projectName = projectName;
    }

    public ProjectForm(String projectName, List<Document> projectDocumentation) {

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

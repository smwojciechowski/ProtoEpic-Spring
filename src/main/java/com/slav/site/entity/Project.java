package com.slav.site.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Projects")
public class Project {

    private int id;

    private String projectName;
    //private List<Document> projectDocumentation;

    public Project() { }

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public Project(String projectName, List<Document> projectDocumentation) {

        this.projectName = projectName;
        //this.projectDocumentation = projectDocumentation;
    }

    @Id
    public int getProjectId() {
        return id;
    }

    public void setProjectId(int projectId) {
        this.id = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /*public List<Document> getProjectDocumentation() {
        return projectDocumentation;
    }

    public void setProjectDocumentation(List<Document> projectDocumentation) {
        this.projectDocumentation = projectDocumentation;
    }*/
}

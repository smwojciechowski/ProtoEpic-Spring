package com.slav.site;

import com.slav.site.entity.Project;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProjectRepositoryImpl implements ProjectRepository {

    //Temporary database before moving the repo to Hibernate
    private Map<String, Project> projectDatabase;

    public ProjectRepositoryImpl() {

        projectDatabase = new HashMap<>();
        projectDatabase.put("Kizomba", new Project("Kizomba"));
        projectDatabase.put("Ichthys", new Project("Ichthys"));
        projectDatabase.put("Tombua", new Project("Tombua"));
        projectDatabase.put("Eni 1506", new Project("Eni 1506"));
        projectDatabase.put("Lianzi", new Project("Lianzi"));
        projectDatabase.put("Mozambik", new Project("Mozambik"));
    }

    @Override
    public Map<String, Project> getProjects() {

        return projectDatabase;
    }
}

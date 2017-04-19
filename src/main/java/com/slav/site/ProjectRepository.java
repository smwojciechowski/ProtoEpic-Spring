package com.slav.site;

import com.slav.site.entity.Document;
import com.slav.site.entity.Project;

import java.util.List;
import java.util.Map;

public interface ProjectRepository {

    List<Project> getAllProjects();

    Project get(long id);

    void add(Project project);

    void update(Project project);

    void delete(Project project);

    void delete(long id);
}

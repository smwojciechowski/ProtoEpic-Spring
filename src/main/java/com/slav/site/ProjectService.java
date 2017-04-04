package com.slav.site;


import com.slav.site.entity.Project;

import java.util.Map;

public interface ProjectService {

    Map<String, Project> listProjects();
}

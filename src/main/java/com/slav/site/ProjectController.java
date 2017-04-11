package com.slav.site;

import com.slav.site.form.DocumentForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ProjectController {

    private ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    public ModelAndView listProjects(Map<String, Object> model) {

        model.put("projectList", projectService.listProjects());

        return new ModelAndView("projectBrowser");
    }

    @RequestMapping(value = "/projectServiceTest", method = RequestMethod.GET)
    public void listRepoProjects() {

        projectService.listProjects().forEach((p) -> System.out.println(p.getProjectName()));
    }


    @RequestMapping(value = "/projects/{name}", method = RequestMethod.GET)
    public ModelAndView displayProject(@PathVariable("name") String projectName,
                                       Map<String, Object> model) {

        model.put("selectedProject", projectName);
        model.put("selectedProjectTemp", new DocumentForm("Not_A_Real_Document"));
        return new ModelAndView("project");
    }
}

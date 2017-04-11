package com.slav.site;

import com.slav.site.entity.Project;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProjectRepositoryImpl implements ProjectRepository {

    //Temporary database before moving the repo to Hibernate
    private Map<String, Project> projectDatabase;

    @PersistenceContext
    EntityManager entityManager;

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
    public List<Project> getAllProjects() {

        return this.entityManager.createQuery(
                "SELECT p FROM Project p ORDER BY p.projectName", Project.class
        ).getResultList();
    }

    @Override
    public Project get(long id) {

        return this.entityManager.createQuery(
                "SELECT p FROM Project p WHERE p.id = :id", Project.class
        ).setParameter("id", id).getSingleResult();
    }

    @Override
    public void add(Project project) {

        this.entityManager.persist(project);
    }

    @Override
    public void update(Project project) {

        this.entityManager.merge(project);
    }

    @Override
    public void delete(Project project) {

        this.entityManager.remove(project);
    }

    @Override
    public void delete(long id) {

        this.entityManager.createQuery(
                "DELETE FROM Project p WHERE p.id = :id"
        ).setParameter("id", id).executeUpdate();
    }
}

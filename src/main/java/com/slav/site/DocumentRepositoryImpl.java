package com.slav.site;

import com.slav.site.entity.Document;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Map;

@Repository
public class DocumentRepositoryImpl implements DocumentRepository {


    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Map<String, Document> getDocuments() {
        return null;
    }

    @Override
    public Document get(long id) {
        return null;
    }

    @Override
    public void add(Document document) {

    }

    @Override
    public void update(Document document) {

    }

    @Override
    public void delete(Document document) {

    }

    @Override
    public void delete(long id) {

    }
}

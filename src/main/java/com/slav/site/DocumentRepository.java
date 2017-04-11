package com.slav.site;

import com.slav.site.entity.Document;

import java.util.Map;

public interface DocumentRepository {

    Map<String, Document> getDocuments();

    Document get(long id);

    void add(Document document);

    void update(Document document);

    void delete(Document document);

    void delete(long id);
}

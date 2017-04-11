package com.slav.site;

import com.slav.site.entity.Document;

import java.util.Map;

public interface DocumentService {

    Map<String, Document> listDocuments();
}

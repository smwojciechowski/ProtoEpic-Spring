package com.slav.site.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@Entity
@Table(name = "Documents")
public class Document {

    private long id;

    private String documentName;
    private String documentType;
    private String documentSubType;
    private String responsiblePerson;
    private String documentDescription;
    private String documentStatus;

    //private Map<String, Attachment> attachments = new LinkedHashMap<>();

    private Instant statusDate;
    private Date receivedDate;
    private Date forecastIssueDate;
    private Date issuedDate;

    public Document() {}

    public Document(String documentName) {

        this.documentName = documentName;
    }

    @Id
    @Column(name = "documentId")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    @Basic
    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @Basic
    public String getDocumentSubType() {
        return documentSubType;
    }

    public void setDocumentSubType(String documentSubType) {
        this.documentSubType = documentSubType;
    }

    @Basic
    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    @Basic
    public String getDocumentDescription() {
        return documentDescription;
    }

    public void setDocumentDescription(String documentDescription) {
        this.documentDescription = documentDescription;
    }

    @Basic
    public String getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
    }

    /*@Basic
    public Map<String, Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(Map<String, Attachment> attachments) {
        this.attachments = attachments;
    }*/

    @Basic
    public Instant getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Instant statusDate) {
        this.statusDate = statusDate;
    }

    @Basic
    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    @Basic
    public Date getForecastIssueDate() {
        return forecastIssueDate;
    }

    public void setForecastIssueDate(Date forecastIssueDate) {
        this.forecastIssueDate = forecastIssueDate;
    }

    @Basic
    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    /*@Basic
    public void addAttachment(Attachment attachment) {

        attachments.put(attachment.getName(), attachment);
    }*/
}

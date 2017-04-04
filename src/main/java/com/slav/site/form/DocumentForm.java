package com.slav.site.form;

import com.slav.site.entity.Attachment;

import java.time.Instant;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class DocumentForm {

    private long documentIndexNumber;

    private String documentName;
    private String documentType;
    private String documentSubType;
    private String responsiblePerson;
    private String documentDescription;
    private String documentStatus;

    private Map<String, Attachment> attachments = new LinkedHashMap<>();

    private Instant statusDate;
    private Date receivedDate;
    private Date forecastIssueDate;
    private Date issuedDate;

    public DocumentForm() {}

    public DocumentForm(String documentName) {

        this.documentName = documentName;
    }

    public long getDocumentIndexNumber() {
        return documentIndexNumber;
    }

    public void setDocumentIndexNumber(long documentIndexNumber) {
        this.documentIndexNumber = documentIndexNumber;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentSubType() {
        return documentSubType;
    }

    public void setDocumentSubType(String documentSubType) {
        this.documentSubType = documentSubType;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public String getDocumentDescription() {
        return documentDescription;
    }

    public void setDocumentDescription(String documentDescription) {
        this.documentDescription = documentDescription;
    }

    public String getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
    }

    public Map<String, Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(Map<String, Attachment> attachments) {
        this.attachments = attachments;
    }

    public Instant getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Instant statusDate) {
        this.statusDate = statusDate;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Date getForecastIssueDate() {
        return forecastIssueDate;
    }

    public void setForecastIssueDate(Date forecastIssueDate) {
        this.forecastIssueDate = forecastIssueDate;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public void addAttachment(Attachment attachment) {

        attachments.put(attachment.getName(), attachment);
    }
}

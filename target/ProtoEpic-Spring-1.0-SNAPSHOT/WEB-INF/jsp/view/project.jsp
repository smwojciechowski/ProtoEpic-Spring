<%--@elvariable id="selectedProject" type="java.lang.String"--%>
<%--@elvariable id="selectedProjectTemp" type="com.slav.site.form.DocumentForm"--%>
<h3>Welcome to ${selectedProject}.</h3>
<br/>
<br/>
<br/>
<form:form method="get" action="/documents" modelAttribute="selectedProjectTemp">
    <form:label path="documentName">Document Name</form:label><br/>
    <form:input path="documentName"/><br/><br/>
    <form:label path="documentType">Document Type</form:label><br/>
    <form:input path="documentType"/><br/><br/>
    <form:label path="documentSubType">Document Subtype</form:label><br/>
    <form:input path="documentSubType"/><br/><br/>
    <form:label path="responsiblePerson">Responsible Person</form:label><br/>
    <form:input path="responsiblePerson"/><br/><br/>
    <form:label path="documentDescription">Document Description</form:label><br/>
    <form:input path="documentDescription"/><br/><br/>
    <form:label path="documentStatus">Document Status</form:label><br/>
    <form:input path="documentStatus"/><br/><br/>
    <form:label path="statusDate">Status Date</form:label><br/>
    <form:input path="statusDate"/><br/><br/>
    <form:label path="receivedDate">Received Date</form:label><br/>
    <form:input path="receivedDate"/><br/><br/>
    <form:label path="issuedDate">Issued Date</form:label><br/>
    <form:input path="issuedDate"/><br/><br/>
</form:form>
<%--@elvariable id="loginForm" type="com.slav.site.form.LoginForm"--%>
<%--@elvariable id="projectList" type="java.util.List<com.slav.site.entity.Project>"--%>
A really successful login ${loginForm.username}!
<br/>
<br/>
Projects:<br/>
<c:forEach items="${projectList}" var="project">
    <a href="<c:url value="/projects/${project.projectName}">
    </c:url>"><c:out value="${project.projectName}" /></a><br/>
</c:forEach>


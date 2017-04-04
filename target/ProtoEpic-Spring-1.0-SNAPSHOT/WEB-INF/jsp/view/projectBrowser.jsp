<%--@elvariable id="loginForm" type="com.slav.site.form.LoginForm"--%>
<%--@elvariable id="projectList" type="java.util.Map<String, com.slav.site.entity.Project>"--%>
A really successful login ${loginForm.username}!
<br/>
<br/>
Projects:<br/>
<c:forEach items="${projectList}" var="project">
    <a href="<c:url value="/projects/${project.key}">
    </c:url>"><c:out value="${project.key}" /></a><br/>
</c:forEach>


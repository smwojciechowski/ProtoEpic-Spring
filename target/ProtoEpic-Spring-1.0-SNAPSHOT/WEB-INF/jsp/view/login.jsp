<h2>Welcome to ProtoEpic, please log in.</h2><br/>

<form:form method="post" modelAttribute="loginForm">
    <form:label path="username">Username</form:label><br/>
    <form:input path="username" /><br/><br/>
    <form:label path="password">Password</form:label><br/>
    <form:input path="password" /><br/><br/>
    <input type="submit" value="Log In" />
</form:form>

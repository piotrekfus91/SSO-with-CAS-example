<%@page pageEncoding="utf-8" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
Aplikacja: ${appName}<br />
<sec:authorize access="isAuthenticated()">
    Użytkownik: <sec:authentication property="principal.username" /><br /><br />
</sec:authorize>
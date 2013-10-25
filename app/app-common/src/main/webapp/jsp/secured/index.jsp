<%@page pageEncoding="utf-8" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
Aplikacja: ${appName}<br />
Użytkownik: ${userName}<br /><br />

<a href='<s:url value="/home" />'>Przejdź na zasób publiczny</a>

<h1>Zasób chroniony</h1>
</body>
</html>
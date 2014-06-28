<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>authors</title>
</head>
<body>
<h1>
	authors  
</h1>

<ul>
<c:forEach items="${authors}" var="author">
	<li>${author.name}</li>
</c:forEach>
</ul>

</body>
</html>

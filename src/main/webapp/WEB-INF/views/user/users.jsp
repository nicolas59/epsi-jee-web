<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<html>
<body>
<ul>
<c:forEach items="${users}" var="user"> 
	<li>${user.firstName} ${user.lastName}</li>
</c:forEach>
</ul>
</body>

</html>
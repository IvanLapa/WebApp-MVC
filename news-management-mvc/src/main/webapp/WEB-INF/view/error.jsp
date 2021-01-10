<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Error</title>
	<fmt:setLocale value="${sessionScope.locale}"/>
	<fmt:setBundle basename="localization.local" var="locale" />
	<fmt:message bundle="${locale}" key="result.operation.error" var="message_error" />
</head>
<body>
	<h1>
		${message_error}
	</h1>
</body>
</html>

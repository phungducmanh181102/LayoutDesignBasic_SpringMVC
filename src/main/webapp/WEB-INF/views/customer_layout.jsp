
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- Thêm css từ @ModelAttribute("styles") trong file Controller -->
<!-- Tương tự có thể truyền @ModelAttribute("js") hay bất cứ thứ gì -->
<c:forEach var="style" items="${styles}">
	<link rel="stylesheet" type="text/css" href="css/${style}">
</c:forEach>

</head>
<body>

		<jsp:include page='sidebar/customer/sidebar.jsp' />
	<jsp:include page='header/customer/header.jsp' />
	<jsp:include page='page/customer/${layout.view}.jsp' />
	<jsp:include page='footer/customer/footer.jsp' />


</body>
</html>
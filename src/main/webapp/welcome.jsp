<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import = "java.util.Date" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Welcome</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="./welcome.jsp">Home</a>
			</div>
		</div>
	</nav>
	<%!// ���� �Ǵ� �޼��� ����
	String greeting = "�� ���θ��� ���� ���� ȯ���մϴ�.";
	String tagline = "Welcome to Web Market!";%>

	<!-- mt-4 p-5 bg-primary text-white rounded = jumbotron, bootstrap5�̻� ���� ���� -->
	<!-- bg-primary : �⺻ ����, text-white : ���� �Ͼ��  -->
	<div class="p-5 bg-primary text-white">
		<!-- container : �¿� ��� ���� -->
		<div class="container">
			<!-- display-3 : ū ���� �߿� ���� ũ�� -->
			<h1 class="display-3">
				<%=greeting%>
			</h1>
		</div>
	</div>
	<div class="container">
		<div class="text-center">
			<h3><%=tagline%></h3>
			<%
			Date today = new Date();
			SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
			
			out.println("���� ���� �ð�: " + format.format(today));
			%>
		</div>
	</div>

	<footer class="container">
		<p>&copy; WebMarket</p>
	</footer>
</body>
</html>
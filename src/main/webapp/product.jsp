<%@page import="dao.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="dto.Product"%>
<%-- <jsp:useBean id="repository" class="dao.ProductRepository"
	scope="session"></jsp:useBean> --%>
<!-- Latest compiled and minified CSS -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세 정보</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="p-5 bg-primary text-white">
		<!-- container : 좌우 가운데 정렬 -->
		<div class="container">
			<!-- display-3 : 큰 글자 중에 보통 크기 -->
			<h1 class="display-3">상품 상세 정보</h1>
		</div>
	</div>
	<%
	// product.jsp?id=P1234 이런식으로 넘어온 id값을 얻는다. 
	String id = request.getParameter("id");
	ProductRepository repository = ProductRepository.getInstance();
	Product product = repository.getProductById(id);
	%>
	<!-- p.174 참고하여 코드 쓰기 -->
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h3><%=product.getName()%></h3>
				<p><%=product.getDescription()%></p>
				<p><%=product.getUnitPrice()%></p>
				<p>
					<a href="#" class="btn btn-info">상품 주문 &raquo;</a> 
					<a href="./products.jsp" class="btn btn-secondary">상품 목록 &raquo;</a>
				</p>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
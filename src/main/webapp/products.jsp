<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<!-- class를 생성해서 안에 있는 데이터를 id의 이름으로 가져다가 쓰겠다. -->
<!-- scope의 application은 서버가 끝날 때 까지, page는 페이지가 넘어갈 때만, session은 class 내용을 서버측에 저장 -->
<!--  -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<%
	/* out.println(session.getAttribute("name"));
	out.println(session.getAttribute("age")); */

	ProductRepository repository = ProductRepository.getInstance();
	List<Product> products = repository.getAllProducts();
	%>
	<div class="container">
		<div class="row text-center">
			<%
			for (Product product : products) {
			%>
			<div class="col-md-4">
				<h3><%=product.getName()%></h3>
				<p><%=product.getDescription()%></p>
				<p><%=product.getUnitPrice()%>원</p>
				<p>
					<a class="btn btn-secondary" role="button"
						href="./product.jsp?id=<%=product.getProductId()%>"> 상세 정보
						&raquo; </a>
				</p>
			</div>
			<%
			}
			%>
		</div>
	</div>
	
	<jsp:include page="footer.jsp" />
	
</body>
</html>
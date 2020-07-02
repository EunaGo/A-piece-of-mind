<%@ page import="util.CookieBox_login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	response.addCookie(CookieBox_login.createCookie("ideuna", "pweuna", "/web/", 60));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/default.css">
<style>
body, div, h1, form {
	margin: 0;
	padding: 0;
}

h1 {
	margin: 10px;
}

#form {
	margin: 10px auto;
}

td {
	padding: 10px;
}

#btn_submit {
	padding: 10px;
	background-color: aquamarine;
	font-weight: bold;
	color: darkgreen;
	border: 1px solid #EEEEEE;
}
</style>
<script>

$(document).ready(function(){
$("#save").change(function(){
	if($("#save").is(":checked")){
		alert('hi');
	}
});


});

	
</script>
</head>
<body>

	<%@ include file="/include/header.jsp"%>

	<div>
		<h1>로그인</h1>
	</div>
	<hr>
	<form action="mypage/mypage.jsp" method="get">
		<table id="form">

			<tr>
				<td>아이디(이메일)</td>
				<td><input type="text"></td>

			</tr>

			<tr>
				<td>비밀번호</td>
				<td><input type="password"></td>

			</tr>

			<tr>
				<td><label><input type="checkbox" id="save">아이디
						저장</label></td>
				<td><input id="btn_submit" type="submit" value="로그인"></td>
			</tr>


		</table>
	</form>


	<%@ include file="/include/footer.jsp"%>
</body>
</html>






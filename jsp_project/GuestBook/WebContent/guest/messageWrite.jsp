<%@page import="guestbook.service.WriteMessageService"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%
	request.setCharacterEncoding("utf-8");
 %>
 <jsp:useBean id="requestMessage" class="guestbook.model.Message" scope="request"/>
 <jsp:setProperty property="*" name="requestMessage"/>
 <%
 	WriteMessageService writeService = WriteMessageService.getInstance();
 
 	int result = writeService.writeMessage(requestMessage);
 
 	request.setAttribute("writeResult", result);
 %>

 <jsp:forward page="messageWrite_View.jsp"/>
<%@page import="java.util.Calendar"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts 2 -Registration Page</title>
<link href="<s:url value='/CSS/registrationstyle.css'/>" rel="stylesheet" type="text/css">
</head>
 
<body>
<h2>Struts 2 - Registration Page</h2>
<h4> Creation time : <%=Calendar.getInstance().getTime() %></h4>
<s:actionerror />
<s:form action="registration.action" method="post">
	<s:textfield name="firstName" key="FIRSTNAME" size="20" />
	<s:textfield name="lastName" key="LASTNAME" size="20"  />   
    <s:textfield name="dob" key="DOB" size="20" />
    <s:textfield name="email" key="EMAIL" size="30" />
    <s:radio list= "{'male','female'}" name="gender" key = "GENDER" />
    <s:submit method="execute" key="Save" align="center" />
</s:form>
</body>
</html>
<%@ page import="java.util.*" language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Tansitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Beer Reccomandations JSP</h1>
<p>
<%
	List<String> styles = (List<String>)request.getAttribute("styles");
	for(String style : styles) {
		out.print("<br />Try: " + style);
	}
%>
</body>
</html>
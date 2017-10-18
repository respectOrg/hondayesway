<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@page import="java.util.Map, java.util.HashMap"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
		<title></title>
		<script type="text/javascript">
			<%
				/**
				
					用于跳转页面，透传所有GET方式传入的参数
					
					跳转到地址，传入参数u（URL）
					http://localhost:8080/hondayesway-hu-gateway/go.jsp?u=baidu.com&param=其他参数
					
					跳转到预设网址，传入参数f（FLAG）
					http://localhost:8080/hondayesway-hu-gateway/go.jsp?f=dynamicPark&param=其他参数
				
				*/
				
				String info = "跳转中...";
				String u = request.getParameter("u");
				String f = request.getParameter("f");
				String url = null;
				if(u == null){
					if("dynamicPark".equals(f)){
						/*检证 
						url = "http://220.181.190.212:8080/dynamicPark/";
						*/
						url = "http://111.207.49.66:8080/dynamicPark/"; 
					}
				} else {
					url = "http://" + u;
				}
				if(url == null || "".equals(url)){
					info = "系统维护，请稍后再试";
					url = "#";
				} else {					
					url = url.indexOf("?") < 0 ? url + "?" : url;
					
					String paramStr = "";
					Map paramMap = request.getParameterMap();
					for(Object _key : paramMap.keySet()){
						String strKey = (String)_key;
						paramStr += "&";
						paramStr += strKey;
						paramStr += "=";
						paramStr += request.getParameter(strKey);
					}
					url += paramStr;
				}
			%>
			window.location.href = "<%=url %>";
		</script>
	</head>

	<body>
		<%=info %>
	</body>

</html>
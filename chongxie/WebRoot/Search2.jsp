<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Search2.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link type="text/css" rel="stylesheet" 	href="css/powerFloat.css" />
<link type="text/css" rel="stylesheet" 	href="css/xmenu.css" />
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/jquery-powerFloat-min.js"></script>
<script type="text/javascript" src="js/jquery-xmenu.js"></script>
  </head>
  
  <body>
    <div id="m2" class="xmenu" style="display: none;">
	<div class="select-info">	
		<label class="top-label">已选部门：</label>
		<ul>
			
		</ul>
		<a  name="menu-confirm" href="javascript:void(0);" class="a-btn">
			<span class="a-btn-text">确定</span>
		</a>
	<div>	
	<dl>
		<dt class="open">需求部门</dt>
			<dd>       
				<ul>
					<li rel="1"  class="">开发部</li>
					<li rel="2">人事部</li>
					<li rel="3">市场部</li>
					<li rel="4" class="">业务部</li>
					<li rel="5">财务部</li>							
				</ul>						
			</dd>
		<dt class="open">缺编部门</dt>
		<dd>
			<ul>
				<li rel="15" class="">研发部</li>
				<li rel="16">广告部</li>
				<li rel="17">出纳部</li>
				<li rel="18" class="">后勤部</li>						
			</ul>    
		</dd>
     </dl>				 
</div>
</div>
</div>

 <br>
  </body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@page import="java.sql.*"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.w.data.*"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->


<%-- <base href="<%=basePath%>"> --%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!--框架必需start-->
<script type="text/javascript" src="../js/jquery-1.4.js">
	
</script>
<script type="text/javascript" src="../js/framework.js"> 
	
</script>
<link href="../css/import_basic.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" id="skin" />
<!--框架必需end-->
<script type="text/javascript" src="../js/nav/ddaccordion.js">
	
</script>
<script type="text/javascript" src="../js/text/text-overflow.js">
</script>
<script type="text/javascript">
$.ajax({
		
		 type:"post",
		 dataType:"text",
		 url:"se",
		 
		 data:{
			"xkfl" : treeNode.name
		 },
		 success:function(data)
		 {
		
		 alert(data);
			 var data1 = eval("("+data+")"); 
			 $("#t tbody").html("");
			 /*alert(data1.needs.);*/
			 $.each(data1.needs, function(i, item) {
			 $("#t tbody").append("<tr><td>"+item.WJID+"</td>"
	    				 +"<td>"+item.JGQC+"</td>"
	    				 +"<td>"+item.JSXQMC+"</td>"
	    				 +"<td>"+item.JHZTZ+"</td>"
	    				 +"<td>"+item.KJHDLX+"</td>"
	    				 +"<td><a href='#'>查看</a></td></tr>"
	    		 ); 
			 });
		 }
	 });
</script>
<style type="text/css">
table {
	border-collapse: collapse;
	margin: 1 auto;
}

table, th, td {
	border: 0px solid black;
}

td {
	text-align: center;
	height: 30px;
}

.btn {
	font-size: 15px;
	background-color: DeepSkyBlue;
	color: white;
}

a {
	text-decoration: none;
	color: MediumBlue;
}

span {
	font-size: 15px;
	color: white;
}
</style>
</head>
<body>
	<table style="width: 900px;">
		<tr>
			<td style="height: 100px; text-align: center;"><span
				style="font-size: 30px; color: black;">需求清单</span></td>
		</tr>
	</table>
  
	
	<table style="width: 1100px;" id="t">
	<thead>
		<tr style="background-color: black;">
			<td style="width: 15%;"><span>公司全称</span></td>
			<td style="width: 15%;"><span>技术需求名称 </span></td>
			<td style="width: 15%;"><span>归口管理部门</span></td>
			<td style="width: 15%;"><span>技术审核状态</span></td>
			<td style="width: 10%;"><span>形式审核状态</span></td>
			<td style="width: 10%;"><span>编辑</span></td>
		</tr>
		</thead>
		<tbody></tbody>
		<%-- <s:iterator value="list2">
		<tr>
		  <td> <s:property value="quancheng"></s:property></td>
		  <td> <s:property value="jname"></s:property></td>
		  <td> <s:property value="guikou"></s:property></td>
		  <td> <s:property value="njname"></s:property></td>
		  <td> <s:property value="zhuangtai"></s:property></td>
		  <td><a href="xqgx?tianbao.id=<s:property value="id"/>">审核</a>
		</tr>
		</s:iterator> --%>
		
	</table>
</body>
</html>
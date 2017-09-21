<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="gb2312">

<title>jQuery添加删除表单元素代码 - 站长素材</title>

<link rel="stylesheet" href="css/zurb-foundation-5.5.1/foundation.min.css">

<link rel="stylesheet" href="css/font-awesome-4.3.0/css/font-awesome.min.css">

<style>body {padding: 2rem 0;}</style>
</head>
<body>
<div class="row">
	
<div class="column">
		
<form class="dynamicWrapper">
			
<div class="row">
				
<div class="medium-4 columns">
			
	<label for="product-0"></label>

	<select name="product-0" id="product-0">
	<option value="tianbao.quancheng">机构全称</option >
	<option value="tianbao.guikou">归口管理部门</option >
	<option value="tianbao.jname">技术名称</option >
	<option value="tianbao.diyu">所在地域</option >
</select>
				</div>

			
	<div class="medium-4 columns">

		<label for="product-0"></label>

	<input type="text" name="qty-0" id="qty-0" size="15">
</div>

				
<div class="medium-2 columns">
<a href="#" class="postfix button dynamicRemove"><i class="fa fa-minus"></i></a>
</div>


<div class="medium-2 columns">
<a href="#" class="postfix button dynamicAdd">
<i class="fa fa-plus"></i></a>
</div>

</div>

</form>
</div>
</div>


<a href="。。/user/Search2.html">分类检索</a>
<script src="js/jquery-2.1.3.min.js"></script>

<script src="js/jquery.dynamic-rows.min.js">
</script>

<script>
$('.dynamicWrapper').ssdDynamicRows();
</script>


<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">


</div>
</body>
</html>
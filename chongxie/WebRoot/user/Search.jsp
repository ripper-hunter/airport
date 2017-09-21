<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<style type="text/css">
*{margin:0;padding:0;list-style-type:none;}
a,img{border:0;}
body{font:12px "宋体","Arial Narrow",HELVETICA;background:#fff;-webkit-text-size-adjust:100%;}
a{color:#2d374b;text-decoration:none}
a:hover{color:#cd0200;text-decoration:underline}


/* searchTxt */
.searchBtn button,.searchTxt .searchMenu .searchSelected{background-image:url(user/images/searchbg.png);background-repeat:no-repeat;}

.searchTxt{float:left;width:399px;height:30px;border:2px solid #d3d3d3;border-right:0;position:relative;z-index:20;background:#fff;}
.searchTxt .radius{width:1px;height:1px;overflow:hidden;background:#f4f4f4;position:absolute;top:-2px;left:-2px;}
.searchTxtHover{float:left;width:399px;height:30px;border:2px solid #3297d8;border-right:0;position:relative;z-index:20;background:#fff;}
.searchTxtHover .radius{width:1px;height:1px;overflow:hidden;background:#cce5f5;position:absolute;top:-2px;left:-2px;}


.searchTxt input{float:left;border:0;background:#fff;color:#333;font:14px/22px '宋体',verdana,tahoma,arial,'SimSun',sans-serif;width:221px;height:22px;margin:0;outline:medium none;padding:4px;}
.searchTxt .sosoLogo{float:right;margin:8px 6px 0 0;display:inline;}
.searchBtn{float:left;}
.searchBtn button{background-position:0px 0px;border:0;color:#fff;cursor:pointer;float:left;font-size:16px;height:34px;text-indent:-9999px;width:86px;}
</style>

<script type="text/javascript" src="jquery/jquery-1.7.min.js"></script> <style type="text/css">
#form1 table tr td strong {
	font-weight: bold;
}
.comments {

width:100%;
overflow:auto;
word-break:break-all;
font-size:16px;
 background-color:##66ccff;


}
.danyuange
{
	height:100%;
}
</style>

    
  
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 <script src="jquery/jquery-1.7.min.js"></script> 
<link rel="stylesheet" type="text/css" href="user/css2/style.css">
<script type="text/javascript" src="user/js2/jquery-1.7.2.min.js"></script>
 <%-- <script type="text/javascript" src="user/js2/script.js"></script>   --%>
 <script>
 
 $(document).ready(function(){
							
	$("#select1 dd").click(function () {
		var text = $(this).find("a").text(); 
		 $.ajax({
		
		 type:"post",
		 dataType:"text",
		 url:"se",
		 
		 data:{
			 val1 : text
		 },
		 /* error: function(XMLHttpRequest, textStatus, errorThrown) {
     alert(XMLHttpRequest.status);
     alert(XMLHttpRequest.readyState);
     alert(textStatus);
	
	}, */
		 success:function(data)
		 {
		
		 
			 var data1 = eval("("+data+")"); 
			 $("#t tbody").html("");
			 /*alert(data1.needs.);*/
			 $.each(data1.needs, function(i, item) {
			 $("#t tbody").append("<tr><td>"+item.quancheng+"</td>"
	    				 +"<td>"+item.Jname+"</td>"
	    				 +"<td>"+item.guikou+"</td>"
	    				 +"<td>"+item.njname+"</td>"
	    				 +"<td>"+item.zhuangtai+"</td>"
	    				 +"<td><a href='#'>查看</a></td></tr>"
	    		 ); 
			 });
		 }
	 });
     /*   $.ajax({
                type: 'POST',
                url: "se",
                tradtional:true,
                data: {
                    val1: text,
                  
                   
                },
                dataType: "json",
	error: function(XMLHttpRequest, textStatus, errorThrown) {
     alert(XMLHttpRequest.status);
     alert(XMLHttpRequest.readyState);
     alert(textStatus);
	
	}
	}); */
	
	       });
	       
	    $("#select2 dd").click(function () {
		var text = $(this).find("a").text(); 
		 
       $.ajax({
                type: 'POST',
                url: "se",
                tradtional:true,
                data: {
                    val1: text,
                  
                   
                },
                dataType: "json",
	error: function(XMLHttpRequest, textStatus, errorThrown) {
     alert(XMLHttpRequest.status);
     alert(XMLHttpRequest.readyState);
     alert(textStatus);
	
	}
	});
	
	       });
	       $("#select3 dd").click(function () {
		var text = $(this).find("a").text(); 
		 
       $.ajax({
                type: 'POST',
                url: "se",
                tradtional:true,
                data: {
                    val1: text,
                  
                   
                },
                dataType: "json",
	error: function(XMLHttpRequest, textStatus, errorThrown) {
     alert(XMLHttpRequest.status);
     alert(XMLHttpRequest.readyState);
     alert(textStatus);
	
	}
	});
	
	       });   
	       $("#selectA").live("click", function () {
		$(this).remove();
		$("#select1 .select-all").addClass("selected").siblings().removeClass("selected");
	});
	
	$("#selectB").live("click", function () {
		$(this).remove();
		$("#select2 .select-all").addClass("selected").siblings().removeClass("selected");
	});
	
	$("#selectC").live("click", function () {
		$(this).remove();
		$("#select3 .select-all").addClass("selected").siblings().removeClass("selected");
	});
	
	$(".select dd").live("click", function () {
		if ($(".select-result dd").length > 1) {
			$(".select-no").hide();
		} else {
			$(".select-no").show();
		}
	});
	       
        }); 
	alert(text);
 
 
  
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
    <form method="post" name="form1" action="se" target="_blank" style="width:487px;height:34px;margin:40px auto 0 auto;">
	<div id="searchTxt" class="searchTxt" onMouseOver="this.className='searchTxt searchTxtHover';" onMouseOut="this.className='searchTxt';">
		<div class="radius" style="top:-2px;"></div>
		<div class="radius" style="top:31px;"></div>
		
		<input name="tianbao.jname" type="text" id="in"placeholder="请输入技术需求名称"/>
	</div>
	
	<div class="searchBtn" >
		<button id="searchBtn" type="submit" >搜索</button>
	</div>
  </form>
	<form method="post" name="form2" action="se" target="_parent">
	<ul class="select">
		<li class="select-list">
			<dl id="select1" >
				<dt>地域：</dt>
				<dd class="select-all selected"><a href="se">全部</a></dd>
				<dd><a href="se">其他（河北工大）</a></dd>
				<dd><a href="se">石家庄市</a></dd>
				<dd><a href="se">辛集市</a></dd>
				<dd><a href="se">唐山市</a></dd>
				<dd><a href="se">秦皇岛市</a></dd>
				<dd><a href="se">邯郸市</a></dd>
				<dd><a href="se">邢台市</a></dd>
				<dd><a href="se">保定市</a></dd>
				<dd><a href="se">定州市</a></dd>
				<dd><a href="se">张家口市</a></dd>
				<dd><a href="se">承德市</a></dd>
				<dd><a href="se">沧州市</a></dd>
				<dd><a href="se">廊坊市</a></dd>
				<dd><a href="se">衡水市</a></dd>
			</dl>
		</li>
		<li class="select-list">
			<dl id="select2">
				<dt>归口部门：</dt>
				<dd class="select-all selected"><a href="se">全部</a></dd>
				<dd><a href="se">石家庄市科技局</a></dd>
				<dd><a href="se">邯郸市科技局</a></dd>
				<dd><a href="se">邢台市科技局</a></dd>
				<dd><a href="se">保定市科技局</a></dd>
				<dd><a href="se">张家口市科技局</a></dd>
			</dl>
		</li>
		<li class="select-list">
			<dl id="select3">
				<dt>机构属性：</dt>
				<dd class="select-all selected"><a href="se">全部</a></dd>
				<dd><a href="se">企业</a></dd>
				<dd><a href="se">高等院校 </a></dd>
				<dd><a href="se">研究机构 </a></dd>
				<dd><a href="se">其他</a></dd>
			</dl>
		</li>
		<li class="select-result">
			<dl>
				<dt>已选条件：</dt>
				<dd class="select-no">暂时没有选择过滤条件</dd>
			</dl>
		</li>
	</ul>
<div style="text-align:center;clear:both" id="view">
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
			<td style="width: 15%;"><span>审核状态</span></td>
			<td style="width: 10%;"><span>需求状态</span></td>
			<td style="width: 10%;"><span>编辑</span></td>
		</tr>
		</thead>
		<tbody></tbody>
		</table>
</div>

</form>
 <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
        <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>       <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
       <br>
    <br>       <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
  </body>
</html>

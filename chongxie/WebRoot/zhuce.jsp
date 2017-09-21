<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
   <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
     
    <title></title>
     <script src="{sh::PUB}js/jquery-2.1.0.min.js" type="text/javascript"></script>
    <script src="{sh::PUB}plugin/layer/layer.js" type="text/javascript"></script>
 <script type="text/javascript">
        function checkPassword() {
            var pass1 = document.getElementById("pwd");
            var pass2 = document.getElementById("pwd1");
     
            if (pass1.value != pass2.value)
                pass2.setCustomValidity("两次输入的密码不匹配");
            else
                pass2.setCustomValidity("");
        }

        // 验证表单
        function checkForm() {
            // ajax检测账号是否已存在
            
            return false;
        }
    </script>

 
  

 
   
  </head>
  <style type="text/css">
 talbe
 {
   border-collapse:collapse;
   border:none;
   margin:0px auto;
   width:500px;
 }
 th,td
 {
  border:solid #333 2px;
 height:50px;
 
 }
 div
 {
 text-align:center;
 }
 </style>
  
  <body>
 
 
 <form  name="form2" action="register"  method="post"  >
 <table width="426" align="center" border="0" >
<tr>
<div class="form-group">
<td width="102"><samp>
  <label for="ID">身份证号</label>
</samp></td>
<td width="196"><samp>
  <input  name="us.id" type="text" id="id"  class="form-control"placeholder="输入身份证号" required pattern="^([0-9]){18}(x|X)?$" oninvalid="this.setCustomValidity('请输入合法的身份证号');" oninput="setCustomValidity('')"  >
</samp></td>
</div></tr>
<tr>
<div class="form-group">
<td><samp>
  <label  for="username">用户名</label>
</samp></td><td><samp>
<input name="us.username" type="text" id="username" class="form-control" pattern  ="[0-9a-zA-Z]{6,20}" required placeholder="请输入6到20位数字字母">

</samp></td></div></tr>
<tr>
<div class="form-group">
<td><samp>
  <label for="pwd">密码</label>
</samp></td>
<td><samp>
  <input  name="us.pwd" type="password" id="pwd" class="form-control"placeholder="6~20位"  pattern="^[a-zA-Z0-9]\w{5,19}$" required oninvalid="this.setCustomValidity('6~20字母数字或下划线');" oninput="setCustomValidity('')" onchange="checkPassword()">
                           </samp></td>
</div></tr>
<tr>
<div class="form-group">
<td><samp>
  <label for="pwd1">请再输入密码</label>
</samp></td>
<td><samp>
  <input  name="pwd1" type="password" id="pwd1" class="form-control"placeholder="确认密码"  required onchange="checkPassword()">
                            </samp></td>
</div></tr>
<tr>
<div class="form-group">
<td><samp>
  <label  for="quancheng">公司全称</label>
</samp></td><td><samp>
<input name="us.quancheng" type="text" id="quancheng" class="form-control">

</samp></td></div></tr>



<tr>
<td><samp>
  <button type="submit" class="btn btn-success">提交</button>
</samp></td>
<td><samp>
  <button type="reset"  class="btn btn-danger">重置</button>
  <a type="button" href="index.jsp" target="frmall" class="btn btn-link">已注册</a></samp></td>
</tr>
</table>
</form>





    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
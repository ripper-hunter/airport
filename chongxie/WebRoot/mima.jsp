<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
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
    
<title>Insert title here</title>
<script type="text/javascript">
 function checkPassword() {
            var pass1 = document.getElementById("userpassword1");
            var pass2 = document.getElementById("userpassword2");
     
            if (pass1.value != pass2.value)
                pass2.setCustomValidity("两次输入的密码不匹配");
            else
                pass2.setCustomValidity("");
        }
 </script>
</head>
<style type="text/css">
 talbe
 {
   border-collapse:collapse;
   border:bule;
   margin:0px auto;
   width:500px;
 }
 th,td
 {
  border:solid #333 2px;
 height:50px;
 
 }
 </style>
  
<body  background="">
    <form  name="form1" action="gengxin.jsp"  method="post" role="form" >
    <table width="420" height="292" align="center" color="blue">
    <tr>  
<td width="88">
  <samp>
  <label  for="username">用户名</label>
  </samp></td>
<td colspan="2"><samp>
  <input name="username" type="text" id="username" class="form-control" pattern  ="[0-9a-zA-Z]{6,20}" required placeholder="请输入6到20位数字字母">
  </div>
</samp></td></tr>
<tr>

<td>
  <samp>
  <label  for="username">旧密码</label>
  </samp></td>
<td colspan="2"><samp>
  <input name="userpassword" type="password" id="userpassword" class="form-control" pattern  ="[0-9a-zA-Z]{6,20}" required placeholder="请输入6到20位数字字母">
  </div>
</samp></td></tr>
<tr>


<td><samp>
  <label  for="username">新密码</label>
</samp></td><td colspan="2"><samp>
    <input name="userpassword1" type="password" id="userpassword1" class="form-control" pattern  ="[0-9a-zA-Z]{6,20}" required placeholder="请输入6到20位数字字母">
    </div>
</samp></td></tr>

<td height="160"><samp>
  <label  for="username">重复新密码</label>
</samp></td><td colspan="2"><samp>
    <input name="userpassword2" type="password" id="userpassword2" class="form-control" pattern  ="[0-9a-zA-Z]{6,20}" required placeholder="请输入6到20位数字字母">
    </div>
</samp></td></tr>
<tr>
<td height="56"><samp><a type="button" href="index.jsp" target="frmall" class="btn btn-success">提交</a></samp></td>
<td width="172"><samp>
  <button type="reset" class="btn btn-danger">重置</button>
</samp></td></tr></table>
</form>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>
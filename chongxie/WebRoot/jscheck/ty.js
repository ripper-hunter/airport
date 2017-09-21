//javaScript
  window.onload= function(){ 
	  
	  //归口部门
	  $.getJSON("loadbumen", function(data) {
		  
		  $("#guikou").html("");
		/*$("#bumen").append("<option value=''></option>");*/
		  $.each(data.bumen, function(i, biao) {
			  $("#guikou").append(
					  "<option value='"+ biao.bumen+"'>"+biao.bumen+"</option>");
			
		  });
	  });
	  //所在地域
	  $.getJSON("loaddiyu", function(data) {
		  $("#diyu").html("");
		 /* $("#diyu").append("<option value=''></option>");*/
		  $.each(data.diyu, function(i, biao) {
			  $("#diyu").append(
					  "<option value='"+ biao.title +"'>"+ biao.title +"</option>");
		  });
	  });
	  
	  
	  var inpt= document.getElementById('form3').getElementsByTagName('input');  //获取表单下所有的input元素
	  for(var i=0;i<inpt.length;i++){   //遍历获得的input元素
		  if(inpt[i].type=='radio'){   //如果是单选按钮


			  inpt[i].onclick=function(){ // input的单击事件
				  if(this.checked)

					  if(this.nextSibling.nodeValue=="基础研究")
					  {
						  studyrow.style.display="";
						  linyurow.style.display="none";
						  techrow.style.display="none";

					  }
					  else if(this.nextSibling.nodeValue=="生产性活动"||this.nextSibling.nodeValue=="应用研究"||this.nextSibling.nodeValue=="试验发展"||this.nextSibling.nodeValue=="研究发展与成果应用"||this.nextSibling.nodeValue=="技术推广与科技服务 "||this.nextSibling.nodeValue=="其他技术")
					  {
						  studyrow.style.display="none";
						  linyurow.style.display="";
						  techrow.style.display="";




					  }
			  }
		  }
	  }

  }



  /***********/
   function check1()
   {
	   if(form1.username.value=="")
		   {
		   alert("请输入机构全称");
		   document.getElementById("username").focus(); 
		   return false;
		   
		   }
	   
   }
   function check2()
   {
	   if(form1.guiguan.value=="")
		   {
		   alert("请输入规管部门");
		   document.getElementById("guiguan").focus(); 
		   return false;
		   
		   }
	   
   }
   function checka()
   {
	   if(form1.adress1.value=="")
		{
		   alert("通讯地址不完整请按格式输入");
		   document.getElementById("adress1").focus(); 
		   
		   return false; 
		   }
	   
	   
   }
   function checkb()
   {
	   if(form1.adress2.value=="")
		{
		   alert("通讯地址不完整请按格式输入");
		   document.getElementById("adress2").focus(); 
		   return false; 
		   }
	   
	   
   }
   function checkc()
   {
	   if(form1.adress3.value=="")
		{
		   alert("通讯地址不完整请按格式输入");
		   document.getElementById("adress3").focus(); 
		   return false; 
		   }
	   
	   
   }
   function checkd()
   {
	   if(form1.adress4.value=="")
		{
		   alert("通讯地址不完整请按格式输入");
		   document.getElementById("adress4").focus(); 
		   return false; 
		   }
	   
	   
   }
   function check4()
   {
	   if(form1.wadress.value=="")
		   {
		   alert("请输入单位网址");
		   document.getElementById("wadress").focus(); 
		   return false;
		   }
	
		    
	   
   }
   function check5()
   {
	   if(form1.email.value=="")
		   {
		   alert("请输入电子信箱");
		   return false;
		   }
	   var email = document.getElementById("email").value; //获取邮箱地址 
	   //判断邮箱格式是否正确 
	   if(!/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(email))
	   { 
	   alert("请输入正确的邮箱格式，例如：123@qq.com"); 
	   document.getElementById("email").focus(); //让邮箱文本框获得焦点 
	   return false; 
	   }
   }
  
   function check6()
   {
	   if(form1.present.value=="")
		   {
		   alert("请输入法人代表");
		   document.getElementById("present").focus(); 
		   return false;
		   
		   }
	   
   }
 /*   function check7()
   {
	   if(form1.youbian.value=="")
		   {
		   alert("请输入邮政编码");
		   return false;
		   }
	   var w=document.getElementById("youbian").value.length;
	   if(w<6||w>6)
		   {
		     alert("请输入正确的邮编！")
		     return false;
		   }
	   
   } */
   function check8()
   {
	   if(form1.callname.value=="")
		   {
		   alert("请输入联系人");
		   document.getElementById("callname").focus(); 
		   return false;
		   
		   }
	   
   }

   /* function check9()
   {
	   if(form1.number.value=="")
	   {
	   alert("请输入电话号码");
	   return false;
	   
	   }
	   
	  var number=document.getElementById("number").value;
	  

	  
	   if(!(/^\d{3,4}\-\d{7,8}$/.test(number)))
		   {
		   alert("请输入正确的电话格式，例如:0517-12345678")
		   document.getElementById("number").focus();
		   return false;
		   
	   }  
	   
   } */
   function check10()
   {
	   if(form1.pnumber.value=="")
		   {
		   alert("请输入手机");
		   document.getElementById("pnumber").focus(); 
		   return false;
		   }
	

   }
   
   
 /*   function check11()
   {
	   if(form1.chuanzhen.value=="")
		   {
		   alert("请输入传真");
		   return false;
		   
		   }
	   var s=document.getElementById("chuanzhen").value.length;
	   if(s>8||s<7)
		   {
		    alert("输入的传真号格式不对，应该为7-8位的数字")
		   }
	   
	   
   } */
  function onchange()
  {
	 if(form1.InsProperty.click=="")
		 {
		 alert("请选择");
		 return false;
		 }
	  
  }


  function kw(){

	  
	var k1=document.getElementById("keyw1").value;
	var k2=document.getElementById("keyw2").value;
	var k3=document.getElementById("keyw3").value;
	var k4=document.getElementById("keyw4").value;
	var k5=document.getElementById("keyw5").value;
	  if(k1=="")
	{
	    KeyWord2.readOnly=true;
	    KeyWord3.readOnly=true;
	    KeyWord4.readOnly=true;
	    KeyWord5.readOnly=true;
	    alert("请输入至少一个关键字！")
	    document.getElementById("keyw1").focus();
	    
	}
		else
		{
			 KeyWord2.readOnly=false;
			
		}
	  if(k2=="")
		  {
		    KeyWord3.readOnly=true;
		    KeyWord4.readOnly=true;
		    KeyWord5.readOnly=true;
		  }
		else
		{
			 KeyWord3.readOnly=false;
		}
	  if(k3=="")
		  {
		    KeyWord4.readOnly=true;
		    KeyWord5.readOnly=true;
		  }
		else
		{
			 KeyWord4.readOnly=false;
			
		}
	  if(k4=="")
		  {
		    KeyWord5.readOnly=true;
		  }
		else
		{
			 KeyWord5.readOnly=false;
			
		}
  }
	     
	    
  function check13()
  {
	  var pnumber = document.getElementById('pnumber').value;
	   /^[1][34578]\d{9}$/; 
  
  if (!(/^1[34578]\d{9}$/.test(pnumber))) {  
	   alert("请输入正确的手机号格式，例如：138****1234")
	   document.getElementById("pnumber").focus();
  return false; 

  } 
  }
  /* function add()
  {
	  var num1 = document.getElementById('zitou').value; //获取第一个输入框的值
      var num2 = document.getElementById('daikuan').value;//获取第二个输入框的值
      var num3=document.getElementById("qita").value;//第三个值
      num1 = parseInt(num1);  //转换为整数
      num2 = parseInt(num2);
      num3=parseInt(num3);
      if (isNaN(num1) || isNaN(num2)||isNaN(num3)) {  //如果为非数字，结果为空
          document.getElementById('jihua').value = "";
      } else {  //将第三个输入框设置为和
          document.getElementById('jihua').value = num1 + num2 + num3;
      }
  } */
  function textCounter(field, countfield, maxlimit) {    
	// 函数，3个参数，表单名字，表单域元素名，限制字符；    
	       if (field.value.length > maxlimit)
		   {    
	       //如果元素区字符数大于最大字符数，按照最大字符数截断；    
	      field.value = field.value.substring(0, maxlimit);
		 
		   }
	       else    
			//在记数区文本框内显示剩余的字符数；    
	       countfield.value = maxlimit - field.value.length;    
	      }    

  function YearYanzheng()
  {
	  var y1=document.getElementById("qishinian").value;
	  var y2=document.getElementById("zhongzhinian").value;
  
	   if(y1>y2)
		   {
		      alert("截止年份应当大于起始年份！")
			   document.getElementById("qishinian").focus();
		      return false;
		   }
  }
 
	function check1() {
		
		
		
		
		if(form1.Address.value=="")
		{
			alert("通讯地址不能为空!");
		    form1.Address.focus();
		   return false;
		}
		
		if(form1.DZYX.value=="")
		{
			alert("电子邮箱不能为空!");
		    form1.DZYX.focus();
		   return false;
		}
		if(form1.LegRep.value=="")
		{
			alert("法人代表不能为空!");
		    form1.LegRep.focus();
		   return false;
		}
		if(form1.Linkman.value=="")
		{
			alert("联系人不能为空!");
		    form1.Linkman.focus();
		   return false;
		}
		if(form1.Cellphone.value=="")
		{
			alert("手机不能为空!");
		    form1.Cellphone.focus();
		   return false;
		}
		
		if(form1.InsProp.value==""&&form1.InsProp.value==null)
		{
			alert("机构属性不能为空!");
		   return false;
		}
		if(form1.InsIntro.value=="")
		{
			alert("机构简介不能为空!");
		    form1.InsIntro.focus();
		   return false;
		}
		if(form1.InsProp.value=="")
		{
			alert("机构属性不能为空!");
		   
		   return false;
		}
		if(form1.NeedName.value=="")
		{
			alert("技术需求名称不能为空!");
		    form1.NeedName.focus();
		   return false;
		}
		if(form1.Question.value=="" &&form1.TechKey.value=="" &&form1.Exceptgoal.value=="")
		{
			alert("需求概述不能为空!");
			form1.Question.focus();
		   return false;
		}
		if(form1.GJZ1.value=="")
		{
			alert("关键字不能为空!");
		    form1.GJZ1.focus();
		   return false;
		}
		if(form1.CooperateMode.value=="")
		{
			alert("技术需求解决方式不能为空!");
		    
		   return false;
		}
		if(form1.SearchKind.value=="")
		{
			alert("科技活动类型不能为空!");
		    
		   return false;
		}

		
		
		return true;
	}
  
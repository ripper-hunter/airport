//javaScript
  window.onload= function(){ 
	  
	  //��ڲ���
	  $.getJSON("loadbumen", function(data) {
		  
		  $("#guikou").html("");
		/*$("#bumen").append("<option value=''></option>");*/
		  $.each(data.bumen, function(i, biao) {
			  $("#guikou").append(
					  "<option value='"+ biao.bumen+"'>"+biao.bumen+"</option>");
			
		  });
	  });
	  //���ڵ���
	  $.getJSON("loaddiyu", function(data) {
		  $("#diyu").html("");
		 /* $("#diyu").append("<option value=''></option>");*/
		  $.each(data.diyu, function(i, biao) {
			  $("#diyu").append(
					  "<option value='"+ biao.title +"'>"+ biao.title +"</option>");
		  });
	  });
	  
	  
	  var inpt= document.getElementById('form3').getElementsByTagName('input');  //��ȡ�������е�inputԪ��
	  for(var i=0;i<inpt.length;i++){   //������õ�inputԪ��
		  if(inpt[i].type=='radio'){   //����ǵ�ѡ��ť


			  inpt[i].onclick=function(){ // input�ĵ����¼�
				  if(this.checked)

					  if(this.nextSibling.nodeValue=="�����о�")
					  {
						  studyrow.style.display="";
						  linyurow.style.display="none";
						  techrow.style.display="none";

					  }
					  else if(this.nextSibling.nodeValue=="�����Ի"||this.nextSibling.nodeValue=="Ӧ���о�"||this.nextSibling.nodeValue=="���鷢չ"||this.nextSibling.nodeValue=="�о���չ��ɹ�Ӧ��"||this.nextSibling.nodeValue=="�����ƹ���Ƽ����� "||this.nextSibling.nodeValue=="��������")
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
		   alert("���������ȫ��");
		   document.getElementById("username").focus(); 
		   return false;
		   
		   }
	   
   }
   function check2()
   {
	   if(form1.guiguan.value=="")
		   {
		   alert("�������ܲ���");
		   document.getElementById("guiguan").focus(); 
		   return false;
		   
		   }
	   
   }
   function checka()
   {
	   if(form1.adress1.value=="")
		{
		   alert("ͨѶ��ַ�������밴��ʽ����");
		   document.getElementById("adress1").focus(); 
		   
		   return false; 
		   }
	   
	   
   }
   function checkb()
   {
	   if(form1.adress2.value=="")
		{
		   alert("ͨѶ��ַ�������밴��ʽ����");
		   document.getElementById("adress2").focus(); 
		   return false; 
		   }
	   
	   
   }
   function checkc()
   {
	   if(form1.adress3.value=="")
		{
		   alert("ͨѶ��ַ�������밴��ʽ����");
		   document.getElementById("adress3").focus(); 
		   return false; 
		   }
	   
	   
   }
   function checkd()
   {
	   if(form1.adress4.value=="")
		{
		   alert("ͨѶ��ַ�������밴��ʽ����");
		   document.getElementById("adress4").focus(); 
		   return false; 
		   }
	   
	   
   }
   function check4()
   {
	   if(form1.wadress.value=="")
		   {
		   alert("�����뵥λ��ַ");
		   document.getElementById("wadress").focus(); 
		   return false;
		   }
	
		    
	   
   }
   function check5()
   {
	   if(form1.email.value=="")
		   {
		   alert("�������������");
		   return false;
		   }
	   var email = document.getElementById("email").value; //��ȡ�����ַ 
	   //�ж������ʽ�Ƿ���ȷ 
	   if(!/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(email))
	   { 
	   alert("��������ȷ�������ʽ�����磺123@qq.com"); 
	   document.getElementById("email").focus(); //�������ı����ý��� 
	   return false; 
	   }
   }
  
   function check6()
   {
	   if(form1.present.value=="")
		   {
		   alert("�����뷨�˴���");
		   document.getElementById("present").focus(); 
		   return false;
		   
		   }
	   
   }
 /*   function check7()
   {
	   if(form1.youbian.value=="")
		   {
		   alert("��������������");
		   return false;
		   }
	   var w=document.getElementById("youbian").value.length;
	   if(w<6||w>6)
		   {
		     alert("��������ȷ���ʱ࣡")
		     return false;
		   }
	   
   } */
   function check8()
   {
	   if(form1.callname.value=="")
		   {
		   alert("��������ϵ��");
		   document.getElementById("callname").focus(); 
		   return false;
		   
		   }
	   
   }

   /* function check9()
   {
	   if(form1.number.value=="")
	   {
	   alert("������绰����");
	   return false;
	   
	   }
	   
	  var number=document.getElementById("number").value;
	  

	  
	   if(!(/^\d{3,4}\-\d{7,8}$/.test(number)))
		   {
		   alert("��������ȷ�ĵ绰��ʽ������:0517-12345678")
		   document.getElementById("number").focus();
		   return false;
		   
	   }  
	   
   } */
   function check10()
   {
	   if(form1.pnumber.value=="")
		   {
		   alert("�������ֻ�");
		   document.getElementById("pnumber").focus(); 
		   return false;
		   }
	

   }
   
   
 /*   function check11()
   {
	   if(form1.chuanzhen.value=="")
		   {
		   alert("�����봫��");
		   return false;
		   
		   }
	   var s=document.getElementById("chuanzhen").value.length;
	   if(s>8||s<7)
		   {
		    alert("����Ĵ���Ÿ�ʽ���ԣ�Ӧ��Ϊ7-8λ������")
		   }
	   
	   
   } */
  function onchange()
  {
	 if(form1.InsProperty.click=="")
		 {
		 alert("��ѡ��");
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
	    alert("����������һ���ؼ��֣�")
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
	   alert("��������ȷ���ֻ��Ÿ�ʽ�����磺138****1234")
	   document.getElementById("pnumber").focus();
  return false; 

  } 
  }
  /* function add()
  {
	  var num1 = document.getElementById('zitou').value; //��ȡ��һ��������ֵ
      var num2 = document.getElementById('daikuan').value;//��ȡ�ڶ���������ֵ
      var num3=document.getElementById("qita").value;//������ֵ
      num1 = parseInt(num1);  //ת��Ϊ����
      num2 = parseInt(num2);
      num3=parseInt(num3);
      if (isNaN(num1) || isNaN(num2)||isNaN(num3)) {  //���Ϊ�����֣����Ϊ��
          document.getElementById('jihua').value = "";
      } else {  //�����������������Ϊ��
          document.getElementById('jihua').value = num1 + num2 + num3;
      }
  } */
  function textCounter(field, countfield, maxlimit) {    
	// ������3�������������֣�����Ԫ�����������ַ���    
	       if (field.value.length > maxlimit)
		   {    
	       //���Ԫ�����ַ�����������ַ�������������ַ����ضϣ�    
	      field.value = field.value.substring(0, maxlimit);
		 
		   }
	       else    
			//�ڼ������ı�������ʾʣ����ַ�����    
	       countfield.value = maxlimit - field.value.length;    
	      }    

  function YearYanzheng()
  {
	  var y1=document.getElementById("qishinian").value;
	  var y2=document.getElementById("zhongzhinian").value;
  
	   if(y1>y2)
		   {
		      alert("��ֹ���Ӧ��������ʼ��ݣ�")
			   document.getElementById("qishinian").focus();
		      return false;
		   }
  }
 
	function check1() {
		
		
		
		
		if(form1.Address.value=="")
		{
			alert("ͨѶ��ַ����Ϊ��!");
		    form1.Address.focus();
		   return false;
		}
		
		if(form1.DZYX.value=="")
		{
			alert("�������䲻��Ϊ��!");
		    form1.DZYX.focus();
		   return false;
		}
		if(form1.LegRep.value=="")
		{
			alert("���˴�����Ϊ��!");
		    form1.LegRep.focus();
		   return false;
		}
		if(form1.Linkman.value=="")
		{
			alert("��ϵ�˲���Ϊ��!");
		    form1.Linkman.focus();
		   return false;
		}
		if(form1.Cellphone.value=="")
		{
			alert("�ֻ�����Ϊ��!");
		    form1.Cellphone.focus();
		   return false;
		}
		
		if(form1.InsProp.value==""&&form1.InsProp.value==null)
		{
			alert("�������Բ���Ϊ��!");
		   return false;
		}
		if(form1.InsIntro.value=="")
		{
			alert("������鲻��Ϊ��!");
		    form1.InsIntro.focus();
		   return false;
		}
		if(form1.InsProp.value=="")
		{
			alert("�������Բ���Ϊ��!");
		   
		   return false;
		}
		if(form1.NeedName.value=="")
		{
			alert("�����������Ʋ���Ϊ��!");
		    form1.NeedName.focus();
		   return false;
		}
		if(form1.Question.value=="" &&form1.TechKey.value=="" &&form1.Exceptgoal.value=="")
		{
			alert("�����������Ϊ��!");
			form1.Question.focus();
		   return false;
		}
		if(form1.GJZ1.value=="")
		{
			alert("�ؼ��ֲ���Ϊ��!");
		    form1.GJZ1.focus();
		   return false;
		}
		if(form1.CooperateMode.value=="")
		{
			alert("������������ʽ����Ϊ��!");
		    
		   return false;
		}
		if(form1.SearchKind.value=="")
		{
			alert("�Ƽ�����Ͳ���Ϊ��!");
		    
		   return false;
		}

		
		
		return true;
	}
  
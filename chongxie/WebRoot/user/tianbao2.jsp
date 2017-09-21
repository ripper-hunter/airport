<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.util.Date"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'tianbao.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

 <style type="text/css">
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
 <script src="jquery/jquery-1.7.min.js"></script> 
 <script type="text/javascript" src="jscheck/ty.js" charset="UTF-8">
  </script>
  

</head>


<body>


<h3 align="center">河北重大技术需求征集</h3>
 <div>
  <form id="form3" name="form3" method="post" action="xqgx" target="_parent">
        <s:iterator value="list">
    <table width="1195" height="1570" border="1" align="center">
 
	
		
      <tr>
        <td width="169" height="43">*机构全称</td>
        <td width="299"><label for="quancheng"></label>
        <input type="text"  name="tianbao.quancheng" id="quancheng" value="<s:property value="quancheng"/>">
        </td>
        <td width="169">归口管理部门</td>
        <td width="308" >
        <select style="width:160px;" select name="tianbao.guikou" size="1"id="guikou">
        	 <option value=""></option>
 		</select>
 		(默认为空白项)			
        </td>
      </tr>
      <tr>
        <td height="35">*通讯地址</td>
        <td><label for="tongxun"></label>
        <input type="text" name="tianbao.tongxun" id="tongxun" value="<s:property value="tongxun"/>"/>
        <label><div id="mestongxun" nowrap></div></label>
        </td>
        <td>*所在地域</td>
         <td width="308">
         <select style="width:160px;"select name="tianbao.diyu" size="1"id="diyu">
 		</select>
 		<label><div id="mesdiyu" nowrap></div></label>
        </td>
      </tr>
      <tr>
        <td height="32">网址</td>
        <td><label for="wangzhi"></label>
        <input type="text" name="tianbao.wangzhi" id="wangzhi" value="<s:property value="wangzhi"/>"/></td>
        <td>*电子邮箱</td>
        <td><label for="youxiang"></label>
        <input type="text" name="tianbao.youxiang" id="youxiang" onBlur="check5()" value="<s:property value="youxiang"/>"/>
         <label><div id="mesyouxiang" nowrap></div></label>
        </td>
      </tr>
      <tr>
        <td height="31">*法人代表</td>
        <td><label for="daibiao"></label>
        <input type="text" name="tianbao.daibiao" id="daibiao" value="<s:property value="daibiao"/>"/></td>
        <td>邮政编码</td>
        <td><label for="youbian"></label>
        <input type="text" name="tianbao.youbian" id="youbian" value="<s:property value="youbian"/>"/>
        <label><div id="mesyoubian" nowrap></div></label>
        </td>
      </tr>
      <tr>
        <td height="37">*联系人</td>
        <td><label for="lianxi"></label>
        <input type="text" name="tianbao.lianxi" id="lianxi" value="<s:property value="lianxi"/>"/></td>
        <td>固定电话</td>
        <td><label for="Phone"></label>
        <input type="text" name="tianbao.phone" id="phone" value="<s:property value="phone"/>" /></td>
      </tr>
      <tr>
        <td height="37">*手机</td>
        <td><label for="mphone"></label>
        <input type="text" name="tianbao.mphone" id="mphone" value="<s:property value="mphone"/>" onblur="check10()" onblur="check13()"/></td>
        <td>传真</td>
        <td><label for="chuanzhen"></label>
        <input type="text" name="tianbao.chuanzhen" id="chuanzhen" value="<s:property value="chuanzhen"/>"/></td>
      </tr>
      <tr>
        <td height="37">*机构属性</td>
        <td colspan="3">
        <label>
            <input type="radio" name="tianbao.jigou" value="企业 " id="Ins_0" /> 企业 </label>
          <label>
            <input type="radio" name="tianbao.jigou" value="高等院校" id="Ins_1" />高等院校</label>
          <label>
            <input type="radio" name="tianbao.jigou" value="研究机构 " id="Ins_2" />研究机构 </label>
          <label>
            <input type="radio" name="tianbao.jigou" value="其他" id="Ins_3" />其他</label>
       
        </td>
      </tr>
      <tr>
        <td colspan="4"><p>机构简介：（主要包括基本情况、现有研究基础等，限500字以内）</p>
        <p>
          <label for="jianjie"></label>
          <textarea name="tianbao.jianjie" id="jianjie" cols="100" rows="5" placeholder="机构简介" class="comments" width="100%"onKeyDown="textCounter(this.form.jianjie,this.form.Shengyu,500);"   onKeyUp="textCounter(this.form.jianjie,this.form.Shengyu,500);"><s:property value="jianjie"/></textarea>
        </p>
        <p>剩余字数
          <label for="Shengyu"></label>
          <input name="Shengyu" type="text" id="Shengyu" size="5" readonly="true"/>
          字
        </p></td>
      </tr>
      <tr>
        <td height="46">*技术需求名称</td>
        <td><label for="jname"></label>
        
       	<input type="text" name="tianbao.jname" id="jname" value="<s:property value="jname"/>" />
        
        </td><td>*需求时限</td>
        <td>
         <select name="tianbao.qishinian" style="width: 90px;" id="qishinian"> 
     <option value="">--- 请选择 ---</option> 
              <%  
                     StringBuffer bufYear = new StringBuffer();  
                     //下拉列表的年数  
                     for(int i=0;i<100;i++){  
                     //最小年  
                     int iYear = 2016+i;  
                     bufYear.append("<option value = '"+iYear+"'");  
                     Date date = new Date();  
                     int sYear = date.getYear();  
                     //系统时间从1900年开始  
                     int sYearc = sYear+1900;  
                     if(iYear == sYearc){  
                          bufYear.append(" selected");  
                      }  
                     bufYear.append(" >"+iYear+"</option>\n");  
                     }  
                     out.println(bufYear.toString());  
               %>  
      </select>-  
     <select name='tianbao.zhongzhinian' style="width: 90px;" id="zhongzhinian"onblur="YearYanzheng()">  
       <option value="">--- 请选择 ---</option>
              <%  
                     StringBuffer bufYear2 = new StringBuffer();  
                     //下拉列表的年数  
                     for(int i=0;i<100;i++){  
                     //最小年  
                    
                     int iYear2 = 2016+i;  
                     bufYear2.append("<option value = '"+iYear2+"'");  
                     Date date = new Date();  
                     int sYear2 = date.getYear();  
                     //系统时间从1900年开始  
                     int sYearc2 = sYear2+1900;  
                      if(iYear2 == sYearc2){  
                          bufYear2.append(" selected");  
                      }  
                     bufYear2.append(" >"+iYear2+"</option>\n");  
                     }  
                     out.println(bufYear2.toString());  
               %>  
      </select>  
        <label><div id="mesyear" nowrap></div></label>
        
        </td>
      </tr>
      <tr>
        <td colspan="4"><p>*技术需求概述</p>
          <p>1.主要问题（需要解决的重大技术问题。）</p>
          <p>2.技术关键（所需要的关键技术、主要指标）</p>
          <p>3.预期目标（技术创新性、经济社会效益，限500字内）</p>
          <textarea name="tianbao.gaishu" id="gaishu" cols="100" rows="5"placeholder="重大需求概述" value="<s:property value="gaishu"/>"" class="comments"width="100%"onKeyDown="textCounter(this.form.gaishu,this.form.Shengyu1,500);"   onKeyUp="textCounter(this.form.gaishu,this.form.Shengyu1,500);"></textarea>
        <p>剩余字数
          <label for="Shengyu1"></label>
          <input name="Shengyu1" type="text" id="Shengyu1" size="5" readonly="readonly"/>字 </p>
      </tr>
      <tr>
        <td>*关键字（1-5个，逐个录入）</td>
        <td colspan="3">
        <input name="gjzi" type="text" id="keyw1" placeholder="关键字" value="" size="10" onKeyUp="kw()"/>
            ----
            <label for="gjzi"></label>
            <input name="tianbao.gjzi" type="text" id="keyw2" size="10" readonly="true"onkeyup="kw()" value=""/>
            ----
            <label for="gjzi"></label>
            <input name="tianbao.gjzi" type="text" id="keyw3" size="10" readonly="true"onkeyup="kw()"value=""/>
            ----
            <label for="gjzi"></label>
            <input name="tianbao.gjzi" type="text" id="keyw4" size="10" readonly="true" onKeyUp="kw()"value=""/>
            ----
            <label for="gjzi"></label>
            <input name="tianbao.gjzi" type="text" id="keyw5" size="10" readonly="true"value=""/>
            <input name="tianbao.gjzi" type="hidden" id="gjzi"value=""/>
        </td>
      </tr>
      <tr>
        <td height="33">拟投入资金总额</td>
        <td colspan="3"> <input type="text" name="tianbao.zijin" id="zijin"placeholder="拟投入总金额" value=""/> 
        万元</td>
      </tr>
      <tr>
        <td>*技术需求解决方式</td>
        <td colspan="3"> <label>
            <input type="radio" name="tianbao.fangshi" value="独立研发" id="fs_0" />独立研发</label >
           <label>
            <input type="radio" name="tianbao.fangshi" value="委托研发" id="fs_1" />委托研发 </label>
          <label>
            <input type="radio" name="tianbao.fangshi" value="合作研发" id="fs_2" />合作研发</label>
          <label>
            <input type="radio" name="tianbao.fangshi" value="其他" id="fs_3" />其他</label>
        <p>合作意向单位:
         <input type="text" name="tianbao.yixiandanwei" id="yixiandanwei"placeholder="合作意向单位" value=""/>
         </p>
        </td>
      </tr>
      <tr>
        <td height="40">*科技活动类型</td>
        <td colspan="3">
         <label>
            <input type="radio" name="tianbao.hdlx" value="基础研究" id="hdlx_0" />基础研究</label>
          <label>
            <input type="radio" name="tianbao.hdlx" value="应用研究" id="hdlx_1" />应用研究</label>
          <label>
            <input type="radio" name="tianbao.hdlx" value="试验发展" id="hdlx_2" />试验发展</label>
             <br />
          <label>
            <input type="radio" name="tianbao.hdlx" value="研究发展与成果应用" id="hdlx_3" />研究发展与成果应用</label>
          <label>
            <input type="radio" name="tianbao.hdlx" value="技术推广与科技服务 " id="hdlx_4" />技术推广与科技服务 </label>
         <label>
            <input type="radio" name="tianbao.hdlx" value="生产性活动 " id="hdlx_5" />生产性活动 </label>
        </p>
        </td>
      </tr>
     
     <tr id="studyrow">
        <td>*学科分类</td>
        <td colspan="3">
        <label for="XKFL"></label>
          <select name="XKFL1" size="1" id="XKFL1" style="width:250px;" onChange="getSecondXkfls();">
        </select>     
        <select name="XKFL2" id="XKFL2" style="width:250px;"onchange="getThirdXkfls();">
        </select>
        <select name="XKFL3" id="XKFL3"style="width:250px;"onchange="inputXkfl();">
        </select>
        <input type="hidden" name="tianbao.xueke" id="XKFL"/>
        </td>
      </tr>
      <tr id="belongrow">
        <td height="37">*需求技术所属领域</td>
        <td colspan="3">
          <label>
            <input type="checkbox" name="tianbao.xuqiuliyu" value="电子信息" id="linyu_0" />
            电子信息</label>
          <label>
            <input type="checkbox" name="tianbao.xuqiuliyu" value="光机电一体化" id="linyu_1" />
            光机电一体化</label>
          <label>
            <input type="checkbox" name="tianbao.xuqiuliyu" value="生物技术与制药 " id="linyu_2" />
            生物技术与制药 </label>
          <label>
            <input type="checkbox" name="tianbao.xuqiuliyu" value="新材料及应用" id="linyu_3" />
            新材料及应用</label>
            <br/>
          <label>
            <input type="checkbox" name="tianbao.xuqiuliyu" value="现代农业" id="linyu_4" />
            现代农业</label>
            <label>
            <input type="checkbox" name="tianbao.xuqiuliyu" value="新能源与高效节能" id="linyu_5" />
            新能源与高效节能</label>
          <label>
            <input type="checkbox" name="tianbao.xuqiuliyu" value="资源与环境 " id="linyu_6" />
            资源与环境</label>
          <label>
            <input type="checkbox" name="tianbao.xuqiuliyu" value="高技术服务业" id="linyu_7" />
            高技术服务业</label>
           <br/>
          <label>
            <input type="checkbox" name="tianbao.xuqiuliyu" value="海洋" id="linyu_8" />
            海洋</label>
          <label>
            <input type="checkbox" name="tianbao.xuqiuliyu" value="社会公共事业" id="linyu_9" />
            社会公共事业</label>
           <label>
            <input type="checkbox" name="tianbao.xuqiuliyu" value="医疗卫生" id="linyu_10" />
            医疗卫生</label>
          <label>
            <input type="checkbox" name="tianbao.xuqiuliyu" value="其他" id="linyu_11" /> 其他(在下面注明)</label>
          <br/>
          其他技术：
          <label for="qita"></label>
          <input type="text" name="tianbao.qita" id="qita"placeholder="其它技术" value=""/>
          <br />
       
        </td>
      </tr>
      <tr id="applyrow">
        <td height="78">*需求技术应用行业</td>
        <td colspan="3"><label for="XQJSYYHY"></label>
          <label for="XQJSYYHY1"></label>
          <select name="XQJSYYHY1" size="1" id="XQJSYYHY1" style="width:250px;"onchange="getSecondGmjjhys()" ><!--  -->
        </select>      <label for="XQJSYYHY2"></label>
        <select name="XQJSYYHY2" id="XQJSYYHY2" style="width:250px;" onChange="getThirdGmjjhys()">
        </select>
        <label for="XQJSYYHY3"></label>
        <select name="XQJSYYHY3" id="XQJSYYHY3"style="width:250px;" onChange="inputXqjsyyhy();">
        </select>
         <input type="hidden" name="tianbao.xuqiuyingyong" id="XQJSYYHY"/>
        </td>
      </tr>
      <tr align="center">
        <td height="31">审核状态</td>
        <td height="31" colspan="3"><select name="tianbao.zhuangtai" style="width: 90px;" id="zhuangtai" >
          <option value="保存未提交">保存未提交</option>
          <option value="提交">提交</option>
        </select>
          <select name="tianbao.njname" style="width: 90px;" id="njname" >
            <option value="未审核">未审核</option>
        </select></td>
      </tr>
      <tr align="center">
        <td height="31" colspan="4">&nbsp;
        	<input type="submit" name="tijiao" id="tijiao"   value="确认" />
      	 <input type="reset" name="reset" id="reset" value="重置" ></td>
      </tr>
        
    
         
              </table>
              
      </s:iterator>
  </form>
  
</div>



  
     <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
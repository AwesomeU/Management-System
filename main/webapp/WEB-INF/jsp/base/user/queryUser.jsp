<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引用jquery easy ui的js库及css -->
<LINK rel="stylesheet" type="text/css"
	href="${baseurl}js/easyui/styles/default.css">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<title>用户管理</title>
<script type="text/javascript">
// datagride列定义
var columns_v = [ [ {
		field : 'tzbh',//对应json中的key
		title : 'TZBH',
		width : 120
	}, {
		field : 'khbh',//对应json中的key
		title : 'KHBH ',
		width : 120
	}, {
		field : 'cmdm',//对应json中的key
		title : 'CMDM',
		width : 120,
		/* formatter : function(value, row, index) {//通过此方法格式化显示内容,value表示从json中取出该单元格的值，row表示这一行的数据，是一个对象,index:行的序号
			if(value =='1'){
				return "卫生局";
			}else if(value =='2'){
				return "卫生院";
			}else if(value =='3'){
				return "卫生室";
			}else if(value =='4'){
				return "供货商";
			}else if(value =='0'){
				return "系统管理员";
			}
		} */

	}, {
		field : 'hchc',//对应json中的key
		title : 'HCHC',
		width : 120
	}, {
		field : 'tdh',//对应json中的key
		title : 'TDH',
		width : 120,
	}, {
		field : 'fmdm',//对应json中的key
		title : 'FMDM',
		width : 120,
	}, {
		field : 'cc',//对应json中的key
		title : 'CC',
		width : 120,
	}, {
		field : 'slsl',//对应json中的key
		title : 'SLSL',
		width : 120,
	}, {
		field : 'ysje',//对应json中的key
		title : 'YSJE',
		width : 120,
	}, {
		field : 'nsje',//对应json中的key
		title : 'NSJE',
		width : 120,
	}, {
		field : 'option1',
		title : '删除',
		width : 120,
		formatter : function(value, row, index) {//通过此方法格式化显示内容,value表示从json中取出该单元格的值，row表示这一行的数据，是一个对象,index:行的序号
			return "<a href=javascript:deleteuser('"+row.tzbh+"')>删除</a>";
		}
	} , {
		field : 'option2',
		title : '修改',
		width : 120,
		formatter : function(value, row, index) {//通过此方法格式化显示内容,value表示从json中取出该单元格的值，row表示这一行的数据，是一个对象,index:行的序号
			return "<a href=javascript:edituser('"+row.tzbh+"')>修改</a>";
		}
	}  ] ];

//定义 datagird工具
var toolbar_v = [ 
		{//工具栏
			id : 'btnadd',
			text : '添加',
			iconCls : 'icon-add',
			handler : function() {
				//打开一个窗口，用户添加页面
				//参数：窗口的title、宽、高、url地址
				createmodalwindow("添加用户信息", 800, 250, '${baseurl}user/addsysuser.action');
			}	
		},
		{
			text: '导入模板',
			iconCls: 'icon-add',
			handler: function () {
				$('#templateDialog').dialog('open')
			}
		}
   ];

//加载datagrid
$(function() {
	$('#sysuserlist').datagrid({
		title : '用户查询',//数据列表标题
		nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
		striped : true,//条纹显示效果
		url : '${baseurl}user/query_result.action',//加载数据的连接，引连接请求过来是json数据
		idField : 'TZBH',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响 获取当前选中行的方法执行
		loadMsg : '',
		columns : columns_v,
		pagination : true,//是否显示分页
		rownumbers : true,//是否显示行号
		pageList:[20,35,55],
		toolbar : toolbar_v
	});
});

// 查询方法
function queryuser() {
	// datagrid的load方法要求传入json数据，最终会将json转成key/value数据传入action
	
	// 准备封装js方法，将form表单数据提取出来，组成json
	var formdata = $("#sysuserqueryForm").serializeJson();
	$('#sysuserlist').datagrid('load',formdata);
	/* $('#sysuserlist').datagrid('load',{
		'sysuser.TDH' : $('tdh').val()
	}); */
}
// 删除用户
function deleteuser(id) {
	//第一个参数是提示信息，第二个参数，取消执行的函数指针，第三个参是，确定执行的函数指针
	_confirm('您确认删除吗？',null,function (){

		//将要删除的id赋值给deleteid，deleteid在sysuserdeleteform中
		$("#delete_id").val(id);
		//使用ajax的from提交执行删除
		//sysuserdeleteform：form的id，userdel_callback：删除回调函数，
		//第三个参数是url的参数
		//第四个参数是datatype，表示服务器返回的类型
		jquerySubByFId('sysuserdeleteform',userdel_callback,null,"json");
		
		
	});
}
// 删除用户的回调
	function userdel_callback(data){
		message_alert(data);
		// 刷新页面
		// 取出提交结果
		var type = data.resultInfo.type;
		if(type == 1){
			// 成功结果
			// 重新加载datagride
			queryuser();
		}
	}
	// 用户
	function edituser(id) {
		// 打开修改窗口
		console.log(id);
		createmodalwindow("修改提单号信息", 800, 250, '${baseurl}user/edituser.action?id='+id);
	}
</script>
</head>
<body>
	<!-- html静态布局 -->
	<form id="sysuserqueryForm">
		<!-- 查询条件 -->
		<TABLE class="table_search" align=center>
			<TBODY>
				<TR>
					<TD class="left">TZBH：</td>
					<td><INPUT type="text" name="sysuser.TZBH" /></TD>
					<TD class="left">TDH：</TD>
					<td><INPUT type="text" id="tdh" name="sysuser.TDH" /></TD>
	
					<TD class="left">HCHC：</TD>
					<td><INPUT type="text" name="sysuser.HCHC" /></TD>
					<TD class="left">类型：</TD>
					<!-- <td><select name="sysuserCustom.groupid"> -->
					<td><select> 
							<option value="">请选择</option>
							<!-- <option value="1">马</option>
							<option value="2">静</option>
							<option value="3">马静</option>
							<option value="4">马静静</option>
							<option value="0">马静静静</option> -->
							<!-- 改成数据字典的形式 -->
							<c:forEach items="${sysuserList}" var="sysuser">
								<option value="${sysuser.KHBH}">${sysuser.KHBH}</option>
							</c:forEach>
					</select></TD>
					<td><a id="btn" href="#" onclick="queryuser()"
						class="easyui-linkbutton" iconCls='icon-search'>查询</a></td>
				</TR>
	
	
			</TBODY>
		</TABLE>
	
	</form>
	
	<!-- 查询列表 -->
	<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
		<TBODY>
			<TR>
				<TD>
					<table id="sysuserlist"></table>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
	<!-- 模板导出 -->
	<div id="templateDialog" title="选择模板" model=true draggable=false class="easyui-dialog" closed=true style="width:350px;height:220px;">
		<form action="">
			<table>
				<tr>
					<td>选择模板：</td>
					<td>
						<input id="templates" name="templates" class="easyui-combobox" panelHeight="auto"
								url="importdata-templates" valueField="templateId" textField="templateName" value="" />
						<a id="okBtn" class="easyui-linkbutton">确定</a>	
					</td>
				</tr>
			</table>
		</form>
	</div>
	<form id="sysuserdeleteform" action="${baseurl}user/deletesysuser.action" method="post">
	  <input type="hidden" id="delete_id" name="id" />
	</form>
</body>
</html>
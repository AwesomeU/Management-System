package yycg.base.action;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.executor.ResultExtractor;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.apache.poi.ss.formula.functions.Rows;
import org.springframework.batch.repeat.support.ResultHolderResultQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import oracle.jdbc.driver.Message;
import yycg.base.pojo.po.QRCode;
import yycg.base.pojo.po.Sysuser;
import yycg.base.pojo.vo.PageQuery;
import yycg.base.pojo.vo.QueryVo;
import yycg.base.process.context.Config;
import yycg.base.process.result.DataGridResultInfo;
import yycg.base.process.result.ExceptionResultInfo;
import yycg.base.process.result.ResultInfo;
import yycg.base.process.result.ResultUtil;
import yycg.base.process.result.SubmitResultInfo;
import yycg.base.service.jftzService;
import yycg.base.service.systemConfigService;
import yycg.base.service.impl.iftzServiceImpl;
import yycg.utils.Files_Utils_DG;


@Controller
public class firstAction {
	
	@Autowired
	private jftzService userService;
	@Autowired
	private systemConfigService systemConfigService;
	
	//首页
	@RequestMapping("/first")
	public String first(Model model)throws Exception{	
		return "/WEB-INF/jsp/base/first";
	}
	
	//欢迎页面
	@RequestMapping("/welcome")
	public String welcome(){
		
		return "/WEB-INF/jsp/base/welcome";
	}
	
	// 用户页面
	@RequestMapping("/user/queryUser")
	public String queryUser(Model model)throws Exception{
		List<Sysuser> sysuserList = systemConfigService.findDropDownList("COSU4003966650");
		model.addAttribute("sysuserList", sysuserList);
		return "/WEB-INF/jsp/base/user/queryUser";
	}
	// 查询结果集
	@RequestMapping("user/query_result")
	public @ResponseBody DataGridResultInfo queryUserReault(
			int page, // 页码
			int rows, // 每页显示个数
			QueryVo queryVo
			) throws Exception{
		// 非空校验
		queryVo = queryVo != null? queryVo:new QueryVo();
		// 查询列表总数
		int total = userService.getUserListCount(queryVo);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		// 分页查询，向QueryVo中传入pageQuery
		queryVo.setPageQuery(pageQuery);
		
		
		List<Sysuser> list = userService.findUserListByVo(queryVo);
	
		DataGridResultInfo resultInfo = new DataGridResultInfo();
		// 填充total
		resultInfo.setTotal(total);
		// 填充rows
		resultInfo.setRows(list);
		return resultInfo;
			
	}
	
	// 添加用户页面
	@RequestMapping("user/addsysuser")
	public String addsysuser(Model model)throws Exception{
		return "/WEB-INF/jsp/base/user/addsysuser";
	}
	// 添加用户提交
	// 提交结果转json输出到页面，提交表单数据统一使用包装类,通过map存储失败信息和传递的数据
	@RequestMapping("user/addsysusersubmit")
	public @ResponseBody SubmitResultInfo addsysusersubmit(QueryVo queryVo)throws Exception{
		/*// 提示用户信息，默认成功/也可以先给一个空值null
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(ResultInfo.TYPE_RESULT_SUCCESS);
		resultInfo.setMessage("添加成功！");
		try{
			//调用service执行用户添加
			if (queryVo.getJfTz() == null){
				// message = "传入数据为空";
				// type = 1; // fail
				resultInfo = new ResultInfo();
				resultInfo.setType(ResultInfo.TYPE_RESULT_FAIL);
			} else {
				userService.insertSysuser(queryVo.getJfTz());
			}
		} catch(Exception e) {
			// 输出异常信息
			e.printStackTrace();
			
			// 解析系统自定义异常, 判断是否是系统自定义异常，因为有可能是runtime异常
			//解析系统自定义异常
			if(e instanceof ExceptionResultInfo){
				//抛出的是系统自定义异常
				resultInfo = ((ExceptionResultInfo)e).getResultInfo();
			}else{
				//重新构造“未知错误”异常
				resultInfo = new ResultInfo();
				resultInfo.setType(ResultInfo.TYPE_RESULT_FAIL);
				resultInfo.setMessage("未知错误！");
			}
		}
		// 将执行结果返回页面	
		SubmitResultInfo submitResultInfo = new SubmitResultInfo(resultInfo);
		return submitResultInfo;
		*/
		// 使用全局异常处理器，在这里就不需要进行try/catch捕获了
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(ResultInfo.TYPE_RESULT_SUCCESS);
		resultInfo.setMessage("添加成功！");
		// 直接调用方法抛出即可
		userService.insertSysuser(queryVo.getJfTz());
		SubmitResultInfo submitResultInfo = new SubmitResultInfo(resultInfo);
		return submitResultInfo;
		
		// 使用工具类可以直接一行代码实现，就不需要上面的一坨了
		//return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 200, null))
	}
	
	// 删除用户
	@RequestMapping("user/deletesysuser")
	public @ResponseBody SubmitResultInfo deleteSysuser(String id)throws Exception{
		// 调用service
		userService.deleteSysuser(id);
		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 202, null));
	}
	
	// 修改用户页面
	@RequestMapping("/user/edituser")
	public String edituser(Model model, String id)throws Exception{
		// 通过id取出用户信息，传到页面
		Sysuser sysuser = userService.findInfoByJfTz(id);
		model.addAttribute("sysuser", sysuser);
		return "/WEB-INF/jsp/base/user/edituser";
	}
	
	// 修改用户提交
	@RequestMapping("/user/editusersubmit")
	public @ResponseBody SubmitResultInfo editusersubmit(String id, QueryVo queryVo)throws Exception{
		userService.updateSysuser(id, queryVo.getJfTz());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 204, null));
	}
	@RequestMapping(value = "user/fileUpload_ajax",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    /*@ResponseBody
    public String fileUpload_ajax(HttpServletRequest request,HttpServletResponse response, @RequestParam("files") MultipartFile multipartFile) {
		response.addHeader("Access-Control-Allow-Origin", null);
		//调用保存文件的帮助类进行保存文件，并返回文件的相对路径
		String filePath= Files_Utils_DG.FilesUpload_stream(request,multipartFile,"/files/upload");
	    return "{'TFMark':'true','Msg':'upload success !','filePath':'" + filePath + "'}";
    }*/
     
     public @ResponseBody SubmitResultInfo upFile(HttpServletRequest request, HttpServletResponse response, @RequestParam("file_upload") MultipartFile multipartFile){
		response.addHeader("Access-Control-Allow-Origin", "null"); 
		String filePath=Files_Utils_DG.FilesUpload_stream(request,multipartFile,"//files//upload");
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 202, null));
     }
}

 // 以下是分离的方法, 前端采用Vue实现
/*@Controller
@RequestMapping("/search")
public class firstAction {
	
	@RequestMapping(value = {"/qrrcode"}) 
	public String test(HttpServletRequest request)throws Exception{
		
		// 将页面所需要的数据取出，传到页面
		return  request.getParameter("id");
	}
	
	@Autowired
	private jftzService service;
	
	
	// codeResult queryUserReault为 分离方法
	@RequestMapping(value = "/qrcode", method = RequestMethod.GET, headers = "Accept=application/json") // 处理器映射器所需要的链接
	public @ResponseBody DataGridResultInfo codeResult(
			HttpServletRequest request, HttpServletResponse response
			) throws Exception{
		
		response.addHeader("Access-Control-Allow-Origin", "http://localhost:8181");
		
		String content = request.getParameter("content");
		String name = request.getParameter("name");
		
		QRCode qrCode = new QRCode();
		qrCode.setContent(content);
		qrCode.setImgName(name);
		
		
		int width = 117;
		int height = 117;
		String format = "png";
		
		// 定义QRCode参数
		HashMap hints = new HashMap();
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);

		// 生成二维码
		try{
			BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height);
			Path file = new File("D:/async-file/FE-project/elementProject/src/img/"+name+".png").toPath();
			MatrixToImageWriter.writeToPath(bitMatrix, format, file);
			
			qrCode.setResult("success");
			List<QRCode> list = new ArrayList<QRCode>();
			list.add(qrCode);
			DataGridResultInfo resultInfo = new DataGridResultInfo();
			// 填充total
			resultInfo.setTotal(1);
			// 填充rows
			resultInfo.setRows(list);
			return resultInfo;
			
		}catch(Exception e){
			qrCode.setResult("fail" + e);
			List<QRCode> list = new ArrayList<QRCode>();
			list.add(qrCode);
			DataGridResultInfo resultInfo = new DataGridResultInfo();
			// 填充total
			resultInfo.setTotal(1);
			// 填充rows
			resultInfo.setRows(list);
			return resultInfo;
		}
	}
	
	@RequestMapping(value = "/searchId", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody DataGridResultInfo queryUserReault(
			HttpServletRequest request, HttpServletResponse response
			) throws Exception{
		response.addHeader("Access-Control-Allow-Origin", "http://localhost:8181");
		String params = request.getParameter("id");
		List<Sysuser> rows = service.findUserList(params);
		
		DataGridResultInfo resultInfo = new DataGridResultInfo();
		// 填充total
		resultInfo.setTotal(rows.size());
		// 填充rows
		resultInfo.setRows(rows);
		return resultInfo;
		
	}
	
}*/
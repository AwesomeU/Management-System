package yycg.base.process.result;


/**
 * 系统提交结果结果类型,提交类的方法统一使用该类型作为返回值方法
 * @author majing
 *
 */
public class SubmitResultInfo {

	public SubmitResultInfo(ResultInfo resultInfo){
		this.resultInfo = resultInfo;
	}
	
	//操作结果信息
	private ResultInfo resultInfo;
	
	public ResultInfo getResultInfo() {
		return resultInfo;
	}

	public void setResultInfo(ResultInfo resultInfo) {
		this.resultInfo = resultInfo;
	}
		
}

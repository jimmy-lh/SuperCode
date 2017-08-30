package com.cyhd.portalmvp.entity;

/*
 * 错误信息
 */
public class PlayErrorMessage {
	
    private int errorCode;
    private String errorMsg;
    private static PlayErrorMessage errormsg;
    
    private PlayErrorMessage(){
    	
    }
    
    public static synchronized PlayErrorMessage getInstace(){
    	if(errormsg == null){
    		errormsg = new PlayErrorMessage();
    	}
    	
		return errormsg;    	
    }
      
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
		
	public void setMessage(int errorCode,String errorMsg){
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public void clearMessage(){
		this.errorCode = 0;
		this.errorMsg = "";
	}
}

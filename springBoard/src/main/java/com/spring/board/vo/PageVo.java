package com.spring.board.vo;

public class PageVo {
	
	private int pageNo = 0;
	
	private String codeType;
	private String codeId;
	private String codeName;
	


    public String[] getArr() {
        return codeId == null ? new String[]{} : codeId.split(",");
        
    }
	
	

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getCodeId() {
		return codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
}

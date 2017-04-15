package org.framestudy.spring_mybatis.pojos;

import java.util.List;

public class Pager {
	private int page;
	private int rows;
	private int index;//起始位置
	
	private int totalRows;
	private int totalPage;
	private List<?> datas;
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {		
		this.totalRows = totalRows;
		totalPage = (totalRows%rows)==0?(totalRows/rows):(totalRows/rows+1);
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<?> getDatas() {
		return datas;
	}
	public void setDatas(List<?> datas) {
		this.datas = datas;
	}
	public int getIndex() {
//		index = (page-1)*rows;
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public Pager() {
		super();
		// TODO Auto-generated constructor stub
	}

	//只需要返回查询到的UserInfo的集合，所以此有参构造不需要添加其他属性！
		//其实还需要关心totalPage或者totalPage，因为页面要显示总共的页数~
	public Pager(int totalRows, List<?> datas) {
		super();
		this.totalRows = totalRows;
		this.datas = datas;
	}

	@Override
	public String toString() {
		return "Pager [page=" + page + ", rows=" + rows + ", index=" + index + ", totalRows=" + totalRows
				+ ", totalPage=" + totalPage + ", datas=" + datas + "]";
	}
	
	
}

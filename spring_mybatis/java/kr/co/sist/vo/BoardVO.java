package kr.co.sist.vo;

public class BoardVO {
	private int startNum, endNum;
	
	public BoardVO() {
		super();
	}
	//개발자인 내가 값을 넣을 때에는 생성자를 사용하는 것이 편하다.
	public BoardVO(int startNum, int endNum) {
		super();
		this.startNum = startNum;
		this.endNum = endNum;
	}
	//Framework에서 값을 넣거나 얻을 때에는 setter getter method 사용한다.
	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}
	
	
}

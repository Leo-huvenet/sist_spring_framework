package kr.co.sist.vo;

public class BoardVO {
	private int startNum, endNum;
	
	public BoardVO() {
		super();
	}
	//�������� ���� ���� ���� ������ �����ڸ� ����ϴ� ���� ���ϴ�.
	public BoardVO(int startNum, int endNum) {
		super();
		this.startNum = startNum;
		this.endNum = endNum;
	}
	//Framework���� ���� �ְų� ���� ������ setter getter method ����Ѵ�.
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

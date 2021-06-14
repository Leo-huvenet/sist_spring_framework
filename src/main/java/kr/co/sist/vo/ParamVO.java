package kr.co.sist.vo;

import java.util.Arrays;

/**
 * VO���� ���� : Web Parameter�� �����ϱ����� ����
 * ���� : HTML Form Control�� name�Ӽ� ���� VO�� instance ������ �̸��� �ݵ�� ���ƾ��Ѵ�.
 * ���ų� �ٸ��ٸ� �ش� ���� �Է¹��� �� ����.
 * VO�� Parameter�� ���� �� �⺻���� ������ �� �ִ� @RequestParam �� ����� �� ����.
 * @author user
 *
 */
public class ParamVO {
	private String nick;
	private int age;
	private String[] movie;
	//Framework������ �⺻�����ڸ� ����Ͽ� VO�� �����ϰ�,
	//web parameter�� ��ġ�ϴ� setter method�� ȣ���� �� ���� �����ϰ�,
	//�����ڴ� getter method ȣ���Ͽ� ���� ��´�.
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getMovie() {
		return movie;
	}
	public void setMovie(String[] movie) {
		this.movie = movie;
	}
	
	@Override
	public String toString() {
		return "ParamVO [nick=" + nick + ", age=" + age + ", movie=" + Arrays.toString(movie) + "]";
	}
	
	
	
}

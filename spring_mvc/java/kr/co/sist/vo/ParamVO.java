package kr.co.sist.vo;

import java.util.Arrays;

/**
 * VO만든 목적 : Web Parameter를 저장하기위한 목적
 * 주의 : HTML Form Control의 name속성 값과 VO와 instance 변수의 이름이 반드시 같아야한다.
 * 없거나 다르다면 해당 값은 입력받을 수 없다.
 * VO는 Parameter가 없을 때 기본값을 설정할 수 있는 @RequestParam 을 사용할 수 없다.
 * @author user
 *
 */
public class ParamVO {
	private String nick;
	private int age;
	private String[] movie;
	//Framework에서는 기본생성자를 사용하여 VO를 생성하고,
	//web parameter에 일치하는 setter method를 호출한 후 값을 설정하고,
	//개발자는 getter method 호출하여 값을 얻는다.
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

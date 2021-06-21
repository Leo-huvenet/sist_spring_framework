package kr.co.sist.domain;

public class IncludeDomain {
	private String nick;
	private int age;
	//Framework에서는 기본생성자를 사용하여 VO를 생성하고,
	//web parameter에 일치하는 setter method를 호출한 후 값을 설정하고,
	//개발자는 getter method 호출하여 값을 얻는다.
	
	public IncludeDomain(String nick, int age) {
		super();
		this.nick = nick;
		this.age = age;
	}	
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
}

package kr.co.sist.vo;

public class WebMemberVO {
		private String id, pass, email, name, birth, phone;

		public WebMemberVO() {
		}

		public WebMemberVO(String id, String pass, String email, String name, String birth, String phone) {
			this.id = id;
			this.pass = pass;
			this.email = email;
			this.name = name;
			this.birth = birth;
			this.phone = phone;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBirth() {
			return birth;
		}

		public void setBirth(String birth) {
			this.birth = birth;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		
}

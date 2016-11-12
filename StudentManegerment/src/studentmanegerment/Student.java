package studentmanegerment;

public class Student {
	private String ma;
	private String hoten;
	private String gioitinh;
	private String email;
	public Student(String ma, String hoten, String gioitinh, String email) {
		super();
		this.ma = ma;
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.email = email;
	}
	public Student(String ma) {
		this(ma,"hoten","gioitinh","email");
	}
	public Student() {
		this("Mã sinh viên");
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equalsIgnoreCase(other.email))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [ma=" + ma + ", hoten=" + hoten + ", gioitinh=" + gioitinh + ", email=" + email + "]";
	}
	
	
	
	
	

}

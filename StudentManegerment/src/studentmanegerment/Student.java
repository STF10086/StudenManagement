package studentmanegerment;

import org.eclipse.swt.widgets.DateTime;

public class Student {
	private String ma;
	private String hoten;
	private DateTime ngaysinh;
	private String gioitinh;
	public Student(String ma, String hoten, DateTime ngaysinh, String gioitinh) {
		super();
		this.ma = ma;
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
	}
	public Student(String ma) {
		super();
		this.ma = ma;
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
	public DateTime getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(DateTime ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ma == null) ? 0 : ma.hashCode());
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
		if (ma == null) {
			if (other.ma != null)
				return false;
		} else if (!ma.equals(other.ma))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [ma=" + ma + ", hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + "]";
	}
	
	
	
	
	
}

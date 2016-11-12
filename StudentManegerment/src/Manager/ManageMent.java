package Manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DB.DBUtils;
import DB.Database;
import studentmanegerment.Student;

public class ManageMent {
	public List<Student>getAllStudent(){
		List<Student> ds=new ArrayList<Student>();
		Connection con =Database.getConnection();
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try {
			stmt=con.prepareStatement("select * from student");
			rs=stmt.executeQuery();
			while(rs.next()){
				ds.add(new Student(rs.getString("ma"),rs.getString("hoten"),rs.getString("gioitinh"),rs.getString("email")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtils.close(rs, stmt);
		}
		return ds;
		
	}
}

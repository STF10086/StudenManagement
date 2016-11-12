package studentmanegerment;

import java.sql.Connection;

import DB.Database;

public class test {
	public static void main(String[] args) {
		Connection con= Database.getConnection();
	}
}

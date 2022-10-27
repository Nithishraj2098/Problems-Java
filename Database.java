import java.sql.*;
class Database{
	public static void main(String[] agrs) throws Exception{
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/","root","");
			System.out.println("Xampp mysql");
			Statement stat=con.createStatement();
			stat.executeUpdate("CREATE DATABASE PROGRAMNITHI");
			System.out.println("created");


		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}


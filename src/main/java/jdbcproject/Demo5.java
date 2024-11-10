package jdbcproject;
import java.sql.*;
public class Demo5 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
	CallableStatement p = c.prepareCall("create databse odbc1");
	boolean b=p.execute();
	System.out.println(b);
	c.close();
}
}
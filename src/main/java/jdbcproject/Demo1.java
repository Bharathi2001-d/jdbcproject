package jdbcproject;
import java.sql.*;
public class Demo1 {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
	CallableStatement p=c.prepareCall("create database Stud");
	boolean e=p.execute();
	System.out.println(e);
	c.close();
}
}

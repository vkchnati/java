package testmini;

import java.sql.*;
import static testmini.DBInfo.*;
public class DBConnection{
private static Connection con=null;
 private DBConnection() {}
 static {
	 try 
	 {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 con=DriverManager.getConnection(dburl,uName,pWord);
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }//end of static block
 public static Connection getCon() {
	return con;
  }
}

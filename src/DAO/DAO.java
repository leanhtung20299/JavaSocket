package DAO;



import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	public static Connection con;
	
	public DAO(){
		if(con == null){
			try {
                                String dbUrl = "jdbc:mysql://localhost:3306/gamesocket";
                                con = DriverManager.getConnection(dbUrl, "root", "123456");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

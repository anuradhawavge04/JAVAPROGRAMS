package Assignment_05_JDBC_Connectivity;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

	public class OracleConnection {
		
		public static void main(String[]args) throws Exception{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb","xyz","123");
			
			Statement st=con.createStatement();
			
			String query="SELECT * from emp";
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
			rs.close();
			st.close();
			con.close();
		}

	}

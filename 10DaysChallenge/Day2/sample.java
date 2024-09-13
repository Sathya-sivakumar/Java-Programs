
import java.sql.*;
import java.util.Scanner;



public class sample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Ente the customer id");

				String CUST_ID=sc.next();

			System.out.println("Ente the customer Name");

				String CUST_NAME=sc.next();

			System.out.println("Ente the customer Age");

				int CUST_Age=sc.nextInt();

			System.out.println("Enter the mobile num");

				String Mobile=sc.next();

			

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");

            PreparedStatement ps=con.prepareStatement("INSERT INTO Customer VALUES (?, ?, ?, ?)");

            

            

            

			ps.setString(1,CUST_ID);

			ps.setString(2,CUST_NAME);

			ps.setInt(3,CUST_Age);

			ps.setString(4,Mobile);

			

			int res=ps.executeUpdate();

			if(res>0) {

				System.out.println("Success");

			}

		}

		catch(Exception obj){

			obj.printStackTrace();

		}finally {

			sc.close();

		}

	}

}


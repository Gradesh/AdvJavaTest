import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class mainclass {

	public static void main(String[] args) throws Exception
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("kjgf");
	Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment01",
				"root","Monaleesa123@");
		Statement stmt= con.createStatement();
		
		System.out.println("Press Number for \n 1. To insert an data into Database"
				+ " \n 2. To Update  \n "
				+ "3. For Show Data");
		
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			//Insertion
			
			
			try 
			{
				   System.out.println("Enter Employee ID");
					int EmployeeID=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Employee Name");
					String EmpName=sc.nextLine();
					System.out.println("Employee Date of Birth (DD-MM-YYYY)"
							+ "");
					String EmpDob=sc.nextLine();
					System.out.println("Employee Date Of Joining(DD-MM-YYYY) ");
					String EmpDoj=sc.nextLine();
					System.out.println("Enter Employee Salary");
					String EmpSal=sc.nextLine();
					System.out.println("Enter Employee Department");
					String EmpDept=sc.nextLine();
					
				
				

	      /*      String query1 = "Insert into Employeeinformation values(3,'Deebika','12-12-1999','02-05-2021',350000,'T24')";
	            stmt.executeUpdate(query1);
	            String query2 = "Insert into Employeeinformation values(4,'Dinesh','22-12-1998','02-05-2021',390000,'Digital')";
	            stmt.executeUpdate(query2);
	            String query3 = "Insert into Employeeinformation values(5,'Gradesh','21-08-1999','02-05-2021',360000,'Digital')";
	            stmt.executeUpdate(query3);
	            
	            
	            stmt.executeUpdate(query1);
	            
	            System.out.println("Query Executed!! Data added successfully"); */
				
				//	System.out.println(EmployeeID+EmpName+EmpDob+EmpDoj+EmpSal+EmpDept);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
			break;
		case 2:
		{
			//Update
			String queryupdate="Update Employeeinformation SET emp_dept='Digital'where emp_id=3";
			stmt.executeUpdate(queryupdate);
			String queryupdate1="Update Employeeinformation SET emp_salary=365000 where emp_id=3";
			stmt.executeUpdate(queryupdate1);
            
            System.out.println("Query Executed!! Data added successfully");
			
		}
		
			break;
		case 3:
		{
			//Show Data
			
			
			/*String queryupdate1="Select * from Employeeinformation where emp_dept='Digital'";
			stmt.executeUpdate(queryupdate1);
            
            System.out.println("Query Executed!! Data added successfully");*/
            
            try 
			{
				//Show Data
				ResultSet rs= stmt.executeQuery("Select * from Employeeinformation where emp_dept='Digital'");
				while (rs.next())
				{
					System.out.println(rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4)+"|"+rs.getString(5)+"|"+rs.getString(6));
				//SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
				DateTimeFormatter dfinput=DateTimeFormatter.ofPattern("y-M-d",Locale.ENGLISH);
				LocalDateTime ldt=LocalDateTime.parse(rs.getString(3),dfinput);
				LocalDate date=ldt.toLocalDate();
				System.out.println(rs.getString(1)+"|"+rs.getString(2)+"|"+date+"|"+rs.getString(4)+"|"+rs.getString(5)+"|"+rs.getString(6));
				
				
				}
				
			}
			catch (Exception e)
			{
				System.out.println("Exception Raised!!!");
				
			}
			
			
		}
		break;
			default:
				System.out.println("Wrong Choice!!");
				break;
		}
		
		

	}

}

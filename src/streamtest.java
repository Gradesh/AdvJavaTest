import java.util.stream.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class streamtest {

	public static void main(String[] args)
	{
		ArrayList<Employee>Emp= new ArrayList<Employee>();
		
		
		Emp.add(new Employee(1,"Regila Merlcy", "02-01-1997",350000));
		Emp.add(new Employee(2,"Pratiksha","05-05-1998",360000));
		Emp.add(new Employee(3,"Deebika","12-12-1999",355000));
		Emp.add(new Employee(4,"Gradesh","21-8-1998",356000));
		Emp.add(new Employee(5,"Dinesh","22-12-1998",359000));
		
		
	//	String first =Emp.stream().filter(s->s.Name("D")).findFirst().get();
		//System.out.println(first);
		
		
		System.out.println("People who has salary in between 355000 to 370000");
		Emp.stream().filter(c-> c.Salary>=355000 & c.Salary<=370000).forEach
		(c->System.out.println(c.Name));
		
		
		System.out.println("\n"
				+ "People name Starts With D");
	Emp.stream().filter(c->c.Name.startsWith("D")).forEach(c->System
			.out.println(c.Name));
		
		
		
		
		//Emp.stream().filter(c->c.Name ("D")).findFirst().forEach(c->System.out.println(c.Name));
		

	}

}

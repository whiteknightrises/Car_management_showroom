package Car_Showroom_Management;

import java.util.Scanner;

public class Employee extends Show_room implements utility {
	String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;
    public void get_details() {
        System.out.println("ID: "+emp_id);
        System.out.println("Name: "+emp_name);
        System.out.println("Age: "+emp_age);
        System.out.println("Department: "+emp_department);
        System.out.println("Showroom Name: "+Showroom_Name);
}
    
    public void set_details() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println();
    	System.out.println("enter id");
    	emp_id = sc.nextLine();
    	System.out.println("enter name");
    	emp_name = sc.nextLine();
    	System.out.println("enter age");
    	emp_age= sc.nextInt();
    	System.out.println("enter department");
    	emp_department= sc.nextLine();
    	System.out.println("enter Showroom");
    	Showroom_Name= sc.nextLine();
    	
    }
    
}
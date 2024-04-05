package Car_Showroom_Management;
import java.util.*;

public class Show_room implements utility{
	String Showroom_Name;
	String Showroom_Adress;
	int total_employees;
	int total_cars_in_stocks;
	String Manager_Name;
	@Override
	public void get_details() {
		System.out.println("Showroom Name: "+Showroom_Name);
        System.out.println("Showroom Address: "+Showroom_Adress);
        System.out.println("Manager Name: "+Manager_Name);
        System.out.println("Total Employees: "+total_employees);
        System.out.println("Total Cars In Stock: "+total_cars_in_stocks);
		
	}

	@Override
	public void set_details() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Showroom Name ");
		Showroom_Name = sc.nextLine();
		System.out.println("Showroom Address ");
		Showroom_Adress = sc.nextLine();
		System.out.println("Manager Name ");
		Manager_Name = sc.nextLine();
		System.out.println("Enter Total Employees: ");
		total_employees=sc.nextInt();
		System.out.println("Total Cars In Stock");
		total_cars_in_stocks=sc.nextInt();
		
	}

}

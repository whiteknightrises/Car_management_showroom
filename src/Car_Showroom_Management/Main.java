package Car_Showroom_Management;
import java.util.*;
interface utility{
	public void get_details();
	public void set_details();
}
public class Main {
	 static void main_menu(){
	        System.out.println();
	        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
	        System.out.println();
	        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
	        System.out.println();
	        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
	        System.out.println();
	        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
	        System.out.println();
	        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

	    }
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Show_room showroom[]= new Show_room[5];
		Employee employee[]= new Employee[5];
		Cars cars[]= new Cars[5];
		int showroom_counter=0;
		int employee_counter=0;
		int car_counter=0;
		int choice =100;
		while(choice!=0) {
			main_menu();
			choice = sc.nextInt();
			while(choice!=0 && choice!=9) {
				switch(choice) {
				case 1:
					showroom[showroom_counter]=new Show_room();
					showroom[showroom_counter].set_details();
					showroom_counter++;
					System.out.println();
					System.out.println("enter 9 to go back to menu");
					System.out.println("enter 0 to exit");
					choice = sc.nextInt();
					break;
				case 2:

					employee[employee_counter]=new Employee();
					employee[employee_counter].set_details();
					employee_counter++;
					System.out.println();
					System.out.println("enter 9 to go back to menu");
					System.out.println("enter 0 to exit");
					choice = sc.nextInt();
					break;
				case 3:
					cars[car_counter]=new Cars();
					cars[car_counter].set_details();
					car_counter++;
					System.out.println();
					System.out.println("enter 9 to go back to menu");
					System.out.println("enter 0 to exit");
					choice = sc.nextInt();
					break;
				case 4:
					for(int i=0;i<showroom_counter;i++) {
						showroom[i].get_details();
						System.out.println();
						System.out.println("enter 9 to go back to menu");
						System.out.println("enter 0 to exit");
						choice = sc.nextInt();
						break;
						
					}
				case 5:
					for(int i=0;i<employee_counter;i++) {
						employee[i].get_details();
						System.out.println();
						System.out.println("enter 9 to go back to menu");
						System.out.println("enter 0 to exit");
						choice = sc.nextInt();
						break;
						
					}
				case 6:
					for(int i=0;i<car_counter;i++) {
						cars[i].get_details();
						System.out.println();
						System.out.println("enter 9 to go back to menu");
						System.out.println("enter 0 to exit");
						choice = sc.nextInt();
						break;
					}
				default:
					System.out.println("ENTER VALID CHOICE: ");
					choice = sc.nextInt();
                    break;
					
				}
					
			}
		}
		

	}

}

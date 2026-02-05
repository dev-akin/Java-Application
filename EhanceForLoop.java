import java.util.Scanner;

public class EhanceForLoop{
	
	public static void main(String[] args){
		
		//create a single dimensional array  of size 10
		String[] names = new String[10];
		
		//create a single dimensional array of size 10
		int[] marks = new int[10];
		
		//create the object of the scanner class
		Scanner scan = new Scanner(System.in);
		
		//get input from user
		for(int i = 0; i < 10; i++){
			System.out.print("Enter Student name: ");
			names[i] = scan.nextLine();
		
			System.out.print("Enter Student mark: ");
			marks[i] = scan.nextInt();
			
			System.out.println("========================");
			
			scan.nextLine();
		}
		
		//Transverse through the arrays to display the elements of the arrays
		for(String name : names){
			System.out.printf("%s%n",name);
		}
		
		for(int mark : marks){
			System.out.printf("%d%n",mark);
		}
	}
	
	
}
import java.util.Scanner;

public class Snap{
	public static void main(String args[]){
		
		String entry1, entry2;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entry 1");
		entry1 = sc.nextLine();
		
		
		
		System.out.println("Entry 2");
		entry2 = sc.nextLine();
		
		
		if(entry1.equals(entry2)){
			System.out.println("SNAP!!");
			}
			
		else{
			System.out.println("No Snap");
		}
	}
}
		
		
		
		
		
		
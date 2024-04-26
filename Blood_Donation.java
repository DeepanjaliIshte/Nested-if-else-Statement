import java.util.Scanner;
public class Blood_Donation {
	public static void main(String[] args) {
		 int age,weight;
		 String Name;
		 System.out.println("");
		 System.out.println("***Welcome to Blood Donation camp***");
		 System.out.println("");
		 Scanner sn =new  Scanner (System.in);
		 		System.out.println("Enter the name");
		 		Name=sn.next();
		 		System.out.println("Enter th age : ");
				 age = sn.nextInt();
		  			System.out.println("Enter th weight : ");
		  		 weight = sn.nextInt();
		  		 System.out.println("");
		  		 if (age>=18)
		  		  {
		  		
		  			 if(weight>50)
		  			 {
		  				 System.out.println("'Congrats' you are eligible to donate blood");
		  			 }
		  			 else {
		  				 System.out.println("'Sorry' you are not eligible to donate blood");
		  			 }
		  		 }
		  			 else 
		  			 {
		  				 System.out.println("Note :- Age must be greater than 18 and weight must be greater than 50.");
		  			 }
		  		 System.out.println("");
		  		 System.out.println("***Thank you***"); 		 
		  		 }
	}



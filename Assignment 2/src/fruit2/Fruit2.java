package fruit2;

import java.util.*;

public class Fruit2 {

	

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter your name:");
		String name = in.next();
		System.out.println("Name:" + name);
		
		System.out.println("Enter your age:");
		int age = in.nextInt();
		System.out.println("Age:" + age);
		
		System.out.println("Enter your gender (in letter form):");
		String str = in.next();
		char gender = str.charAt(0);
		System.out.println("Gender:" + gender);
		
		System.out.println();
		System.out.println("Product provided: Apples, Oranges, Pineapples");
		
		double price1 = 1.20;
		double price2 = 1.30;
		double price3 = 1.50;
		System.out.println("Price of apples: RM1.20");
		System.out.println("Price of oranges: RM1.30");
		System.out.println("Price of pineapples: RM1.50");
		
		
		System.out.println("Apple purchased? (true or false)");
			boolean apple = in.nextBoolean();
			System.out.println("Oranges purchased? (true or false)");
		    boolean orange = in.nextBoolean();
			System.out.println("Pineapples purchased? (true or false)");
		    boolean pineapple = in.nextBoolean();
		    
		    
			if((apple = true) && (orange = false) && (pineapple=false)) {
				System.out.println("Enter the quantity of apples purchased:");
				int quantity = in.nextInt();
				double total = quantity*price1;
				System.out.println("Total price: RM" + total);
				
				
			}
			else if((apple = false) && (orange = true) && (pineapple=false)) {
				System.out.println("Enter the quantity of oranges purchased:");
				int quantity = in.nextInt();
				double total = quantity*price2;
				System.out.println("Total price: RM" + total);
				
			}
			else if((apple = false) && (orange = false) && (pineapple=true)) {
				System.out.println("Enter the quantity of pineapple purchased:");
				int quantity = in.nextInt();
				double total = quantity*price3;
				System.out.println("Total price: RM" + total);
				
			}
			
		
			else if((apple = false) && (orange = true) && (pineapple = true)) {
				System.out.println("Enter the quantity of orange purchased:");
				int quantity = in.nextInt();
				System.out.println("Enter the quantity of pineapple purchased:");
				int quantity1 = in.nextInt();
				double total [] = {(quantity*price2), (quantity1*price3)};
				double total1 =  0;
				for(int i=0; i<total.length;i++) {
					total1 = total1 + total[i];
				}
				System.out.println("Total price: RM" + total1);
				
			}
			else if((apple = true) && (orange = false) && (pineapple = true)) {
				System.out.println("Enter the quantity of apples purchased:");
				int quantity = in.nextInt();
				System.out.println("Enter the quantity of pineapple purchased:");
				int quantity1 = in.nextInt();
				double total [] = {(quantity*price1), (quantity1*price3)};
				double total1 =  0;
				for(int i=0; i<total.length;i++) {
					total1 = total1 + total[i];}
				
				System.out.println("Total price: RM" + total1);
			}
			else if((apple = true) && (orange = true) && (pineapple = false)) {
				System.out.println("Enter the quantity of apples purchased:");
				int quantity = in.nextInt();
				System.out.println("Enter the quantity of oranges purchased:");
				int quantity1 = in.nextInt();
				double total [] = {(quantity*price1), (quantity1*price2)};
				double total1 =  0;
				for(int i=0; i<total.length;i++) {
					total1 = total1 + total[i];}
				
				System.out.println("Total price: RM" + total1);
				
			}
			
			else if((apple = true) && (orange = true) && (pineapple = true)) {
			System.out.println("Enter the quantity of apples purchased:");
			int quantity = in.nextInt();
			System.out.println("Enter the quantity of oranges purchased:");
			int quantity1 = in.nextInt();
			System.out.println("Enter the quantity of pineapples purchased:");
			int quantity2 = in.nextInt();
			double total [] = {(quantity*price1), (quantity1*price2), (quantity2*price3)};
			double total1 =  0;
			for(int i=0; i<total.length;i++) {
				total1 = total1 + total[i];}
			
			System.out.println("Total price: RM" + total1);
			
		}
			else {
				System.out.println("Input incorrect");
			}
			
			in.close();
			}
		
			
			
		

	}



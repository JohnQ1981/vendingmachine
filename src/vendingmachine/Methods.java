package vendingmachine;

import java.util.Scanner;

public class Methods {

		//I need to select product and set the price
	
		public double select(Products product) {
			
			System.out.println(product.toString());//Display the products
			
			
			do {
			System.out.println("Please Select Your Item from the list above");
			Scanner scan = new Scanner(System.in);
			product.setProductNum(scan.nextInt());
			
			if(product.getProductNum()<1 || product.getProductNum()>10) {
				
				System.out.println("Please Enter only numbers from the list below");
				System.out.println(product.toString());
			}
			
			} while(product.getProductNum()<1 || product.getProductNum()>10);
			
			switch(product.getProductNum()) {
			
				case 1:
					product.setPrice(product.getSnicker());
				break;
				case 2:
					product.setPrice(product.getChipsAhoy());
				break;
				case 3:
					product.setPrice(product.getPringles());
				break;
				case 4:
					product.setPrice(product.getMilano());
				break;
				case 5:
					product.setPrice(product.getReeses());
				break;
				case 6:
					product.setPrice(product.getCocaCola());
				break;
				case 7:
					product.setPrice(product.getFanta());
				break;
				case 8:
					product.setPrice(product.getWater());
				break;
				case 9:
					product.setPrice(product.getArizona());
				break;
				case 10:
					product.setPrice(product.getSkittles());
				break;
				
			}
						
			return product.getPrice();
			
			}
		
			public double balance(double price, double accountBalance, Products product) {
				
				while(accountBalance<price) {
					Scanner scan = new Scanner(System.in);
					System.out.println("No enough Balance.Would you like to deposit money? (Y/N)");
					char confirm = scan.next().toLowerCase().charAt(0);
					if(confirm == 'y') {
						System.out.println("How Much Money do you want to Deposit?");
						double deposit= scan.nextDouble();
						accountBalance=accountBalance+deposit;
						System.out.println("Your New Balance is "+ accountBalance+" dollars.");
						price = select(product);
					}else if (confirm =='n' || confirm !='y') {
						System.out.println("You do not have enough limit to make a purchase, your current balance "+ accountBalance);
						System.out.println("Thank for shopping...");
						break;
					}
				}
				return  accountBalance;
			}
			
			public void puchase(double price, double accountBalance, Products product) {
				
				while(accountBalance>=product.getPrice()) {
					
					accountBalance= accountBalance- product.getPrice();
					System.out.println("Your Remaining Balance is: " + accountBalance);
					Scanner scan = new Scanner(System.in);
					System.out.println("Would you like to buy something else from the store?");
					char confirm = scan.next().toLowerCase().charAt(0);
					if(confirm =='y') {
						product.setPrice(select(product));
						accountBalance=balance(product.getPrice(),accountBalance,  product);
					}
						//else if(confirm=='n'|| confirm!='n') {
//						System.out.println("Please Enter Y or N");
//						product.setPrice(select(product));
//						accountBalance=balance(product.getPrice(),accountBalance,  product);
//						
//					}
					
					else {
						System.out.println("Thank you for shopping with us...");
						break;
					}
				}
				
			}
			
			public double getMoney(double money) {
				
				Scanner scan = new Scanner(System.in);
				System.out.println("How much do you want to deposit?");
				double deposit = scan.nextDouble();
				money = money + deposit;
				
				System.out.println("Your current balance: " + money);
				return money;
			}
			
			
			
		}
	


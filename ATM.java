package com.nit.atmMachine;

import java.util.Scanner;

class Machine{
private double balance;
private double depositeAmount;
private double withdrawAmount;
public Machine() {	
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public double getDepositeAmount() {
	return depositeAmount;
}
public void setDepositeAmount(double depositeAmount) {
	this.depositeAmount = depositeAmount;
}
public double getWithdrawAmount() {
	return withdrawAmount;
}
public void setWithdrawAmount(double withdrawAmount) {
	this.withdrawAmount = withdrawAmount;
}
}
public class ATM{
	public static void main(String[] args) {
		AtmOperations ao=new AtmOperationImpl();
		int atmnumber=12345;
		int atmPin=123;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To Atm Machine");
		System.out.println("enter atm number:");
		int atmNumber=sc.nextInt();
		 System.out.println("enter pin:");
		 int pin=sc.nextInt();
		 
		 if((atmnumber==atmNumber)&&(atmPin==pin)){
			 while(true) {
				 System.out.println("1.View Available Balance \n 2.Withdraw Amount \n 3.Deposite Amount\n4.View Ministatement\n5.Exit");
				 System.out.println("enter choice:");
				 int ch=sc.nextInt();
				 if(ch==1) {
					 System.out.println("View Available Balance");
					 ao.ViewBalance();
				 }
				 else if(ch==2) {
					System.out.println(" enter amount to Withdraw ");
					double withdrawAMount=sc.nextDouble();
					ao.WithdrawAmount(withdrawAMount);
				 }
				 else if(ch==3) {
					 System.out.println("Enter Amount to deposite");
					 double depositeAmount=sc.nextDouble();
					 ao.depositeAmount(depositeAmount);
				 }
				 else if(ch==4) {
					 System.out.println("View Ministatement");
					 ao.ViewMiniStatement();
				 }
				 else if(ch==5) {
					System.out.println("Collect Your ATM Card\n thank you for using ATM Machine"); 
					 System.exit(0);
				 }
				 else {
					 System.out.println("please enter correct choice");
					
				 }
				 
			 }
			 
		 }
		// System.out.println("validation done");
		 else {
			 System.out.println("invalid atm Number or pin");
			 System.exit(0);
		 }
		 
	}
}

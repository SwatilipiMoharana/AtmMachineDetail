package com.nit.atmMachine;
import java.util.HashMap;
import java.util.Map;
public interface AtmOperations {
public void ViewBalance();
public void WithdrawAmount(double withdrawAmount);
public void depositeAmount(double depositeAmount);
public void ViewMiniStatement();
}
 class AtmOperationImpl implements AtmOperations{
	 Machine  machine=new Machine();
	 Map<Double,String>ministmt=new HashMap<>();
	@Override
	public void ViewBalance() {
		System.out.println("available balance is :"+machine.getBalance());
	}
	@Override
	public void WithdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
		if(withdrawAmount<=machine.getBalance()) {
			ministmt.put(withdrawAmount, "Amount Withdrawn");
		 System.out.println("collect the cash"+withdrawAmount);
		 machine.setBalance(machine.getBalance()-withdrawAmount);
		 ViewBalance();
		}
		else {
			System.out.println("insufficient balance!!");
		}
		}
		else {
			System.out.println("please amount the amount is multiple of 500...");
		}
	}
	@Override
	public void depositeAmount(double depositeAmount) {
		ministmt.put(depositeAmount, "Amount Withdrawn");
	System.out.println(depositeAmount+"deposited successfully...");
	machine.setBalance(machine.getBalance()+depositeAmount);
	ViewBalance();
	}
	@Override
	public void ViewMiniStatement() {
		for(Map.Entry<Double, String>m:ministmt.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
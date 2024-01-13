package src;

import java.util.Scanner;

public class Main_class {
	static double monthly_rate(double debt, double IR)
	{
		double monthly_rate =0.0;
		monthly_rate= debt * (IR/12)*.01;
		if(debt < 0 || IR < 0)
		{
			monthly_rate =0;
		}
		return monthly_rate;
	}
//	static double number_rate(double IR)
//	{
//		if(IR<0)
//		{
//			return 0.0;
//		}
//		return  IR/12;
//	}
	//Amount calculation based on simple interest
	static double amount_(double debt, double IR, int months)
	{
		double amount = debt + (debt*(IR/12)*months)/100;
		if(amount < 0)
		{
			return 0;
		}
		
		return amount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner myObj  = new Scanner(System.in);
		System.out.println("Enter Debt Value");
		double debt = myObj.nextDouble();
		System.out.println("Enter Interest Rate");
		double interest = myObj.nextDouble();
		System.out.println("Enter Duration in months");
		int duration = myObj.nextInt();
		System.out.println("Debt: "+debt+" Interest rate: "+interest+" Duration: "+duration);
		double m_rate = 0.0;
		m_rate = monthly_rate(debt, interest);
		System.out.println("Monthly amount is "+m_rate);
		System.out.println("Number of rates is "+duration);
		System.out.println("Over all amount is "+amount_(debt, interest, duration));
		
		

	}

}


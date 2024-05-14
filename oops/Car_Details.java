package oops;

import java.util.Scanner;

public class Car_Details
{
	
		Scanner sc=new Scanner(System.in);
		public String name,model;
		public int age,year,car_num;
		private long mobnum;                       //Encapsulation
		
		public void details()              
		{
			System.out.println("Enter Car model: ");
			model=sc.next();
			System.out.println("Enter Car car_no: ");
			car_num=sc.nextInt();
			System.out.println("Enter Car purchasing year: ");
			year=sc.nextInt();
		}
		
		public long getMobno() 
		{
			return mobnum;
		}

		public void setMobno(long mobno) 
		{
			this.mobnum=mobno;
		}
	}
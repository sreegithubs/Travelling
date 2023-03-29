package com.main;

import java.util.Scanner;

import com.details.JDBCPostgreSQLConnection;
import com.details.Cusdetails;

public class App {

	static Scanner sc = new Scanner(System.in);
	String s = sc.next();

	public static void main(String[] args) {

		JDBCPostgreSQLConnection jb = new JDBCPostgreSQLConnection();
		System.out.println("TOURIST BIRD");

		while (true) {
			System.out.println("Press '1' to choose your dream place");
			System.out.println("Press '0' EXIT");

			int n = sc.nextInt();
			if (n != 0) {

				switch (n) {

				case 1:
					JDBCPostgreSQLConnection jb1 = new JDBCPostgreSQLConnection();

					System.out.println("Get ready to fill your pages with beautiful memories");
					System.out.println("Enter location");
					String p=sc.nextLine();
						p=sc.nextLine();   //inorder to read input of both string and integer
					System.out.println("Number of persons:");
					int n1 = sc.nextInt();
					Cusdetails[] c = new Cusdetails[n1];

					for (int i = 0; i < c.length; i++) {
						System.out.println("Enter Name");
						String Name = sc.next();
						System.out.println("Enter Contact number");
						String Number = sc.next();
						System.out.println("Enter No. of Age");
						int age = sc.nextInt();
						System.out.println("Enter No. of days");
						int day = sc.nextInt();
						Cusdetails cd = new Cusdetails();
						cd.setName(Name);
						cd.setMobileNumber(Number);
						cd.setAge(age);
						cd.setDay(day);
						cd.setDestination(p);
//					jb1.createTable(cd);
						jb1.save(cd);
//					jb1.selectDetails();
					}
					System.out.println("Have a safe trip");
					System.out.println("Please share your experience");
					break;

				default:
					System.out.println("Fill details");
				}
			} else
				return;
		}
	}

}

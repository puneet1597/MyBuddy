package com.app.app;

import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import utils.ExceptionHandling;
import static utils.SampleData.populateData;
import utils.ValidateBuddy;
import com.app.core.*;

public class MyBuddy {

	public static void main(String[] args) throws ExceptionHandling {

		try (Scanner sc = new Scanner(System.in)) {

			HashMap<String, Buddy> hm = populateData();
			
			System.out.println("********** Welcome to MyBuddies ************");
			
			boolean con = true;

			while (con) {
				try {
					System.out.println("\nPress 1 for add buddy");
					System.out.println("Press 2 for search buddy by email id");
					System.out.println("Press 3 for delete buddy by email id");
					System.out.println("Press 4 to display all my buddies");
					System.out.println("Press 5 to sort the data by DOB");
					System.out.println("Press 6 for exit");

					switch (sc.nextInt()) {

					case 1:

						System.out.println("Enter the email id");
						String em = sc.next();
						ValidateBuddy.emailValidation(em,hm); // email should ends with .com & contain @
						System.out.println("Enter the name");
						String nm = sc.next();
						System.out.println("Enter the phone number");
						String ph = sc.next();
						ValidateBuddy.phoneNumberValidation(ph,hm); // phone number should have 10 digits
						System.out.println("Enter the DOB --->>(yr-mm-dd)");
						LocalDate dob = parse(sc.next());
						System.out.println("Enter the city");
						String c = sc.next();

						Buddy b = new Buddy(em, nm, ph, dob, c);
						hm.put(em, b);
						System.out.println("Buddy added successfully");
						break;

					case 2:
						System.out.println("Enter the email id");
						String em1 = sc.next();

						if (hm.containsKey(em1)) {
							System.out.println(hm.get(em1));
						} else {
							throw new ExceptionHandling("Buddy not found !!");
						}
						break;

					case 3:
						System.out.println("Enter the email id");
						String em2 = sc.next();

						if (hm.containsKey(em2)) {
							hm.remove(em2);
							System.out.println("Buddy removed successfully");
						} else {
							throw new ExceptionHandling("Buddy not found !!");
						}
						break;

					case 4:
						if (hm.containsKey(null)) {
							throw new ExceptionHandling("No buddy added !!");
						} else {
							hm.values().stream().forEach(i -> System.out.println(i));
						}
						break;

					case 5:

						hm.values().stream().sorted(Comparator.comparing(Buddy::getDob))
								.forEach(i -> System.out.println(i));

						break;

					case 6:
						System.out.println("Thanks for coming !!");
						con = false;
						break;

					default:
						System.out.println("Invalid Input");
					}
				} catch (ExceptionHandling e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					System.out.println("Invalid Input");
				}
				sc.nextLine();
			}
		}

	}

}

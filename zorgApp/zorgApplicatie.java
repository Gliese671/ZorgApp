package zorgApp;
import java.util.Scanner;

public class zorgApplicatie{
	
	static void zorgApp(){

			Boolean yesNo;
			Boolean who;
			String answer;
			int editor;
			
			Scanner scan = new Scanner(System.in); //Scanner for String answer
			Scanner scan2 = new Scanner(System.in); //Scanner for the int  answer
			
			profiles patient1= new profiles("John", "Doe", 42);
			
			System.out.println("Who is looking at the patient records? 1.Nurse 2.Patient"); //Asks who is looking at the records, error upon entering anything besides an integer!!!
			
				while (true) {
					editor = scan2.nextInt();
					if (editor ==(1)) {
						who = true;
						
						System.out.println("Welcome nurse"); //When 1 is entered a nurse is welcomed
						break;
						
					} else if (editor == (2)) {
						who = false;
						
						System.out.println("Welcome patient"); //Upon entering 2 a patient is welcomed 
						break;
						
					}else {
						System.out.println("Please answer using either 1 or 2."); //Failed to enter a valid answer
					}
					
				}
			System.out.println("==Patient records==");
			System.out.println(patient1.getFirstName());
			System.out.println(patient1.getLastName());
			System.out.println(patient1.getAge());
			System.out.println("Would you like to update this information? [y/n]");
			
				while (true) {
					  answer = scan.nextLine().trim().toLowerCase(); 
					  if (answer.equals("y")) {
					    yesNo = true;
					    
					    System.out.println("Enter first name :");
					    patient1.setName1(scan.nextLine());
					    //Updates name (Edit this to set class
					    
					    System.out.println("Enter surname :");
					    patient1.setLastName(scan.nextLine());
					    //Updates last name (Edit this to set class
					    
					    System.out.println("Enter age :");
					    patient1.setAge(scan.nextInt());
					    //Updates Age (Edit this to set class
					    
					    System.out.println("Information has been updated.");
					    System.out.println(patient1.getFirstName());
					    System.out.println(patient1.getLastName());
					    System.out.println(patient1.getAge());
					    //Print the new info-These statements need to be (print new get statements)    
					    System.out.println("Thank you for your time.");    
					    break;
					    
					  } else if (answer.equals("n")) {
					    yesNo = false;
					    System.out.println("Have a nice day");
					    break;
					    
					  } else {
					     System.out.println("Please answer with either y or n");
					  }
			}
			} 
			}

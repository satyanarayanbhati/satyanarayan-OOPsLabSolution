package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;

public class Driver {

		private  static Scanner sc = new Scanner( System.in );
	
	public static void main( String[] args ) {
		
		System.out.println( "First name :" );
		String firstName = sc.next();
		System.out.println( "Last name :" );
		String lastName = sc.next();
		
		System.out.println( "1. Technical" );
		System.out.println( "2. Admin" );
		System.out.println( "3. Human Resource" );
		System.out.println( "4. Legal" );
		
//		System.out.println( "Please enter the department from the following" );
		
		int choice = sc.nextInt();
		
     String dept;
		
		switch( choice ) {
			case 1:
				dept = "tech";
				break;
			case 2:
				dept = "adm";
				break;
			case 3:
				dept = "hr";
				break;
			case 4:
				dept = "lg";
				break;
			default:
				System.out.println( "Incorrect choice" );
				return;
		}
		
		Employee emp = new Employee( firstName, lastName, dept );
       CredentialsService cs = new CredentialsService(); 
		
		String email = cs.generateEmailAddress( emp );
		
		
		String password = cs.generatePassword();
		
		cs.showCredentials( emp, email, password );
		
				
		
	}
	
	
	
	

	
	
	

}

package com.orkut.view;

import java.util.Scanner;

import com.orkut.controller.OrkutControllerInterface;
import com.orkut.utility.ControllerFactory;

public class OrkutView {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s="y";
		while(s.equals("y")) {
			
			System.out.println("************ WELCOME TO ORKUT ***********");
			System.out.println("____/MAIN MENU/____");
			System.out.println("press 1 to Sign-up");
			System.out.println("press 2 to search profile");
			System.out.println("press 3 to view all profiles");
			System.out.println("press 4 to delete profile");
			System.out.println("press 5 to Sign-in profile");
			System.out.println("press 6 to edit profile");
			
			int ch=sc.nextInt();
			
		/* note : Always we should use factory design pattern to create object of other layer 
			and should store result inside corresponding interface*/
			
			OrkutControllerInterface lc=ControllerFactory.createObject();
			
			switch(ch) {
			case 1 : int i=lc.createProfileController();
					  if(i>0) {
						  System.out.println("profile created");
					  }
					  else {
						  System.out.println("could not create profile!");
					  }
				break;
				
			case 2 : int i1=lc.viewProfileController();
			  if(i1>0) {
				  System.out.println("profile found");
			  }
			  else {
				  System.out.println("Profile not found!");
			  }
		break;
			case 3 : int i2=lc.viewAllProfileController();
			  if(i2>0) {
				  System.out.println(i2+ " profiles(s) found");
			  }
			  else {
				  System.out.println("No profile found!");
			  }
		break;
		
			case 4 : int i3=lc.deleteProfileController();
			  if(i3>0) {
				  System.out.println( "  deleted");
			  }
			  else {
				  System.out.println("could not delete profile!");
			  }
		break;
			case 5 : int i4=lc.loginProfileController();
			  if(i4>0) {
				  System.out.println( "profile signed-in successfully");
			  }
			  else {
				  System.out.println("login failed! \n (credentials mismatch)");
			  }
		break;
			case 6 : int i5=lc.editProfileController();
			  if(i5>0) {
				  System.out.println( " profile updated successfully");
			  }
			  else {
				  System.out.println("can't updated profile");
			  }
		break;
				default:System.out.println("invalid choice");
			}
			
			System.out.println("---------------------------");
			System.out.println(" Do you want to continue press y \nOR\n Press any key to abort ");
			System.out.println("---------------------------");
			s=sc.next();
		}

	}

}

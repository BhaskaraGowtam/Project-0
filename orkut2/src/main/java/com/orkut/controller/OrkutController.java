package com.orkut.controller;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.orkut.entity.OrkutUser;
import com.orkut.entity.TimeLineEntity;
import com.orkut.service.OrkutServiceInterface;
import com.orkut.utility.ServiceFactory;
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class OrkutController implements OrkutControllerInterface {

	private static Logger log1 = Logger.getLogger("OrkutController");

	public int createProfileController() {
		
		log1.info("Inside create profile method");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter password");
		String password=sc.next();
		
		System.out.println("Enter email");
		String email=sc.next();
		
		System.out.println("Enter address");
		String address=sc.next();
		
		OrkutUser lu=new OrkutUser();
		lu.setName(name);
		lu.setPassword(password);
		lu.setEmail(email);
		lu.setAddress(address);
		
		OrkutServiceInterface ls=ServiceFactory.createObject();
		
		
		return ls.createProfileService(lu);
	}

 
	private static Logger Log2 = Logger.getLogger("OrkutController");
	public int viewProfileController() {
		
		Log2.info("Inside search profile method");
		Scanner sc=new Scanner(System.in);
		
		
		int i=0;
		System.out.println("Enter email");
		String email=sc.next();
		
		OrkutUser lu=new OrkutUser();
		lu.setEmail(email);
		
		OrkutServiceInterface ls=ServiceFactory.createObject();
		OrkutUser lu1=ls.viewProfileService(lu);
		
		if(lu1!=null) {
			System.out.println("Name is "+lu1.getName());
			System.out.println("Password is "+lu1.getPassword());
			System.out.println("Email is "+lu1.getEmail());
			System.out.println("Address is "+lu1.getAddress());
			i=1;
		}
		
		return i;
	}

	private static Logger Log3 = Logger.getLogger("OrkutController");
	public int viewAllProfileController() {
		
		Log3.info("Inside view All profile method");
		Scanner sc=new Scanner(System.in);
		
		OrkutServiceInterface ls=ServiceFactory.createObject();
		List<OrkutUser> lu1=ls.viewAllProfileService();
		
		for(OrkutUser lu2:lu1) {
			System.out.println("---    ----     ----    ----   -----");
			System.out.println("Name is "+lu2.getName());
			System.out.println("Password is "+lu2.getPassword());
			System.out.println("Email is "+lu2.getEmail());
			System.out.println("Address is "+lu2.getAddress());
			
		}
		
		return lu1.size();
	}

	private static Logger Log4= Logger.getLogger("OrkutController");
	public int deleteProfileController() {
		Log4.info("Inside delete profile method");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email");
		String email=sc.next();
		
		OrkutUser lu=new OrkutUser();
		lu.setEmail(email);
		
		OrkutServiceInterface ls=ServiceFactory.createObject();
		int lu1=ls.deleteProfileService(lu);
		return lu1;
	}


    private static Logger Log5=Logger.getLogger("OrkutController"); 
	public int loginProfileController() {
		Log5.info("Inside Log in profile method");
		
		Scanner sc=new Scanner(System.in);
		
		int i=0;
		
		System.out.println("Enter email");
		String email=sc.next();
		
		System.out.println("Enter password");
		String password=sc.next();
		
		
		OrkutUser lu=new OrkutUser();
	
		lu.setPassword(password);
		lu.setEmail(email);
		
		
		OrkutServiceInterface ls=ServiceFactory.createObject();
		OrkutUser uu=ls.loginProfileService(lu);
		if(uu!=null) {
			i=1;
			String s="s";
			while(s.equals("s")){
			System.out.println("Welcome "+uu.getName());
			System.out.println("Press 1 to view timeline");
			System.out.println("Press 2 to LogOut");
			
			System.out.println("Enter your choice");
			int cc=sc.nextInt();
			TimeLineEntity tl=new TimeLineEntity();
			Scanner sc11=new  Scanner(System.in);
			
			switch(cc) {
			case 1 :
				System.out.println("Enter sender name");
				tl.setSender(sc11.nextLine());
				System.out.println("Enter recevier name");
				tl.setReceiver(sc11.nextLine());
				System.out.println("Enter message");
				tl.setMessage(sc11.nextLine());
				
				System.out.println("===== Message sent sucessfully  to "+tl.getReceiver()+ " ====>>");
				System.out.println("===> New message from "+ tl.getSender());
				System.out.println("Message :::"+ tl.getMessage());
				System.out.println(" Do you want to continue press s ");
				s=sc.next();
				break;
			case 2 : 
				System.out.println("LogOut Successfully");
				System.out.println("==== //Thank you// ====");
				int status = 0;
				System.exit(status);
				break;
		  
			}
		}
			
		}
		
		return i;
		
	}

	private static Logger Log6=Logger.getLogger("OrkutController"); 
	@Override
	public int editProfileController() {
		Log6.info("Inside Log in profile method");
		Scanner sc=new Scanner(System.in);
		
		int i=0;
		
		System.out.println("Enter email");
		String email=sc.next();
		
		System.out.println("Enter password");
		String password=sc.next();
		
		
		OrkutUser lu=new OrkutUser();
	
		lu.setPassword(password);
		lu.setEmail(email);
		
		
		OrkutServiceInterface ls=ServiceFactory.createObject();
		int tu=ls.editProfileService(lu);
		if(tu!=0) {
			 i=1;
		}
	 
		return i;
	}

}






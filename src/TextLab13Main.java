import java.util.UUID;
import java.util.*;


public class TextLab13Main {


	public static void main(String[] args){
		
		Bank matt = new Checking("Matthew","Pearce", 650, generatePhoneNumber(), generateSocialSecurity());
		
		System.out.println(matt);
	}


	///random data generator
	public static String generateSocialSecurity(){
		 
		return UUID.randomUUID().toString();
		
	}
	
	public static String generatePhoneNumber(){
		
		
		return ((int)(Math.random()*900)+100) + "-" + ((int)(Math.random()*900)+100) + "-" + ((int)(Math.random()*9000)+1000) ;
		
	}
}

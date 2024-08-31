package Strings;

import java.util.Scanner;

public class ToggleCharacters {
	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  StringBuilder str = new StringBuilder(sc.nextLine());
		  System.out.println(str);
		  
		  // toggle -> PYsiCs - > pySIcS
		  
		  for(int i=0; i<str.length(); i++) {
			  
			  boolean flag = true; // true -> capital letter
			  char ch = str.charAt(i); // A
			  if(ch == ' ') continue;
              int asci = (int)ch; // 65
              if(asci>=97) flag = false; // small
              if(flag==true) {
            	  asci += 32;
            	  char ah = (char)asci; // a
            	  str.setCharAt(i, ah);
              }
              else {
            	  asci -= 32;
            	  char ah = (char)asci;
            	  str.setCharAt(i, ah);
              }
		  }
		  System.out.println(str);
	}

}

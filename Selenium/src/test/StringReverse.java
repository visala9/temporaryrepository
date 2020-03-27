package test;

public class StringReverse {
	
public static void main (String args[])
{
 String originalString = "Visala";
 String temp = "";
    
 int length = originalString.length();

 for (int i = length - 1; i >= 0; i--)
 {
  temp = temp + originalString .charAt(i);
 }

 System.out.println("String before reversing: " + originalString);
 System.out.println("String after reversing: " + temp);
}


}
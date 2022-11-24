package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> name = new ArrayList<String>();
		//2. Add five Strings to your list
		name.add("Clint");
        name.add("Tony");
        name.add("Bruce");
        name.add("Steve");
        name.add("Natasha");
      
		//3. Print all the Strings using a standard for-loop
for(int i = 0; i < name.size(); i++) {
	String s =  name.get(i);
	System.out.println("String at element " + i + " " + s);
}
System.out.println("\n");

for(String s: name) {
	System.out.println(s);
	
}
for (int i = 0;name.size()>i; i++) {
	if(i%2==0) {
		System.out.println(i);
	}
}
		//4. Print all the Strings using a for-each loop
for (int i =name.size()-1;i>=0;i--) {
	if(i%2==0) {
		System.out.println(i);
	}
}	
for (int i =name.size()-1;i>=0;i--) {
	if(i%2==0) {
		System.out.println(i);
	}
}
		//5. Print only the even numbered elements in the list.
for(int i = name.size()-1;i>=0;i--) {
	String a=name.get(i);
	if(a.contains("E")){
		System.out.println(a);
}
}
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
	}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args){  	
		LinkedList<String> names = new LinkedList<String>();
		names.push("Caleb");
		names.push("Sue");
		names.push("Sally");
		
		ListIterator<String> it = names.listIterator();
		it.next();
		it.next();
		it.add("Susan");
		
		for(String s: names) {
			System.out.println(s);
		}
		
	}
	
}
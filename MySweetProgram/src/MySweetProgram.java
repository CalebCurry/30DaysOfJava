import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) throws FileNotFoundException {  
		LinkedList<String> names = new LinkedList<String>();
		names.add("Caleb");
		names.add("Sue");
		names.add("Sally");

		System.out.println(names.remove());
		System.out.println(names.remove());
		System.out.println(names.remove());
	}
	
}
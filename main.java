// program designed to predict whether or not Trump will win the 2020 presidential Election. The results are written to the file newFile.txt

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;


public class main {
	
	public static void main(String [] args) {
		
		
		ArrayList<String> president = new ArrayList<String>();
		// read from a file
		try {
			  File x = new File("C:\\Users\\lets_\\Documents\\Java_files\\presidents.txt");
			  Scanner sc = new Scanner(x);      
			  while(sc.hasNext()) {	    
				    president.add(sc.nextLine());
				  }
				  sc.close();
				} catch (FileNotFoundException e) {
				  System.out.println("Error");
				}
		
		System.out.println(president);
		
		
		
		// write to file with presidents sorted alphabetically
		Collections.sort(president);
		
		try {
		      FileWriter myWriter = new FileWriter("C:\\Users\\lets_\\Documents\\Java_files\\newFile.txt");
		      for(String str: president) {
		    	  myWriter.write(str + System.lineSeparator());
		    	}
		      int total_votes = countVotes(0);
		      myWriter.write(String.valueOf(total_votes));
		      // conver integer countVotes to a String
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	}

	
	public static int countVotes(int votes) {
		
		
		String party = "Democrat";
		String part2 = "Republican";
		for(int i = 0; i < 539; i ++) {
			votes++;
		}
		return votes;
		
	}

}

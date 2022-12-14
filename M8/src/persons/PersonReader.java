package persons;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;

/**
 * Provides a static method to parse a list of persons from a CSV (comma-separated values) file.
 *
 * @author t.perennou
 *
 */
public class PersonReader {
	
	/**
	 * Reads persons from a text file. The file must be in the CSV format:
	 * <ul>
	 * <li> One person per line
	 * <li> Each line must be in the format: 
	 * <pre>
	 * name,age
	 * </pre>
	 * </ul>
	 * 
	 * Here is an example file of CSV file content:
	 * 
	 * <pre>
	 * Jean Dupont,33
	 * Pierre Martin,55
	 * </pre>
 	 * 
	 * @param filename Path of the file to read, e.g. "data/persons.txt"
	 * @return A list of persons in the text file
	 * @throws IOException when the file cannot be read or has a bad format.
	 */
	static public ArrayList<Person> read(String filename) throws IOException {
		FileReader in = new FileReader(filename);
		BufferedReader bin = new BufferedReader(in);

		ArrayList<Person> persons = new ArrayList<Person>();
		ArrayList<String> wrongFormatException = new ArrayList<String>();
		int lineNumber = 1;
		while(bin.ready()) {
			String line = bin.readLine();
			try {
				String[] tokens = line.split(",");
				String name = tokens[0].trim();
				int age = Integer.parseInt(tokens[1].trim());
				persons.add(new Person(name, age));
				
			} catch(PatternSyntaxException wrongFormatComa) {
				wrongFormatException.add("The format with ' , ' is not correct on line " + lineNumber);
			} catch(NumberFormatException ageIsNotInt) {
				wrongFormatException.add("The age is not an integer on line " + lineNumber);
			}
			lineNumber++;
			
			
		}
		bin.close();

		if(!wrongFormatException.isEmpty()){
			System.out.println("Catched some wrong formating in file " + filename);
			for(String err: wrongFormatException){
				System.out.println(err);
			}
			System.out.println("PersonReader.read created the given persons on the other lines");
		}
		
		return persons;
	}

}

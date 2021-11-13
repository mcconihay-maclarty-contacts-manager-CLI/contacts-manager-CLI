package hope;

import util.Input;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;

public class CLI {

	String directory = "./src/data";
	Path dataDirectory = Paths.get(directory);

	// 		File path
	String filename = "contactInfo.text";

	//		Combine them
	Path dataFile = Paths.get(directory, filename);



//	allContacts uses a reader to use a relative path to the text file contactInfo. Once in the file
//	The reader uses a while loop to read each line and to stop once the line reads null.
//	After it finishes reading it will print the text to the terminal.
	public void allContacts(){
		try {
			BufferedReader reader = new BufferedReader(new FileReader("contactInfo.text"));
			String line;
			while((line = reader.readLine()) != null){
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}



//addContact takes in two separate strings so the user has to enter both in separate scanners.
//	the FileWriter is using a relative path anf is set to true, allowing Filewriter to append instead of overwriting.
//	newLine causes the next writer to write on a new line
//	when using a writer you have to use .close inorder for the function to finish
	public void addContact(String name, String number) {

		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter("contactInfo.text", true));
			writer.write(name);
			writer.write(" | ");
			writer.write(number);
			writer.write(" |");
			writer.newLine();
			writer.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}



//	Maybe delete by index and add a number that increments
	public void deleteContact(String lineToRemove) throws IOException {
		File inputFile = new File("contactInfo.text");
		File tempFile = new File("myTempFile.txt");

		BufferedReader reader = new BufferedReader(new FileReader("contactInfo.text"));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		String Line;

		while((Line = reader.readLine()) != null) {
			String trimmedLine = Line.trim();
			if(trimmedLine.equals(lineToRemove)) continue;
			writer.write(Line + System.getProperty("line.separator"));
		}
		writer.close();
		reader.close();
		boolean successful = tempFile.renameTo(inputFile);
	}



//	searchByName is similar to the method allContacts but with an if statement that uses a ROOT or empty string method
//	with the contains method to locate your search in the textfile.
	public void searchByName(String name) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("contactInfo.text"));
			String line;
			while((line = reader.readLine()) != null){
				if(line.toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))) {
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

//---Name---|----Number----|
//		Bob Vance | 909-090-9090 |
//		Lost Boys | 909-999-0000 |
//		Joe Wallace | 909-505-3939 |
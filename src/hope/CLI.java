package hope;

import java.io.*;
import java.nio.file.Files; //Remove
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale; //Remove

public class CLI {

	String directory = "./src/data";
	Path dataDirectory = Paths.get(directory);

	// 		File path
	String filename = "./src/data/contactInfo.text";
	String fileTemp = "myTempFile.txt";
	//		Combine them
	Path dataFile = Paths.get(directory, filename);
	Path dataTempFile = Paths.get(directory, fileTemp);
//BufferedWriter is a subclass to writer
//	BufferedWriter writes text to character output stream, buffering characters so as to provide for the efficient writing of single characters, arrays, and strings.

// readline() reads a text line that ends with \n

//Java FileWriter class is used to write character-oriented data to a file. Unlike FileOutputStream class, you don't need to convert string into byte array because it provides method to write string directly.


//	allContacts uses a reader to use a relative path to the text file contactInfo. Once in the file
//	The reader uses a while loop to read each line and to stop once the line reads null.
//	After it finishes reading it will print the text to the terminal.
	public void allContacts(){
		try {
			BufferedReader reader = new BufferedReader(new FileReader("./src/data/contactInfo.text"));
			String line;
			while((line = reader.readLine()) != null){
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}



//addContact takes in two separate strings so the user has to enter both in separate scanners.
//	the FileWriter is using a relative path and is set to true, allowing Filewriter to append instead of overwriting.
//	newLine causes the next writer to write on a new line
//	when using a writer you have to use .close inorder for the function to finish
	public void addContact(String name, String number) {

		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter("./src/data/contactInfo.text", true));
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

		File inputFile = new File("./src/data/contactInfo.text");
		File tempFile = new File("./src/data/myTempFile.txt");

		BufferedReader reader = new BufferedReader(new FileReader("./src/data/contactInfo.text"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("./src/data/myTempFile.txt"));

		String Line;

		while((Line = reader.readLine()) != null) {
			if(!Line.toLowerCase().contains(lineToRemove.toLowerCase())){
				writer.write(Line + System.getProperty("line.separator"));
				}
			}
			writer.close();
			reader.close();
			boolean successful = tempFile.renameTo(inputFile);
	}



//	searchByName is similar to the method allContacts but with an if statement that uses a ROOT or empty string method
//	with the contains method to locate your search in the textfile.
	public void searchByName(String name) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("./src/data/contactInfo.text"));
			String line;
			while((line = reader.readLine()) != null){
				if(line.toLowerCase().contains(name.toLowerCase())) {
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}



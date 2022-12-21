// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

class fileOperation{
	public static void main(String[] args) {
		// creating file in java
		// try{
		// File f = new File("tebabu.txt");
		// 	f.createNewFile();
		// 	System.out.println("File created: "+ f.getName());
		// }
		// catch(IOException e){
		// 	System.out.println("An error occured");
		// 	e.printStackTrace();
		// }

		// writing on file
		// try{
		// 	FileWriter fw = new FileWriter("tebabu.txt");
		// 	fw.write("File in java is very tricky");
		// 	fw.close();
		// 	System.out.println("Successfully wrote");
		// }
		// catch(IOException e){
		// 	System.out.println("An error occured");
		// 	e.printStackTrace();
		// }

		// reading a file
		// try{
		// 	File f = new File("tebabu.txt");
		// 	Scanner s = new Scanner(f);
		// 	while(s.hasNextLine()){
		// 		String data = s.nextLine();
		// 		System.out.println(data);
		// 	}
		// }
		// catch(FileNotFoundException e){
		// 	System.out.println("An error occured");
		// 	e.printStackTrace();
		// }

		// Getting extra info about File
		// File f = new File("tebabu.txt");
		// if (f.exists()) {
		// 	System.out.println("file name "+ f.getName());
		// 	System.out.println("absolute path of file "+ f.getAbsolutePath());
		// 	System.out.println("writable "+ f.canWrite());
		// 	System.out.println("Readable "+ f.canRead());
		// 	System.out.println("size in byte "+ f.length());
		// }
		// else{
		// 	System.out.println("file does not exist");
		// }

		// deleting file in java
		// File f = new File("mac.txt");
		// if (f.delete()) {
		// 	System.out.println("file is deleted "+ f.getName());
		// }
		// else{
		// 	System.out.println("failed to delete file");
		// }


	}
}
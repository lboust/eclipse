package gestionFichier;

import java.io.*;
public class Principal {
	
	public static void main(String[] args) throws Exception{
	//créer et remplir un fichier
	FileOutputStream fos = new FileOutputStream("data.txt");
	fos.write("Hello\n".getBytes());
	fos.write("Hello\n".getBytes());
	fos.close();
	//lire un fichier
	FileInputStream fis = new FileInputStream("data.txt");
	while (fis.available()>0) { 		// lit la totalité du fichier
		System.out.print((char)fis.read());
	}
	fis.close();
	
	//meilleure façon de gérer un fichier
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
	while (bis.available()>0) { 		// lit la totalité du fichier
		System.out.print((char)bis.read());
	}
	bis.close();
	
	BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
	for(;;) {
		String line = bufferedReader.readLine();
		if (line==null) {
			break;
		}
		System.out.println(line);
		
	}
	bufferedReader.close();
	}
}

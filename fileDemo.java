package program;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName=null;
		Scanner br=new Scanner(System.in);
		System.out.println("enter the name of the file");
		fileName=br.next();
		String path="C:\\Users\\nisha\\java\\program\\src";
		File fCreate=new File(path+"/"+fileName);
		try {
			if(fCreate.createNewFile()) {
				System.out.println("the file"+fCreate.getName()+"successfully created");
				FileWriter Writer =new FileWriter(fCreate);
				Writer.write("files in java are seriously good!");
				Writer.close();
				System.out.println("successfully written");
			}else {
				System.out.println("the file"+fCreate.getName()+"already exists");	
			}
		}catch(IOException e) {
		e.printStackTrace();
	}
	if(fCreate.exists()) {
		System.out.println("is the file readable"+fCreate.canRead());
		System.out.println("is the file writable"+fCreate.canWrite());
		System.out.println("the path of the file"+fCreate.getAbsolutePath());
		System.out.println("the name of the file"+fCreate.getParent());
		System.out.println(" the path of the file "+fCreate.getPath());
		System.out.println("is the directory"+fCreate.isDirectory());
		System.out.println("is the file"+fCreate.isFile());
		System.out.println("is the file hidden"+fCreate.isHidden());
		System.out.println("is the file modified"+fCreate.lastModified());
		System.out.println("the length of the file"+fCreate.length());
		fCreate.delete();
		System.out.println("the file"+fCreate.getName()+"successfully deleted");
	}
		
	}

}

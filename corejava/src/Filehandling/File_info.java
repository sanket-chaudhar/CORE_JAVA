package Filehandling;

import java.io.File;

public class File_info {
public static void main(String[] args) {
	String filepath="C:\\Users\\sanke\\Desktop";
	File file=new File(filepath);

	if(file.exists()) {
		System.out.println("file is present");
		System.out.println("file name:"+file.getName());
		System.out.println("file path:"+file.getAbsolutePath());
		
		System.out.println("can read:"+file.canRead());
		
		System.out.println("can write"+file.canWrite());
		
		System.out.println("can execute"+file.canExecute());
		
		}else {
			System.out.println("file is not fount");
		}
}
}

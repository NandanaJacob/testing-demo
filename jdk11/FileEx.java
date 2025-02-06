package jdk11;

import java.nio.file.Files;
import java.nio.file.Path;
 
public class FileEx {
 
	public static void main(String[] args) throws Exception{
		Path path = Path.of("demo.txt");
		Files.writeString(path, "Hello everyone!!!");
		String data=Files.readString(path);
		System.out.println(data);
		Files.deleteIfExists(path);
	}
}


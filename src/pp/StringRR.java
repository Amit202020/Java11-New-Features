package pp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class StringRR {

	public static void main(String[] args) throws IOException {
		
		
		 var path = "c://app/data.txt";
		 
		 Files.writeString(Path.of(path),"This is mocroservice demo",StandardOpenOption.WRITE);
		 
		 String  s1 = Files.readString(Path.of(path));
		 
		 System.out.println(s1);

	}

}

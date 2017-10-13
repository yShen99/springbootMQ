package testMaven.com.qian.util.fileIo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadLine {
	public static void main(String[] args) {
		System.err.println(read("F:/s.txt"));
	}
	
	public static String read(String fileNane){
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileNane));
			String s ;
			StringBuilder sb = new StringBuilder();
			try {
				while((s = br.readLine())!=null){
					sb.append(s+"\n");
				}
				br.close();
				return sb.toString();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return fileNane;
	}
	
}

package testMaven.com.qian.util.binary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestBinary {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Integer l = 10;
		printInfo(l);
		l = l<<1;
		printInfo(l);
		l = l >> 1;
		printInfo(l);
		
		String fileName = "F:\\s.txt";
		System.out.println(fileName.equals("‪F:\\s.txt"));//"F:/s.txt"
		File file = new File(fileName);
		
		InputStream in = null;
        try {
            System.out.println("以字节为单位读取文件内容，一次读一个字节：");
            // 一次读一个字节
            in = new FileInputStream(file);
            int tempbyte;
            while ((tempbyte = in.read()) != -1) {
                System.out.write(tempbyte);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    
		
		
		
		
		
		
		
		
		
		
		
	}
	 /**
	  * @param num
	  */
	    private static void printInfo(Integer num){
	         System.out.println(Integer.toBinaryString(num));
	     }
}

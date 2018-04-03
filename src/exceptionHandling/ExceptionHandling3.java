package exceptionHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling3 {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, AWTException {
		// throw means JVM Will handle it
		// If JVM can't handle it will terminate the program
		// but try catch is always recommended over throws
		System.out.println("Start");
		Thread.sleep(5000);
		System.out.println("End");
		
		FileInputStream fis = new FileInputStream("");
		
		Robot a=new Robot();

	}

}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

import Package1.Employee;
import Package1.Employee2;

public class Main {

	public static void main(String[] args) {
		String line;
		
		try {
            FileReader reader = new FileReader("abc.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            while ((line = bufferedReader.readLine()) != null) {
            	System.out.println(line);
               
            }
            
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}

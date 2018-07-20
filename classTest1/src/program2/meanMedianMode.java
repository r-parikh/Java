package program2;

import java.io.*;
import java.lang.reflect.Array;
import java.net.*;
import java.util.Arrays;

public class meanMedianMode {
	
	public static void main(String[] args) throws IOException, URISyntaxException {
		
		String nums = null;
		
		FileReader file = new FileReader("/home/rparikh/eclipse-workspace/classTest1/src/program2/data.txt");
		BufferedReader fileReader = new BufferedReader(file);
		
		String line = fileReader.readLine();
		String[] str = new String[100];
		String strLine = "";
        String str_data = "";
		
        while (line != null)
        {
           if (line == null)
             break;
           str_data += line + " ";
           line = fileReader.readLine();
           
        }
        
        String[] stringArray = str_data.split(" ");
	    
	    fileReader.close();
		
	    //System.out.println(java.util.Arrays.toString(str_data.split("(?<=\\G.{2})")));
	    //String data = java.util.Arrays.toString(str_data.split("(?<=\\G.{2})"));
	    
	    //System.out.println(stringArray.length);
	    int[] A = new int[stringArray.length];;
	    
	    for(int i=0;i<stringArray.length;i++) {
	    	A[i] = Integer.parseInt(stringArray[i]);
	    }
	    
	    Arrays.sort(A);
	    
	    double mean=0;
	    double median;
	    double mode;
	    int count=0;
	    
	    for(int i =0;i<A.length;i++) {
	    	mean += A[i];
	    }
	    
	    if(A.length%2 ==0) 
	    	median = ((double)A[A.length/2] + (double)A[A.length/2 - 1])/2;
	    else
	    	median = (double) A[A.length/2];
	    
//	    mode = A[0];
//	    int maxCount = 0;
//	    for (int i = 0; i < A.length; i++) {
//	        int value = A[i];
//	        count = 1;
//	        for (int j = 0; j < A.length; j++) {
//	            if (A[j] == value) count++;
//	            if (count > maxCount) {
//	                mode = value;
//	                maxCount = count;
//	            }
//	        }
	    
	    
	    
	    System.out.print("Mean is: ");
	    System.out.println((mean/A.length));
	    
	    System.out.print("Median is: ");
	    System.out.println(median);
	    
	    System.out.print("Mode is: ");
	    //System.out.println(mode);
	    
	    
	    
	    
	    
	    
	    
	    }	    
	}

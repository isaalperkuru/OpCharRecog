package com.OpCharRecog;
import java.io.*;
import java.util.*;
public class CSVfileReader {
	public static ArrayList<ArrayList<Double>> lists = new ArrayList<ArrayList<Double>>();
	public static ArrayList<Integer> classes = new ArrayList<Integer>();
	public static ArrayList<ArrayList<Double>> exTractTraningData(FileReader file) throws IOException {

	    try {
	        //create BufferedReader to read csv file
	        BufferedReader reader = new BufferedReader(file);
	        ArrayList<Double> arrays = new ArrayList<Double>();
	        ArrayList<Double> arrays2 = new ArrayList<Double>();
	        //ArrayList<Integer> classes = new ArrayList<Integer>();
	        //ArrayList<ArrayList<Number>> lists = new ArrayList<ArrayList<Number>>();
	        String strLine = "";
	        StringTokenizer st = null;

	        int lineNumber = 0, tokenNumber = 0;;


	        while ((strLine = reader.readLine()) != null) {
	            lineNumber++;
	            //break comma separated line using ","
	            st = new StringTokenizer(strLine, ",");

	            while (st.hasMoreTokens()) {
	                //display csv values
	                tokenNumber++;
	                System.out.println("Line # " + lineNumber
	                        + ", Token # " + tokenNumber
	                        + ", Token : " + st.nextToken()
	                         + ": " + strLine);
	                String a[]=strLine.split(",");
	                for(int i=0; i<a.length-1;i++)
	                	arrays.add(Double.parseDouble(a[i]));
	                if(tokenNumber==a.length)
	                	classes.add(Integer.parseInt(a[a.length-1]));
	            }
	            //reset token number
	            tokenNumber = 0;;
	            lists.add(arrays);
	            arrays=arrays2;
	        }
	        /*for(int i=0;i<lists.size();i++){
	        	 for(int j=0;j<65;j++){
	        		System.out.println(lists.get(i).get(j));
	        		}
	        }*/
	    } catch (Exception e) {

	        System.out.println("Exception while reading csv file: " + e);
	    }
	    return lists;
	}
	
}

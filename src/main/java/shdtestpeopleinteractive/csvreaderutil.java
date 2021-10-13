package shdtestpeopleinteractive;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class csvreaderutil {
	public static String a;
	public static String b;
	
	public static List<String> csvread() throws Exception {
	CSVReader reader= new CSVReader(new FileReader("F:\\Eclipse Java new Programs\\shdtestpeopleinteractive\\src\\main\\resources\\testcsv.csv"));
	String csvcontent[];
	List<String> langlist=new ArrayList<>();
	while((csvcontent=reader.readNext())!=null) {
		for(int i=0;i<1;i++) {
			 langlist.add(csvcontent[i]);
			 langlist.add(csvcontent[i+1]);
		}
		
	}
	return langlist;
	
	}
	public static void main(String[] args) {
		try {
			csvread();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

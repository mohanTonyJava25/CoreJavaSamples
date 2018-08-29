package spring.ioc.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class collectionExample {


	public static void main(String[] args) {
		
	
	
	List<String> test = new ArrayList();
	List<String> test1 = new LinkedList();
	Vector<String> test3 = new Vector();
	Set<String> test4 = new HashSet();
	Set<Integer> test5 = new TreeSet();
    Map<Integer,String> test6 = new HashMap();
         
    
     test.add("hello");
     test.add("hello1");
     test.add("man");
     test1.add("tommy");
     test1.add("tommy2");
     test1.add("tommy");
     test1.remove("tommy");
     
     
     
     
    
     
	}
}
    
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


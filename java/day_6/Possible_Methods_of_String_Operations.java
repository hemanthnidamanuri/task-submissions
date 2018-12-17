/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 *
 */
public class Possible_Methods_of_String_Operations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String h = "hemanth";
		//charat() methods
		char ch = h.charAt(0);
		System.out.println(ch);
		
		//compareto()
		String k = "hems";
		System.out.println(h.compareToIgnoreCase(k));
		
		//concat methods()
		String s1 = "hello";
		String s2  = "hi";
		System.out.println(s1.concat(s2));
		
		//contains() mathod
		String line = "hemanth is a webdeveloper";
		System.out.println(line.contains("webdeveloper"));
		
		//endswith() methods
		String name  = "hemanth";
		System.out.println(name.endsWith("h"));
		
		//equals() methods
		String s = "msit";
		String x = "jntuk";
		System.out.println(s.equals(x));
		
		//equalsIgnorecase() methods
		String sn = "hems";
		String ns = "HEMS";
		System.out.println(sn.equalsIgnoreCase(ns));
		
		//format() methods
		int i = 23;
		String fmat = String.format("%d", i);
		System.out.println(fmat);
		
		//getBytes() method
		String alph  = "abcdef";
		byte[]  arr  = alph.getBytes();
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		
		//getting string back
		String alp = new String(arr);
		System.out.println(alp);
		
		//getChars() method
		String str = new String("hello javatpoint how r u");  
	      char[] c = new char[10];  
	      try{  
	         str.getChars(6, 16, c, 0);  
	         System.out.println(c);  
	      }catch(Exception ex){System.out.println(ex);}  
	      
	      //indexof() method
	      String g = "hello,world!";
	      System.out.println(g.indexOf("world"));
	      
	      //intern() method
	      String n=new String("hello");  
	      String t="hello";  
	      String r=s1.intern();//returns string from pool, now it will be same as s2  
	      System.out.println(n==t);//false because reference variables are pointing to different instance  
	      System.out.println(t==r);//true because reference variables are pointing to same instance 
	      
	      //isEmpty() method
	      
	      String emp = "";
	      System.out.println(emp.isEmpty());
	      
	      //joinString() method
	      
	      String joinString1=String.join("-","welcome","to","javatpoint");  
	      System.out.println(joinString1); 
	      
	      //lastindexof() methods
	      String lid="this is index of example";//there are 2 's' characters in this sentence  
	      int index1=lid.lastIndexOf('s');//returns last index of 's' char value  
	      System.out.println(index1);//6  
	      
	      //length() methods
	      String nd = "nidamanuri hemanth";
	      System.out.println(nd.length());
	      
	      //replace() methods
	      String comp = "semanth bits";
	      String rpl = comp.replace("semantic", "hemanth");
	      System.out.println(rpl);
	      
	      //replaceAll() method
	      String exam = "this is final, it final";
	      String exm = exam.replaceAll("final", "notfinal");
	      System.out.println(exm);
	      
	      //split() methods
	      String inum = "hello,hemanth,hiee,how are you";
	      String[] hmm = inum.split(",");
	      for (int j = 0; j < hmm.length; j++) {
			System.out.println(hmm[j]);
		}
	      
	      //startsWith() method
	      String  nid = "nidamanuri";
	      System.out.println(nid.startsWith("n"));
	      
	      //subString() methods
	      String hem = "hemanth";
	      System.out.println(hem.substring(1,5));
	      
	      //toCharArray() method
	      String nth = "hemanth";
	      char[] ary = nth.toCharArray();
	      for (int j = 0; j < ary.length; j++) {
			System.out.println(ary[j]);
		}
	      //toLowerCase() method
	      String em = "HEMANTH";
	      System.out.println(em.toLowerCase());
	      
	      //toUpperCase() method
	      String tn = "hemanth";
	      System.out.println(tn.toUpperCase());
	      
	      //trim() method 
	      String u = "hemanth nidamanuri ";
	      System.out.println(u.trim());
	      
	      //valueOf() method
	      int o = 100;
	      String sss = String.valueOf(o);
	      System.out.println(sss+100);
	      
		}
	
}

package fPPExam;

import java.util.Stack;

public class Recursive {

//	public static void main(String[] args){
//		System.out.println(recurse("xyza"));
//	}
//	
//	public static String recurse(String str){
//		if(str.length() <=1){
//			return str;
//		}else{
//			return str.substring(str.length()-1, str.length())+recurse(str.substring(0, str.length()-1));
//		}
//	}
	
	public static String recursive(Stack< Character> s){
		String c="";
		if(s.isEmpty())
			return "";
		else{
		c= c+s.pop()+ recursive(s);
		 }
		 return c;
	}
	public static void main(String[] args) {
	//Recursive sc= new Recursive ();

 Stack<Character>sc=new Stack<>();
  String s="Anmyt";
  for(int i=0;i<s.length();i++){
sc.push(s.charAt(i));
 }
  System.out.println(recursive(sc));
	}

}

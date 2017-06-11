package exam;

import java.util.Arrays;

public class MyStringList {
	
	private final int INITIAL_LENGTH=4;
	private String[] strArray;
	private int size=0;
	public MyStringList ( ){
		this.strArray= new String[INITIAL_LENGTH];
		}
	public void add(String s){
		if(size==strArray.length){
			throw new ArrayIndexOutOfBoundsException("eroor");
		}

	 else{
		 strArray[size]=s;
		 size++;
		 System.out.println(Arrays.toString(strArray));
	 }
		
	}
	public String get(int i){
		if(i<0||i>=size)
			return null;
		else 
			return strArray[i];
	
	}
	public boolean find(String s){
		for( int i=0;i<strArray.length;i++){
			if(strArray[i].equals(s))
				return true;
		}
		return false;
	}
	public void insert(String s,int pos){
		if(pos>=size)
			return;
		else if(strArray[pos]!=null){
			System.out.println("Already occupied");
		}
		else 
			strArray[pos]=s;
		size++;
		System.out.println(Arrays.toString(strArray));
			
	}
	public boolean remove(String s){
		for(int i=0;i<strArray.length;i++){
			if(strArray[i]==s){
				strArray[i]=null;
				size--;
				return true;
				}
		}
	return false;
	}
	public void resize(){
		int resize=strArray.length*2;
		strArray=Arrays.copyOf(strArray,resize);
		System.out.println(Arrays.toString(strArray));
		size=strArray.length;
	}
	public int size(){
		return size;
	}
//	public String toString(){
//		return String.format(""+);
//	}

	public static void main(String[] args) {
		MyStringList list=new MyStringList();
		list.add("lwam");
		list.add("llulu");
		list.add("zaidm");
		System.out.println(list.get(1));
		System.out.println(list.find("zaid"));
		list.insert("jjj",3);
		System.out.println(list.remove("lwam"));
		list.resize();
		System.out.println(list.size());

	}

}

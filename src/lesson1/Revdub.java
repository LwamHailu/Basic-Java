package lesson1;

//import java.util.Arrays;

public class Revdub {
public static String [] RemvDub(String []a){
		String []arr=new String [a.length];
		int index=0;
		
		for(int i=0;i<a.length;i++){
			boolean isseen=false;
			for(int j=0;j<index;j++){
				if(a[i].equals(arr[j])){
					isseen=true;
					break;
				}
			}
				
				if(!isseen){
					arr[index]=a[i];
					index++;
				}
			
		}
		String newcopy[]=new String[index];
		for(int k=0;k<index;k++){
			newcopy[k]=arr[k];
		}
		return newcopy;
		
		
	}
	public static void main(String[] args) {
		
String a[]=RemvDub(new String[]{"horse","dog","cat","cat","cat","horse"});

for(String s:a){
	System.out.println(s);
}
	}

}

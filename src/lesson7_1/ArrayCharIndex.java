package lesson7_1;

public class ArrayCharIndex {

	public static void main(String[] args) {
		MyTable t = new MyTable(); 
		t.add('a', "Andrew"); 
		t.add('b',"Billy");
		t.add( 'C',"Charles"); 
		t.add( 'w',"Willie"); 
		t.add( 'd',"David"); 
		t.add( 'b',"Bod"); 
		t.add( 'c',"Cosmas"); 
		System.out.println(t);

	}

}

class MyTable { 
	private Entry[] entries;
	
	public MyTable() {
		entries = new Entry[26];
	}
		//returns the String that is matched with char c in the table 
	public String get(char c){
		return this.toString();
	}
	public void add(char c, String s) {
		if(Character.isUpperCase(c)){
			System.out.println("\""+c+"\" for \""+s+ "\" ");
		}else{
			entries[c-'a'] = new Entry(c, s);
		}
		
	}
	public String toString() {
		String ret = "";
		for(Entry entry : entries){
			if(entry!=null)
			ret += entry.indexChar +" -> "+entry.valueString+"\n";
		}
		return ret; 
	}
	private class Entry {
		char indexChar;
		String valueString;
		
		Entry(char ch, String str){
			this.indexChar = ch;
			this.valueString = str;
		}
		public String toString() {
			String ret = this.indexChar + " -> "+ this.valueString;
			return ret; 
		}
	} 
}
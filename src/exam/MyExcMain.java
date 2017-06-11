package exam;

public class MyExcMain{
	
	public static void main (String[] a) throws MyException {
		
		try{
			int x=1, y=2;
			int z=x/y;
			
			if (x< y)
			{
				throw new MyException("just try again");
				
			}
				
			if (z<x){
				
				throw new MyException("second issue");
			}
			}
			
			catch(MyException e){
				
				System.out.println("end of program");
				System.out.println(e.getMessage());
				System.out.println(e.getMessage());
				System.out.println(e.getMessage());
			}
		}
		
	}



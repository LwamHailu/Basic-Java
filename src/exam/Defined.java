package exam;

public class Defined {
	public static void main(String[] args) throws UserException {
	
		 int x = 5, y = 40;
	        try
	        {
	            float z = (float)x / (float)y;
	            if(z < 0.01)
	            {
	                throw new UserException("Number is too small");
	            }
	            if (x<y)
	            {
	            	throw new UserException("First Number Should greater ");
	            }
	        }
	        catch(UserException e)
	        {
	            System.out.println("Caught MyException");
	            System.out.println(e.getMessage());
	        }
	        finally
	        {
	            System.out.println("End of Program");
	        }
}

}

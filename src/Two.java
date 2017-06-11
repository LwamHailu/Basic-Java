
class Two extends One implements First, Second {

//class Two extends One implements First, Second{
     
    public void show_first()
    {
        System.out.println("Interface first : " + F);
    }
    public void show_second()
    {   
    	//S = 30;
    	int x = F + S;
        System.out.println("Interface second : " + x);
    }
    public void show_two()
    {   
        System.out.println("Class two");
    }
 }
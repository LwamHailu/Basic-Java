package lesson3and4;

public class Main {
public static void main(String[] args) {
		int press=0;
		Television tv=new Television("LG",32);
		tv.setPowerOn(true);
		tv.setChannel(7);
		tv.setDecreaseVolume(6);
		tv.setIncreaseVolume(87);
		if(tv.isPowerOn()==true){
		 System.out.println("power is on");}
			else{
		  System.out.println("power is off");
			}
          System.out.println("brand "+tv.getManufacturer());
		  System.out.println("screen size "+tv.getScreen_size());
	      System.out.println("decrease volume "+tv.getDecreaseVolume());
		  System.out.println("increase volume "+tv.getIncreaseVolume());
		  System.out.println("Channel  "+tv.getChannel());
	      System.out.println("volume "+tv.getVolume());
		

	}

}

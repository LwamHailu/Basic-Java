package lesson3and4;

public class Television {

	private String Manufacturer;
	private int Screen_siz;
	private boolean PowerOn;
	private int channel=8;
	private int Volume=8;
	
	
	Television(String brand,int size){
		Manufacturer=brand;
		Screen_siz=size;
		
	}
	public int getScreen_size(){
		return Screen_siz;
	}
	
	public boolean isPowerOn() {
		return PowerOn;
	}

	public void setPowerOn(boolean powerOn) {
		this.PowerOn = powerOn;
	}
	
	public String getManufacturer(){
		return Manufacturer;
	}
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int newChannel) {
		channel = newChannel;
		if(channel>=1 &&channel<=125)
			++channel;
	}

	public int getVolume() {
		return Volume;
	}

	public void setDecreaseVolume(int dec) {
	Volume=dec;
		if(dec<0)
			Volume=0;
		
		Volume--;
		}
   public int getDecreaseVolume() {
		
		return Volume;
	}
	public void setIncreaseVolume( int inc) {
		 Volume=inc;
			Volume++;
	}
	
	public int getIncreaseVolume() {
		return Volume;
	}
	

}

package lesson5two;

public class Computer implements Cloneable {
	private String manufacturer;
	private String processor;
	private  int ramSize;
	private  int diskSize;
	private  double processorSpeed;
	
	public Computer(String manufacturer,String processor,int ramSize,int diskSize,double processorSpeed ){
		this.manufacturer=manufacturer;
		this.processor=processor;
		this.ramSize=ramSize;
		this.diskSize=diskSize;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public int getDiskSize() {
		return diskSize;
	}
	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	public void setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
	public double getCoputerPower(){
		return this.getRamSize()* this.getProcessorSpeed();
	}

	public String tostring(){
		return String.format(getManufacturer()+" Processor "+getProcessor()+"Ram:- "+getRamSize()+" Disk Size  "+getDiskSize()+""+" ComputePower"+getCoputerPower()
				);
	}
	 @Override
  public boolean equals(Object ob){
	  if(ob==null)
		  return false;
	if(!(ob instanceof Computer))
		return false;
	Computer c=(Computer)ob;
	boolean equals =this.manufacturer.equals(c.manufacturer)&&this.processor.equals(c.processor)&&
			this.ramSize==c.ramSize;
		
	return equals;
	
}
  @Override
  public int hashCode(){
		int hash = 17; // user defined formula
		int h = hash*13 + this.getManufacturer().hashCode()*this.processor.hashCode()*this.ramSize;
		return h;
	}
  @Override
  public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
		
	}
}

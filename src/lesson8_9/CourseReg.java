package lesson8_9;

//import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
//import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
public class CourseReg {

	int regNo; 
	 String cName; 
	 String sName; 
	 String sId; 
	 public CourseReg(int regNo,String cName,String sName,String sId){
		 this.regNo=regNo;
		this.sName=sName;
		 this.cName=cName;
		 this.sId=sId;
		 
		 }
	 
	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}   
	 public static  Comparator<CourseReg> S_ID = new Comparator<CourseReg>() {
			public int compare(CourseReg o1, CourseReg o2) {
				return (o1.regNo-o2.regNo);}
		};
	public String toString(){
		return String.format("\nregistration No "+getRegNo()+" Student Name "+getcName()+
				"  Course Name "+getsName()+" Student Id "+getsId());
	}
	public static void display(Queue<CourseReg> list){
		if(list.size()==0){
			System.out.println("Queue is empty");
		}else{
			Iterator<CourseReg> it = list.iterator();
			while(it.hasNext()){
				//CourseReg ob = ;
				System.out.println(list.poll());
		}
			
		}
	}
	
	public static void main(String[] args) {
		//CourseReg s=new
	  Queue<CourseReg> list=new PriorityQueue<>(S_ID);
	  
	   list.add(new CourseReg(10,"lwam","computer","8"));
       list.add(new CourseReg(17,"Bereket","English","9"));
       list.add(new CourseReg(11,"yonas","Math","5"));
       list.add(new CourseReg(13,"Tekle","History","6"));
       list.add(new CourseReg(12,"feven","Physics","10"));
       System.out.println(list.peek());
       System.out.println(list.size());
        display(list);
       System.out.println(list.isEmpty());

       
    }

}

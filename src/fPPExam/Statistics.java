package fPPExam;

import java.util.List;

public class Statistics {

	public static double computeSalary(List<Payable>list){
		double sum =0;
		for(Payable l:list){
		sum=sum+l.getSalary();
		}
		return sum;
	}

}

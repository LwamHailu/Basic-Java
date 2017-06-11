package exam;

import java.util.ArrayList;
import java.util.List;

//import java.util.Arrays;

public class Driver1 {

	public static void main(String[] args) {
		List<Figure>sc=new ArrayList<>();
//		Figure sc[]={new UpwardHat(),
//				new DownwardHat(),new FaceMaker(),new Vertical()};
		sc.add(new UpwardHat());
		sc.add(new DownwardHat());
		sc.add(new FaceMaker());
		sc.add(new Vertical());
		
//		  for(Figure i:sc){
//			i.getfigure();
//			}
System.out.println(sc);
		for(Figure i:sc){
		System.out.print("\n"+i.getClass().getSimpleName()+ " ");
		i.getfigure();
			
		}
	}

}

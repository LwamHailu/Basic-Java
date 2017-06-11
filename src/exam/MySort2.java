package exam;

import java.util.Comparator;

public class MySort2 implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
//		if(o1.getWeight()>o2.getWeight())
//			return 1;
//		else if(o1.getWeight()<o2.getWeight())
//			return -1;
//				return 0;
		return (o1.getWeight()-o2.getWeight());
			}

}

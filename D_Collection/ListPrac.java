import java.util.*;

public class ListPrac{

	public static void main(String args[]){
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(1);
		l.add(2);
		l.add(3);
		Set<Integer> s = new HashSet<>(l);
		System.out.println(s);
	}
}

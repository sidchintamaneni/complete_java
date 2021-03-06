import java.util.*;

public class Using_Iterable implements Iterable<Integer>{
	
	public Integer[] x;
	public int size;

	public Using_Iterable(){
		x = new Integer[4];
		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		x[3] = 4;
		size = x.length;
	}

	@Override
	public Iterator<Integer> iterator(){
		return new ArrayIterator(x, size);
	}

	public class ArrayIterator implements Iterator<Integer>{		
		public Integer[] x;
		public int size;
		public int counter = 0;

		public ArrayIterator(Integer[] x,int size){
			this.x = new Integer[size];
			for(int i=0; i<size; i++){
				this.x[i] = x[i];
			}
			this.size = size;
		}

		@Override
		public boolean hasNext(){
			return counter < size;
		}

		@Override
		public Integer next(){
			Integer num = x[counter];
			counter++;
			return num;
		}
	}

	public static void main(String[] args){
		Using_Iterable x = new Using_Iterable();
		
		Iterator<Integer> i = x.iterator();
	//	while(i.hasNext()){
	//		System.out.println(i.next());
	//	}
		for(int k: x) {
			System.out.println(k);
		}

	}
}

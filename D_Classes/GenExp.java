class GenExp<T>{
	
	void add(T a, T b){
		System.out.println(a+" "+b);
	}
	
	public static void main(String args[]){

		GenExp<Integer> obj_int = new GenExp<Integer>();
		
		obj_int.add(1,2);

		GenExp<Double> obj_double = new GenExp<Double>();

		obj_double.add(1.2,1.4);
	}
}


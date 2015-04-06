package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test<T> {
	T a;
	List<T> array;
	public Test(int size)
	{
		array = new ArrayList<T>();
		array.add((T) "weishi");
		array.add((T)(Integer)5);
//		array = (T[])new Object[size];
//		array[0]=(T)"sss";
//		array[1] = (T)(Integer)5;
//		System.out.println(array[0].getClass().getName()+"dsds");
//		System.out.println(array.getClass().getName()+"dsds");
//		array[0]=(T)"sss";
//		array[0]=(T)"sss";
//		array[1] = (T)"DDDDDD";
//		array[2] = (T)(String)"dddddddd";
//		array[3] = (T)(Integer)"0000";
//		array = new T[size];
	}
	
//	public <U> U[] makeArray(){
//		return new U[10];
//	}
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		Test<Integer> tt =new Test<Integer>(10);
//		System.out.println(Arrays.toString(tt.array));
//		tt.
//		Test<String> t = new Test<String>("ddd");
		
	}

}

package com.tech.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayParallel {
	public static void main(String[] args) {
ArrayBlockingQueue<Integer>a= new ArrayBlockingQueue<Integer>(10);
a.add(22);
a.add(23);
a.add(52);
a.add(60);
Iterator it=a.iterator();
a.add(452);
while (it.hasNext()) {
	Object object = (Object) it.next();
	System.out.println(object);
	
}

	
}

		
	

}

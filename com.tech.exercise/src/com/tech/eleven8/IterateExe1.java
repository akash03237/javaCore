package com.tech.eleven8;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateExe1 {
	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<>();
		a.add(54);
		a.add(68);
		a.add(13);
		a.add(45);
		a.add(87);
		a.add(12);
		Iterator<Object> it = a.iterator();//objects are print by iterator
		while (it.hasNext()) {

			Object ob = it.next();
			System.out.println(ob);

		}

	}
}

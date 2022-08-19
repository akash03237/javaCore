package com.raystech.collections;

import java.util.ArrayList;
import java.util.List;

public class TestADDon {
public static void main(String[] args) {
List a = new ArrayList<>();
a.add(21);
a.add(23.5);
a.add('a');
a.add("akash");


System.out.println("this is in array" + a);
for (Object ob : a) {
	System.out.println();
	System.out.println("this is in sequential " + ob);
}List b = new ArrayList<>();
b.add(45);
b.add('l');
b.addAll(a);
a.size();//ye size batara he 
System.out.println(a.size());
System.out.println();
System.out.println(b.contains(45));

System.out.println(b.containsAll(a));
//b.clear();//ye b ki value clear kar dega 
System.out.println("yha upper or down dono method add ho gye"+b);
System.out.println();
System.out.println(b.isEmpty());//empty khali he ya nhai batata he
System.out.println();
System.out.println(a.remove(1));
System.out.println();
System.out.println(b.removeAll(b));
System.out.println();
System.out.println(a.retainAll(b));
System.out.println();







}
}

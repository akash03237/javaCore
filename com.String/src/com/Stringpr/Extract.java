package com.Stringpr;

public class Extract {
public static void main(String[] args) {
	String s = "vijay chouhan";
String [] words=s.split(" ",2);
for (String word : words)
System.out.println(word);
}
}

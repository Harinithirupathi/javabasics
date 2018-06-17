package com.util.general;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListExample {
public static void main(String[] args) {
	LinkedList<String> linkedList = new LinkedList<>();
	linkedList.add("one");
	linkedList.add("two");
	linkedList.add("three");
	linkedList.add("four");
	
	linkedList.offerFirst("oneTothree");
	linkedList.offerLast("fourToone");
	
	System.out.println(linkedList);
	Iterator<String> iter =linkedList.descendingIterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
		
	}
	for(String str : linkedList) {
	System.out.println(str);
	
	
	
}
}
}
package com.xiahu.Work;

import java.util.LinkedList;

public class MyStack {
	private LinkedList link;
	
	public MyStack(){
		link=new LinkedList();
	}
	
	public void add(Object obj){
		link.addFirst(obj);
	}
	
	public Object get(){
//		return link.getFirst();
		return link.removeFirst();
	}
	
	public boolean isEmply(){
		return link.isEmpty();
		
	}

}

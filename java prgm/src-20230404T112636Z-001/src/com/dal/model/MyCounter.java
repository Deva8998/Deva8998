package com.dal.model;

public class MyCounter {
	int x =45;
	class MyInner
	{
		public void InnerMethod()
		{
			System.out.println("x == " + x);
		}
	}
	public void OuterMethod()
	{
		System.out.println("From outer method = " + x);
		MyInner inn = new MyInner();
		inn.InnerMethod();
	}
	public static void main(String[] a)
	{
		MyCounter mo = new MyCounter();
	//MyInner inn = new MyInner(); //invalid
	//inn.InnerMethod();
	//<outerclassname>.<innerclassname> objname = <outerclass instancename>.new <innerclassname>();
	MyCounter.MyInner mi = mo.new MyInner(); //instantiate inner class
	mi.InnerMethod();
	mo.OuterMethod();
	//mi.OuterMethod();  illegal
	//mo.InnerMethod();   illegal 
		
	}
}


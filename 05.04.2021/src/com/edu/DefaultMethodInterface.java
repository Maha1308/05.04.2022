package com.edu;

interface Calulations
{
	void add(int a, int b);
	default void mult(int a, int b)
	{
		int m=a*b;
		System.out.println(" Product="+m);
	}
	static void sub(int a, int b)
	{
		int ans=a-b;
		System.out.println("Different="+ans);
	}
}
interface MyUpdateCalulations
{
	default void mult(int a, int b)
	{
		int m=a*b;
		System.out.println("MyUpdateCalulaion ns product="+m);
	}
	void myfunct();
}

public   class DefaultMethodInterface implements Calulations, MyUpdateCalulations{
	public void add(int a, int b)
	{
		int s=a+b;
		System.out.println("sum="+s);
	}
	public void mult(int a, int b)
	{
		Calulations.super.mult(a,b);
		MyUpdateCalulations.super.mult(7,9);
		
	}

	public static void main(String[] args) {
		 DefaultMethodInterface ob = new  DefaultMethodInterface();
		 ob.add(5, 9);
		 ob.mult(8,7);
		 Calulations.sub(8, 5);
	}
	@Override
	public void myfunct() {
		// TODO Auto-generated method stub
		
	}

}

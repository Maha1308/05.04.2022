package com.edu;


	
	@FunctionalInterface
	interface Drawable{   //Functional interface a interface which has single abstract method
		void draw(); //Lambda expression can be applied to a functional interface
	}
	interface Addition
	
	{
		int add(int i, int j);
		
	}
	interface Sub
	{
		int sub(int i, int j);
	}

	public class LambdaClassMain {
		
		public static void main(String[] args) {
			
			//using Lambda expression ->
			Drawable dob=()->{
				//body of the function
				System.out.println("draw method body");
			};
			dob.draw();
		
			//Thread class Runnable interface
			
			Runnable rob=()->{
				System.out.println("Run method is called");
			};
			
			Thread tob=new Thread(rob);
			
			tob.start();
			
			Addition aob=(i,j)->(i+j);
			System.out.println(aob.add(2,7));
			 
			Sub s=(i,j)->(i-j);
			System.out.println(s.sub(20,10));
			
			}
		
		}



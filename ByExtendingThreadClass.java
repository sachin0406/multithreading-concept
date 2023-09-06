package com.multithreading.inJava;
// 2nd commit
class ChildThread extends Thread
{
	public void run()
	{
		System.out.println("I am being executed by child- thread and my name is " +Thread.currentThread().getName());
		   for( int i =0; i< 5; i++)
		   {
		      System.out.println("Child - Thread");
		   }
	}
}
public class ByExtendingThreadClass
{
   public static void main(String[] args)
   {
	   Thread t1 = new ChildThread();
	   t1.start();
	   System.out.println("I am being executed by main - thread and my name is " +Thread.currentThread().getName());
	   for( int i =0; i< 5; i++)
	   {
	      System.out.println("Main - Thread");
	   }	   
	}
}

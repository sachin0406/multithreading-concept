package com.multithreading.inJava;
class PriorityThread extends Thread
{
	public void run()
	{
		System.out.println("exceuted by child - thread and name: " +Thread.currentThread().getName());
		for ( int i =0; i< 5; i++)
		{
			System.out.println("child - thread");
		}
	}
}
public class ToSetPriorityOfThread
{
    public static void main(String[] args)
    {
	     Thread t1 = new PriorityThread();
	     t1.start();
	     t1.setPriority(10);
	     System.out.println("exceuted by main - thread and name: " +Thread.currentThread().getName());
	     for(int i =0; i<5 ; i++)
	     {
	    	 System.out.println("main - thread");
	     }	     
	}
}

package com.multithreading.inJava;
class ChildThreadTwo implements Runnable
{
	public void run()
	{
		
		System.out.println("Below lines are executed by child - thread and name of the thread is: " + Thread.currentThread().getName());
		for ( int i=0; i< 5 ; i ++)
		{
			System.out.println("child - thread");
		}
	}
}
public class ByImplementingRunnableInterface
{
   public static void main(String[] args)
   {
	   ChildThread runnableThread = new ChildThread();
	   Thread t1 = new Thread(runnableThread);
	   t1.start();
	   t1.setName("Sachin - Thread");
	   Thread.currentThread().setName("MAIN-THREAD");
	   System.out.println("Below lines are executed by main - thread and name of the thread is: " + Thread.currentThread().getName());
	   for (int i =0; i< 5; i++)
	   {
		   System.out.println("main - thread");
	   }	
   }
}


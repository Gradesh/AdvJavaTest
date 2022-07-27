import java.util.Scanner;

class table 
{
	
	synchronized void print(int n)
	{
		for (int i=0;i<=5;i++)
		{
			System.out.println(n*i);
			try 
			{
				Thread.sleep(400);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}

}

public class InterThread {

	public static void main(String[] args)throws InterruptedException
	{
		final table obj= new table();
		
		
		Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                   obj.print(15);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
		 Thread t2 = new Thread(new Runnable()
	        {
	            @Override
	            public void run()
	            {
	                try
	                {
	                    obj.print(56);
	                }
	                catch(Exception e)
	                {
	                    e.printStackTrace();
	                }
	            }
	        });
		 Thread t3= new Thread ()
			{
				public void run()
				{
					obj.print(3);
				}
			};
		t1.start();
		t2.start();
		t3.start();

	}

}

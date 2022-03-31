package Thread;


class Sample extends Thread
{
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Demo implements Runnable
{
	public void run()
	{
		for (int i=101;i<=110;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Main_class 
{
	public static void main(String[] args)
	{
		Sample s=new Sample();
		Thread t=new Thread(s);
		t.start();
		Demo d=new Demo();
		Thread r=new Thread(d);
		r.start();
		
	}
}

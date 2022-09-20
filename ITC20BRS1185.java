public class ITC20BRS1185
{
static class Q
{
	int n;
	boolean statusFlag = false;
	synchronized void put(int n)
	{
		try
		{
			while(statusFlag)
			{
				wait();
			}
		}
		catch(InterruptedException ignored){}
		this.n = n;
		System.out.println("Created Resource: " + n);
		statusFlag = true;
		notify();
	}
	synchronized void get()
	{
		try
		{
			while(!statusFlag)
			{
				wait();
			}
		}
		catch(InterruptedException ignored){}
		statusFlag = false;
		System.out.println("Consumed Resource: " + n);
		notify();
	}
}

static class Producer implements Runnable
{
	Q q;
	Producer(Q q)
	{
		this.q = q;
		new Thread(this, "Producer").start();
	}
	public void run()
	{
		int i = 0;
		while (i < 5)
		{
			q.put(i);
			i++;
		}
	}
}

static class Consumer implements Runnable
{
	Q q;
	Consumer(Q q)
	{
		this.q = q;
		new Thread(this, "Consumer").start();
	}
	public void run()
	{
		int i = 0;
		while(i<5)
		{
			q.get();
			i++;
		}
	}
}

	public static void main(String[] args)
	{
		Q q = new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
	}
}
import java.util.Random;


public class PrintingPeep implements Runnable {

	private static int idCounter = 0;
	private static Printer printer = new Printer();
	private int ID = 0;
	private String name;
	private int numJobs = 1;
	public PrintingPeep(String name)
	{
		this.name = name;
		ID = idCounter;
		idCounter++;
	}
	public String name() {
		return name;
	}

	public int ID() {
		return ID;
	}
	
	public void sendJob()
	{
		try{
			Thread.sleep(5000 + new Random().nextInt(15000));
		}
		catch(Exception e)
		{e.printStackTrace();}
		printer.print(this, numJobs);
		numJobs++;
	}
	
	public void run() {
		while(true)
			sendJob();
	}

}

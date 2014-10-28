
public class Printer {
	
	PrintingPeep peep;
	String toPrint;
	public Printer()
	{
		this.peep = peep;
		this.toPrint = toPrint;
	}
	public void print(PrintingPeep peep, int numJobs)
	{
		System.out.println("Print job from " + peep.name() + " - ID: " + peep.ID() + " - Job #" + numJobs);
	}
}

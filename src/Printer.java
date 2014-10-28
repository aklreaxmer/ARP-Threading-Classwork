
public class Printer {

	public void print(PrintingPeep peep, int numJobs)
	{
		System.out.println("Print job from " + peep.name() + " - ID: " + peep.ID() + " - Job #" + numJobs);
	}
}

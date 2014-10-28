
public class Maine{

	public Maine()
	{
		new Thread(new PrintingPeep("Paul")).start();
		new Thread(new PrintingPeep("Jimbo")).start();
		new Thread(new PrintingPeep("Frank")).start();
		new Thread(new PrintingPeep("Geoff")).start();
		new Thread(new PrintingPeep("Karen")).start();

	}
	public static void main(String[] args) {
		new Maine();
	}
	
}

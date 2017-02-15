public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket w = new Walkup();
		Ticket a = new Advance();
		Ticket s = new StudentAdvance();
		
		System.out.println(w + "\n");
		System.out.println(a + "\n");
		System.out.println(s + "\n");
		
	}
	
}
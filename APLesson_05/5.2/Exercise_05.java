import java.util.Scanner;

public class Exercise_05
{
	static Scanner keyboard;
	public static void main(String[]args)
	{
		keyboard = new Scanner(System.in);
		System.out.println("It is Thursday, November 20th, 2014. Press enter to continue.");
		keyboard.nextLine();
		System.out.println("Would you like to..." +
							"\n (1) Go to school" +
							"\n (2) Ditch");
		int Choice1 = keyboard.nextInt();
		if(Choice1 == 1)
		{
			System.out.println("You chose to go to school. Press enter to continue.");
			keyboard.nextLine();
			keyboard.nextLine();
			System.out.println("Would you like to..." +
								"\n (1) Go to class" +
								"\n (2) Change your mind and go to the Highlands");
			int Choice2 = keyboard.nextInt();
			if (Choice2 == 1)
			{
				System.out.println("You chose to go to class. Press enter to continue.");
				keyboard.nextLine();
				keyboard.nextLine();
				System.out.println("Suddenly, there is an announcement to start a lockdown. "
								+ "After texting your friends you find out that there is supposedly an armed intruder on campus. \nPress enter to continue."); 
				keyboard.nextLine();
				System.out.println("Would you like to...."
									+ "\n (1) Assume it's a joke and sneak out to leave"
									+ "\n (2) Do nothing");
			int Choice3 = keyboard.nextInt();				
				if (Choice3 == 1)
				{
					System.out.println("You chose to sneak out and leave. Press enter to continue.");
					keyboard.nextLine();
					keyboard.nextLine();
					System.out.println("While the teacher isn't looking, you leave the classroom and start running. "
										+ "Suddenly you bump into the armed intruder and get shot and bleed to death. \nThe end.");
				}
				else
				{
					System.out.println("You chose to do nothing. Press enter to continue.");
					keyboard.nextLine();
					keyboard.nextLine();
					System.out.println("You and your classmates sit in a dark classroom for four hours. "
										+ "Eventually you are released to go home by the police. The end.");
				}
			}
			else
			{
				System.out.println("You chose to spend the morning at the Highlands. Press enter to continue.");
				keyboard.nextLine();
				keyboard.nextLine();
				System.out.println("Would you like to..."
									+ "\n (1) go back to school to take a test so you don't have to make it up later."
									+ "\n (2) go home to take a nap."); 
				
				int Choice4 = keyboard.nextInt();
				if (Choice4 == 1)
				{
					System.out.println("You chose to go back to school. Press enter to continue.");
					keyboard.nextLine();
					keyboard.nextLine();
					System.out.println("You return to school and see it surrounded by a bunch of police cars.  You decide to turn back and go home.  Press enter to continue.");
					keyboard.nextLine();
					System.out.println("You go home and find out that your school was under lockdown. You feel very fortunate to not be at school. The end.");
				}
				else
				{
					System.out.println("You chose to go home and take a nap. Press enter to continue.");
					keyboard.nextLine();
					keyboard.nextLine();
					System.out.println("After you wake up, you find out that your school was under lockdown for four hours. You feel very fortunate to not be at school. The end.");
				}
			}
		}
		
		else
		{
			System.out.println("You chose to ditch.  Press enter to continue.");
			keyboard.nextLine();
			keyboard.nextLine();
			System.out.println("Where would you like to go?"
								+ "\n(1) Stay home"
								+ "\n(2) The beach");
			int Choice5 = keyboard.nextInt();
			if (Choice5 == 1)
			{
				System.out.println("You chose to stay home.  Press enter to continue.");
				keyboard.nextLine();
				keyboard.nextLine();
				System.out.println("What would you like to do?"
									+ "\n(1) College Apps"
									+ "\n(2) Play video games");
				int Choice6 = keyboard.nextInt();
				if (Choice6 == 1)
				{
					System.out.println("You chose to work on college apps. Press enter to continue");
					keyboard.nextLine();
					keyboard.nextLine();
					System.out.println("While editing your Common App essay you get a text from your friend that your school is under lockdown.  You feel very fortunate to not be at school. The end.");
				}
				else
				{
					System.out.println("You chose to play video games. Press enter to continue");
					keyboard.nextLine();
					keyboard.nextLine();
					System.out.println("Three hours later, you get killed by the boss for the 4th time in a row.  You rage quit and take a nap and wake up the next day. The end.");
				}
			}
			else
			{
				System.out.println("You chose to go to the beach. Press enter to continue");
					keyboard.nextLine();
					keyboard.nextLine();
					System.out.println("What do you want to do?"
									+ "\n(1) Go surfing"
									+ "\n(2) Sit on the sand and look at the ocean");
				int Choice7 = keyboard.nextInt();
				if (Choice7 == 1)
				{
					System.out.println("You chose to go surfing. Press enter to continue");
					keyboard.nextLine();
					System.out.println("Suddenly, a shark jumps out of the water and eats you whole. The end.");
				}
				else
				{
					System.out.println("You chose to sit on the sand and watch people. Press enter to continue");
					keyboard.nextLine();
					keyboard.nextLine();
					System.out.println("You sit on the sand and see a shark attack one of the surfers."
										+ "\nYou realize you left your phone in your car and run to get it."  
										+  "\nWhen you return, neither the shark nor the surfer can be found. The end." );
				}
			}
		}
	}
}

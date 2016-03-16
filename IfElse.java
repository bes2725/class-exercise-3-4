import javax.swing.JOptionPane;
/*
Bailey Spicer
bes2725@email.nvcc.edu
This program will ask for the number of people and players present, and divide them into groups and teams respectively, based on the numbers of people.
*/

public class IfElse
{
	public static void main(String[] args)
	{
		//declare variables
		String people, players;
		//so you're finding the number of people playing, and then dividing them 
		//groups, and then the number of players into teams
		int numPeople = 0, numPlayers = 0, groupSize = 0, teamSize = 0;

		//user input
		people = JOptionPane.showInputDialog("Please enter the number of people"
			+ " in your party.");
		numPeople = Integer.parseInt(people);
		players = JOptionPane.showInputDialog("How many players are there?");
		numPlayers = Integer.parseInt(players);

		//group size
		if (numPeople > 10)
		{
			groupSize = numPeople/2;
		}
		else if (3 <= numPeople && numPeople <= 10)
		{
			groupSize = numPeople/3;
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "You must have at least 3"
				+ " people in your party.");
		}
		
		//team size
		if (numPlayers <= 55 && 11 <= numPlayers)
		{
			teamSize = numPlayers/11;
		}
		else 
		{
			teamSize = 1;
		}

		JOptionPane.showMessageDialog(null, "Your group size will be " + groupSize 
			+ ".\nYour team size will be " + teamSize + ".\nHave a nice day!");

		
	}
}

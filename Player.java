import java.util.List;

/*Player.java
*Class that creates instances of players to use for the guessing game. Each player has instance variables, first name, last name and score. 
*Class also contains set and get methods for instance variables
* By: Rosa Li
* Start Date: 01/04/2021
* End Date: 11/06/2021
*/
public class Player 
{
	//declaring instance variables 
	private String strFName, strLName;
	private short shrScore;
	
	//constructor that allows instances of Player be created
	public Player(String fName, String lName)
	{
		this.strFName = fName;
		this.strLName = lName;
		this.shrScore = 0;
	}
	
	//default constructor that creates instances of Player
	public Player()
	{
		this.strFName = " ";
		this.strLName = " ";
		this.shrScore = 0;
		
	}
	
	//get method that returns first name of an instance of Player
	public String getFName()
	{
		return strFName;
	}
	
	//set method that assigns a value to instance variable that holds first name of a player
	public void setFName(String fName)
	{
		this.strFName = fName;
	}
	
	//get method that returns the last name of a player
	public String getLName()
	{
		return strLName;
	}
	
	//set method that assigns a value to instance variable that holds last name of a player
	public void setLName(String lName)
	{
		this.strLName = lName;
	}
	
	//get method that returns the score of a player
	public short getScore()
	{
		return shrScore;
	}
	
	//set method that assigns a value to instance variable that holds score of a player
	public void setScore(short score)
	{
		this.shrScore = score;
	}
	
	
	
	
}

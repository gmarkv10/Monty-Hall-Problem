//Gabe Markarian Monty Hall Problem Simulator 3/5/2014
public class MontyHall {

	private enum MH{
		GOAT, PRIZE
	};
	
	private MH[] doors = {MH.GOAT, MH.GOAT, MH.GOAT};
	
	public int currentChoice;
	

	public MontyHall(){
		initPrize();
	}
	
	public void initPrize(){
		doors[(int)(Math.random()*3)] = MH.PRIZE;
	}
	
	private int initChoice;
	public int chooseOne(){
		initChoice = (int)(Math.random()*3);
		currentChoice = initChoice;
		return initChoice;
	}
	
	private int revealedGoat;
	public int revealGoat(){
		for(int x = 0; x < 3; x++){
			if(doors[x] != MH.PRIZE && x != initChoice){
				revealedGoat = x;
				return x;
			}	
		}
		System.err.println("---GOAT NOT FOUND---");
		return -1;
	}
	
	public int switchDoor(){
		for(int x = 0; x <3; x++){
			if(x != revealedGoat && x != initChoice){
				currentChoice = x;
				return x;
			}
		}
		System.err.println("---SWITCH DOOR NOT FOUND---");
		return -1;
	}
	
	public int getResult(){
		if(doors[currentChoice] == MH.PRIZE){
			//System.out.println("YOU WON THE PRIZE!");
			return 1;
		}
		else{
			//System.out.println("PRIZE WAS BEHIND A DIFFERENT DOOR");
			return 0;
		}
		
	}
}

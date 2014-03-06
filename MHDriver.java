//Gabe Markarian Monty Hall Problem Simulator 3/5/2014
public class MHDriver {
	public static final int NUM_TESTS = 10000;
	public static void main(String[] args){
		
		int winsWSwitch = 0;
		int winsNoSwitch = 0;
		for(int x = 0; x < NUM_TESTS; x++){
			MontyHall m =  new MontyHall();
			m.chooseOne();
			m.revealGoat();
			m.switchDoor();
			winsWSwitch += m.getResult();
		}
		
		for(int y = 0; y < NUM_TESTS; y++){
			MontyHall m =  new MontyHall();
			m.chooseOne();
			m.revealGoat();
			//m.switchDoor();  NO door switch
			winsNoSwitch += m.getResult();
			
		}
		
		System.out.println("Win % without switching: " + (double)winsNoSwitch/NUM_TESTS);
		System.out.println("Win % with switching   : " + (double)winsWSwitch/NUM_TESTS);
	}
}

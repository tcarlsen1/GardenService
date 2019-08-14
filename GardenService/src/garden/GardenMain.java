package garden;

import java.util.InputMismatchException;
import java.util.Scanner;
import garden.Garden;

public class GardenMain {
	
	

	public static void main(String[] args) {
		
		double areaNeededForGarden;
		double areaOfGarden;
		double differenceBetweenAreas;
		
		 Garden G1 = new Garden();
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Use this program to figure out if your "
				+ "plot will be large enough for the amount of vegtables "
				+ " you want to grow by answering the questions below \n");
		
		try {
			System.out.println("How many different types of vegtables are you growing");
			int vegtableCount = scanner.nextInt();
			Vegtables vegArry[] = new Vegtables[vegtableCount];
			
			System.out.println("How many feet wide is your garden");
			G1.setGardenWidth(scanner.nextDouble());
			System.out.println("How many feet long is your garden");
			G1.setGardenHeight(scanner.nextDouble());
			
			for(int j = 1, i = 0; i < vegArry.length; j++, i++) {
				System.out.println("what is the name of vegtable number " + j);
				String Name = scanner.next();
				System.out.println("What is the space between vegtables in inches?");
				double SBP = scanner.nextDouble();
				System.out.println("What is the space between rows for this vegtable in inches?");
				double SBR = scanner.nextDouble();
				System.out.println("How many of these vegtables will you be planting?");
				int AOP = scanner.nextInt();
				
				vegArry[i] = new Vegtables(SBR, SBP, AOP, Name);
				
			}
			areaOfGarden = G1.getGardenArea();
			areaNeededForGarden = G1.gardenAreaNeeded(vegArry);
			
			differenceBetweenAreas = areaOfGarden - areaNeededForGarden;
			
			if(differenceBetweenAreas < 0) {
				System.out.println("The garden you are planning on planting is too large by " + Math.abs(differenceBetweenAreas) + " Square feet");
			}else {
				System.out.println("The garden you are planning on planting is small enough to fit your plot by " + differenceBetweenAreas + " Square feet");
				
			}
			
		}
		catch(InputMismatchException exc) {
			System.out.println("The data type you entered for the field above was incorrect, please try again");
			
			
		}	
		

	}

}

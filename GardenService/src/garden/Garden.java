package garden;

public class Garden {
	private double gardenWidth;
	private double gardenHeight;
	
	void setGardenWidth(double GW) {gardenWidth = GW;}
	void setGardenHeight(double GH) {gardenHeight = GH;}
	
	double getGardenArea() {
		return gardenWidth * gardenHeight;
	}
	
	double gardenAreaNeeded(Vegtables vegArry[]) {
		double sum = 0;
		for(Vegtables v: vegArry) {
			sum += v.areaNeeded();
		}
		return sum;
			
		}
	

}

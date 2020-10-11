
public class House {
	
	String houseColor;
	House newHouse = new House("Je");

	public House(String houseColor) {
		this.houseColor = houseColor;
	}

	public String getHouseColor() {
		return houseColor;
	}

	public void setHouseColor(String houseColor) {
		this.houseColor = houseColor;
	}
	
	public static void staticMethod() {
		//setHouseColor("XYZ");
		
	}
	

}

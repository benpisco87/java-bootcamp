
public abstract class Construction {
	
	private Wall wall;
	//the roof can be of concrete, wood, tile
	private String Roof;
	private int NumOfDoors;
	private int NumOfFloors;
	
	
	public Construction(int NumOfDoors, int NumOfFloors, String TypeOfWalls, int NumOfWalls,String Roof)
	{
		this.setNumOfDoors(NumOfDoors);
		this.setNumOfFloors(NumOfFloors);
		this.wall= new Wall(NumOfWalls,TypeOfWalls);
		this.setRoof(Roof);
		
	}
	
	public String Description()
	{
		return "This is a construction";
	}

	public Wall getWall() {
		return wall;
	}

	public void setWall(Wall wall) {
		this.wall = wall;
	}

	public String getRoof() {
		return Roof;
	}

	public void setRoof(String roof) {
		Roof = roof;
	}

	public int getNumOfFloors() {
		return NumOfFloors;
	}

	public void setNumOfFloors(int numOfFloors) {
		NumOfFloors = numOfFloors;
	}

	public int getNumOfDoors() {
		return NumOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		NumOfDoors = numOfDoors;
	}

}

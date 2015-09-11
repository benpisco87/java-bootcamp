
public class Hospital extends Construction{
	
	
	public Hospital(int NumOfDoors, int NumOfFloors, String TypeOfWalls, int NumOfWalls, String Roof) {
		super(NumOfDoors, NumOfFloors, TypeOfWalls, NumOfWalls, Roof);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Description()
	{
		return "This is a Hospital";
	}
}
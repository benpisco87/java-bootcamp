package Topic0;

public class House extends Construction{



	public House(int NumOfDoors, int NumOfFloors, String TypeOfWalls, int NumOfWalls, String Roof) {
		super(NumOfDoors, NumOfFloors, TypeOfWalls, NumOfWalls, Roof);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Description()
	{
		return "This is a House";
	}
	
}

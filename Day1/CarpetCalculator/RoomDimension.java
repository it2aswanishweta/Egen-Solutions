package day1;

public class RoomDimension {

	private float length;
	private float width;

	public RoomDimension(float length, float width) {

		this.length = length;
		this.width = width;
	}

	public float areaCalculate() {

		return length * width;
	}
}

package day1;

public class RoomCarpet extends RoomDimension {

	private float costPerSqFoot;

	public RoomCarpet(float length, float width, float costPerSqFoot) {

		super(length, width);
		this.costPerSqFoot = costPerSqFoot;
	}

	public float totalCostCarpet() {

		return costPerSqFoot * this.areaCalculate();
	}

}

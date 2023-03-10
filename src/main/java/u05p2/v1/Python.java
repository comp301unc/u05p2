package u05p2.v1;

public class Python {

	private Point3D location;
	private int id;
	
	public Python(int id, Point3D point3d) {
		this.id = id;
		this.location = point3d;
	}
	
	public int getID() {
		return id;
	}

	public Point3D getLocation() {
		return location;
	}

	private void slither(Point3D destination) {
		System.out.println(getID() + " is slithering to " + destination.toString());				
	}
		
	public void move(Point3D destination) {
		if (destination.getZ() > 0) {
			throw new RuntimeException("Pythons can't fly");
		}
		slither(destination);
		location = destination;
	}

	public void speak() {
		System.out.println(getID() + " says 'Hissss'");				
	}
}

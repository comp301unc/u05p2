package u05p2.v4;

public class Python extends AnimalImpl implements Animal {

	public Python(int id, Point3D point3d) {
		super(id, point3d);
	}
	
	private void slither(Point3D destination) {
		System.out.println(getID() + " is slithering to " + destination.toString());				
	}
		
	@Override
	public void move(Point3D destination) {
		if (destination.getZ() > 0) {
			throw new RuntimeException("Pythons can't fly");
		}
		slither(destination);
		super.move(destination);
	}

	public void speak() {
		System.out.println(getID() + " says 'Hissss'");				
	}
}

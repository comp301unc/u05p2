package u05p2.v4;

public interface Animal {
	
	int getID();
	Point3D getLocation();
	void move(Point3D destination);
	void speak();
}

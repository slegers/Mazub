package jumpingalien.model;

public class Vector {
	
	private int xCoordinate;
	private int yCoordinate;
	private double[]  size = new double[2];
	private double velocity;
	private double maxVelocity;


	public Vector(int pixeLeftX, int pixelBottomY) {
		setX(pixeLeftX);
		setY(pixelBottomY);
	}

	private void setX(int pixeLeftX) {
		xCoordinate = pixeLeftX;
	}

	private void setY(int pixelBottomY) {
		yCoordinate = pixelBottomY;
	}

	public int getX() {
		return xCoordinate;
	}

	public int getY() {
		return yCoordinate;
	}

	public double[] getSize() {
		return size;
	}

	public void setSize(double[] size) {
		this.size = size;
	}
	public int getMaxXcoordinate(){
		return 1024;
	}
	public int getMaxYcoordinate(){
		return 768;
	}
	public boolean canHaveAsPosition(int xCoordinate,int yCoordinate){
		if(xCoordinate > getMaxXcoordinate() || yCoordinate > getMaxYcoordinate()){
			return false;
		}
		return true;
	}

	public double getVelocity() {
		return velocity;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}

	public double getMaxVelocity() {
		return 3;
	}
}

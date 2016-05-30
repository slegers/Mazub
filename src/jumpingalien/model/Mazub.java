package jumpingalien.model;

import jumpingalien.util.Sprite;

public class Mazub {
	
	private Vector vector;
	private int width;
	private int height;
	private Sprite[] sprites;

	public Mazub(int pixelLeftX, int pixelBottomY, Sprite[] sprites) {
		setVector(pixelLeftX, pixelBottomY);
	}
	
	public Vector getVector(){
		return vector;
	}
	public void setVector(int pixelLeftX,int pixelBottomY){
		this.vector = new Vector(pixelLeftX,pixelBottomY);
	}

	public int getwidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Sprite[] getSprites() {
		return sprites;
	}

	public void setSprites(Sprite[] sprites) {
		this.sprites = sprites;
	}

	public void startMoveLeft() {
		// TODO Auto-generated method stub	
	}
	public void endMoveLeft() {
		getVector().setVelocity(0);	
	}
	public void startMoveRight() {
		// TODO Auto-generated method stub	
	}
	public void endMoveRight() {
		getVector().setVelocity(0);	
	}

}

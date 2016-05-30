package jumpingalien.part1.facade;

import jumpingalien.model.Mazub;
import jumpingalien.util.Sprite;

public class Facade implements IFacade{

	@Override
	public Mazub createMazub(int pixelLeftX, int pixelBottomY, Sprite[] sprites) {
		return new Mazub(pixelLeftX,pixelBottomY,sprites);
	}

	@Override
	public int[] getLocation(Mazub alien) {
		int[] location = new int[2];
		location[0] = alien.getVector().getX();
		location[1] = alien.getVector().getY();
		return null;
	}

	@Override
	public double[] getVelocity(Mazub alien) {
		return null;
	}

	@Override
	public double[] getAcceleration(Mazub alien) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getSize(Mazub alien) {
		int[] size = new int[2];
		size[0] = alien.getwidth();
		size[1] = alien.getHeight();
		return size;
	}

	@Override
	public Sprite getCurrentSprite(Mazub alien) {
			return alien.getSprites()[0];
	}

	@Override
	public void startJump(Mazub alien) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endJump(Mazub alien) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startMoveLeft(Mazub alien) {
		alien.startMoveLeft();
	}

	@Override
	public void endMoveLeft(Mazub alien) {
		alien.endMoveLeft();
	}

	@Override
	public void startMoveRight(Mazub alien) {
		alien.startMoveRight();
	}

	@Override
	public void endMoveRight(Mazub alien) {
		alien.endMoveRight();
	}

	@Override
	public void startDuck(Mazub alien) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endDuck(Mazub alien) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void advanceTime(Mazub alien, double dt) {
		// TODO Auto-generated method stub
		
	}

}

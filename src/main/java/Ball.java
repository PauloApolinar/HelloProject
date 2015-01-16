import java.awt.Color;


public class Ball {

	private int xPos;
	private int yPos;
	
	private static final int SIZE = 10;
	private static final Color color = Color.BLUE;
	
	public Ball(int x, int y) {
		this.xPos = x;
		this.yPos = y;
		
	}
	
	public int getX(){
		return this.xPos;
	}
	
	public int getY(){
		return this.yPos;
	}
	
	public void setX(int x){
		this.xPos = x;
	}
	
	public void setY(int y){
		this.yPos = y;
	}

}

import java.awt.Color;
import java.awt.Graphics;


public class Token {
private int x, y,score;
private Snakee snake;
public Token(Snakee s)
{
	
	x=(int)(Math.random()* 395);
	y=(int)(Math.random()* 395);
	snake= s;
	}
public void changePosition(){
	x=(int)(Math.random()* 395);
	y=(int)(Math.random()* 395);	
}
public int getScore(){
	return score;
	
}
public void draw(Graphics g){
	g.setColor(Color.green);
	g.fillRect(x, y, 10,10);
	}
public boolean snakeCollision(){
	int snakeX=snake.getX() +4;
	int snakeY=snake.getY() +4;
	if(snakeX >=x-2 && snakeY <=(y+5)){
		changePosition();
		score++;
		snake.setElongate(true);
		return true;
		
	}
	
	return false;
	
}
}

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


public class Snakee {
List<point> snakePoints;
int xDir,yDir;
boolean isMoving,elongate;
final int STARTSIZE=20, STARTX= 150, STARTY=150;


public Snakee(){
	snakePoints=new ArrayList<point>();
	xDir=0;
	yDir=0;
	isMoving=false;
	elongate=false;
	snakePoints.add(new point(STARTX,STARTY));
	for(int i=1;i<STARTSIZE;i++){
		snakePoints.add(new point(STARTX-i*4, STARTY));
	}
	
	}
public void draw(Graphics g){
	g.setColor(Color.white);
	for(point p :snakePoints){
		g.fillRect(p.getX(), p.getY(), 4, 4);
		
	}
}
public void move(){ 
	if(isMoving){
		point temp=snakePoints.get(0);
		point last=snakePoints.get(snakePoints.size()-1);
		point newStart=new point(temp.getX()+xDir*4, temp.getY()+yDir*4);
		for(int i=snakePoints.size()-1;i>=1;i--){
		snakePoints.set(i, snakePoints.get(i-1));
		
		
	}
	
	snakePoints.set(0, newStart);
	}
}
public boolean snakeCollision(){
	int x=this.getX();
	int y=this.getY();
	for(int i=1;i<snakePoints.size();i++){
		if(snakePoints.get(i).getX()==x && snakePoints.get(i).getY()==y)
			return true;
	}
	return false;
	}
}
public boolean isMoving(){
	return isMoving;
	}
public void setIsMoving(boolean b){
	isMoving=b;
}
public int getXDir(){
return xDir;
}
public int getYDir(){
return yDir;
}
public void setXDir(int x){
xDir=x;
}
public void setYDir(int y){
	yDir=y;
}
public int getX(){
return snakePoints.get(0).getX();

}
public int getY(){
return snakePoints.get(0).getY();	
}
}


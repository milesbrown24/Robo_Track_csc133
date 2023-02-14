package com.mycompany.hi;
import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.geom.Point;
import java.util.Random;

public class GameObject{
    private int size;
    private int color;
    private Point location;
    private Random rand;
    
    public GameObject() {
	rand = new Random();
	// Generate random X and Y coordinates within the game area, and round them to one decimal place
	double x = (Math.round((1025.0* rand.nextDouble() * 10.0)) / 10.0);
	double y = (Math.round((769.0* rand.nextDouble() * 10.0)) / 10.0);
	
	 int intX = (int) x;
	 int intY = (int) y;
	//If something "Spawns" outside of border this puts it on the border. 
	if( intX > 1024)
	    intX = 1024;
	if(intY > 768)
	    intY = 768;
	 
	location = new Point(intX, intY);
    }
    
    public int GetSize() {
	return size;
    }
    
    public int GetColor() {
	return color;
    }
    
    public int GetLocationX() {
	return location.getX();
    }
    public int GetLocationY() {
   	return location.getY();
       }
    
    public void SetSize(int Size) {
	this.size = Size;
    }
    
    public void SetLocation(int x, int y) {
	this.location = new Point(x,y);
    }
    
    public void SetColor(int color) {
	this.color= color;
    }
    
    public void print_Location() {
	    System.out.println("(" + location.getX() + ", " + location.getY() + ")");
	}
}
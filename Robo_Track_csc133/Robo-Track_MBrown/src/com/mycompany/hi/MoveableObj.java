package com.mycompany.hi;

import java.util.Random;

public abstract class MoveableObj extends GameObject{
    private int heading;
    private int speed;
    
    public MoveableObj() {
	speed = 1;
	//heading = Random.nextInt(365);
	
    }
    public void Move() {
	
    }
    
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }
}
    
   
package com.mycompany.hi;

public class Robot extends MoveableObj{
    

    private int steeringDirection;
    private int maximumSpeed;
    private int energyLevel;
    private int energyConsumptionRate;
    private int damageLevel;
    private int lastBaseReached;

    public Robot() {
	this.SetColor(5);
	//this.SetLocation(44);
    }

        // getters and setters for each property
        public int getSteeringDirection() {
            return steeringDirection;
        }
    
        public void setSteeringDirection(int steeringDirection) {
            this.steeringDirection = steeringDirection;
        }
    
        public int getMaximumSpeed() {
            return maximumSpeed;
        }
    
        public void setMaximumSpeed(int maximumSpeed) {
            this.maximumSpeed = maximumSpeed;
        }
    
        public int getEnergyLevel() {
            return energyLevel;
        }
    
        public void setEnergyLevel(int energyLevel) {
            this.energyLevel = energyLevel;
        }
    
        public int getEnergyConsumptionRate() {
            return energyConsumptionRate;
        }
    
        public void setEnergyConsumptionRate(int energyConsumptionRate) {
            this.energyConsumptionRate = energyConsumptionRate;
        }
    
        public int getDamageLevel() {
            return damageLevel;
        }
    
        public void setDamageLevel(int damageLevel) {
            this.damageLevel = damageLevel;
        }
    
        public int getLastBaseReached() {
            return lastBaseReached;
        }
    
        public void setLastBaseReached(int lastBaseReached) {
            this.lastBaseReached = lastBaseReached;
        }
}


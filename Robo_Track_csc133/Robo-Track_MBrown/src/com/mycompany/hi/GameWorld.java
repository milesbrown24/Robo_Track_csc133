package com.mycompany.hi;


public class GameWorld {
    private GameObject go;
    private int[] origin = {0, 0};
    private int[] gameDim = {1024,768};
    
    
    public void init(){ 
	//code here to create the 
	//initial game objects/setup 
	// Create the 4 bases
	Base Base1 = new Base();
	Base1.SetSequenceNumber(1);

	Base Base2 = new Base();
	Base2.SetSequenceNumber(2);

	Base Base3 = new Base();
	Base3.SetSequenceNumber(3);

	Base Base4 = new Base();
	Base4.SetSequenceNumber(4);
	
	Base1.print_Location();
	Base2.print_Location();
	Base3.print_Location();
	Base4.print_Location();
    } 
    // additional methods here to
    // manipulate world objects and 
    // related game state data 
    public void exit() {
	System.exit(0);
    }
} 
 
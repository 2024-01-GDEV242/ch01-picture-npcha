/**
 * This picture represents a person climbing a stair in the middle of 
 * their walk with them wearing a hat to protect themselves from the sunlight.
 *
 * @author  Pipatporn Chaluthong
 * @version 2024.01.22
 */
public class Picture
{
    private Square stair1;
    private Square stair2;
    private Square stair3;
    private Square stair4;
    private Square sky;
    private Square grass;
    private Triangle hat;
    private Circle sun;
    private Person person;
    private Circle hatDecoration;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        stair1 = new Square();
        stair2 = new Square();
        stair3 = new Square();
        stair4 = new Square();
        sky = new Square();
        grass = new Square();
        hat = new Triangle();  
        sun = new Circle();
        person = new Person();
        hatDecoration = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("blue");
            sky.moveHorizontal(-350);
            sky.moveVertical(-250);
            sky.changeSize(550);
            sky.makeVisible();
            
            grass.changeColor("green");
            grass.moveHorizontal(-320);
            grass.moveVertical(150);
            grass.changeSize(550);
            grass.makeVisible();
            
            sun.changeColor("orange");
            sun.moveHorizontal(-200);
            sun.moveVertical(-80);
            sun.changeSize(68);
            sun.makeVisible();
            
            stair1.changeColor("grey");
            stair1.moveHorizontal(-20);
            stair1.moveVertical(100);
            stair1.changeSize(50);
            stair1.makeVisible();
            
            stair2.changeColor("grey");
            stair2.moveHorizontal(20);
            stair2.moveVertical(60);
            stair2.changeSize(50);
            stair2.makeVisible();
            
            stair3.changeColor("grey");
            stair3.moveHorizontal(60);
            stair3.moveVertical(100);
            stair3.changeSize(50);
            stair3.makeVisible();
            
            stair4.changeColor("grey");
            stair4.moveHorizontal(20);
            stair4.moveVertical(100);
            stair4.changeSize(50);
            stair4.makeVisible();
            
            person.changeColor("grey");
            person.moveHorizontal(70);
            person.moveVertical(-50);
            person.changeSize(60,30);
            person.makeVisible();
            
            hat.changeColor("brown");
            hat.moveHorizontal(140);
            hat.moveVertical(-35);
            hat.changeSize(20,20);
            hat.makeVisible();
            
            hatDecoration.changeColor("yellow");
            hatDecoration.moveHorizontal(115);
            hatDecoration.moveVertical(10);
            hatDecoration.changeSize(10);
            hatDecoration.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("black");
        grass.changeColor("white");
        sun.changeColor("white");
        person.changeColor("white");
        hat.changeColor("white");
        hatDecoration.changeColor("white");
        stair1.changeColor("white");
        stair2.changeColor("white");
        stair3.changeColor("white");
        stair4.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("blue");
        grass.changeColor("green");
        sun.changeColor("orange");
        person.changeColor("grey");
        hat.changeColor("brown");
        hatDecoration.changeColor("yellow");
        stair1.changeColor("grey");
        stair2.changeColor("grey");
        stair3.changeColor("grey");
        stair4.changeColor("grey");
    }
    }
    


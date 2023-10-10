/**
 * Bounce. 
 * 
 * When the shape hits the edge of the window, it reverses its direction. 
 */
 
int rad = 60;        // Width of the shape
float xpos, ypos;    // Starting position of shape    

float xspeed = 2.8;  // Speed of the shape
float yspeed = 2.2;  // Speed of the shape

int xdirection = 1;  // Left or Right
int ydirection = 1;  // Top to Bottom

Shape s1;
Shape s2;


void setup() 
{
  size(640, 360);
  noStroke();
  frameRate(30);
  ellipseMode(RADIUS);
  // Set the starting position of the shape
  s1 = new Shape(width/2, height/2);
  s2 = new Shape(width/3, height/3);
}

void draw() 
{
  background(102);
  
    // Update the position of the shape
    s1.update();
    s2.update();

    // Draw the shape
    s1.display();
    s2.display();
    
}


public class Shape {
  private int rad = 60;
  private float xpos, ypos;
  private float xspeed = 2.8;
  private float yspeed = 2.2;
  private int xdirection = 1;
  private int ydirection = 1;

  public Shape(int x, int y) {
    xpos = x;
    ypos = y;
  }

  public void update() {
    xpos = xpos + ( xspeed * xdirection );
    ypos = ypos + ( yspeed * ydirection );
    if (xpos > width-rad || xpos < rad) {
      xdirection *= -1;
    }
    if (ypos > height-rad || ypos < rad) {
      ydirection *= -1;
    }
  }

  public void display() {
    ellipse(xpos, ypos, rad, rad);
  }
}
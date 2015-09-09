//// Wild circles #0.

// Setup:  screen size. //
void setup() {
  size(500, 500);   
  background(#26512D);
  // Try changing the width & height.
}

// Next frame:  circle at (x,y). //
void draw() {
  rectMode(CENTER);
  fill(#8A8D80);
  rect( 250, 250, 100, 65);
  rectMode(CENTER);
  rect( 285, 300, 30, 35);
  rectMode(CENTER);
  rect( 215, 300, 30, 35);
  rectMode(CENTER);
  fill(#BA151A);
  rect( 280, 215, 40, 5);
  rectMode(CENTER);
  fill(#8A8D80);
  rect( 293, 190, 65, 45);
  triangle(260,167,285,142,285,167);
  triangle(200,245,200,217,170,217); 
  triangle(170, 195, 200,217,170,217); 
  line(260,215,150,135);
  ellipseMode(CENTER);
  fill(#000000);
  ellipse(280,180, 5,17);

  
  // Try changing the (x,y) and size.
}

import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  PImage imgFootball;
  PImage imgField;
  PImage imgNFL;

  // logo x and y coordinates
  float fltNFLX = 525;
  float fltNFLY = 225;

  // speed variables
  float fltXSpeed = 10;
  float fltYSpeed = 10;
  float fltNFLSpeed = 1;
  // football x and y coordinates
  float fltFootballX = 560;
  float fltFootballY = 155;
  float fltAngle = 0.05f;

  public void settings() {
    size(1200, 579);
  }

  public void setup() {
    // load field
    imgField = loadImage("field.png");
    // load NFL Logo
    imgNFL = loadImage("nfl.png");
    // resize NFL Logo
    imgNFL.resize(150, 150);
    // load football
    imgFootball = loadImageIO("football.png");
    // // resize football
    imgFootball.resize(75, 75);

  }

  public void draw() {
    background(imgField);
    // draw logo and move
    image(imgNFL, fltNFLX, fltNFLY);
    
    fltNFLX += fltNFLSpeed;
    
    if (fltNFLX < 520 || fltNFLX > 530) {
      fltNFLSpeed *= -1;
      }

    // draw football and move
    image(imgFootball, fltFootballX, fltFootballY);

    fltAngle -= 0.0095f;
    fltFootballX -= cos(fltAngle);
    fltFootballY -= sin(fltAngle);
    fltXSpeed += fltFootballX;
    fltYSpeed += fltFootballY;

  }
}
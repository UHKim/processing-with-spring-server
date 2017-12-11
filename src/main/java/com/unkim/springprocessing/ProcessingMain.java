package com.unkim.springprocessing;
import processing.core.*;

public class ProcessingMain extends PApplet{
    public void settings(){
        size(300,300);
    }

    public void setup(){
        fill(120,50,240);
    }

    public void draw(){
        ellipse(width/2,height/2,second(),second());
    }

}

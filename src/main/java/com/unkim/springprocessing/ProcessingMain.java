package com.unkim.springprocessing;
import processing.core.*;

public class ProcessingMain extends PApplet implements CommendReceiver {
    public int radius = 100;

    public void settings() {
        size(600, 400);
    }

    public void setup() {
        background(0, 0, 0);
    }

    public void draw() {
        ellipse(width / 2, height / 2, radius, radius);
        fill(50, 50, 50);
    }

    public void executeCommend(){

    }

}

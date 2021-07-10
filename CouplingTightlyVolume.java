package com.gadrawingz4;

/**********************************
 * There is inter-dependency b2n both classes,
 * Any change in Box class, then they reflects
 * in the result of class Volume.
 * ********************************/

public class CouplingTightlyVolume {
    public static void main(String[] args) {

        // through constructor
        Box box1 = new Box(6, 3, 4);
        Box box2 = new Box(8, 4, 2);

        System.out.println("Volume is : "+box1.volume);
        System.out.println("Volume is : "+box2.volume);
    }
}

class Box {
    public int volume;
    Box(int length, int width, int height) {
        this.volume = length * width * height;
    }
}
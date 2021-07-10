/***********************
 * There is no dependency b2n both classes, 
 * If we change anything in the BigBox,
 * Then we don't have 2 change anything in Volume class.
 * *********************/

package com.gadrawingz4;

public class CouplingLooselyVolume {
    public static void main(String[] args) {
        BigBox box = new BigBox(4, 4, 4);
        System.out.println("Volume is: "+box.getVolume());
    }
}

class BigBox {
    private int volume;

    BigBox(int length, int width, int height) {
        this.volume = length * width * height;
    }

    public int getVolume() {
        return volume;
    }
}

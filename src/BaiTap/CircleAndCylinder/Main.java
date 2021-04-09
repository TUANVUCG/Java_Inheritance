package BaiTap.CircleAndCylinder;

import BaiTap.CircleAndCylinder.Cylinder;

public class Main  {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3,"red",10);
        System.out.println("Volume is: "+ cylinder.getVolume());
    }
}

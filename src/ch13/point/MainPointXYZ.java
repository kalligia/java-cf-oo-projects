package ch13.point;

import ch13.point.model.PointXYZ;

public class MainPointXYZ {
    public static void main(String[] args) {

        PointXYZ p = new PointXYZ(3,3,2);

        System.out.println(p.convertToString());
        System.out.printf("Distance XY is: %.2f\n", p.getXYDistance());
        System.out.printf("Distance XZ is: %.2f\n", p.getXZDistance());
        System.out.printf("Distance YZ is: %.2f\n", p.getYZDistance());
        System.out.printf("Distance XYZ is: %.2f", p.getXYZDistance());
    }
}

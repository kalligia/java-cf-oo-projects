package ch13.point.model;

public class PointXYZ {

    private int x;
    private int y;
    private int z;

    public PointXYZ() {

    }

    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String convertToString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public double getXYDistance() {
        double distance = 0;

        try {
            distance = Math.sqrt(Math.pow((x), 2) +  Math.pow((y), 2));
            return distance;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public double getYZDistance() {
        double distance = 0;

        try {
            distance =  Math.sqrt(Math.pow((y), 2) +  Math.pow((z), 2));
            return distance;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public double getXZDistance() {
        double distance = 0;

        try {
            distance =  Math.sqrt(Math.pow((x), 2) +  Math.pow((z), 2));
            return distance;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public double getXYZDistance() {
        double distance = 0;

        try {
            distance =  Math.sqrt(Math.pow((x), 2) +  Math.pow((y), 2) + Math.pow((z), 2));
            return distance;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

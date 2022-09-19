package ss6.bai_tap.point2D_point3D;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        this.z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float z) {
        getXY();
        this.z = z;
    }

    public float[] getXYZ() {
        float arr[] = {getX(), getY(), z};
        return arr;
    }

    @Override
    public String toString() {
        return super.toString() +
                "z=" + z +
                '}';
    }
}


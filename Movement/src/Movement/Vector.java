package Movement;

public class Vector {
    private double xComponent, yComponent;

    public Vector() { }

    public Vector(double xComponent, double yComponent) {
        this.xComponent = xComponent;
        this.yComponent = yComponent;
    }

    double getXcomponent() {
        return xComponent;
    }

    double getYcomponent() {
        return yComponent;
    }

    public void addVector(Vector v) {
        this.xComponent += v.getXcomponent();
        this.yComponent += v.getYcomponent();
    }

    public void reverseY() {
        this.yComponent *= -1;
    }
}

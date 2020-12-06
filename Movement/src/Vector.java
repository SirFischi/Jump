public class Vector {
    private double xComponent, yComponent;

    public Vector() { }

    public Vector(double xComponent, double yComponent) {
        this.xComponent = xComponent;
        this.yComponent = yComponent;
    }

    double getxComponent() {
        return xComponent;
    }

    double getyComponent() {
        return yComponent;
    }
}

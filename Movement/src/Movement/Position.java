package Movement;

public class Position {
    private double x,y;

    public Position() { }

    public Position(double xCord, double yCord) {
        this.x = xCord;
        this.y = yCord;
    }

    public double getX() { return x; }

    public double getY() { return y; }

    public void move(Vector vector) {
        this.x += vector.getXcomponent();
        this.y += vector.getYcomponent();
    }

    public void setX(double x) {
        this.x = x;
    }
}

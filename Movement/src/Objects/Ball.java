package Objects;

import Movement.Position;
import Movement.Vector;

public class Ball implements movable{
    Position position;
    double radius;
    Vector momentum;

    public Ball(Position startPosition, double radius) {
        this.position = startPosition;
        this.radius = radius;
        this.momentum = new Vector(0, 0);
    }

    public void addMomentum(Vector momentum) {
        this.momentum.addVector(momentum);
    }

    public void applyMomentum() {
        this.position.move(momentum);
    }

    public Position getPosition() {
        return position;
    }

    public double getRadius() {
        return radius;
    }

    public void reverseVertical() {
        momentum.reverseY();
    }

    public void setX(double x) {
        this.position.setX(x);
    }

    public void moveHorizontal(double distance) {
        this.setX(this.getPosition().getX() + distance);
    }

    public void setMomentum(Vector momentum) {
        this.momentum = momentum;
    }
}

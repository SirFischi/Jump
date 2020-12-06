package Space;

import Movement.Vector;
import Objects.Ball;
import Objects.movable;

import java.util.ArrayList;

public class verticalTube {
    private Ball ball;
    private Vector gravity = new Vector();
    private int width;

    public verticalTube(int width) {
        this.width = width;
    }

    public void setGravity(Vector gravity) {
        this.gravity = gravity;
    }

    /**
     *
     * @param downwardForce takes positive Number and applies it as downwardForce going into the negative
     */
    public void setGravity(double downwardForce) {
        setGravity(new Vector(0, downwardForce * (-1)));
    }

    public void addBall(Ball b) {
        this.ball = b;
    }

    public void applyGravity() {
        ball.addMomentum(gravity);
    }

    public void applyMomentum() {
        ball.applyMomentum();
    }

    public void checkSide() {
        if (ball.getPosition().getX() <= 0) {
            ball.setX(width);
        } else if (ball.getPosition().getX() >= width) {
            ball.setX(0);
        }
    }

    public Ball getBall() {
        return ball;
    }
}

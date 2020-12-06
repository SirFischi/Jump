package Space;

import Movement.Position;
import Objects.Ball;
import edu.princeton.cs.algs4.StdDraw;

public class test {
    public static void main(String[] args) {
        Space2D space1 = new Space2D();
        Ball ball1 = new Ball(new Position(500, 500), 10);
        space1.addMovable(ball1);
        space1.setGravity(0.01);

        StdDraw.setCanvasSize(1000, 1000);
        StdDraw.setXscale(0, 1000);
        StdDraw.setYscale(0, 1000);
        StdDraw.enableDoubleBuffering();

        while (true) {
            space1.applyGravity();
            space1.applyMomentum();
            StdDraw.clear();
            StdDraw.filledCircle(ball1.getPosition().getX(), ball1.getPosition().getY(), ball1.getRadius());
            StdDraw.show();
            if ((ball1.getPosition().getY() - ball1.getRadius()) <= 0) {
                ball1.reverseVertical();
            }
        }
    }
}

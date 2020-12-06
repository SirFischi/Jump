package DoodleJump;

import Movement.Position;
import Movement.Vector;
import Objects.Ball;
import Space.verticalTube;
import edu.princeton.cs.algs4.StdDraw;

import javax.swing.*;

public class doodleJump {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 2 * WIDTH;
    private static final double GRAVITY = 0.01;
    private static final double INPUTSTRENGHT = 1;
    private static final Vector JUMPSTRENGHT = new Vector(0, 40);

    private verticalTube tube;
    private double currHeight = 0;

    public doodleJump() {
        this.tube = new verticalTube(WIDTH);
        this.tube.addBall(new Ball(new Position(WIDTH / 2, WIDTH / 2), WIDTH / 100));
        this.tube.setGravity(GRAVITY);
        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(WIDTH, HEIGHT);
        StdDraw.setXscale(0, WIDTH);
        StdDraw.setYscale(0, HEIGHT);
    }

    private void adjustHeight() {
        double ballPeak = (tube.getBall().getPosition().getY() + tube.getBall().getRadius());
        if (ballPeak > currHeight + HEIGHT) {
            currHeight += (ballPeak - HEIGHT);
            StdDraw.setXscale(currHeight, currHeight + HEIGHT);
        }
    }

    private void draw() {
        StdDraw.clear();
        StdDraw.filledCircle(tube.getBall().getPosition().getX(), tube.getBall().getPosition().getY(), tube.getBall().getRadius());
        StdDraw.show();
    }

    public void gameTick() {
        tube.applyGravity();
        tube.applyMomentum();
        tube.checkSide();
        this.adjustHeight();
        this.draw();
    }

    private void userInput() {
        if (StdDraw.isKeyPressed(37)) { //left
            tube.getBall().moveHorizontal(INPUTSTRENGHT * (-1));
        } else if (StdDraw.isKeyPressed(39)) { //right
            tube.getBall().moveHorizontal(INPUTSTRENGHT);
        } else if (StdDraw.isKeyPressed(32)) {
            this.jump();
        }
    }

    private void jump() {
        tube.getBall().setMomentum(JUMPSTRENGHT);
    }


    public static void main(String[] args) {
        doodleJump game1 = new doodleJump();

        while (true) {
            game1.gameTick();
            game1.userInput();
        }
    }
}



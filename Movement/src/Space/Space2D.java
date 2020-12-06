package Space;

import Movement.Vector;
import Objects.movable;

import java.util.ArrayList;


public class Space2D {
    private ArrayList<movable> movingObjects = new ArrayList();
    private Vector gravity = new Vector();

    public Space2D() { }

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

    public void addMovable(movable m) {
        this.movingObjects.add(m);
    }

    public void applyGravity() {
        for (movable m:movingObjects) {
            m.addMomentum(gravity);
        }
    }

    public void applyMomentum() {
        for (movable m:movingObjects) {
            m.applyMomentum();
        }
    }
}

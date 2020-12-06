package Objects;

import Movement.Vector;

public interface movable {
    void addMomentum(Vector v);
    void applyMomentum();
}

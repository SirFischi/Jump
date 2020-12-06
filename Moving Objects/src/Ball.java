import javax.swing.text.Position;
import java.util.Vector;

public class Ball {
    Position position;
    double radius;
    Vector momentum;

    public Ball(Position startPosition, double radius) {
        this.position = startPosition;
        this.radius = radius;
    }

    public void applyMomentum(Vector momentum) {

    }
}

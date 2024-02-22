package Main;

public class Position {

    public Position getDiff (Position targetPos) {

        return new Position(x - targetPos.getX(), y - targetPos.getY());
    }
}

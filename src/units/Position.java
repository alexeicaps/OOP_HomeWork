package units;

public class Position {

    protected int X, Y;
    public Position(int x, int y){
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }


    //Метод нахождения расстояния между двумя персонажами
    public double distance(Position target){
        return Math.sqrt((Math.pow(X - target.X, 2) + Math.pow(Y - target.Y, 2)));
    }
}

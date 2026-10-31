package labtask07.task3;

public class SquareShape implements Shape {

    private int side;

    public SquareShape(int side) {

        this.side = side;
    }

    @Override
    public int getArea() {

        return side * side;
    }
}
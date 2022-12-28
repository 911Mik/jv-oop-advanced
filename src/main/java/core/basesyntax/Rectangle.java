package core.basesyntax;

public class Rectangle extends Figure {
    final double sideA;
    final double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area:  " + getArea() + " sq.units " + " sideA: "
                + sideA + " units " + "sideB: " + sideB + " units " + " color: " + getColor());
    }
}


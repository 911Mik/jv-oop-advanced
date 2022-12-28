package core.basesyntax;

public class Advanced {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        // Random rd = new Random();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure(i);
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}

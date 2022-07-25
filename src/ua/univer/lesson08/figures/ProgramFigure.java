package ua.univer.lesson08.figures;

public class ProgramFigure {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(1,2);
        Line l1 = new Line(new Point(4,4), new Point(5, 5));
        AbstractFigure[] figures = {
                p1,
                new ColorPoint(3,4,"RED"),
                l1,
                new ColorLine(l1.clone(), "Yellow")
        };

        for (AbstractFigure f: figures) {
            if(f instanceof ColorAble)
                System.out.println(((ColorAble) f).getColor());
        }

        Point p2 = new Point(p1);
        Point p3 = p1.clone();
        System.out.println(p1);
        System.out.println(p3);
    }
}

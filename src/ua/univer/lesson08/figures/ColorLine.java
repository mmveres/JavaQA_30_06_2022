package ua.univer.lesson08.figures;

public class ColorLine extends Line implements ColorAble{
    private String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    public ColorLine(Line l, String color) {
       this(new Point(l.getStart()),new Point(l.getEnd()), color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}

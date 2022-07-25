package ua.univer.lesson08.figures;

public class Line extends AbstractFigure{
   private Point start;
   private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        Line l = (Line) super.clone();
        l.setStart(getStart().clone());
        l.setEnd(getEnd().clone());
        return l;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

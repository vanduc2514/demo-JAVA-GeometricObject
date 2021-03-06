package handle.editor.resizeable;

import geometric.circle.Circle;

public class CircleResizeable implements Resizeable<Circle> {
    private double percent;

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public void resize(Circle circle) {
        circle.setRadius(circle.getRadius() * percent);
    }
}

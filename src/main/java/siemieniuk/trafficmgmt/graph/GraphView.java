package siemieniuk.trafficmgmt.graph;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public final class GraphView extends Canvas {
    @Override
    public boolean isResizable() {
        return true;
    }

    @Override
    public double maxHeight(double width) {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public double maxWidth(double height) {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public double minWidth(double height) {
        return 1D;
    }

    @Override
    public double minHeight(double width) {
        return 1D;
    }

    @Override
    public void resize(double width, double height) {
        this.setWidth(Math.min(width, height));
        this.setHeight(Math.min(width, height));
    }

    public GraphView() {
        super();
    }

    public GraphView(double size) {
        super(size, size);
    }

    private static int cellWidth = 0, cellHeight = 0;

    public void redraw() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.clearRect(0, 0, getWidth(), getHeight());
        gc.setFill(Color.BLUE);
        gc.setStroke(Color.TRANSPARENT);
        gc.fillRect(0, 0, getWidth(), getHeight());
    }

    /**
     * Converts canvas position to the local coordinate system
     * @param x Canvas' horizontal position
     * @param y Canvas' vertical position
     * @return The position in Coordinate system
     */
    public static int[] convertToLocalCoordinates(double x, double y) {
        int newX = (int)x/cellWidth;
        int newY = (int)y/cellHeight;
        return new int[] {newX, newY};
    }
}

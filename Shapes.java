import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Shapes extends JComponent
{
    private int size = 50;
    private ArrayList<Shape> Shapes;

    public Shapes()
    {
        Shapes = new ArrayList<>();
    }

    public void addCircle(Point2D point)
    {
        double dPosX = point.getX() - (double)size/2;
        double dPoxY = point.getY() - (double)size/2;

        Shapes.add(new Ellipse2D.Double(dPosX, dPoxY, size, size));
    }

    public void addSquare(Point2D point)
    {
        double dPosX = point.getX() - (double)size/2;
        double dPoxY = point.getY() - (double)size/2;

        Shapes.add(new Rectangle2D.Double(dPosX, dPoxY, size, size));
    }

    public void paint(Graphics graphics)
    {
        super.paint(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;

        for(int i = 0; i < Shapes.size(); i++)
        {
            graphics2D.fill(Shapes.get(i));
        }
    }
}
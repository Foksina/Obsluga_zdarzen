import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Drawing extends JPanel{

    protected Shapes shapes;
    private int chosenShape = 1;

    Drawing()
    {
        shapes = new Shapes();
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
        this.setBackground(Color.lightGray);
        this.setBounds(10,10,965,680);

        shapes.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e)
            {
                shapes.requestFocusInWindow();
                if (e.getButton() == MouseEvent.BUTTON1)
                {
                    if (chosenShape == 1)
                        shapes.addCircle(e.getPoint());
                    else
                        shapes.addSquare(e.getPoint());
                }
                repaint();
            }
        });
        shapes.addKeyListener(new KeyAdapter()
        {

            @Override
            public void keyPressed(KeyEvent e)
            {
                Point mousePosition = MouseInfo.getPointerInfo().getLocation();
                SwingUtilities.convertPointFromScreen(mousePosition, shapes);

                switch (e.getKeyCode())
                {
                    case KeyEvent.VK_C:
                        if (shapes.contains(mousePosition))
                        {
                            chosenShape = 1;
                            shapes.addCircle(mousePosition);
                            repaint();
                        }
                        break;
                    case KeyEvent.VK_S:
                        if (shapes.contains(mousePosition))
                        {
                            chosenShape = 2;
                            shapes.addSquare(mousePosition);
                            repaint();
                        }
                        break;
                    default:
                        break;
                }
            }
        });
        this.add(shapes, BorderLayout.CENTER);
        this.setVisible(true);
    }
}
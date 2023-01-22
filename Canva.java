import javax.swing.*;

import java.awt.event.KeyListener;

import static java.awt.Color.white;

public class Canva extends JFrame {
    public Canva(){
        JFrame canvasWindow = new JFrame();
        canvasWindow.setSize(1000,800);
        canvasWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvasWindow.setLayout(null);
        canvasWindow.setResizable(false);
        canvasWindow.setLocationRelativeTo(null);
        canvasWindow.setBackground(white);
        canvasWindow.setVisible(true);

        Drawing drawingCanvas = new Drawing();
        canvasWindow.add(drawingCanvas);
    }

}

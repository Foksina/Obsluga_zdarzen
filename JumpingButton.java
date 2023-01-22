import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class JumpingButton extends JFrame implements ActionListener {
    private JButton button = null;
    private Random number = new Random();
    private int x1,y1, x2, y2;

    public JumpingButton(){
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,700,500);
        button = new JButton("Ok");
        x1 = 100;
        y1 = 100;
        button.setBounds(x1,y1,80,40);
        add(button);
        button.addMouseListener(new MouseAdapter()
        {
            public void mouseEntered(MouseEvent me)
            {
                if(x1<550 && x1>20){ //warunek aby dało się "złapać" przycisk
                    do{
                        x2 = number.nextInt(600);
                        y2 = number.nextInt(410);
                    }
                    while(x2==x1 && y2==y1); //petla zapewnia, że wylosowane polozenie bedzie rozne od obecnego
                    button.setBounds(x2,y2,80,40);
                    x1 = x2;
                    y1 = y2;
                }
            }
        });
        button.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Canva();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);



        this.add(label);






        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Invoked when the mouse has been clicked (pressed and released) on a component

    }

    @Override
    public void mousePressed(MouseEvent e) {
        //Invoked when a mouse button has been pressed on a component

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //Invoked when a mouse button has been released on a component

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Invoked when the mouse enters a component

    }

    @Override
    public void mouseExited(MouseEvent e) {
        //Invoked when the mouse exits a component

    }
}

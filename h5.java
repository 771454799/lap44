import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 * Created by students on 04/09/22.
 */
public class MyDraw extends JComponent {
    public void paintComponent(Graphics g)
    {
        Rectangle r= new Rectangle(200,200,100,100);
        Graphics2D g2= (Graphics2D) g;
        g2.fill(r);
        Ellipse2D.Double face= new Ellipse2D.Double(200,200,100,100);
        g2.setColor(Color.yellow);
        g2.fill(face);
        Ellipse2D.Double eye1= new Ellipse2D.Double(220,220,25,25);
        g2.setColor(Color.black);
        g2.fill(eye1);
        Ellipse2D.Double eye2= new Ellipse2D.Double(255,220,25,25);
        g2.setColor(Color.black);
        g2.fill(eye2);

        Line2D.Double mouth= new Line2D.Double(230,270,270,270);
        g2.draw(mouth);

    }
}

import javax.swing.*;

/**
 * Created by students on 04/09/22.
 */
public class Ex8 {
    public static void main(String[] args) {
        JFrame frame= new JFrame("My Frame");
        frame.setSize(500,500);
        frame.setVisible(true);
        MyDraw d=new MyDraw();
        frame.add(d);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame {
        private ControlWindow cw = new ControlWindow();
       
        public Main() {
                this.add(cw);
                this.pack();
                this.setTitle("Ping Pong");
                this.setSize(Consts.WIDTH, Consts.HEIGHT);
                this.setLocationRelativeTo(null);
                this.setResizable(false);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setVisible(true);
        }
       
        public static void main(String[] args) {
                new Main();
        }
}
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Ball {
        public int x, y, diameter;
        public int speedX = 5, speedY = 5;
       
        public Ball(int x, int y, int diameter) {
                this.x = x;
                this.y = y;
                this.diameter = diameter;
        }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Player {
        public int x, y;
        public int width = 30, height = 100;
        public int speedY = 30;
        public int score = 0;
       
        public Player(int x, int y) {
                this.x = x;
                this.y = y;
        }
}
 
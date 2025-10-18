import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ControlWindow extends JPanel implements ActionListener, KeyListener {
        private Ball ball = new Ball(Consts.WIDTH / 2, Consts.HEIGHT / 2, 30);
        private Timer timer = new Timer(6, this);
        private Player lp = new Player(0, Consts.HEIGHT / 2);
        private Player rp = new Player(Consts.WIDTH - lp.width - lp.width / 2, Consts.HEIGHT / 2);
        private Font gameFont = new Font("Consolas", Font.PLAIN, 30);
       
        @Override public void paintComponent(Graphics g) {
                super.paintComponent(g);
               
                g.setColor(Color.WHITE);
                g.fillOval(ball.x, ball.y, ball.diameter, ball.diameter);
 
                g.fillRect(lp.x, lp.y, lp.width, lp.height);
                g.fillRect(rp.x, rp.y, rp.width, rp.height);
               
                g.setFont(gameFont);
                g.drawString("LEFT: " + lp.score, 0, 40);
                g.drawString("RIGHT: " + rp.score, Consts.WIDTH - 200, 40);
        }
       
        @Override public void actionPerformed(ActionEvent e) {
                ball.x += ball.speedX;
                ball.y += ball.speedY;
               
                Rectangle rectBall = new Rectangle(ball.x, ball.y, ball.diameter, ball.diameter);
                Rectangle rectLp = new Rectangle(lp.x, lp.y, lp.width, lp.height);
                Rectangle rectRp = new Rectangle(rp.x, rp.y, rp.width, rp.height);
               
                if (rectBall.intersects(rectRp)) {
                        ball.speedX = -Math.abs(ball.speedX);
                }
               
                if (rectBall.intersects(rectLp)) {
                        ball.speedX = Math.abs(ball.speedX);
                }
               
                if (ball.y >= Consts.HEIGHT - ball.diameter * 2) {
                        ball.speedY *= -1;
                }
               
                if (ball.y <= 0) {
                        ball.speedY *= -1;
                }
               
                if (ball.x >= Consts.WIDTH - ball.diameter) {
                        lp.score++;
                        ball.x = Consts.WIDTH / 2;
                        ball.y = Consts.HEIGHT / 2;
                }
               
                if (ball.x <= 0) {
                        rp.score++;
                        ball.x = Consts.WIDTH / 2;
                        ball.y = Consts.HEIGHT / 2;
                }
               
                repaint();
        }
       
        @Override public void keyPressed(KeyEvent e) {
                // W, S
                // MUI TEN LEN, XUONG
               
                if (e.getKeyCode() == KeyEvent.VK_W) {
                        lp.y -= lp.speedY;
                }
               
                if (e.getKeyCode() == KeyEvent.VK_S) {
                        lp.y += lp.speedY;
                }
               
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                        rp.y -= rp.speedY;
                }
               
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                        rp.y += rp.speedY;
                }
        }
       
        @Override public void keyTyped(KeyEvent e) {}
        @Override public void keyReleased(KeyEvent e) {}
        public ControlWindow() {
                timer.start();
                this.setBackground(Color.BLACK);
                this.addKeyListener(this);
                this.setFocusable(true);
        }
}
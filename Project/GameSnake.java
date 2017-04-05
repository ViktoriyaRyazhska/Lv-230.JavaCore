import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
 
public class GameSnake {
 
    final String TITLE_OF_GAME = "Snake The Gamee";   
    final int POINT_RADIUS = 20; // 
    final int PROGRAM_WIDTH = 30; // the size of window  pixels
    final int PROGRAM_HEIGHT = 20;
    final int X = 6;
    final int Y = 28;
    final int START_LOCATION = 200;
    final int SNAKE_SIZE = 6;    //start size of snake
    final int START_SNAKE_X = 10;
    final int START_SNAKE_Y = 10;
    final int DELAY = 100;//slowmotion of moving---braking move
    final int LEFT = 37;//code of keys
    final int UP = 38;
    final int RIGHT = 39;
    final int DOWN = 40;
    final int START_DIRECTION = RIGHT;
    final Color DEFAULT_COLOR = Color.RED;
    final Color FOOD_COLOR = Color.orange;
    final String GAME_OVER_MSG = "GAME OVER";
    
    Snake snake;
    Food food;
    
    JFrame frame;
    Canvas canvasPanel;
    Random random = new Random();
    boolean gameOver = false;
 
    public static void main(String[] args) {
        new GameSnake().go();
    }
     
    void go() {
        frame = new JFrame(TITLE_OF_GAME + " : " + "Score " + SNAKE_SIZE);//title windo
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit on close
        frame.setSize(PROGRAM_WIDTH * POINT_RADIUS + X, PROGRAM_HEIGHT * POINT_RADIUS + Y);
        frame.setLocation(START_LOCATION, START_LOCATION);
        frame.setResizable(false);
 
        canvasPanel = new Canvas();
        canvasPanel.setBackground(Color.BLACK);
         
        frame.getContentPane().add(BorderLayout.CENTER, canvasPanel);
        frame.addKeyListener(new KeyAdapter() {//check our keys push
           public void keyPressed(KeyEvent e) {
               snake.setDirection(e.getKeyCode());//move x,y 
           }
        });
 
        frame.setVisible(true);
 
        snake = new Snake(START_SNAKE_X, START_SNAKE_Y, SNAKE_SIZE, START_DIRECTION);//object snake position size
        food = new Food();
 
        while (!gameOver) {//безперервний цикл
            snake.move();
            if (food.isEaten()) {
                food.next();
            }
            canvasPanel.repaint();
            try {
                Thread.sleep(DELAY);//тормозіння руху змійки
            } catch (InterruptedException e) { e.printStackTrace(); }//дозволяэ рухатися
        }
    }
 
    class Snake {
        ArrayList<Point> snake = new ArrayList<Point>();
        int direction;
 
        public Snake(int x, int y, int length, int direction) {
            for (int i = 0; i < length; i++) {//робимо змійку з пойнтів
                Point point = new Point(x-i, y);
                snake.add(point);
            }
            this.direction = direction;
        }
         
        boolean isInsideSnake(int x, int y) {
            for (Point point : snake) {
                if ((point.getX() == x) && (point.getY() == y)) {//смерть змійки
                    return true;
                }
            }
            return false;
        }
 
        boolean isFood(Point food) {
            return ((snake.get(0).getX() == food.getX()) && (snake.get(0).getY() == food.getY()));
        }//поглинаємо обєкт їжа
         
        void move() {
            int x = snake.get(0).getX();
            int y = snake.get(0).getY();//голова управляє всім
            if (direction == LEFT) { x--; }
            if (direction == RIGHT) { x++; }
            if (direction == UP) { y--; }
            if (direction == DOWN) { y++; }
            if (x > PROGRAM_WIDTH - 1) { x = 0; }//робимо щоб за межы не виходила, а поверталася на 0 координат
            if (x < 0) { x = PROGRAM_WIDTH - 1; }
            if (y > PROGRAM_HEIGHT - 1) { y = 0; }
            if (y < 0) { y = PROGRAM_HEIGHT - 1; }
            gameOver = isInsideSnake(x, y); // check for acrooss itselves
            snake.add(0, new Point(x, y));
            if (isFood(food)) {
                food.eat();
                frame.setTitle(TITLE_OF_GAME + " : " + "Score:" + snake.size());
            } else {
                snake.remove(snake.size() - 1);
            }
        }
         
        void setDirection(int direction) {
            if ((direction >= LEFT) && (direction <= DOWN)) {
                if (Math.abs(this.direction - direction) != 2) {//не я
                    this.direction = direction;
                }
            }
        }
 
        void paint(Graphics g) {//метод малювання інтерфейсу
            for (Point point : snake) {
                point.paint(g);
            }
        }
    }
 
    class Food extends Point {
 
        public Food() {
            super(-1, -1);//положення поза межами першої їжі
            this.color = FOOD_COLOR;
        }
         
        void eat() {
            this.setXY(-1, -1);
        }
         
        boolean isEaten() {
            return this.getX() == -1;
        }
         
        void next() {
            int x, y;
            do {
                x = random.nextInt(PROGRAM_WIDTH);
                y = random.nextInt(PROGRAM_HEIGHT);
            } while (snake.isInsideSnake(x, y));
            this.setXY(x, y);
        }
    }
 
    class Point {
        int x, y;
        Color color = DEFAULT_COLOR;
 
        public Point(int x, int y) {
            this.setXY(x, y);
        }
 
        void paint(Graphics g) {
            g.setColor(color);
            g.fillOval(x * POINT_RADIUS, y * POINT_RADIUS, POINT_RADIUS, POINT_RADIUS);//малюємо овальну форму 
        }
 
        int getX() { return x; }
        int getY() { return y; }
 
        void setXY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
 
    public class Canvas extends JPanel {
 
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            snake.paint(g);
            food.paint(g);
            if (gameOver) {
                g.setColor(Color.red);
                g.setFont(new Font("Arial", Font.BOLD, 40));
                FontMetrics fm = g.getFontMetrics();
                g.drawString(GAME_OVER_MSG, (PROGRAM_WIDTH * POINT_RADIUS + X - fm.stringWidth(GAME_OVER_MSG))/2, (PROGRAM_HEIGHT * POINT_RADIUS + Y)/2);
            }
        }
    }
}
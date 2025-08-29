package com.mycompany.mavenproject1.patterns;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BouncingBalls3D extends JPanel implements ActionListener {
    private static final int SPHERE_RADIUS = 200;
    private static final int BALL_RADIUS = 10;
    private static final int BALL_COUNT = 20;
    private static final int TIMER_DELAY = 20;
    private final List<Ball> balls = new ArrayList<>();
    private final Random random = new Random();
    private double rotationAngle = 0;

    public BouncingBalls3D() {
        setPreferredSize(new Dimension(500, 500));
        initializeBalls();
        Timer timer = new Timer(TIMER_DELAY, this);
        timer.start();
    }

    private void initializeBalls() {
        for (int i = 0; i < BALL_COUNT; i++) {
            double theta = random.nextDouble() * 2 * Math.PI;
            double phi = random.nextDouble() * Math.PI;
            double x = SPHERE_RADIUS * Math.sin(phi) * Math.cos(theta);
            double y = SPHERE_RADIUS * Math.sin(phi) * Math.sin(theta);
            double z = SPHERE_RADIUS * Math.cos(phi);
            double dx = random.nextDouble() * 4 - 2;
            double dy = random.nextDouble() * 4 - 2;
            double dz = random.nextDouble() * 4 - 2;
            balls.add(new Ball(x, y, z, dx, dy, dz));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        g2d.translate(getWidth() / 2, getHeight() / 2);
        g2d.rotate(rotationAngle);

        g2d.setColor(Color.WHITE);
        g2d.drawOval(-SPHERE_RADIUS, -SPHERE_RADIUS, SPHERE_RADIUS * 2, SPHERE_RADIUS * 2);

        for (Ball ball : balls) {
            int drawX = (int) ball.x;
            int drawY = (int) ball.y;
            g2d.setColor(Color.RED);
            g2d.fillOval(drawX - BALL_RADIUS, drawY - BALL_RADIUS, BALL_RADIUS * 2, BALL_RADIUS * 2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Ball ball : balls) {
            ball.update();
        }
        rotationAngle += 0.01;
        repaint();
    }

    private static class Ball {
        double x, y, z;
        double dx, dy, dz;

        public Ball(double x, double y, double z, double dx, double dy, double dz) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.dx = dx;
            this.dy = dy;
            this.dz = dz;
        }

        public void update() {
            x += dx;
            y += dy;
            z += dz;

            double distance = Math.sqrt(x * x + y * y + z * z);
            if (distance + BALL_RADIUS > SPHERE_RADIUS) {
                double normalX = x / distance;
                double normalY = y / distance;
                double normalZ = z / distance;
                double dot = dx * normalX + dy * normalY + dz * normalZ;
                dx -= 2 * dot * normalX;
                dy -= 2 * dot * normalY;
                dz -= 2 * dot * normalZ;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Bouncing Balls in Rotating Sphere");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new BouncingBalls3D());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}


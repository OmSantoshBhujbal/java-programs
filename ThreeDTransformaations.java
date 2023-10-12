import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreeDTransformaations extends JPanel implements ActionListener {
    private double[][] vertices = {
        {50, 50, 50},
        {100, 50, 50},
        {100, 100, 50},
        {50, 100, 50},
        {50, 50, 100},
        {100, 50, 100},
        {100, 100, 100},
        {50, 100, 100}
    };

    private int[][] edges = {
        {0, 1}, {1, 2}, {2, 3}, {3, 0},
        {4, 5}, {5, 6}, {6, 7}, {7, 4},
        {0, 4}, {1, 5}, {2, 6}, {3, 7}
    };

    private double[][] transformationMatrix = new double[4][4];

    private double scale = 1.0;
    private double translationX = 0;
    private double translationY = 0;

    public ThreeDTransformaations() {
        Timer timer = new Timer(100, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);

        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;

        // Clear the canvas
        g2d.fillRect(0, 0, width, height);

        // Apply transformations
        transformationMatrix = getTransformationMatrix();

        for (int[] edge : edges) {
            int x1 = (int) (vertices[edge[0]][0]);
            int y1 = (int) (vertices[edge[0]][1]);
            int x2 = (int) (vertices[edge[1]][0]);
            int y2 = (int) (vertices[edge[1]][1]);

            double[] p1 = applyTransformation(transformationMatrix, x1, y1);
            double[] p2 = applyTransformation(transformationMatrix, x2, y2);

            g2d.drawLine(centerX + (int) p1[0], centerY - (int) p1[1], centerX + (int) p2[0], centerY - (int) p2[1]);
        }
    }

    private double[] applyTransformation(double[][] matrix, double x, double y) {
        double[] result = new double[3];
        result[0] = matrix[0][0] * x + matrix[0][1] * y + matrix[0][3];
        result[1] = matrix[1][0] * x + matrix[1][1] * y + matrix[1][3];
        result[2] = matrix[2][0] * x + matrix[2][1] * y + matrix[2][3];
        return result;
    }

    private double[][] getTransformationMatrix() {
        double[][] translationMatrix = {
            {1, 0, 0, translationX},
            {0, 1, 0, translationY},
            {0, 0, 1, 0},
            {0, 0, 0, 1}
        };

        double[][] scaleMatrix = {
            {scale, 0, 0, 0},
            {0, scale, 0, 0},
            {0, 0, scale, 0},
            {0, 0, 0, 1}
        };

        return matrixMultiply(translationMatrix, scaleMatrix);
    }

    private double[][] matrixMultiply(double[][] a, double[][] b) {
        int aRows = a.length;
        int aColumns = a[0].length;
        int bColumns = b[0].length;
        double[][] result = new double[aRows][bColumns];

        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bColumns; j++) {
                for (int k = 0; k < aColumns; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update the translation and scale values
        translationX += 1.0;
        translationY += 1.0;
        scale += 0.01;

        // Repaint the component
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("3D Transformations");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.add(new ThreeDTransformaations());
            frame.setVisible(true);
        });
    }
}

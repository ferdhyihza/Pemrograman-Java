package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class App extends javax.swing.JFrame implements MouseListener {
    private JPanel panelUtama;
    private JButton btnClear;
    private JRadioButton lingkaranRadioButton;
    private JRadioButton persegiRadioButton;
    private JComboBox pilihWarna;
    private JPanel panelDraw;
    private ButtonGroup buttonGroup1;

    private String color = "Putih"; // Default color is putih
    private String shape;

    private int[] point = new int[4];

    public App() {
        frameInit();
        this.panelDraw.addMouseListener(this);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonGroup1.clearSelection();
                pilihWarna.setSelectedIndex(0);
            }
        });
        lingkaranRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shape = "Lingkaran";
                System.out.println(shape + " selected");
                System.out.println("With color : " + color);
            }
        });
        persegiRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shape = "Persegi";
                System.out.println(shape + " selected");
                System.out.println("With color : " + color);
            }
        });
        pilihWarna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int warna = pilihWarna.getSelectedIndex();
                switch (warna) {
                    case 0 -> color = "Putih";
                    case 1 -> color = "Hitam";
                    case 2 -> color = "Merah";
                    case 3 -> color = "Kuning";
                    case 4 -> color = "Hijau";
                    case 5 -> color = "Biru";
                }
            }
        });

    }

    public void paint(Graphics g) {
        super.paint(g);
        int warna = pilihWarna.getSelectedIndex();
        switch (warna) {
            case 0 -> g.setColor(Color.white);
            case 1 -> g.setColor(Color.black);
            case 2 -> g.setColor(Color.red);
            case 3 -> g.setColor(Color.yellow);
            case 4 -> g.setColor(Color.green);
            case 5 -> g.setColor(Color.blue);
        }
        if (lingkaranRadioButton.isSelected())
        g.fillRect(100,100,100,100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelUtama);
        frame.setTitle("Simple Paint");
        frame.setSize(960,480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        point[0] = e.getX();
        point[1] = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        point[2] = e.getX();
        point[3] = e.getY();
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

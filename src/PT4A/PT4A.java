package PT4A;
import javax.swing.JButton;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.FileChooserUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PT4A extends JFrame {
    private int width = 800;
    private int height = 400;

    static double u;
    static int i, j, k;
    private static JTextField inputa1, inputa2, inputa3, inputa4, inputa5, inputb1, inputb2, inputb3, inputb4, inputb5;
    private static JTextField inputc1, inputc2, inputc3, inputc4, inputc5, inputd1, inputd2, inputd3, inputd4, inputd5;
    private static JTextField outkq;
    private static JTextField x1, x2, x3, x4;
    static double matrix[][] = new double[4][5];
    private static String path;

    public static void main(String[] args) throws InterruptedException {
        new PT4A();

    }

    public PT4A() {
        this.setSize(width, height);
        this.setTitle("Giai PT 4 an");
        // label
        JLabel lba = new JLabel();
        lba.setText("Nhap PT 1:");
        lba.setSize(400, 100);
        lba.setBounds(30, 30, 70, 50);
        this.add(lba);

        JLabel lbb = new JLabel();
        lbb.setText("Nhap PT 2:");
        lbb.setSize(400, 100);
        lbb.setBounds(30, 90, 70, 50);
        this.add(lbb);

        JLabel lbc = new JLabel();
        lbc.setText("Nhap PT 3:");
        lbc.setSize(400, 100);
        lbc.setBounds(30, 150, 70, 50);
        this.add(lbc);

        JLabel lbd = new JLabel();
        lbd.setText("Nhap PT 4:");
        lbd.setSize(400, 100);
        lbd.setBounds(30, 210, 70, 50);
        this.add(lbd);

        JLabel kq = new JLabel();
        kq.setText("Ket qua:");
        kq.setSize(100, 100);
        kq.setBounds(430, 120, 70, 50);
        this.add(kq);

        JLabel kq1 = new JLabel();
        kq1.setText("x1 = ");
        kq1.setSize(400, 100);
        kq1.setBounds(570, 30, 30, 50);
        this.add(kq1);

        JLabel kq2 = new JLabel();
        kq2.setText("x2 = ");
        kq2.setSize(400, 100);
        kq2.setBounds(570, 90, 30, 50);
        this.add(kq2);

        JLabel kq3 = new JLabel();
        kq3.setText("x3 = ");
        kq3.setSize(400, 100);
        kq3.setBounds(570, 150, 30, 50);
        this.add(kq3);

        JLabel kq4 = new JLabel();
        kq4.setText("x4 = ");
        kq4.setSize(400, 100);
        kq4.setBounds(570, 210, 30, 50);
        this.add(kq4);

        // input pt1
        inputa1 = new JTextField();
        inputa1.setBounds(100, 30, 50, 50);
        this.add(inputa1);

        inputa2 = new JTextField();
        inputa2.setBounds(160, 30, 50, 50);
        this.add(inputa2);

        inputa3 = new JTextField();
        inputa3.setBounds(220, 30, 50, 50);
        this.add(inputa3);

        inputa4 = new JTextField();
        inputa4.setBounds(280, 30, 50, 50);
        this.add(inputa4);

        inputa5 = new JTextField();
        inputa5.setBounds(340, 30, 50, 50);
        this.add(inputa5);
        // input pt2
        inputb1 = new JTextField();
        inputb1.setBounds(100, 90, 50, 50);
        this.add(inputb1);

        inputb2 = new JTextField();
        inputb2.setBounds(160, 90, 50, 50);
        this.add(inputb2);

        inputb3 = new JTextField();
        inputb3.setBounds(220, 90, 50, 50);
        this.add(inputb3);

        inputb4 = new JTextField();
        inputb4.setBounds(280, 90, 50, 50);
        this.add(inputb4);

        inputb5 = new JTextField();
        inputb5.setBounds(340, 90, 50, 50);
        this.add(inputb5);
        // input pt3
        inputc1 = new JTextField();
        inputc1.setBounds(100, 150, 50, 50);
        this.add(inputc1);

        inputc2 = new JTextField();
        inputc2.setBounds(160, 150, 50, 50);
        this.add(inputc2);
        inputc3 = new JTextField();
        inputc3.setBounds(220, 150, 50, 50);
        this.add(inputc3);

        inputc4 = new JTextField();
        inputc4.setBounds(280, 150, 50, 50);
        this.add(inputc4);

        inputc5 = new JTextField();
        inputc5.setBounds(340, 150, 50, 50);
        this.add(inputc5);
        // input pt4
        inputd1 = new JTextField();
        inputd1.setBounds(100, 210, 50, 50);
        this.add(inputd1);

        inputd2 = new JTextField();
        inputd2.setBounds(160, 210, 50, 50);
        this.add(inputd2);

        inputd3 = new JTextField();
        inputd3.setBounds(220, 210, 50, 50);
        this.add(inputd3);

        inputd4 = new JTextField();
        inputd4.setBounds(280, 210, 50, 50);
        this.add(inputd4);

        inputd5 = new JTextField();
        inputd5.setBounds(340, 210, 50, 50);
        this.add(inputd5);

        // ket qua
        x1 = new JTextField();
        x1.setEditable(false);
        x1.setBounds(600, 30, 150, 50);
        this.add(x1);

        x2 = new JTextField();
        x2.setEditable(false);
        x2.setBounds(600, 90, 150, 50);
        this.add(x2);

        x3 = new JTextField();
        x3.setEditable(false);
        x3.setBounds(600, 150, 150, 50);
        this.add(x3);

        x4 = new JTextField();
        x4.setEditable(false);
        x4.setBounds(600, 210, 150, 50);
        this.add(x4);

        outkq = new JTextField();
        outkq.setEditable(false);
        outkq.setBounds(500, 300, 250, 50);
        this.add(outkq);

        // button giai pt
        JButton output = new JButton("Tinh");
        output.setBounds(100, 290, 70, 50);
        output.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                x1.setText("");
                x2.setText("");
                x3.setText("");
                x4.setText("");
                // matrix = new double[4][5];
                outkq.setText("");
                if (checkInput()) {

                    solveEquation(matrix);
                }

            }
        });
        this.add(output);
        // button reset
        JButton reset = new JButton("reset");
        reset.setBounds(180, 290, 70, 50);
        reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                inputa1.setText("");
                inputa2.setText("");
                inputa3.setText("");
                inputa4.setText("");
                inputa5.setText("");

                inputb1.setText("");
                inputb2.setText("");
                inputb3.setText("");
                inputb4.setText("");
                inputb5.setText("");

                inputc1.setText("");
                inputc2.setText("");
                inputc3.setText("");
                inputc4.setText("");
                inputc5.setText("");

                inputd1.setText("");
                inputd2.setText("");
                inputd3.setText("");
                inputd4.setText("");
                inputd5.setText("");

                x1.setText("");
                x2.setText("");
                x3.setText("");
                x4.setText("");
            }
        });
        this.add(reset);
        // file
        JButton file = new JButton("chon file");
        file.setBounds(340, 290, 120, 50);
        file.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    chooseFile();
                    matrix = loadDataFile(path);

                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        });
        this.add(file);
        // button exit
        JButton exit = new JButton("exit");
        exit.setBounds(260, 290, 70, 50);
        exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.add(exit);

        this.setLayout(null);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }

    public void chooseFile() {
        final JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        try {
            if (fc.getSelectedFile() != null) {
                path = fc.getSelectedFile().getPath();

                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean checkInput() {
        String matrix1[][] = loadData();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (!isNumeric(matrix1[i][j])) {
                    outkq.setText("Du lieu nhap khong dung dinh dang");
                    return false;
                }
                matrix[i][j] = Double.parseDouble(matrix1[i][j]);
            }
        }
        return true;
    }

    // load data from choose file
    public double[][] loadDataFile(String filePath) throws InterruptedException {
        double matrix2[][] = null;
        Path path = Paths.get(filePath);
        Charset charset = Charset.forName("US-ASCII");
        try {
            BufferedReader reader = Files.newBufferedReader(path, charset);
            String line0 = reader.readLine(); // skip a first line
            String[] s = line0.split(" ");
            matrix2 = new double[Integer.parseInt(s[0])][Integer.parseInt(s[1])];
            String line1 = null;
            int count = 0;
            while ((line1 = reader.readLine()) != null) {
                String[] readElemnents = line1.split(" ");
                for (int i = 0; i < readElemnents.length; i++) {
                    matrix2[count][i] = Double.parseDouble(readElemnents[i]);
                }
                count++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        setInput(matrix2);
        return matrix2;
    }

    public static void setInput(double[][] mt) {
        inputa1.setText("" + mt[0][0]);
        inputa2.setText("" + mt[0][1]);
        inputa3.setText("" + mt[0][2]);
        inputa4.setText("" + mt[0][3]);
        inputa5.setText("" + mt[0][4]);

        inputb1.setText("" + mt[1][0]);
        inputb2.setText("" + mt[1][1]);
        inputb3.setText("" + mt[1][2]);
        inputb4.setText("" + mt[1][3]);
        inputb5.setText("" + mt[1][4]);

        inputc1.setText("" + mt[2][0]);
        inputc2.setText("" + mt[2][1]);
        inputc3.setText("" + mt[2][2]);
        inputc4.setText("" + mt[2][3]);
        inputc5.setText("" + mt[2][4]);

        inputd1.setText("" + mt[3][0]);
        inputd2.setText("" + mt[3][1]);
        inputd3.setText("" + mt[3][2]);
        inputd4.setText("" + mt[3][3]);
        inputd5.setText("" + mt[3][4]);
    }

    // load data from UI
    public static String[][] loadData() {
        String matrix2[][] = null;
        try {
            matrix2 = new String[4][5];
            matrix2[0][0] = inputa1.getText();
            matrix2[0][1] = inputa2.getText();
            matrix2[0][2] = inputa3.getText();
            matrix2[0][3] = inputa4.getText();
            matrix2[0][4] = inputa5.getText();
            matrix2[1][0] = inputb1.getText();
            matrix2[1][1] = inputb2.getText();
            matrix2[1][2] = inputb3.getText();
            matrix2[1][3] = inputb4.getText();
            matrix2[1][4] = inputb5.getText();
            matrix2[2][0] = inputc1.getText();
            matrix2[2][1] = inputc2.getText();
            matrix2[2][2] = inputc3.getText();
            matrix2[2][3] = inputc4.getText();
            matrix2[2][4] = inputc5.getText();
            matrix2[3][0] = inputd1.getText();
            matrix2[3][1] = inputd2.getText();
            matrix2[3][2] = inputd3.getText();
            matrix2[3][3] = inputd4.getText();
            matrix2[3][4] = inputd5.getText();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return matrix2;
    }

    // giai pt
    @SuppressWarnings("deprecation")
    public static void solveEquation(double[][] a) {
        int m = a.length;
        int n = a[0].length;

        double[] x = new double[m];
        double sum;
        if (n > m + 1) {
            outkq.setText("Phuong trinh vo so nghiem");
        }

        else {
            for (k = 0; k < m - 1; k++) {
                for (i = k + 1; i < m; i++) {
                    Thread thread1 = new Thread() {
                        public void run() {
                            u = a[i][k] / a[k][k];
                        }
                    };
                    thread1.run();
                    for (j = k; j < m + 1; j++) {
                        Thread thread2 = new Thread() {
                            public void run() {
                                a[i][j] -= u * a[k][j];
                            }
                        };
                        thread2.run();
                        thread2.stop();
                    }
                    thread1.stop();

                }
            }
            m = m - 1;
            x[m] = a[m][m + 1] / a[m][m];
            for (int i = m - 1; i >= 0; i--) {
                sum = 0;
                for (int j = i + 1; j <= m; j++) {
                    sum += a[i][j] * x[j];
                }
                x[i] = (a[i][m + 1] - sum) / a[i][i];
            }
            ArrayList<String> list = new ArrayList<String>();
            System.out.println(x.length);
            for (int o = 0; o < x.length; o++) {

                if ("NaN".equals(x[o] + "")) {
                    outkq.setText("PTVN");
                    return;
                }
                String xi = "" + (double) Math.round(x[o] * 100000) / 100000;
                list.add(xi);
            }

            x1.setText(list.get(0));
            x2.setText(list.get(1));
            x3.setText(list.get(2));
            x4.setText(list.get(3));

        }

    }
}

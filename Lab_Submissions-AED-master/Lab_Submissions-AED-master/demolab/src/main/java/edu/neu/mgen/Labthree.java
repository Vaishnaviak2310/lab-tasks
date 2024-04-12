package edu.neu.mgen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Labthree {

    public static class ColorChooserGUI extends JFrame implements ActionListener {
        private JComboBox<String> colorComboBox;
        private JLabel circleLabel;
        private JLabel outputLabel;

        public ColorChooserGUI() {
            setTitle("Color Chooser");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            // Dropdown choice of colors
            colorComboBox = new JComboBox<>(new String[]{"Select a Color", "Red", "Blue", "Green"});
            colorComboBox.addActionListener(this);

            // Circle panel
            JPanel circlePanel = new JPanel();
            circlePanel.setPreferredSize(new Dimension(200, 200));
            circlePanel.setBackground(Color.WHITE);
            
            // Initialize the circleLabel with a clear (outline only) circle
            circleLabel = new JLabel(new ColorIcon(Color.BLACK, false)); // False indicates outline only
            circlePanel.add(circleLabel);

            // Output label
            outputLabel = new JLabel("Select a color from the dropdown");
            outputLabel.setHorizontalAlignment(JLabel.CENTER);

            // Add components to the frame
            add(colorComboBox, BorderLayout.NORTH);
            add(circlePanel, BorderLayout.CENTER);
            add(outputLabel, BorderLayout.SOUTH);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedColor = (String) colorComboBox.getSelectedItem();
            if (selectedColor != null && !selectedColor.equals("Select a Color")) {
                switch (selectedColor) {
                    case "Red":
                        circleLabel.setIcon(new ColorIcon(Color.RED, true)); // True to fill the circle
                        outputLabel.setText("Selected color of the circle: Red");
                        break;
                    case "Blue":
                        circleLabel.setIcon(new ColorIcon(Color.BLUE, true));
                        outputLabel.setText("Selected color of the circle: Blue");
                        break;
                    case "Green":
                        circleLabel.setIcon(new ColorIcon(Color.GREEN, true));
                        outputLabel.setText("Selected color of the circle: Green");
                        break;
                }
            }
        }

        // Custom icon to draw colored circles or an outline
        private class ColorIcon implements Icon {
            private final Color color;
            private final boolean fill; // Determines if the circle is filled

            public ColorIcon(Color color, boolean fill) {
                this.color = color;
                this.fill = fill;
            }

            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
                g.setColor(color);
                if (fill) {
                    g.fillOval(x, y, getIconWidth(), getIconHeight());
                } else {
                    g.drawOval(x, y, getIconWidth(), getIconHeight());
                }
            }

            @Override
            public int getIconWidth() {
                return 100;
            }

            @Override
            public int getIconHeight() {
                return 100;
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                ColorChooserGUI gui = new ColorChooserGUI();
                gui.setVisible(true);
            });
        }
    }
}

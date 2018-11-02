import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CirclePanel extends JPanel
{
    private final int CIRCLE_SIZE = 50;
    private int x, y;
    private Color c;

    JButton left = new JButton("Left");
    JButton right = new JButton("Right");
    JButton up = new JButton("Up");
    JButton down = new JButton("Down");

    JPanel buttonPanel = new JPanel();

    //---------------------------------------------------------------
    // Set up circle and buttons to move it.
    //---------------------------------------------------------------
    public CirclePanel(int width, int height)
    {
        // Set coordinates so circle starts in middle
        x = (width/2)-(CIRCLE_SIZE/2);
        y = (height/2)-(CIRCLE_SIZE/2);
        c = Color.green;
        // Need a border layout to get the buttons on the bottom
        this.setLayout(new BorderLayout());
        // Create buttons to move the circle


        left.setMnemonic('l');
        right.setMnemonic('r');
        up.setMnemonic('u');
        down.setMnemonic('d');


        left.setToolTipText("This button will move the circle to the left 20 pixels.");
        right.setToolTipText("This button will move the circle to the right 20 pixels.");
        up.setToolTipText("This button will move the circle up 20 pixels.");
        down.setToolTipText("This button will move the circle down 20 pixels.");



        // Add listeners to the buttons
        left.addActionListener(new MoveListener(-20, 0));
        right.addActionListener(new MoveListener(20, 0));
        up.addActionListener(new MoveListener(0, -20));
        down.addActionListener(new MoveListener(0, 20));
        // Need a panel to put the buttons on or they'll be on
        // top of each other.
        buttonPanel.add(left);
        buttonPanel.add(right);
        buttonPanel.add(up);
        buttonPanel.add(down);
        // Add the button panel to the bottom of the main panel
        this.add (buttonPanel, "South");

    }
    //----------------------------------------------------------------
    // Draw circle on CirclePanel
    //----------------------------------------------------------------
    public void paintComponent(Graphics page)
    {

        super.paintComponent(page);
        page.setColor(c);
        page.fillOval(x,y, CIRCLE_SIZE, CIRCLE_SIZE);
    }
    //----------------------------------------------------------------
    // Class to listen for button clicks that move circle.
    //----------------------------------------------------------------
    private class MoveListener implements ActionListener
    {
        private int dx;
        private int dy;
        //----------------------------------------------------------------
        // Parameters tell how to move circle at click.
        //----------------------------------------------------------------
        public MoveListener(int dx, int dy)
        {
            this.dx = dx;
            this.dy = dy;
        }
        //----------------------------------------------------------------
        // Change x and y coordinates and repaint.
        //----------------------------------------------------------------
        public void actionPerformed(ActionEvent e)
        {
            x += dx;
            y += dy;

            if(x<=0){

                left.setEnabled(false);

            }

            if(y<=0){

                up.setEnabled(false);

            }

            if(x>= buttonPanel.getWidth()){

                right.setEnabled(false);

            }

            if(y>=(getHeight()-buttonPanel.getHeight())){



                down.setEnabled(false);

            }




            if(x>=0){

                left.setEnabled(true);

            }

            if(y>=0){

                up.setEnabled(true);

            }

            if(x<=buttonPanel.getWidth()){

                right.setEnabled(true);

            }

            if(y<=(getHeight()-buttonPanel.getHeight())){

                down.setEnabled(true);

            }
            repaint();
        }
    }
}
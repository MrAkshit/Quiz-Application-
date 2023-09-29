import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {

    Score(String name , int score){
        setBounds(300,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(200,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3) ;
        image.setBounds(0, 200, 300,250);
        add(image);

         JLabel heading  = new JLabel("ThankYou " + name + " for playing Great Minds !!");
        heading.setBounds(40,35,650,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);


        JLabel lblscore  = new JLabel("Your Score is " + score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(lblscore);

        JButton submit= new JButton("Play Again");
        submit.setBounds(370,320,180,25);
        submit.setFont(new Font("Tahoma",Font.PLAIN,20));
        submit.setBackground(new Color(30,100,200));
        submit.setBackground(Color.PINK);
        submit.addActionListener(this);
        add(submit);


        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();

    }

    public static void main(String[] args) {
        new Score("User",0);
    }
}

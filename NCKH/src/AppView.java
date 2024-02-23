import javax.swing.*;
import java.awt.event.ActionListener;

public class AppView extends JFrame {
    private JPanel panel1;
    private JButton startButton;

    public AppView() {
        this.setTitle("Test");
        this.setSize(1080,720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        init();
        this.setVisible(true);
    }

    private void init(){
        this.setContentPane(panel1);
        ActionListener ac= new AppController(this);
        startButton.addActionListener(ac); //nhan su kien
    }
}

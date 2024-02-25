import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AppView extends JFrame {
    private JPanel mainWindow;
    private JButton startButton;
    public JPanel getMainWindow() {
        return mainWindow;
    }
    public JButton getStartButton() {
        return startButton;
    }
    public AppView() {
        this.setTitle("Test");
        this.setSize(1080,720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        init();
        this.setVisible(true);
    }
    private void init(){
        this.setContentPane(mainWindow);
        ActionListener ac= new AppController(this);
        startButton.addActionListener(ac);
    }
}

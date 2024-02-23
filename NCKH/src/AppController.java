import org.python.core.util.RelativeFile;
import org.python.util.PythonInterpreter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class AppController implements ActionListener {
    public AppView view;
    public AppController(AppView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mess= e.getActionCommand();
        if(mess.equals("Start")){
            PythonInterpreter python= new PythonInterpreter();
            RelativeFile path= new RelativeFile("src\\CodePython\\test.py");
            python.execfile(path.toString());
//            WebcamGUI webcam= new WebcamGUI(); // khoi tao khung camera
        }
    }
}

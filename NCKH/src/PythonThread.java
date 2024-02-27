import java.io.*;

public class PythonThread implements Runnable{
    @Override
    public void run() {

        String pythonScriptPath = System.getProperty("user.dir")+"\\src\\hi.py"; // thay doi file
        System.out.println(pythonScriptPath);
        try {
            //processBuilder cai tien hon process
            ProcessBuilder pb = new ProcessBuilder("python", pythonScriptPath);
            Process process = pb.start();

            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = reader.readLine()) != null) { //Kiem tra python chay den dau
                System.out.println(line);
            }

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}

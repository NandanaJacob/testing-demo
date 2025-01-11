import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingSerializedObject{
    public static void main(String[] args) throws IOException {
        FileOutputStream fs = new FileOutputStream("MyGame.ser");
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(char1);
        os.writeObject(char2);
        os.writeObject(char3);
        os.close();
    }
}

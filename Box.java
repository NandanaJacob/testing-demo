import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Box implements Serializable{
    private int width;
    private int hieght;
    //define constructor
    public Box(){

    }
    public Box(int width, int hieght){
        this.width = width;
        this.hieght = hieght;
    }
    //setter methods
    public void setWidth(int width){
        this.width = width;
    }
    public void setHieght(int hieght){
        this.hieght = hieght;
    }
    public static void main(String[] args) {
        Box b = new Box();
        b.setWidth(100);
        b.setHieght(200);
        try{
            FileOutputStream fs = new FileOutputStream("Box.ser"); //connection stream
            ObjectOutputStream os = new ObjectOutputStream(fs); //chain stream
            os.writeObject(myBox);
            os.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

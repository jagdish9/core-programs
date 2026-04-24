package programs.marker;

import java.io.FileInputStream;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\tmp\\empse.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            EmpSer empSer = (EmpSer) ois.readObject();

            System.out.println(empSer.getName() + " "+ empSer.getPassword());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

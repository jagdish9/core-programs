package programs.marker;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

public class SerializeDemo {
    public static void main(String[] args) {
        EmpSer empSer = new EmpSer(20, "Sanjana", "San#2008");

        try {
            FileOutputStream fos = new FileOutputStream("D:\\tmp\\empse.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(empSer);
            oos.close();

            System.out.println("Object serializer successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class EmpSer implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private transient String password;

    public EmpSer(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

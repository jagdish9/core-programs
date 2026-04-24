package programs.marker;

public class CloneableExample {
    public static void main(String[] args) {
        WorkerObject wo = new WorkerObject(12, "Samiksha");

        WorkerObject wo1 = null;
        try {
            wo1 = (WorkerObject) wo.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(wo == wo1);
        System.out.println(wo.equals(wo1));
        System.out.println(wo.getName().equals(wo1.getName()));
    }
}

class WorkerObject implements Cloneable{
    private int id;
    private String name;

    public WorkerObject(int id, String name) {
        this.id = id;
        this.name = name;
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

    /*@Override
    public WorkerObject clone() {
        try {
            WorkerObject clone = (WorkerObject) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }*/

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

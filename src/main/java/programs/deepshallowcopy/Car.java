package programs.deepshallowcopy;

import java.util.List;

public class Car {
    private String name;
    private List<String> colors;

    public Car(String name, List<String> colors) {
        this.name = name;
        this.colors = colors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public String getName() {
        return name;
    }

    public List<String> getColors() {
        return colors;
    }
}

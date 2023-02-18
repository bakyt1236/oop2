import java.util.List;

public class Parents {
    private String namelswife;
    private String namelshusban;
    private int countChild;
    private List<Child> child;

    public Parents(String namelswife, String namelshusban, int countChild, List<Child> child) {
        this.namelswife = namelswife;
        this.namelshusban = namelshusban;
        this.countChild = countChild;
        this.child = child;
    }

    @Override
    public String toString() {
        return "Parents{" +
                "namelswife='" + namelswife + "\n" +
                ", namelshusban='" + namelshusban + "\n" +
                ", countChild=" + countChild +
                ", child=" + child +
                '}';
    }
}


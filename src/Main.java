
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Child> childList = new ArrayList<>();
        childList.add(new Child("Marlen", 17));
        childList.add(new Child("Mapoh", 34));
        childList.add(new Child("Rosi", 14));
        childList.add(new Child("Mark", 11));
        childList.add(new Child("Mak", 11));
        Parents parents = new Parents("Deizi", "Jorch", childList.size(),childList);
        House house = new House(14, "Toktogul", parents);
        System.out.println(house);
    }
}
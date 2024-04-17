import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Alice");
        name.add("Bob");
        name.add("Charlie");
        name.add("David");
        name.add("Emma");
        name.set(3, "Daniel");
        //name.remove(3);
        name.clear();

        System.out.println(name);

        Collections.sort(name);

        //System.out.println("Sorted list: " + name);

        //System.out.println(name);

        //System.out.println(name);

        //for (int i = 0; i < name.size(); i++)
        {
            //System.out.println(name.get(i));
        }

        //System.out.println("does names contain Alice?");
        //System.out.println(name.contains("Alice"));






    }
}


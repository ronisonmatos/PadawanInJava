package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        SortedSet<String> alfabeto = new TreeSet<>();

        alfabeto.add("A");
        alfabeto.add("R");
        alfabeto.add("T");
        alfabeto.add("C");
        alfabeto.add("B");

        for (String listar : alfabeto) {
            System.out.println(listar);
        }

    }

}

package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Queue<String> filmes = new LinkedList<String>();

        // Offer e add adicionam elementos na fila
        // Diferen�a � quando comportamento ocorre
        // quando a fila est� cheia
        filmes.offer("Epis�dio 4: Uma Nova Esperan�a");
        filmes.add("Epis�dio 5: O Imp�rio Contra-Ataca");
        filmes.offer("Epis�dio 6: O Retorno de Jedi");
        filmes.add("Epis�dio 1: A Amea�a Fantasma");
        filmes.offer("Epis�dio 2: O Ataque dos Clones");
        filmes.add("Epis�dio 3: A Vingan�a dos Sith");
        filmes.offer("Epis�dio 7: O Despertar da For�a");
        filmes.add("Epis�dio 8: Os �ltimos Jedi");
        filmes.offer("Epis�dio 9: A Ascens�o Skywalker");
        filmes.add("Han Solo: Uma Hist�ria Star Wars");
        filmes.offer("Rogue One: Uma Hist�ria Star Wars");

        // Peek e Element obtem os elementos da fila (sem remover)
        System.out.println(filmes.peek()); // retorna null
        System.out.println(filmes.peek());
        System.out.println(filmes.element()); // lan�a uma exe��o
        System.out.println(filmes.element());

        // Poll e Elemento obtem os elementos da fila e remove
        System.out.println(filmes.poll()); // retorna null
        System.out.println(filmes.remove()); // lan�a uma exe��o
    }

}

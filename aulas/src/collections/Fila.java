package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionem elementos na fila
        // Diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); // retorna false
        fila.offer("Bia"); // lança uma excecao
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // peek e element -> obter o proximo elementos
        // da fila (sem remover) elementos na fila
        // diferença é o comportamento ocorre
        // quando a fila está vazia!
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lanca uma excecao
        System.out.println(fila.element());

        /// fila.size();
        // fila.clear();
        // fila.isEmpty();

        // Poll e Remove -> obtem o próximo elemento
        // da fila e remove!

        // Peek e Element -> obter o próximo elemento da fila (sem remover)

        // diferença é o comportamento que ocorre
        // quando a fila está vazia!
        System.out.println(fila.poll()); // retorna null
        System.out.println(fila.remove()); // lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // lança uma exceção

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains(...)


    }
}

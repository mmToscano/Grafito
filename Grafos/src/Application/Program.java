package Application;

import entities.Grafo;


public class Program {

    public static void main(String[] args) {


        Grafo g = new Grafo();
        g.addVertice(2);
        g.addVertice(3);
        g.addVertice(4);
        g.addVertice(5);
        g.addVertice(9);
        g.addVertice(12);
        g.addVertice(1);
        g.addVertice(25);

        g.addVertice(20);
        g.addVertice(30);


        g.addAresta(2, 3, 30);
        g.addAresta(2, 4, 40);
        g.addAresta(2, 5, 12);
        g.addAresta(5, 1, 14);
        g.addAresta(2, 1, 18);
        g.addAresta(2, 9, 10);
        g.addAresta(9, 12, 20);
        g.addAresta(2, 12, 22);
        g.addAresta(12, 25, 22);

        g.addAresta(20, 30, 5);


        //g.imprimirGrafo();

        System.out.println(g.existeCaminho(2, 25));

    }
}

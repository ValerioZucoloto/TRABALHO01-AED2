import java.util.Scanner;

public class Main {

    //
    public static Scanner sc = new Scanner(System.in);

    public static TBlocos tBlocos;
    public static Lista lista = new Lista();

    public static void main(String[] args) {

        addObjetoAuto();

        //tBlocos = new TBlocos();
//        tBlocos.listaBlocos[0] = null;
//
//        addObjeto(tBlocos);
//        addObjeto(tBlocos);
//        addObjeto(tBlocos);
//        addObjeto(tBlocos);
//        addObjeto(tBlocos);
//
        //listar();


    }

    private static void moveOnto(int n1, int n2) {

        TBlocos aux = lista.primeiro;

        while (aux != null) {
            if (aux.proximo == null) {
                System.out.println(aux.num + " -> null");
                aux = null;
            } else {
                System.out.println(aux.num + " -> " + aux.proximo.num);
                aux = aux.proximo;
            }
        }

    }

    private static void listar() {

        TBlocos aux = lista.primeiro;

        if (aux == null) {
            System.out.println("Lista Vazia!");
        } else {
            System.out.println();
            System.out.println("Elementos na lista :");
            while (aux != null) {
                if (aux.proximo == null) {
                    System.out.println(aux.num + " -> null");
                    aux = null;
                } else {
                    System.out.println(aux.num + " -> " + aux.proximo.num);
                    aux = aux.proximo;
                }
            }
        }

    }

    public static void addObjeto(TBlocos tBlocos) {

//        TBlocos newTBloco = new TBlocos();
//        TBlocos auxTBloco;
//
//        if (lista.qtd == 0) {
//            System.out.println("Lista Vazia!");
//
//            System.out.print("Informe o número desejado: ");
//            newTBloco.num = sc.nextInt();
//            newTBloco.proximo = null;
//
//            lista.primeiro = newTBloco;
//            lista.ultimo = newTBloco;
//            lista.qtd++;
//        } else {
//
//            auxTBloco = lista.primeiro;
//
//            while (auxTBloco.proximo != null){
//                auxTBloco = auxTBloco.proximo;
//            }
//
//            System.out.print("Informe o número desejado: ");
//            newTBloco.num = sc.nextInt();
//            newTBloco.proximo = null;
//
//            auxTBloco.proximo = newTBloco;
//            lista.ultimo = newTBloco;
//            lista.qtd++;
//
//        }

    }

    public static void addObjetoAuto() {

        TBlocos auxTBloco;

        System.out.print("Informe o número desejado: ");
        int n = sc.nextInt();

        TBlocos newTBloco = new TBlocos(n);

        for (int i = 0; i < n; i++) {
            if (lista.qtd == 0) {
                System.out.print("INFO0");
                newTBloco.num = sc.nextInt();
                newTBloco.proximo = null;

                lista.primeiro = newTBloco;
                lista.ultimo = newTBloco;
                lista.qtd++;
            } else {
                System.out.print("INFO2");
                auxTBloco = lista.primeiro;

                while (auxTBloco.proximo != null) {
                    auxTBloco = auxTBloco.proximo;
                }

                newTBloco.num = i;
                newTBloco.proximo = null;

                auxTBloco.proximo = newTBloco;
                lista.ultimo = newTBloco;
                lista.qtd++;
            }
            System.out.print("INFO0");
        }

    }

}

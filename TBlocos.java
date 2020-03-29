public class TBlocos {

    public int tamnhoLista;

    public TBlocos(int tamnhoLista) {
        this.tamnhoLista = tamnhoLista;
    }

    public Lista[] listaBlocos = new Lista[tamnhoLista];
    public int num;
    public TBlocos proximo;

}

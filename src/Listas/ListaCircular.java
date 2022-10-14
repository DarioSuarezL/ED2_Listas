package Listas;

public class ListaCircular{
    private Nodo Head;
    private int n;
    
    public ListaCircular(){
        this.Head = null;
        this.n = 0;
    }
    
    public boolean isVacia(){
        return (Head == null);
    }
    
    public Nodo nodoIndex(int posicion) {
        int contador = 0;
        Nodo actual = Head;
        while (contador < posicion) {
            actual = actual.getLink();
            contador++;
        }
        return actual;
    }
    
    public void add(int newdata){
        Nodo ant = null;
        Nodo p = Head;
        int i = 0;
        while (i<n && newdata >= p.getData()) {
            ant = p;
            p = p.getLink();
            i++;
        }
        Nodo newnodo;
        if (ant == null) {
            newnodo = new Nodo(newdata);
            newnodo.setLink(Head);
            Head = newnodo;
            n++;
            if(n>1){
                Nodo q = nodoIndex(n-1);
                q.setLink(Head);
            }
        } else if (ant.getData() != newdata) {
            newnodo = new Nodo(newdata);
            ant.setLink(newnodo);
            newnodo.setLink(p);
            n++;
        } 
    }
    
    public int length(){
        return n;
    }
    
    @Override
    public String toString() {
        String st = "";
        Nodo p = Head;
        
        for(int i = 0; i < n; i++){
            st = st + p.getData() + "--> ";
            p = p.getLink();
        }
        
        return st;
    }
}

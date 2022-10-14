package Listas;

public class ColaCircular {
    private Nodo Tail;
    private int n;
    
    public ColaCircular(){
        Tail = null;
        n = 0;
    }
    
    public boolean isVacia() {
        return (Tail == null);
    }
    
    public Nodo nodoIndex(int posicion) {
        int contador = 0;
        Nodo actual = Tail;
        while (contador < posicion) {
            actual = actual.getLink();
            contador++;
        }
        return actual;
    }
    
    //Añade al ultimo el nuevo dato y hace que sea apuntado por el nodo final para que siga siendo colacircular
    public void push(int newdata){
        if (isVacia()){
            Tail = new Nodo(newdata);
        }else{
            Nodo newnodo = new Nodo(newdata);
            newnodo.setLink(Tail);
            Tail = newnodo;
            Nodo H = nodoIndex(n);
            H.setLink(Tail); //Apunta al ultimo
        }
        
        n++;
        
    }

    public int pop(){
        if(isVacia()){
            return 0;
        }else{
            Nodo nuevo_prim = nodoIndex(n-2);
            Nodo prim = nodoIndex(n-1);
            nuevo_prim.setLink(Tail);
            n--;
            return prim.getData();
        }
    }
    
    @Override
    public String toString() {
        String st = "";
        Nodo p = Tail;
        
        for(int i = 0; i < n; i++){
            st = st + p.getData() + "--> ";
            p = p.getLink();
        }
        
        return st;
    }
}

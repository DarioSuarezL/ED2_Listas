package Listas;

public class Pila {
    
    private Nodo Head;
    private int n;
    
    //constructor
    public Pila() {
        this.Head = null;
        this.n = 0;
    }
    
    //devolver tamaño
    public int length() {
        return n;
    }
    
    public boolean isVacia(){
        return (Head == null);        
    }
    
    public void push(int newdata){
        if (isVacia()){
            Head = new Nodo(newdata);
        }else{
            Nodo p = new Nodo(newdata);
            p.setLink(Head);
            Head = p;
        }
        n++;
    }
    
    public int pop(){
        if (!isVacia()){
            int p = Head.getData();
            Head = Head.getLink();
            return p;
        }
        return 0;
    }
    
    @Override 
    public String toString() {
        String st = "";
        Nodo p = Head;
        while (p != null) {
            st = st + p.getData() + "\n";
            p = p.getLink();
        }
        return st;
    }

}

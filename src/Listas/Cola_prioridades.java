package Listas;

public class Cola_prioridades {
    //priorizan los pares
    private Nodo Frente, Atras;
    private int n;
    
    public Cola_prioridades(){
        Frente = Atras = null;
        n = 0;
    }
    
    public boolean isVacia(){
        return(Frente == null && Atras == null);
    }
    
    public void push(int newdata){
        Nodo newnodo = new Nodo(newdata);
        if (isVacia()){
            Frente = newnodo;
            Atras = newnodo;
        }else{
            if(newdata % 2 == 0){
                Nodo p = Atras;
                Nodo ant = null;
                while(p != null && p.getData()%2 != 0){
                    ant = p;
                    p = p.getLink();
                }
                
                if (p == null){
                    Frente = newnodo;
                }      
            newnodo.setLink(p);
            ant.setLink(newnodo);
            }else{
                newnodo.setLink(Atras);
                Atras = newnodo; 
            }
        }
        n++;
    }
    
    public Nodo nodoIndex(int posicion) {
        int contador = 0;
        Nodo actual = Atras;
        while (contador < posicion) {
            actual = actual.getLink();
            contador++;
        }
        return actual;
    }
    
    public int pop(){
        if (!isVacia()){
            int p = Frente.getData();
            Frente = nodoIndex(n-2);
            Frente.setLink(null);
            n--;
            if (n==0){
                Atras = null;
                Frente = null;
            }
            return p;
        }
        return 0;
    }
    
    public int length(){
        return n;
    }
    
    @Override
    public String toString() {
        String st = "";
        Nodo p = Atras;
        for(int i = 0; i < n; i++){
            st = st + p.getData() + "--> ";
            p = p.getLink();
        }
        return st;
    }   
}
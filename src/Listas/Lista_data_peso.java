package Listas;

public class Lista_data_peso {
    private Nodo Head;
    private int n;

    public Lista_data_peso() {
        this.Head = null;
        this.n = 0;
    }
    
    public boolean isVacia() {
        return (Head == null);
    }
    
    public void add(int newdata,int peso){
        if(isVacia()){
            Head = new Nodo(newdata);
            Nodo peso_uno = new Nodo(peso);
            Head.setLink(peso_uno);
            n+=2;
        }else{
            Nodo antdata = null;
            Nodo pdata = Head;
            Nodo antpeso = null;
            Nodo ppeso = Head.getLink();
            while(pdata != null && (newdata > pdata.getData() || (pdata.getData()== newdata && ppeso.getData() <=  peso))){
                antdata = pdata;
                antpeso = ppeso;
                
                pdata = pdata.getLink().getLink();
                if (pdata != null)
                    ppeso = pdata.getLink();
            }
            Nodo nuevodata;
            Nodo nuevopeso;
            if (antdata == null){
                nuevodata = new Nodo(newdata);
                nuevopeso = new Nodo(peso);
                nuevodata.setLink(nuevopeso);
                nuevopeso.setLink(Head);
                Head = nuevodata;
                n+=2;
            }else if (antdata.getData() != newdata || (antdata.getData() == newdata && antpeso.getData() != peso)){
                nuevodata = new Nodo(newdata);
                nuevopeso = new Nodo(peso);
                antpeso.setLink(nuevodata);
                nuevodata.setLink(nuevopeso);
                nuevopeso.setLink(pdata);
                n+=2;
            }
        }
    }
    
    public String toString() {
        char sep[] = {',',')','('};
        int control = 0;
        String st = "(";
        Nodo p = Head;
        while (p != null) {
            st = st + p.getData() + sep[control];
            
            if (control == 1 && p.getLink()!=null){
                st += ","+sep[control+1];
                control++;
            }
            
            p = p.getLink();
            control++;
            
            if (control == 3){
                control = 0;
            }
            
        }
        return st;
    }
    
}

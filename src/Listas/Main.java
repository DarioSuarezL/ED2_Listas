package Listas;

public class Main {
    public static void main(String[] args){
       /** //CLASE LISTA
        Lista list = new Lista();
        list.recursive_add(20);
        list.recursive_add(1);
        list.recursive_add(5);
        list.recursive_add(20);
        
        System.out.println(list.toString());
        System.out.println(list.length());
        System.out.println("\n");
        System.out.println(list.toString());
        
        //INICIA CLASE PILA
        Pila pil = new Pila();
        pil.push(17);
        pil.push(25);
        pil.push(75);
        System.out.println(pil.toString());
        int m1 = pil.pop();
        System.out.println(pil.toString());
        System.out.println(m1);
        
        //INICIA COLACIRCULAR
        System.out.println("-----------------------COLA CIRCULAR-----------------------"); 
        ColaCircular cola_cir = new ColaCircular();
        cola_cir.push(12);
        cola_cir.push(3);
        cola_cir.push(0);
        cola_cir.push(87);
        System.out.println(cola_cir.toString());
        System.out.println(cola_cir.pop()); 
        System.out.println(cola_cir.toString()); 
        
        //INICIA CLASE COLA
        Cola col = new Cola();
        col.push(5);
        col.push(12);
        col.push(78);
        System.out.println(col.toString());
        int m2 = col.pop();
        System.out.println(col.toString());
        System.out.println(m2);
        
        //INICIA LA CLASE LISTACIRCULAR
        System.out.println("-----------LISTA CIRCULAR------------");
        ListaCircular List_cir = new ListaCircular();
        List_cir.add(20);
        List_cir.add(1);
        List_cir.add(10);
        List_cir.add(20);   
        List_cir.add(1);
        List_cir.add(0);
        List_cir.add(2);        
        System.out.println(List_cir.toString());
        System.out.println(List_cir.length());
         **/
        System.out.println("------------------------------------");
        System.out.println("-----------LISTA DATA-PESO ------------");
        System.out.println("------------------------------------");
        Lista_data_peso L = new Lista_data_peso();
        L.add(2,3);
        L.add(1, 21);
        L.add(0, 22);
        L.add(1, 19);
        L.add(3, 5);
        L.add(2,3);
        L.add(3,5);
        L.add(1,2);
        L.add(1,30);
        L.add(111, 222);
        L.add(0,1);
        L.add(22,1);
        System.out.println(L.toString());
        
        System.out.println("------------------------------------");
        System.out.println("-----------COLA PRIORIDADES------------");
        System.out.println("------------------------------------");
        Cola_prioridades Cpri = new Cola_prioridades();
        Cpri.push(9);
        Cpri.push(8);
        Cpri.push(3);
        Cpri.push(10);
        Cpri.push(5);
        Cpri.push(18);
        Cpri.push(8);
        System.out.println(Cpri.toString());
        int el = Cpri.pop();
        System.out.println(Cpri.toString());
        System.out.println(el);
        int er = Cpri.pop();
        System.out.println(Cpri.toString());
        System.out.println(er);
  }
}
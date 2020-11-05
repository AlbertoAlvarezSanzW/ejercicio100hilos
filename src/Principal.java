
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


import java.util.*;

public class Principal implements Callback {
    final int maximo = 20;
    String it1,it2,it3,it4,it5="";
    int num=0;
    public Principal() throws InterruptedException {
        for (int j = 0; j<maximo;j++){
            Hilos hilo = new Hilos(this);
            hilo.setName("El Hilo "+(j+1)+" :");
            hilo.start();
        }


    }
    public void acaba(String acaba1,int it) {
        switch(it){
            case 1:
                it1+=acaba1+"\n";
                break;
            case 2:
                it2+=acaba1+"\n";
                break;
            case 3:
                it3+=acaba1+"\n";
                break;
            case 4:
                it4+=acaba1+"\n";
                break;
            case 5:
                it5+=acaba1+"\n";
                break;
            default:
                break;
        }
    }

    public void gracias_Carlos() {
        num++;
        if(num==maximo) {
            System.out.println("Iteración 1:\n" + it1 + "\nIteración 2:\n" + it2 + "\nIteración 3:\n" + it3 +
                    "\nIteración 4:\n" + it4 + "\nIteración 5:\n" + it5);
        }
    }
}

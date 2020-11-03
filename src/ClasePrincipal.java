
import java.util.ArrayList;



public class ClasePrincipal implements Callback {

    final int MAX = 100;
    hilos[] hilos = new hilos[MAX];
    ArrayList <String> lista = new ArrayList<String>();

    public ClasePrincipal(){
        int i = 0;
        int j = 0;
        for (i = 1; i<5; i++){
            System.out.println("La iteración "+i);

            for (j = 0; j<MAX;j++){
                hilos hilo = new hilos(this);
                hilo.setName("El hilo:"+j);
                hilo.start();
                hilos[j] = hilo;
            }

            for(hilos x:hilos){
                try{
                    x.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }

            System.out.println(lista.get(0));
            lista.clear();
        }
    }

    public void cadena(String cadena){
        lista.add(cadena);
    }


    public void finish(String finish) {
        System.out.println(finish );
    }

}

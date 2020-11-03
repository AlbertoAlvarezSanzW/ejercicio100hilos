

import java.util.Random;


public class hilos extends Thread{


    Callback callback;

    public hilos(Callback callback){
        this.callback = callback;

    }

    @Override
    public void run() {
        Random rand = new Random();
        int time = rand.nextInt(7000)+1000;

        try{

            sleep(time);
            callback.finish(getName()+" ha estado esperando por "+time);
            callback.cadena(getName()+" ha tardado en total "+time);
            time = rand.nextInt(6000)+2000;

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

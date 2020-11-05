public class Hilos extends Thread{
    Callback callback;
    Callback finished;
    public Hilos(Callback callback){
        this.callback = callback;
        this.finished = finished;
    }

    @Override
    public void run() {
        final int max=5;
        final int maxsleep=8000;
        String iter="";
        for (int i=0;i<max;i++){
            int time = (int) (Math.random() * (maxsleep - 1000 + 1) + 1000);
            try {
                sleep(time);
                iter=getName()+" ha dormido por "+time;
                callback.acaba(iter,(i+1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        callback.gracias_Carlos();
    }
}


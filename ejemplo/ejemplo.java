import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ejemplo {
    private CyclicBarrier barrier;

    public ejemplo(){
        this.barrier = new CyclicBarrier(3);
    }

    public void prueba(){
        try{
            //hace algo
            this.barrier.await();
        }catch(InterruptedException | BrokenBarrierException e){}
    }
}

package design;

import java.util.concurrent.*;

/**
 * Created by focus on 17/2/20.
 */
public class Design {
    public static void main(String[] args) {
        ExecutorService mExecutor = Executors.newFixedThreadPool(11);
        /**
         * 容量为10的阻塞队列
         */
        final BlockingDeque<Future<Integer>> queue = new LinkedBlockingDeque<>(10);
        final CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(mExecutor, queue);

        for (int i = 0; i < 20; i++) {
            completionService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int ran = ThreadLocalRandom.current().nextInt(1000);
                    Thread.sleep(ran);
                    System.out.println(Thread.currentThread() + "休息了" + ran);
                    return ran;
                }
            });
        }

        for (int i = 0; i < 10; i++) {
            try {
                Future<Integer> take = completionService.take();
                System.out.println(take.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}

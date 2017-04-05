package guava.future;

import com.google.common.util.concurrent.*;
import com.sun.istack.internal.Nullable;

import java.util.concurrent.*;


/**
 * Created by focus on 17/4/5.
 */
public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("=====call====");
                Thread.sleep(3000);
                return 10;
            }
        });
        new Thread(futureTask).start();
        System.out.println("=====get=====");
        System.out.println(futureTask.get());

        CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(Executors.newFixedThreadPool(10));

        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            cs.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    Thread.sleep(3000);
                    return taskId;
                }
            });
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(cs.take().get());
        }
        System.out.println("====end1?=======");

        ListeningExecutorService les = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(10));

        ListenableFuture<Integer> listenableFuture = les.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(3000);
                return 1212;
            }
        });
        Futures.<Integer>addCallback(listenableFuture, new FutureCallback<Integer>() {
            @Override
            public void onSuccess(@Nullable Integer integer) {
                System.out.println(integer);
            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });
        System.out.println("====end2?=======");
    }
}

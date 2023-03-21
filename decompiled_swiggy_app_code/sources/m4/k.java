package m4;

import java.util.concurrent.Executor;

/* compiled from: SynchronousExecutor */
public class k implements Executor {
    public void execute(Runnable runnable) {
        runnable.run();
    }
}

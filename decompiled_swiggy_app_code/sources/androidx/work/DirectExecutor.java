package androidx.work;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.p;

/* compiled from: DirectExecutor.kt */
public enum DirectExecutor implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        p.j(runnable, "command");
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}

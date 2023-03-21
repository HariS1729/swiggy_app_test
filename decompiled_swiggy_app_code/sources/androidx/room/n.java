package androidx.room;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import wp0.f1;

/* compiled from: CoroutinesRoom.kt */
public final class n {
    public static final CoroutineDispatcher a(RoomDatabase roomDatabase) {
        p.j(roomDatabase, "<this>");
        Map<String, Object> k = roomDatabase.k();
        p.i(k, "backingFieldMap");
        Object obj = k.get("QueryDispatcher");
        if (obj == null) {
            Executor n = roomDatabase.n();
            p.i(n, "queryExecutor");
            obj = f1.b(n);
            k.put("QueryDispatcher", obj);
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (CoroutineDispatcher) obj;
    }

    public static final CoroutineDispatcher b(RoomDatabase roomDatabase) {
        p.j(roomDatabase, "<this>");
        Map<String, Object> k = roomDatabase.k();
        p.i(k, "backingFieldMap");
        Object obj = k.get("TransactionDispatcher");
        if (obj == null) {
            Executor q = roomDatabase.q();
            p.i(q, "transactionExecutor");
            obj = f1.b(q);
            k.put("TransactionDispatcher", obj);
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (CoroutineDispatcher) obj;
    }
}

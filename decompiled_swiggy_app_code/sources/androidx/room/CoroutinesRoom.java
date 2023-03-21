package androidx.room;

import android.os.CancellationSignal;
import fp0.c;
import java.util.concurrent.Callable;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import wp0.g1;
import wp0.h;
import wp0.o;

/* compiled from: CoroutinesRoom.kt */
public final class CoroutinesRoom {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f11484a = new Companion((i) null);

    /* compiled from: CoroutinesRoom.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final <R> Object a(RoomDatabase roomDatabase, boolean z11, CancellationSignal cancellationSignal, Callable<R> callable, c<? super R> cVar) {
            if (roomDatabase.x() && roomDatabase.r()) {
                return callable.call();
            }
            y0 y0Var = (y0) cVar.getContext().get(y0.f11690b);
            CoroutineDispatcher c11 = y0Var == null ? null : y0Var.c();
            if (c11 == null) {
                c11 = z11 ? n.b(roomDatabase) : n.a(roomDatabase);
            }
            o oVar = new o(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            oVar.w();
            oVar.N(new CoroutinesRoom$Companion$execute$4$1(cancellationSignal, j.d(g1.f29466a, c11, (CoroutineStart) null, new CoroutinesRoom$Companion$execute$4$job$1(callable, oVar, (c<? super CoroutinesRoom$Companion$execute$4$job$1>) null), 2, (Object) null)));
            Object t = oVar.t();
            if (t == b.d()) {
                f.c(cVar);
            }
            return t;
        }

        public final <R> Object b(RoomDatabase roomDatabase, boolean z11, Callable<R> callable, c<? super R> cVar) {
            if (roomDatabase.x() && roomDatabase.r()) {
                return callable.call();
            }
            y0 y0Var = (y0) cVar.getContext().get(y0.f11690b);
            CoroutineDispatcher c11 = y0Var == null ? null : y0Var.c();
            if (c11 == null) {
                c11 = z11 ? n.b(roomDatabase) : n.a(roomDatabase);
            }
            return h.g(c11, new CoroutinesRoom$Companion$execute$2(callable, (c<? super CoroutinesRoom$Companion$execute$2>) null), cVar);
        }
    }

    public static final <R> Object a(RoomDatabase roomDatabase, boolean z11, CancellationSignal cancellationSignal, Callable<R> callable, c<? super R> cVar) {
        return f11484a.a(roomDatabase, z11, cancellationSignal, callable, cVar);
    }

    public static final <R> Object b(RoomDatabase roomDatabase, boolean z11, Callable<R> callable, c<? super R> cVar) {
        return f11484a.b(roomDatabase, z11, callable, cVar);
    }
}

package androidx.room;

import fp0.d;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import lp0.p;

/* compiled from: RoomDatabase.kt */
public final class y0 implements CoroutineContext.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f11690b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f11691a;

    /* compiled from: RoomDatabase.kt */
    public static final class a implements CoroutineContext.b<y0> {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public final d c() {
        return this.f11691a;
    }

    public <R> R fold(R r11, p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        return CoroutineContext.a.C0310a.a(this, r11, pVar);
    }

    public <E extends CoroutineContext.a> E get(CoroutineContext.b<E> bVar) {
        return CoroutineContext.a.C0310a.b(this, bVar);
    }

    public CoroutineContext.b<y0> getKey() {
        return f11690b;
    }

    public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return CoroutineContext.a.C0310a.c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.a.C0310a.d(this, coroutineContext);
    }
}

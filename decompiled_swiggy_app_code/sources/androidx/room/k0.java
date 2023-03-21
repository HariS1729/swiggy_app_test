package androidx.room;

import androidx.room.RoomDatabase;
import java.util.concurrent.Executor;
import t3.h;

/* compiled from: QueryInterceptorOpenHelperFactory */
final class k0 implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final h.c f11582a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomDatabase.e f11583b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f11584c;

    k0(h.c cVar, RoomDatabase.e eVar, Executor executor) {
        this.f11582a = cVar;
        this.f11583b = eVar;
        this.f11584c = executor;
    }

    public h a(h.b bVar) {
        return new j0(this.f11582a.a(bVar), this.f11583b, this.f11584c);
    }
}

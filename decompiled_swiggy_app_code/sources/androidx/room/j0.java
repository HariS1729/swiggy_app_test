package androidx.room;

import androidx.room.RoomDatabase;
import java.util.concurrent.Executor;
import t3.g;
import t3.h;

/* compiled from: QueryInterceptorOpenHelper */
final class j0 implements h, p {

    /* renamed from: a  reason: collision with root package name */
    private final h f11578a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomDatabase.e f11579b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f11580c;

    j0(h hVar, RoomDatabase.e eVar, Executor executor) {
        this.f11578a = hVar;
        this.f11579b = eVar;
        this.f11580c = executor;
    }

    public void close() {
        this.f11578a.close();
    }

    public String getDatabaseName() {
        return this.f11578a.getDatabaseName();
    }

    public h getDelegate() {
        return this.f11578a;
    }

    public g i() {
        return new i0(this.f11578a.i(), this.f11579b, this.f11580c);
    }

    public void setWriteAheadLoggingEnabled(boolean z11) {
        this.f11578a.setWriteAheadLoggingEnabled(z11);
    }
}

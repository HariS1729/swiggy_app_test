package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import t3.k;

/* compiled from: SharedSQLiteStatement */
public abstract class x0 {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f11670a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final RoomDatabase f11671b;

    /* renamed from: c  reason: collision with root package name */
    private volatile k f11672c;

    public x0(RoomDatabase roomDatabase) {
        this.f11671b = roomDatabase;
    }

    private k c() {
        return this.f11671b.f(d());
    }

    private k e(boolean z11) {
        if (!z11) {
            return c();
        }
        if (this.f11672c == null) {
            this.f11672c = c();
        }
        return this.f11672c;
    }

    public k a() {
        b();
        return e(this.f11670a.compareAndSet(false, true));
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.f11671b.c();
    }

    /* access modifiers changed from: protected */
    public abstract String d();

    public void f(k kVar) {
        if (kVar == this.f11672c) {
            this.f11670a.set(false);
        }
    }
}

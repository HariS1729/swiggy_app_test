package androidx.work;

import android.os.Build;
import androidx.work.e;
import java.util.concurrent.TimeUnit;

/* compiled from: PeriodicWorkRequest */
public final class d extends e {

    /* compiled from: PeriodicWorkRequest */
    public static final class a extends e.a<a, d> {
        public a(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit) {
            super(cls);
            this.f12347c.e(timeUnit.toMillis(j));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public d c() {
            if (this.f12345a && Build.VERSION.SDK_INT >= 23 && this.f12347c.j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            } else if (!this.f12347c.q) {
                return new d(this);
            } else {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public a d() {
            return this;
        }
    }

    d(a aVar) {
        super(aVar.f12346b, aVar.f12347c, aVar.f12348d);
    }
}

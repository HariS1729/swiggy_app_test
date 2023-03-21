package androidx.work;

import android.os.Build;
import androidx.work.e;

/* compiled from: OneTimeWorkRequest */
public final class c extends e {

    /* compiled from: OneTimeWorkRequest */
    public static final class a extends e.a<a, c> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f12347c.f15496d = OverwritingInputMerger.class.getName();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public c c() {
            if (!this.f12345a || Build.VERSION.SDK_INT < 23 || !this.f12347c.j.h()) {
                return new c(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public a d() {
            return this;
        }
    }

    c(a aVar) {
        super(aVar.f12346b, aVar.f12347c, aVar.f12348d);
    }

    public static c d(Class<? extends ListenableWorker> cls) {
        return (c) new a(cls).b();
    }
}

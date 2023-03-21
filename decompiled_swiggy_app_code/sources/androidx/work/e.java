package androidx.work;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import l4.p;

/* compiled from: WorkRequest */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private UUID f12342a;

    /* renamed from: b  reason: collision with root package name */
    private p f12343b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f12344c;

    /* compiled from: WorkRequest */
    public static abstract class a<B extends a<?, ?>, W extends e> {

        /* renamed from: a  reason: collision with root package name */
        boolean f12345a = false;

        /* renamed from: b  reason: collision with root package name */
        UUID f12346b = UUID.randomUUID();

        /* renamed from: c  reason: collision with root package name */
        p f12347c;

        /* renamed from: d  reason: collision with root package name */
        Set<String> f12348d = new HashSet();

        /* renamed from: e  reason: collision with root package name */
        Class<? extends ListenableWorker> f12349e;

        a(Class<? extends ListenableWorker> cls) {
            this.f12349e = cls;
            this.f12347c = new p(this.f12346b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.f12348d.add(str);
            return d();
        }

        public final W b() {
            W c11 = c();
            d4.a aVar = this.f12347c.j;
            int i11 = Build.VERSION.SDK_INT;
            boolean z11 = (i11 >= 24 && aVar.e()) || aVar.f() || aVar.g() || (i11 >= 23 && aVar.h());
            p pVar = this.f12347c;
            if (pVar.q) {
                if (z11) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                } else if (pVar.f15499g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f12346b = UUID.randomUUID();
            p pVar2 = new p(this.f12347c);
            this.f12347c = pVar2;
            pVar2.f15493a = this.f12346b.toString();
            return c11;
        }

        /* access modifiers changed from: package-private */
        public abstract W c();

        /* access modifiers changed from: package-private */
        public abstract B d();

        public final B e(d4.a aVar) {
            this.f12347c.j = aVar;
            return d();
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        public B f(OutOfQuotaPolicy outOfQuotaPolicy) {
            p pVar = this.f12347c;
            pVar.q = true;
            pVar.f15506r = outOfQuotaPolicy;
            return d();
        }

        public B g(long j, TimeUnit timeUnit) {
            this.f12347c.f15499g = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f12347c.f15499g) {
                return d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final B h(b bVar) {
            this.f12347c.f15497e = bVar;
            return d();
        }
    }

    protected e(UUID uuid, p pVar, Set<String> set) {
        this.f12342a = uuid;
        this.f12343b = pVar;
        this.f12344c = set;
    }

    public String a() {
        return this.f12342a.toString();
    }

    public Set<String> b() {
        return this.f12344c;
    }

    public p c() {
        return this.f12343b;
    }
}

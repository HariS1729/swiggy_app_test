package f4;

import d4.i;
import d4.l;
import java.util.HashMap;
import java.util.Map;
import l4.p;

/* compiled from: DelayedWorkTracker */
public class a {

    /* renamed from: d  reason: collision with root package name */
    static final String f14624d = i.f("DelayedWorkTracker");

    /* renamed from: a  reason: collision with root package name */
    final b f14625a;

    /* renamed from: b  reason: collision with root package name */
    private final l f14626b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Runnable> f14627c = new HashMap();

    /* renamed from: f4.a$a  reason: collision with other inner class name */
    /* compiled from: DelayedWorkTracker */
    class C0121a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f14628a;

        C0121a(p pVar) {
            this.f14628a = pVar;
        }

        public void run() {
            i.c().a(a.f14624d, String.format("Scheduling work %s", new Object[]{this.f14628a.f15493a}), new Throwable[0]);
            a.this.f14625a.e(this.f14628a);
        }
    }

    public a(b bVar, l lVar) {
        this.f14625a = bVar;
        this.f14626b = lVar;
    }

    public void a(p pVar) {
        Runnable remove = this.f14627c.remove(pVar.f15493a);
        if (remove != null) {
            this.f14626b.a(remove);
        }
        C0121a aVar = new C0121a(pVar);
        this.f14627c.put(pVar.f15493a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.f14626b.b(pVar.a() - currentTimeMillis, aVar);
    }

    public void b(String str) {
        Runnable remove = this.f14627c.remove(str);
        if (remove != null) {
            this.f14626b.a(remove);
        }
    }
}

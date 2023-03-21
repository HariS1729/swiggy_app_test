package j4;

import android.content.Context;
import d4.i;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintTracker */
public abstract class d<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f15274f = i.f("ConstraintTracker");

    /* renamed from: a  reason: collision with root package name */
    protected final n4.a f15275a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f15276b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f15277c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Set<h4.a<T>> f15278d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    T f15279e;

    /* compiled from: ConstraintTracker */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f15280a;

        a(List list) {
            this.f15280a = list;
        }

        public void run() {
            for (h4.a a11 : this.f15280a) {
                a11.a(d.this.f15279e);
            }
        }
    }

    d(Context context, n4.a aVar) {
        this.f15276b = context.getApplicationContext();
        this.f15275a = aVar;
    }

    public void a(h4.a<T> aVar) {
        synchronized (this.f15277c) {
            if (this.f15278d.add(aVar)) {
                if (this.f15278d.size() == 1) {
                    this.f15279e = b();
                    i.c().a(f15274f, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f15279e}), new Throwable[0]);
                    e();
                }
                aVar.a(this.f15279e);
            }
        }
    }

    public abstract T b();

    public void c(h4.a<T> aVar) {
        synchronized (this.f15277c) {
            if (this.f15278d.remove(aVar) && this.f15278d.isEmpty()) {
                f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f15277c
            monitor-enter(r0)
            T r1 = r3.f15279e     // Catch:{ all -> 0x002b }
            if (r1 == r4) goto L_0x0029
            if (r1 == 0) goto L_0x0010
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            r3.f15279e = r4     // Catch:{ all -> 0x002b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002b }
            java.util.Set<h4.a<T>> r1 = r3.f15278d     // Catch:{ all -> 0x002b }
            r4.<init>(r1)     // Catch:{ all -> 0x002b }
            n4.a r1 = r3.f15275a     // Catch:{ all -> 0x002b }
            java.util.concurrent.Executor r1 = r1.b()     // Catch:{ all -> 0x002b }
            j4.d$a r2 = new j4.d$a     // Catch:{ all -> 0x002b }
            r2.<init>(r4)     // Catch:{ all -> 0x002b }
            r1.execute(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.d.d(java.lang.Object):void");
    }

    public abstract void e();

    public abstract void f();
}

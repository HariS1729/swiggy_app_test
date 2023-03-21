package coil.disk;

import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
/* compiled from: DiskLruCache.kt */
final class DiskLruCache$launchCleanup$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f13542a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DiskLruCache f13543b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiskLruCache$launchCleanup$1(DiskLruCache diskLruCache, c<? super DiskLruCache$launchCleanup$1> cVar) {
        super(2, cVar);
        this.f13543b = diskLruCache;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new DiskLruCache$launchCleanup$1(this.f13543b, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((DiskLruCache$launchCleanup$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:9|10|11|12|13|14|15|(1:17)|20|21|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3.q = true;
        r3.f13520l = okio.u.c(okio.u.b());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x002c */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0022=Splitter:B:14:0x0022, B:23:0x003e=Splitter:B:23:0x003e, B:12:0x001f=Splitter:B:12:0x001f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            java.lang.Object unused = kotlin.coroutines.intrinsics.b.d()
            int r0 = r2.f13542a
            if (r0 != 0) goto L_0x0045
            bp0.g.b(r3)
            coil.disk.DiskLruCache r3 = r2.f13543b
            monitor-enter(r3)
            boolean r0 = r3.n     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003e
            boolean r0 = r3.f13522o     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x001a
            goto L_0x003e
        L_0x001a:
            r0 = 1
            r3.O0()     // Catch:{ IOException -> 0x001f }
            goto L_0x0022
        L_0x001f:
            r3.f13523p = r0     // Catch:{ all -> 0x0042 }
        L_0x0022:
            boolean r1 = r3.e0()     // Catch:{ IOException -> 0x002c }
            if (r1 == 0) goto L_0x003a
            r3.S0()     // Catch:{ IOException -> 0x002c }
            goto L_0x003a
        L_0x002c:
            r3.q = r0     // Catch:{ all -> 0x0042 }
            okio.f0 r0 = okio.u.b()     // Catch:{ all -> 0x0042 }
            okio.d r0 = okio.u.c(r0)     // Catch:{ all -> 0x0042 }
            r3.f13520l = r0     // Catch:{ all -> 0x0042 }
        L_0x003a:
            bp0.k r0 = bp0.k.f22762a     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return r0
        L_0x003e:
            bp0.k r0 = bp0.k.f22762a     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return r0
        L_0x0042:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0045:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.DiskLruCache$launchCleanup$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

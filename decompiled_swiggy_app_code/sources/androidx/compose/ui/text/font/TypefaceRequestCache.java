package androidx.compose.ui.text.font;

import t1.b;
import u1.l0;
import u1.m0;
import x1.k;
import x1.l;

/* compiled from: FontFamilyResolver.kt */
public final class TypefaceRequestCache {

    /* renamed from: a  reason: collision with root package name */
    private final l f7605a = k.a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b<l0, m0> f7606b = new b<>(16);

    public final l b() {
        return this.f7605a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r5 = (u1.m0) r5.invoke(new androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1(r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r0 = r3.f7605a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r3.f7606b.d(r4) != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r5.a() == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r3.f7606b.e(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        r4 = bp0.k.f22762a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        throw new java.lang.IllegalStateException("Could not load font", r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e0.d1<java.lang.Object> c(u1.l0 r4, lp0.l<? super lp0.l<? super u1.m0, bp0.k>, ? extends u1.m0> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "typefaceRequest"
            kotlin.jvm.internal.p.j(r4, r0)
            java.lang.String r0 = "resolveTypeface"
            kotlin.jvm.internal.p.j(r5, r0)
            x1.l r0 = r3.f7605a
            monitor-enter(r0)
            t1.b<u1.l0, u1.m0> r1 = r3.f7606b     // Catch:{ all -> 0x0059 }
            java.lang.Object r1 = r1.d(r4)     // Catch:{ all -> 0x0059 }
            u1.m0 r1 = (u1.m0) r1     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0027
            boolean r2 = r1.a()     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x001f
            monitor-exit(r0)
            return r1
        L_0x001f:
            t1.b<u1.l0, u1.m0> r1 = r3.f7606b     // Catch:{ all -> 0x0059 }
            java.lang.Object r1 = r1.f(r4)     // Catch:{ all -> 0x0059 }
            u1.m0 r1 = (u1.m0) r1     // Catch:{ all -> 0x0059 }
        L_0x0027:
            monitor-exit(r0)
            androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1 r0 = new androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1     // Catch:{ Exception -> 0x0050 }
            r0.<init>(r3, r4)     // Catch:{ Exception -> 0x0050 }
            java.lang.Object r5 = r5.invoke(r0)     // Catch:{ Exception -> 0x0050 }
            u1.m0 r5 = (u1.m0) r5     // Catch:{ Exception -> 0x0050 }
            x1.l r0 = r3.f7605a
            monitor-enter(r0)
            t1.b<u1.l0, u1.m0> r1 = r3.f7606b     // Catch:{ all -> 0x004d }
            java.lang.Object r1 = r1.d(r4)     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x0049
            boolean r1 = r5.a()     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0049
            t1.b<u1.l0, u1.m0> r1 = r3.f7606b     // Catch:{ all -> 0x004d }
            r1.e(r4, r5)     // Catch:{ all -> 0x004d }
        L_0x0049:
            bp0.k r4 = bp0.k.f22762a     // Catch:{ all -> 0x004d }
            monitor-exit(r0)
            return r5
        L_0x004d:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L_0x0050:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not load font"
            r5.<init>(r0, r4)
            throw r5
        L_0x0059:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.TypefaceRequestCache.c(u1.l0, lp0.l):e0.d1");
    }
}

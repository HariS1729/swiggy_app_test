package androidx.compose.ui.text.font;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t1.c;
import u1.a0;
import u1.h;
import x1.k;
import x1.l;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
public final class AsyncTypefaceCache {

    /* renamed from: a  reason: collision with root package name */
    private final Object f7576a = a.b((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final t1.b<b, a> f7577b = new t1.b<>(16);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final c<b, a> f7578c = new c<>(0, 1, (i) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final l f7579d = k.a();

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f7580a;

        private /* synthetic */ a(Object obj) {
            this.f7580a = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public static Object b(Object obj) {
            return obj;
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && p.e(obj, ((a) obj2).g());
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean e(Object obj) {
            return obj == null;
        }

        public static String f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f7580a, obj);
        }

        public final /* synthetic */ Object g() {
            return this.f7580a;
        }

        public int hashCode() {
            return d(this.f7580a);
        }

        public String toString() {
            return f(this.f7580a);
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final h f7581a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f7582b;

        public b(h hVar, Object obj) {
            p.j(hVar, "font");
            this.f7581a = hVar;
            this.f7582b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p.e(this.f7581a, bVar.f7581a) && p.e(this.f7582b, bVar.f7582b);
        }

        public int hashCode() {
            int hashCode = this.f7581a.hashCode() * 31;
            Object obj = this.f7582b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.f7581a + ", loaderKey=" + this.f7582b + ')';
        }
    }

    public static /* synthetic */ void f(AsyncTypefaceCache asyncTypefaceCache, h hVar, a0 a0Var, Object obj, boolean z11, int i11, Object obj2) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        asyncTypefaceCache.e(hVar, a0Var, obj, z11);
    }

    public final a d(h hVar, a0 a0Var) {
        a d11;
        p.j(hVar, "font");
        p.j(a0Var, "platformFontLoader");
        b bVar = new b(hVar, a0Var.a());
        synchronized (this.f7579d) {
            d11 = this.f7577b.d(bVar);
            if (d11 == null) {
                d11 = this.f7578c.b(bVar);
            }
        }
        return d11;
    }

    public final void e(h hVar, a0 a0Var, Object obj, boolean z11) {
        p.j(hVar, "font");
        p.j(a0Var, "platformFontLoader");
        b bVar = new b(hVar, a0Var.a());
        synchronized (this.f7579d) {
            if (obj == null) {
                try {
                    a h11 = this.f7578c.h(bVar, a.a(this.f7576a));
                } catch (Throwable th2) {
                    throw th2;
                }
            } else if (z11) {
                a h12 = this.f7578c.h(bVar, a.a(a.b(obj)));
            } else {
                a e11 = this.f7577b.e(bVar, a.a(a.b(obj)));
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public final java.lang.Object g(u1.h r6, u1.a0 r7, boolean r8, lp0.l<? super fp0.c<java.lang.Object>, ? extends java.lang.Object> r9, fp0.c<java.lang.Object> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1) r0
            int r1 = r0.f7588f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7588f = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r5, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f7586d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f7588f
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            boolean r8 = r0.f7585c
            java.lang.Object r6 = r0.f7584b
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r6 = (androidx.compose.ui.text.font.AsyncTypefaceCache.b) r6
            java.lang.Object r7 = r0.f7583a
            androidx.compose.ui.text.font.AsyncTypefaceCache r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache) r7
            bp0.g.b(r10)
            goto L_0x007a
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            bp0.g.b(r10)
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r10 = new androidx.compose.ui.text.font.AsyncTypefaceCache$b
            java.lang.Object r7 = r7.a()
            r10.<init>(r6, r7)
            x1.l r6 = r5.f7579d
            monitor-enter(r6)
            t1.b<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r7 = r5.f7577b     // Catch:{ all -> 0x00b0 }
            java.lang.Object r7 = r7.d(r10)     // Catch:{ all -> 0x00b0 }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache.a) r7     // Catch:{ all -> 0x00b0 }
            if (r7 != 0) goto L_0x005c
            t1.c<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r7 = r5.f7578c     // Catch:{ all -> 0x00b0 }
            java.lang.Object r7 = r7.b(r10)     // Catch:{ all -> 0x00b0 }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache.a) r7     // Catch:{ all -> 0x00b0 }
        L_0x005c:
            if (r7 == 0) goto L_0x0064
            java.lang.Object r7 = r7.g()     // Catch:{ all -> 0x00b0 }
            monitor-exit(r6)
            return r7
        L_0x0064:
            bp0.k r7 = bp0.k.f22762a     // Catch:{ all -> 0x00b0 }
            monitor-exit(r6)
            r0.f7583a = r5
            r0.f7584b = r10
            r0.f7585c = r8
            r0.f7588f = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L_0x007a:
            x1.l r9 = r7.f7579d
            monitor-enter(r9)
            if (r10 != 0) goto L_0x008d
            t1.c<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r8 = r7.f7578c     // Catch:{ all -> 0x008b }
            java.lang.Object r7 = r7.f7576a     // Catch:{ all -> 0x008b }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r7 = androidx.compose.ui.text.font.AsyncTypefaceCache.a.a(r7)     // Catch:{ all -> 0x008b }
            r8.h(r6, r7)     // Catch:{ all -> 0x008b }
            goto L_0x00aa
        L_0x008b:
            r6 = move-exception
            goto L_0x00ae
        L_0x008d:
            if (r8 == 0) goto L_0x009d
            t1.c<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r7 = r7.f7578c     // Catch:{ all -> 0x008b }
            java.lang.Object r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.a.b(r10)     // Catch:{ all -> 0x008b }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.a.a(r8)     // Catch:{ all -> 0x008b }
            r7.h(r6, r8)     // Catch:{ all -> 0x008b }
            goto L_0x00aa
        L_0x009d:
            t1.b<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r7 = r7.f7577b     // Catch:{ all -> 0x008b }
            java.lang.Object r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.a.b(r10)     // Catch:{ all -> 0x008b }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.a.a(r8)     // Catch:{ all -> 0x008b }
            r7.e(r6, r8)     // Catch:{ all -> 0x008b }
        L_0x00aa:
            bp0.k r6 = bp0.k.f22762a     // Catch:{ all -> 0x008b }
            monitor-exit(r9)
            return r10
        L_0x00ae:
            monitor-exit(r9)
            throw r6
        L_0x00b0:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncTypefaceCache.g(u1.h, u1.a0, boolean, lp0.l, fp0.c):java.lang.Object");
    }
}

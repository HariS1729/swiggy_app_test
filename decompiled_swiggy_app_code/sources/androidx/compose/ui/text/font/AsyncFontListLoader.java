package androidx.compose.ui.text.font;

import bp0.k;
import e0.a1;
import e0.d1;
import e0.h0;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.l;
import u1.a0;
import u1.h;
import u1.l0;
import u1.m0;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
public final class AsyncFontListLoader implements d1<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final List<h> f7551a;

    /* renamed from: b  reason: collision with root package name */
    private final l0 f7552b;

    /* renamed from: c  reason: collision with root package name */
    private final AsyncTypefaceCache f7553c;

    /* renamed from: d  reason: collision with root package name */
    private final l<m0.b, k> f7554d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final a0 f7555e;

    /* renamed from: f  reason: collision with root package name */
    private final h0 f7556f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7557g = true;

    public AsyncFontListLoader(List<? extends h> list, Object obj, l0 l0Var, AsyncTypefaceCache asyncTypefaceCache, l<? super m0.b, k> lVar, a0 a0Var) {
        p.j(list, "fontList");
        p.j(obj, "initialType");
        p.j(l0Var, "typefaceRequest");
        p.j(asyncTypefaceCache, "asyncTypefaceCache");
        p.j(lVar, "onCompletion");
        p.j(a0Var, "platformFontLoader");
        this.f7551a = list;
        this.f7552b = l0Var;
        this.f7553c = asyncTypefaceCache;
        this.f7554d = lVar;
        this.f7555e = a0Var;
        this.f7556f = j.e(obj, (a1) null, 2, (Object) null);
    }

    private void setValue(Object obj) {
        this.f7556f.setValue(obj);
    }

    public final boolean f() {
        return this.f7557g;
    }

    public Object getValue() {
        return this.f7556f.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075 A[SYNTHETIC, Splitter:B:27:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef A[SYNTHETIC, Splitter:B:38:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(fp0.c<? super bp0.k> r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            boolean r2 = r0 instanceof androidx.compose.ui.text.font.AsyncFontListLoader$load$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            androidx.compose.ui.text.font.AsyncFontListLoader$load$1 r2 = (androidx.compose.ui.text.font.AsyncFontListLoader$load$1) r2
            int r3 = r2.f7565h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f7565h = r3
            goto L_0x001c
        L_0x0017:
            androidx.compose.ui.text.font.AsyncFontListLoader$load$1 r2 = new androidx.compose.ui.text.font.AsyncFontListLoader$load$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f7563f
            java.lang.Object r3 = kotlin.coroutines.intrinsics.b.d()
            int r4 = r2.f7565h
            r5 = 0
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0068
            if (r4 == r7) goto L_0x004a
            if (r4 != r6) goto L_0x0042
            int r4 = r2.f7562e
            int r9 = r2.f7561d
            java.lang.Object r10 = r2.f7559b
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r2.f7558a
            androidx.compose.ui.text.font.AsyncFontListLoader r11 = (androidx.compose.ui.text.font.AsyncFontListLoader) r11
            bp0.g.b(r0)     // Catch:{ all -> 0x003f }
            goto L_0x0103
        L_0x003f:
            r0 = move-exception
            goto L_0x012c
        L_0x0042:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004a:
            int r4 = r2.f7562e
            int r9 = r2.f7561d
            java.lang.Object r10 = r2.f7560c
            u1.h r10 = (u1.h) r10
            java.lang.Object r11 = r2.f7559b
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r2.f7558a
            androidx.compose.ui.text.font.AsyncFontListLoader r12 = (androidx.compose.ui.text.font.AsyncFontListLoader) r12
            bp0.g.b(r0)     // Catch:{ all -> 0x0064 }
            r15 = r12
            r18 = r11
            r11 = r10
            r10 = r18
            goto L_0x00b9
        L_0x0064:
            r0 = move-exception
            r11 = r12
            goto L_0x012c
        L_0x0068:
            bp0.g.b(r0)
            java.util.List<u1.h> r0 = r1.f7551a     // Catch:{ all -> 0x012a }
            int r4 = r0.size()     // Catch:{ all -> 0x012a }
            r15 = r1
            r14 = 0
        L_0x0073:
            if (r14 >= r4) goto L_0x010f
            java.lang.Object r9 = r0.get(r14)     // Catch:{ all -> 0x0107 }
            r13 = r9
            u1.h r13 = (u1.h) r13     // Catch:{ all -> 0x0107 }
            int r9 = r13.b()     // Catch:{ all -> 0x0107 }
            u1.q$a r10 = u1.q.f16935a     // Catch:{ all -> 0x0107 }
            int r10 = r10.a()     // Catch:{ all -> 0x0107 }
            boolean r9 = u1.q.e(r9, r10)     // Catch:{ all -> 0x0107 }
            if (r9 == 0) goto L_0x010a
            androidx.compose.ui.text.font.AsyncTypefaceCache r9 = r15.f7553c     // Catch:{ all -> 0x0107 }
            u1.a0 r11 = r15.f7555e     // Catch:{ all -> 0x0107 }
            r12 = 0
            androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1 r10 = new androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1     // Catch:{ all -> 0x0107 }
            r10.<init>(r15, r13, r5)     // Catch:{ all -> 0x0107 }
            r2.f7558a = r15     // Catch:{ all -> 0x0107 }
            r2.f7559b = r0     // Catch:{ all -> 0x0107 }
            r2.f7560c = r13     // Catch:{ all -> 0x0107 }
            r2.f7561d = r14     // Catch:{ all -> 0x0107 }
            r2.f7562e = r4     // Catch:{ all -> 0x0107 }
            r2.f7565h = r7     // Catch:{ all -> 0x0107 }
            r16 = r10
            r10 = r13
            r17 = r13
            r13 = r16
            r16 = r14
            r14 = r2
            java.lang.Object r9 = r9.g(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0107 }
            if (r9 != r3) goto L_0x00b3
            return r3
        L_0x00b3:
            r10 = r0
            r0 = r9
            r9 = r16
            r11 = r17
        L_0x00b9:
            if (r0 == 0) goto L_0x00ef
            u1.l0 r3 = r15.f7552b     // Catch:{ all -> 0x0107 }
            int r3 = r3.e()     // Catch:{ all -> 0x0107 }
            u1.l0 r4 = r15.f7552b     // Catch:{ all -> 0x0107 }
            u1.v r4 = r4.f()     // Catch:{ all -> 0x0107 }
            u1.l0 r5 = r15.f7552b     // Catch:{ all -> 0x0107 }
            int r5 = r5.d()     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = u1.u.a(r3, r0, r11, r4, r5)     // Catch:{ all -> 0x0107 }
            r15.setValue(r0)     // Catch:{ all -> 0x0107 }
            bp0.k r0 = bp0.k.f22762a     // Catch:{ all -> 0x0107 }
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            boolean r2 = wp0.n1.m(r2)
            r15.f7557g = r8
            lp0.l<u1.m0$b, bp0.k> r3 = r15.f7554d
            u1.m0$b r4 = new u1.m0$b
            java.lang.Object r5 = r15.getValue()
            r4.<init>(r5, r2)
            r3.invoke(r4)
            return r0
        L_0x00ef:
            r2.f7558a = r15     // Catch:{ all -> 0x0107 }
            r2.f7559b = r10     // Catch:{ all -> 0x0107 }
            r2.f7560c = r5     // Catch:{ all -> 0x0107 }
            r2.f7561d = r9     // Catch:{ all -> 0x0107 }
            r2.f7562e = r4     // Catch:{ all -> 0x0107 }
            r2.f7565h = r6     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = wp0.i2.a(r2)     // Catch:{ all -> 0x0107 }
            if (r0 != r3) goto L_0x0102
            return r3
        L_0x0102:
            r11 = r15
        L_0x0103:
            r14 = r9
            r0 = r10
            r15 = r11
            goto L_0x010c
        L_0x0107:
            r0 = move-exception
            r11 = r15
            goto L_0x012c
        L_0x010a:
            r16 = r14
        L_0x010c:
            int r14 = r14 + r7
            goto L_0x0073
        L_0x010f:
            kotlin.coroutines.CoroutineContext r0 = r2.getContext()
            boolean r0 = wp0.n1.m(r0)
            r15.f7557g = r8
            lp0.l<u1.m0$b, bp0.k> r2 = r15.f7554d
            u1.m0$b r3 = new u1.m0$b
            java.lang.Object r4 = r15.getValue()
            r3.<init>(r4, r0)
            r2.invoke(r3)
            bp0.k r0 = bp0.k.f22762a
            return r0
        L_0x012a:
            r0 = move-exception
            r11 = r1
        L_0x012c:
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            boolean r2 = wp0.n1.m(r2)
            r11.f7557g = r8
            lp0.l<u1.m0$b, bp0.k> r3 = r11.f7554d
            u1.m0$b r4 = new u1.m0$b
            java.lang.Object r5 = r11.getValue()
            r4.<init>(r5, r2)
            r3.invoke(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.k(fp0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(u1.h r8, fp0.c<java.lang.Object> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.f7572d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7572d = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f7570b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f7572d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r8 = r0.f7569a
            u1.h r8 = (u1.h) r8
            bp0.g.b(r9)     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            goto L_0x004b
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            bp0.g.b(r9)
            r5 = 15000(0x3a98, double:7.411E-320)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r9 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            r9.<init>(r7, r8, r4)     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            r0.f7569a = r8     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            r0.f7572d = r3     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            java.lang.Object r9 = kotlinx.coroutines.TimeoutKt.d(r5, r9, r0)     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            if (r9 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r4 = r9
            goto L_0x0085
        L_0x004d:
            r9 = move-exception
            kotlin.coroutines.CoroutineContext r1 = r0.getContext()
            wp0.g0$a r2 = wp0.g0.f29464k0
            kotlin.coroutines.CoroutineContext$a r1 = r1.get(r2)
            wp0.g0 r1 = (wp0.g0) r1
            if (r1 == 0) goto L_0x0085
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            r2.<init>(r8, r9)
            r1.handleException(r0, r2)
            goto L_0x0085
        L_0x007a:
            r8 = move-exception
            kotlin.coroutines.CoroutineContext r9 = r0.getContext()
            boolean r9 = wp0.n1.m(r9)
            if (r9 == 0) goto L_0x0086
        L_0x0085:
            return r4
        L_0x0086:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.n(u1.h, fp0.c):java.lang.Object");
    }
}

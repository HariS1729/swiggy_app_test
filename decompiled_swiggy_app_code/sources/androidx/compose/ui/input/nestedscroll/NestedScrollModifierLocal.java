package androidx.compose.ui.input.nestedscroll;

import e0.a1;
import e0.h0;
import j1.b;
import j1.d;
import j1.e;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;
import p0.c;
import t0.f;
import wp0.j0;

/* compiled from: NestedScrollModifierLocal.kt */
public final class NestedScrollModifierLocal implements b, d<NestedScrollModifierLocal>, e1.b {

    /* renamed from: a  reason: collision with root package name */
    private final NestedScrollDispatcher f6617a;

    /* renamed from: b  reason: collision with root package name */
    private final e1.b f6618b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f6619c = j.e((Object) null, (a1) null, 2, (Object) null);

    public NestedScrollModifierLocal(NestedScrollDispatcher nestedScrollDispatcher, e1.b bVar) {
        p.j(nestedScrollDispatcher, "dispatcher");
        p.j(bVar, "connection");
        this.f6617a = nestedScrollDispatcher;
        this.f6618b = bVar;
        nestedScrollDispatcher.g(new a<j0>(this) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ NestedScrollModifierLocal f6620a;

            {
                this.f6620a = r1;
            }

            /* renamed from: a */
            public final j0 invoke() {
                return this.f6620a.g();
            }
        });
    }

    /* access modifiers changed from: private */
    public final j0 g() {
        j0 j0Var;
        NestedScrollModifierLocal h11 = h();
        if ((h11 != null && (j0Var = h11.g()) != null) || (j0Var = this.f6617a.f()) != null) {
            return j0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    private final NestedScrollModifierLocal h() {
        return (NestedScrollModifierLocal) this.f6619c.getValue();
    }

    private final void j(NestedScrollModifierLocal nestedScrollModifierLocal) {
        this.f6619c.setValue(nestedScrollModifierLocal);
    }

    public void D(e eVar) {
        p.j(eVar, "scope");
        j((NestedScrollModifierLocal) eVar.a(NestedScrollModifierLocalKt.a()));
        this.f6617a.i(h());
    }

    public /* synthetic */ p0.d N(p0.d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public long a(long j, long j11, int i11) {
        long j12;
        long a11 = this.f6618b.a(j, j11, i11);
        NestedScrollModifierLocal h11 = h();
        if (h11 != null) {
            j12 = h11.a(f.r(j, a11), f.q(j11, a11), i11);
        } else {
            j12 = f.f16662b.c();
        }
        return f.r(a11, j12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(long r9, fp0.c<? super d2.u> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1) r0
            int r1 = r0.f6631e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6631e = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f6629c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f6631e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            long r9 = r0.f6628b
            bp0.g.b(r11)
            goto L_0x007c
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            long r9 = r0.f6628b
            java.lang.Object r2 = r0.f6627a
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal) r2
            bp0.g.b(r11)
            goto L_0x0057
        L_0x0040:
            bp0.g.b(r11)
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r11 = r8.h()
            if (r11 == 0) goto L_0x005e
            r0.f6627a = r8
            r0.f6628b = r9
            r0.f6631e = r4
            java.lang.Object r11 = r11.c(r9, r0)
            if (r11 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r2 = r8
        L_0x0057:
            d2.u r11 = (d2.u) r11
            long r4 = r11.n()
            goto L_0x0065
        L_0x005e:
            d2.u$a r11 = d2.u.f14031b
            long r4 = r11.a()
            r2 = r8
        L_0x0065:
            r6 = r9
            r9 = r4
            r4 = r6
            e1.b r11 = r2.f6618b
            long r4 = d2.u.k(r4, r9)
            r2 = 0
            r0.f6627a = r2
            r0.f6628b = r9
            r0.f6631e = r3
            java.lang.Object r11 = r11.c(r4, r0)
            if (r11 != r1) goto L_0x007c
            return r1
        L_0x007c:
            d2.u r11 = (d2.u) r11
            long r0 = r11.n()
            long r9 = d2.u.l(r9, r0)
            d2.u r9 = d2.u.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.c(long, fp0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(long r16, long r18, fp0.c<? super d2.u> r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1 r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1) r2
            int r3 = r2.f6626f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.f6626f = r3
            goto L_0x001b
        L_0x0016:
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1 r2 = new androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.f6624d
            java.lang.Object r9 = kotlin.coroutines.intrinsics.b.d()
            int r3 = r2.f6626f
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0047
            if (r3 == r4) goto L_0x0039
            if (r3 != r10) goto L_0x0031
            long r2 = r2.f6622b
            bp0.g.b(r1)
            goto L_0x008c
        L_0x0031:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0039:
            long r3 = r2.f6623c
            long r5 = r2.f6622b
            java.lang.Object r7 = r2.f6621a
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r7 = (androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal) r7
            bp0.g.b(r1)
            r13 = r3
            r11 = r5
            goto L_0x0065
        L_0x0047:
            bp0.g.b(r1)
            e1.b r3 = r0.f6618b
            r2.f6621a = r0
            r11 = r16
            r2.f6622b = r11
            r13 = r18
            r2.f6623c = r13
            r2.f6626f = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.d(r4, r6, r8)
            if (r1 != r9) goto L_0x0064
            return r9
        L_0x0064:
            r7 = r0
        L_0x0065:
            d2.u r1 = (d2.u) r1
            long r4 = r1.n()
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r3 = r7.h()
            if (r3 == 0) goto L_0x0094
            long r6 = d2.u.l(r11, r4)
            long r11 = d2.u.k(r13, r4)
            r1 = 0
            r2.f6621a = r1
            r2.f6622b = r4
            r2.f6626f = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.d(r4, r6, r8)
            if (r1 != r9) goto L_0x008b
            return r9
        L_0x008b:
            r2 = r13
        L_0x008c:
            d2.u r1 = (d2.u) r1
            long r4 = r1.n()
            r13 = r2
            goto L_0x009b
        L_0x0094:
            r13 = r4
            d2.u$a r1 = d2.u.f14031b
            long r4 = r1.a()
        L_0x009b:
            long r1 = d2.u.l(r13, r4)
            d2.u r1 = d2.u.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.d(long, long, fp0.c):java.lang.Object");
    }

    public long e(long j, int i11) {
        NestedScrollModifierLocal h11 = h();
        long e11 = h11 != null ? h11.e(j, i11) : f.f16662b.c();
        return f.r(e11, this.f6618b.e(f.q(j, e11), i11));
    }

    public j1.f<NestedScrollModifierLocal> getKey() {
        return NestedScrollModifierLocalKt.a();
    }

    /* renamed from: i */
    public NestedScrollModifierLocal getValue() {
        return this;
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }
}

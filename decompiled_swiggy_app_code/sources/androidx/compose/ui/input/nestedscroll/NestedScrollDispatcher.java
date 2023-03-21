package androidx.compose.ui.input.nestedscroll;

import e1.b;
import kotlin.jvm.internal.p;
import lp0.a;
import t0.f;
import wp0.j0;

/* compiled from: NestedScrollModifier.kt */
public final class NestedScrollDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private a<? extends j0> f6603a = new NestedScrollDispatcher$calculateNestedScrollScope$1(this);

    /* renamed from: b  reason: collision with root package name */
    private j0 f6604b;

    /* renamed from: c  reason: collision with root package name */
    private b f6605c;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r8, long r10, fp0.c<? super d2.u> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.f6609c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6609c = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r7, r12)
        L_0x0018:
            r6 = r0
            java.lang.Object r12 = r6.f6607a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r6.f6609c
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            bp0.g.b(r12)
            goto L_0x0044
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            bp0.g.b(r12)
            e1.b r1 = r7.f6605c
            if (r1 == 0) goto L_0x004b
            r6.f6609c = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.d(r2, r4, r6)
            if (r12 != r0) goto L_0x0044
            return r0
        L_0x0044:
            d2.u r12 = (d2.u) r12
            long r8 = r12.n()
            goto L_0x0051
        L_0x004b:
            d2.u$a r8 = d2.u.f14031b
            long r8 = r8.a()
        L_0x0051:
            d2.u r8 = d2.u.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.a(long, long, fp0.c):java.lang.Object");
    }

    public final long b(long j, long j11, int i11) {
        b bVar = this.f6605c;
        return bVar != null ? bVar.a(j, j11, i11) : f.f16662b.c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(long r5, fp0.c<? super d2.u> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.f6612c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6612c = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f6610a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f6612c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            bp0.g.b(r7)
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            bp0.g.b(r7)
            e1.b r7 = r4.f6605c
            if (r7 == 0) goto L_0x0048
            r0.f6612c = r3
            java.lang.Object r7 = r7.c(r5, r0)
            if (r7 != r1) goto L_0x0041
            return r1
        L_0x0041:
            d2.u r7 = (d2.u) r7
            long r5 = r7.n()
            goto L_0x004e
        L_0x0048:
            d2.u$a r5 = d2.u.f14031b
            long r5 = r5.a()
        L_0x004e:
            d2.u r5 = d2.u.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.c(long, fp0.c):java.lang.Object");
    }

    public final long d(long j, int i11) {
        b bVar = this.f6605c;
        return bVar != null ? bVar.e(j, i11) : f.f16662b.c();
    }

    public final j0 e() {
        j0 j0Var = (j0) this.f6603a.invoke();
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final j0 f() {
        return this.f6604b;
    }

    public final void g(a<? extends j0> aVar) {
        p.j(aVar, "<set-?>");
        this.f6603a = aVar;
    }

    public final void h(j0 j0Var) {
        this.f6604b = j0Var;
    }

    public final void i(b bVar) {
        this.f6605c = bVar;
    }
}

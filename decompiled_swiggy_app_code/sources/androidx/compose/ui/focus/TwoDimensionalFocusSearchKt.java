package androidx.compose.ui.focus;

import f0.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;
import lp0.l;
import s0.b;
import s0.t;
import t0.h;

/* compiled from: TwoDimensionalFocusSearch.kt */
public final class TwoDimensionalFocusSearchKt {

    /* compiled from: TwoDimensionalFocusSearch.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6406a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 2;
            iArr[FocusStateImpl.Active.ordinal()] = 3;
            iArr[FocusStateImpl.Captured.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f6406a = iArr;
        }
    }

    private static final FocusModifier b(FocusModifier focusModifier) {
        if (focusModifier.i() == FocusStateImpl.ActiveParent || focusModifier.i() == FocusStateImpl.DeactivatedParent) {
            FocusModifier b11 = t.b(focusModifier);
            if (b11 != null) {
                return b11;
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private static final boolean c(h hVar, h hVar2, h hVar3, int i11) {
        if (d(hVar3, i11, hVar) || !d(hVar2, i11, hVar)) {
            return false;
        }
        if (e(hVar3, i11, hVar)) {
            b.a aVar = b.f16557b;
            if (b.l(i11, aVar.c()) || b.l(i11, aVar.g()) || f(hVar2, i11, hVar) < g(hVar3, i11, hVar)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean d(t0.h r4, int r5, t0.h r6) {
        /*
            s0.b$a r0 = s0.b.f16557b
            int r1 = r0.c()
            boolean r1 = s0.b.l(r5, r1)
            r2 = 1
            if (r1 == 0) goto L_0x000f
            r1 = 1
            goto L_0x0017
        L_0x000f:
            int r1 = r0.g()
            boolean r1 = s0.b.l(r5, r1)
        L_0x0017:
            r3 = 0
            if (r1 == 0) goto L_0x0035
            float r5 = r4.e()
            float r0 = r6.l()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x0033
            float r4 = r4.l()
            float r5 = r6.e()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0033
            goto L_0x0063
        L_0x0033:
            r2 = 0
            goto L_0x0063
        L_0x0035:
            int r1 = r0.h()
            boolean r1 = s0.b.l(r5, r1)
            if (r1 == 0) goto L_0x0041
            r5 = 1
            goto L_0x0049
        L_0x0041:
            int r0 = r0.a()
            boolean r5 = s0.b.l(r5, r0)
        L_0x0049:
            if (r5 == 0) goto L_0x0064
            float r5 = r4.j()
            float r0 = r6.i()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x0033
            float r4 = r4.i()
            float r5 = r6.j()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0033
        L_0x0063:
            return r2
        L_0x0064:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "This function should only be used for 2-D focus search"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.d(t0.h, int, t0.h):boolean");
    }

    private static final boolean e(h hVar, int i11, h hVar2) {
        b.a aVar = b.f16557b;
        if (b.l(i11, aVar.c())) {
            if (hVar2.i() >= hVar.j()) {
                return true;
            }
        } else if (b.l(i11, aVar.g())) {
            if (hVar2.j() <= hVar.i()) {
                return true;
            }
        } else if (b.l(i11, aVar.h())) {
            if (hVar2.l() >= hVar.e()) {
                return true;
            }
        } else if (!b.l(i11, aVar.a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        } else if (hVar2.e() <= hVar.l()) {
            return true;
        }
        return false;
    }

    private static final float f(h hVar, int i11, h hVar2) {
        float f11;
        float l11;
        float e11;
        float l12;
        float e12;
        b.a aVar = b.f16557b;
        if (b.l(i11, aVar.c())) {
            l12 = hVar2.i();
            e12 = hVar.j();
        } else {
            if (b.l(i11, aVar.g())) {
                l11 = hVar.i();
                e11 = hVar2.j();
            } else if (b.l(i11, aVar.h())) {
                l12 = hVar2.l();
                e12 = hVar.e();
            } else if (b.l(i11, aVar.a())) {
                l11 = hVar.l();
                e11 = hVar2.e();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f11 = l11 - e11;
            return Math.max(0.0f, f11);
        }
        f11 = l12 - e12;
        return Math.max(0.0f, f11);
    }

    private static final float g(h hVar, int i11, h hVar2) {
        float f11;
        float e11;
        float e12;
        float l11;
        float l12;
        b.a aVar = b.f16557b;
        if (b.l(i11, aVar.c())) {
            l11 = hVar2.i();
            l12 = hVar.i();
        } else {
            if (b.l(i11, aVar.g())) {
                e11 = hVar.j();
                e12 = hVar2.j();
            } else if (b.l(i11, aVar.h())) {
                l11 = hVar2.l();
                l12 = hVar.l();
            } else if (b.l(i11, aVar.a())) {
                e11 = hVar.e();
                e12 = hVar2.e();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f11 = e11 - e12;
            return Math.max(1.0f, f11);
        }
        f11 = l11 - l12;
        return Math.max(1.0f, f11);
    }

    private static final h h(h hVar) {
        return new h(hVar.j(), hVar.e(), hVar.j(), hVar.e());
    }

    private static final FocusModifier i(e<FocusModifier> eVar, h hVar, int i11) {
        h hVar2;
        b.a aVar = b.f16557b;
        if (b.l(i11, aVar.c())) {
            hVar2 = hVar.q(hVar.n() + ((float) 1), 0.0f);
        } else if (b.l(i11, aVar.g())) {
            hVar2 = hVar.q(-(hVar.n() + ((float) 1)), 0.0f);
        } else if (b.l(i11, aVar.h())) {
            hVar2 = hVar.q(0.0f, hVar.h() + ((float) 1));
        } else if (b.l(i11, aVar.a())) {
            hVar2 = hVar.q(0.0f, -(hVar.h() + ((float) 1)));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        FocusModifier focusModifier = null;
        int m11 = eVar.m();
        if (m11 > 0) {
            int i12 = 0;
            Object[] l11 = eVar.l();
            do {
                FocusModifier focusModifier2 = (FocusModifier) l11[i12];
                if (t.g(focusModifier2)) {
                    h e11 = t.e(focusModifier2);
                    if (k(e11, hVar2, hVar, i11)) {
                        focusModifier = focusModifier2;
                        hVar2 = e11;
                    }
                }
                i12++;
            } while (i12 < m11);
        }
        return focusModifier;
    }

    private static final boolean j(FocusModifier focusModifier, FocusModifier focusModifier2, int i11, l<? super FocusModifier, Boolean> lVar) {
        if (p(focusModifier, focusModifier2, i11, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) s0.a.a(focusModifier, i11, new TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(focusModifier, focusModifier2, i11, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean k(h hVar, h hVar2, h hVar3, int i11) {
        if (l(hVar, i11, hVar3)) {
            if (!l(hVar2, i11, hVar3) || c(hVar3, hVar, hVar2, i11)) {
                return true;
            }
            if (!c(hVar3, hVar2, hVar, i11) && o(i11, hVar3, hVar) < o(i11, hVar3, hVar2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean l(h hVar, int i11, h hVar2) {
        b.a aVar = b.f16557b;
        if (b.l(i11, aVar.c())) {
            if ((hVar2.j() > hVar.j() || hVar2.i() >= hVar.j()) && hVar2.i() > hVar.i()) {
                return true;
            }
        } else if (b.l(i11, aVar.g())) {
            if ((hVar2.i() < hVar.i() || hVar2.j() <= hVar.i()) && hVar2.j() < hVar.j()) {
                return true;
            }
        } else if (b.l(i11, aVar.h())) {
            if ((hVar2.e() > hVar.e() || hVar2.l() >= hVar.e()) && hVar2.l() > hVar.l()) {
                return true;
            }
        } else if (!b.l(i11, aVar.a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        } else if ((hVar2.l() < hVar.l() || hVar2.e() <= hVar.l()) && hVar2.e() < hVar.e()) {
            return true;
        }
        return false;
    }

    private static final float m(h hVar, int i11, h hVar2) {
        float f11;
        float l11;
        float e11;
        float l12;
        float e12;
        b.a aVar = b.f16557b;
        if (b.l(i11, aVar.c())) {
            l12 = hVar2.i();
            e12 = hVar.j();
        } else {
            if (b.l(i11, aVar.g())) {
                l11 = hVar.i();
                e11 = hVar2.j();
            } else if (b.l(i11, aVar.h())) {
                l12 = hVar2.l();
                e12 = hVar.e();
            } else if (b.l(i11, aVar.a())) {
                l11 = hVar.l();
                e11 = hVar2.e();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f11 = l11 - e11;
            return Math.max(0.0f, f11);
        }
        f11 = l12 - e12;
        return Math.max(0.0f, f11);
    }

    private static final float n(h hVar, int i11, h hVar2) {
        float f11;
        float i12;
        float i13;
        float n;
        b.a aVar = b.f16557b;
        boolean z11 = true;
        if (b.l(i11, aVar.c()) ? true : b.l(i11, aVar.g())) {
            f11 = (float) 2;
            i12 = hVar2.l() + (hVar2.h() / f11);
            i13 = hVar.l();
            n = hVar.h();
        } else {
            if (!b.l(i11, aVar.h())) {
                z11 = b.l(i11, aVar.a());
            }
            if (z11) {
                f11 = (float) 2;
                i12 = hVar2.i() + (hVar2.n() / f11);
                i13 = hVar.i();
                n = hVar.n();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        return i12 - (i13 + (n / f11));
    }

    private static final long o(int i11, h hVar, h hVar2) {
        long abs = (long) Math.abs(m(hVar2, i11, hVar));
        long abs2 = (long) Math.abs(n(hVar2, i11, hVar));
        return (((long) 13) * abs * abs) + (abs2 * abs2);
    }

    /* access modifiers changed from: private */
    public static final boolean p(FocusModifier focusModifier, FocusModifier focusModifier2, int i11, l<? super FocusModifier, Boolean> lVar) {
        FocusModifier i12;
        e eVar = new e(new FocusModifier[focusModifier.e().m()], 0);
        eVar.c(eVar.m(), focusModifier.e());
        while (eVar.p() && (i12 = i(eVar, t.e(focusModifier2), i11)) != null) {
            if (!i12.i().isDeactivated()) {
                return lVar.invoke(i12).booleanValue();
            }
            if (j(i12, focusModifier2, i11, lVar)) {
                return true;
            }
            eVar.r(i12);
        }
        return false;
    }

    private static final h q(h hVar) {
        return new h(hVar.i(), hVar.l(), hVar.i(), hVar.l());
    }

    public static final boolean r(FocusModifier focusModifier, int i11, l<? super FocusModifier, Boolean> lVar) {
        h hVar;
        Object obj;
        p.j(focusModifier, "$this$twoDimensionalFocusSearch");
        p.j(lVar, "onFound");
        FocusStateImpl i12 = focusModifier.i();
        int[] iArr = a.f6406a;
        boolean z11 = true;
        switch (iArr[i12.ordinal()]) {
            case 1:
            case 2:
                FocusModifier j = focusModifier.j();
                if (j != null) {
                    switch (iArr[j.i().ordinal()]) {
                        case 1:
                        case 2:
                            if (r(j, i11, lVar) || j(focusModifier, b(j), i11, lVar)) {
                                return true;
                            }
                            return false;
                        case 3:
                        case 4:
                            return j(focusModifier, j, i11, lVar);
                        case 5:
                        case 6:
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
            case 3:
            case 4:
                e<FocusModifier> a11 = t.a(focusModifier);
                if (a11.m() <= 1) {
                    if (a11.o()) {
                        obj = null;
                    } else {
                        obj = a11.l()[0];
                    }
                    FocusModifier focusModifier2 = (FocusModifier) obj;
                    if (focusModifier2 != null) {
                        return lVar.invoke(focusModifier2).booleanValue();
                    }
                    return false;
                }
                b.a aVar = b.f16557b;
                if (b.l(i11, aVar.g()) ? true : b.l(i11, aVar.a())) {
                    hVar = q(t.e(focusModifier));
                } else {
                    if (!b.l(i11, aVar.c())) {
                        z11 = b.l(i11, aVar.h());
                    }
                    if (z11) {
                        hVar = h(t.e(focusModifier));
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
                FocusModifier i13 = i(a11, hVar, i11);
                if (i13 != null) {
                    return lVar.invoke(i13).booleanValue();
                }
                return false;
            case 5:
                return false;
            case 6:
                return lVar.invoke(focusModifier).booleanValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

package androidx.compose.foundation.text.selection;

import b0.g;
import kotlin.jvm.internal.p;
import lp0.l;
import p1.a0;
import p1.b0;
import p1.y;

/* compiled from: SelectionAdjustment.kt */
public interface SelectionAdjustment {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f4703a = Companion.f4704a;

    /* compiled from: SelectionAdjustment.kt */
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ Companion f4704a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        private static final SelectionAdjustment f4705b = new c();

        /* renamed from: c  reason: collision with root package name */
        private static final SelectionAdjustment f4706c = new a();

        /* renamed from: d  reason: collision with root package name */
        private static final SelectionAdjustment f4707d = new SelectionAdjustment$Companion$Word$1();

        /* renamed from: e  reason: collision with root package name */
        private static final SelectionAdjustment f4708e = new SelectionAdjustment$Companion$Paragraph$1();

        /* renamed from: f  reason: collision with root package name */
        private static final SelectionAdjustment f4709f = new b();

        /* compiled from: SelectionAdjustment.kt */
        public static final class a implements SelectionAdjustment {
            a() {
            }

            public long a(y yVar, long j, int i11, boolean z11, a0 a0Var) {
                p.j(yVar, "textLayoutResult");
                if (!a0.h(j)) {
                    return j;
                }
                return g.a(a0.n(j), StringsKt__StringsKt.b0(yVar.k().j()), z11, a0Var != null ? a0.m(a0Var.r()) : false);
            }
        }

        /* compiled from: SelectionAdjustment.kt */
        public static final class b implements SelectionAdjustment {
            b() {
            }

            private final boolean b(y yVar, int i11) {
                long B = yVar.B(i11);
                return i11 == a0.n(B) || i11 == a0.i(B);
            }

            private final boolean c(int i11, int i12, boolean z11, boolean z12) {
                if (i12 == -1) {
                    return true;
                }
                if (i11 == i12) {
                    return false;
                }
                if (z11 ^ z12) {
                    if (i11 < i12) {
                        return true;
                    }
                } else if (i11 > i12) {
                    return true;
                }
                return false;
            }

            private final int d(y yVar, int i11, int i12, int i13, boolean z11, boolean z12) {
                int i14;
                int i15;
                long B = yVar.B(i11);
                if (yVar.p(a0.n(B)) == i12) {
                    i14 = a0.n(B);
                } else {
                    i14 = yVar.t(i12);
                }
                if (yVar.p(a0.i(B)) == i12) {
                    i15 = a0.i(B);
                } else {
                    i15 = y.o(yVar, i12, false, 2, (Object) null);
                }
                if (i14 == i13) {
                    return i15;
                }
                if (i15 == i13) {
                    return i14;
                }
                int i16 = (i14 + i15) / 2;
                if (z11 ^ z12) {
                    if (i11 <= i16) {
                        return i14;
                    }
                } else if (i11 < i16) {
                    return i14;
                }
                return i15;
            }

            private final int e(y yVar, int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
                if (i11 == i12) {
                    return i13;
                }
                int p11 = yVar.p(i11);
                if (p11 != yVar.p(i13)) {
                    return d(yVar, i11, p11, i14, z11, z12);
                }
                if (c(i11, i12, z11, z12) && b(yVar, i13)) {
                    return d(yVar, i11, p11, i14, z11, z12);
                }
                return i11;
            }

            public long a(y yVar, long j, int i11, boolean z11, a0 a0Var) {
                int i12;
                int i13;
                p.j(yVar, "textLayoutResult");
                if (a0Var == null) {
                    return Companion.f4704a.g().a(yVar, j, i11, z11, a0Var);
                }
                if (a0.h(j)) {
                    return g.a(a0.n(j), StringsKt__StringsKt.b0(yVar.k().j()), z11, a0.m(a0Var.r()));
                }
                if (z11) {
                    i13 = e(yVar, a0.n(j), i11, a0.n(a0Var.r()), a0.i(j), true, a0.m(j));
                    i12 = a0.i(j);
                } else {
                    int n = a0.n(j);
                    i12 = e(yVar, a0.i(j), i11, a0.i(a0Var.r()), a0.n(j), false, a0.m(j));
                    i13 = n;
                }
                return b0.b(i13, i12);
            }
        }

        /* compiled from: SelectionAdjustment.kt */
        public static final class c implements SelectionAdjustment {
            c() {
            }

            public long a(y yVar, long j, int i11, boolean z11, a0 a0Var) {
                p.j(yVar, "textLayoutResult");
                return j;
            }
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final long b(y yVar, long j, l<? super Integer, a0> lVar) {
            if (yVar.k().j().length() == 0) {
                return a0.f16041b.a();
            }
            int b02 = StringsKt__StringsKt.b0(yVar.k().j());
            long r11 = lVar.invoke(Integer.valueOf(l.m(a0.n(j), 0, b02))).r();
            long r12 = lVar.invoke(Integer.valueOf(l.m(a0.i(j), 0, b02))).r();
            return b0.b(a0.m(j) ? a0.i(r11) : a0.n(r11), a0.m(j) ? a0.n(r12) : a0.i(r12));
        }

        public final SelectionAdjustment c() {
            return f4706c;
        }

        public final SelectionAdjustment d() {
            return f4709f;
        }

        public final SelectionAdjustment e() {
            return f4705b;
        }

        public final SelectionAdjustment f() {
            return f4708e;
        }

        public final SelectionAdjustment g() {
            return f4707d;
        }
    }

    long a(y yVar, long j, int i11, boolean z11, a0 a0Var);
}

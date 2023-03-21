package androidx.compose.ui.platform;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.Objects;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p1.y;

/* compiled from: AccessibilityIterators.android.kt */
public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f7274d = new a((i) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f7275e = 8;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static c f7276f;

    /* renamed from: g  reason: collision with root package name */
    private static final ResolvedTextDirection f7277g = ResolvedTextDirection.Rtl;

    /* renamed from: h  reason: collision with root package name */
    private static final ResolvedTextDirection f7278h = ResolvedTextDirection.Ltr;

    /* renamed from: c  reason: collision with root package name */
    private y f7279c;

    /* compiled from: AccessibilityIterators.android.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final c a() {
            if (c.f7276f == null) {
                c.f7276f = new c((i) null);
            }
            c g11 = c.f7276f;
            Objects.requireNonNull(g11, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return g11;
        }
    }

    private c() {
    }

    public /* synthetic */ c(i iVar) {
        this();
    }

    private final int i(int i11, ResolvedTextDirection resolvedTextDirection) {
        y yVar = this.f7279c;
        y yVar2 = null;
        if (yVar == null) {
            p.B("layoutResult");
            yVar = null;
        }
        int t = yVar.t(i11);
        y yVar3 = this.f7279c;
        if (yVar3 == null) {
            p.B("layoutResult");
            yVar3 = null;
        }
        if (resolvedTextDirection != yVar3.x(t)) {
            y yVar4 = this.f7279c;
            if (yVar4 == null) {
                p.B("layoutResult");
            } else {
                yVar2 = yVar4;
            }
            return yVar2.t(i11);
        }
        y yVar5 = this.f7279c;
        if (yVar5 == null) {
            p.B("layoutResult");
            yVar5 = null;
        }
        return y.o(yVar5, i11, false, 2, (Object) null) - 1;
    }

    public int[] a(int i11) {
        int i12;
        if (d().length() <= 0 || i11 >= d().length()) {
            return null;
        }
        if (i11 < 0) {
            y yVar = this.f7279c;
            if (yVar == null) {
                p.B("layoutResult");
                yVar = null;
            }
            i12 = yVar.p(0);
        } else {
            y yVar2 = this.f7279c;
            if (yVar2 == null) {
                p.B("layoutResult");
                yVar2 = null;
            }
            int p11 = yVar2.p(i11);
            i12 = i(p11, f7277g) == i11 ? p11 : p11 + 1;
        }
        y yVar3 = this.f7279c;
        if (yVar3 == null) {
            p.B("layoutResult");
            yVar3 = null;
        }
        if (i12 >= yVar3.m()) {
            return null;
        }
        return c(i(i12, f7277g), i(i12, f7278h) + 1);
    }

    public int[] b(int i11) {
        int i12;
        if (d().length() <= 0 || i11 <= 0) {
            return null;
        }
        if (i11 > d().length()) {
            y yVar = this.f7279c;
            if (yVar == null) {
                p.B("layoutResult");
                yVar = null;
            }
            i12 = yVar.p(d().length());
        } else {
            y yVar2 = this.f7279c;
            if (yVar2 == null) {
                p.B("layoutResult");
                yVar2 = null;
            }
            int p11 = yVar2.p(i11);
            i12 = i(p11, f7278h) + 1 == i11 ? p11 : p11 - 1;
        }
        if (i12 < 0) {
            return null;
        }
        return c(i(i12, f7277g), i(i12, f7278h) + 1);
    }

    public final void j(String str, y yVar) {
        p.j(str, "text");
        p.j(yVar, "layoutResult");
        f(str);
        this.f7279c = yVar;
    }
}

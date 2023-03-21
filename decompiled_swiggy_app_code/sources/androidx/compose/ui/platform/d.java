package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.Objects;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p1.y;

/* compiled from: AccessibilityIterators.android.kt */
public final class d extends a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f7288f = new a((i) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f7289g = 8;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static d f7290h;

    /* renamed from: i  reason: collision with root package name */
    private static final ResolvedTextDirection f7291i = ResolvedTextDirection.Rtl;
    private static final ResolvedTextDirection j = ResolvedTextDirection.Ltr;

    /* renamed from: c  reason: collision with root package name */
    private y f7292c;

    /* renamed from: d  reason: collision with root package name */
    private SemanticsNode f7293d;

    /* renamed from: e  reason: collision with root package name */
    private Rect f7294e;

    /* compiled from: AccessibilityIterators.android.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final d a() {
            if (d.f7290h == null) {
                d.f7290h = new d((i) null);
            }
            d g11 = d.f7290h;
            Objects.requireNonNull(g11, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return g11;
        }
    }

    private d() {
        this.f7294e = new Rect();
    }

    public /* synthetic */ d(i iVar) {
        this();
    }

    private final int i(int i11, ResolvedTextDirection resolvedTextDirection) {
        y yVar = this.f7292c;
        y yVar2 = null;
        if (yVar == null) {
            p.B("layoutResult");
            yVar = null;
        }
        int t = yVar.t(i11);
        y yVar3 = this.f7292c;
        if (yVar3 == null) {
            p.B("layoutResult");
            yVar3 = null;
        }
        if (resolvedTextDirection != yVar3.x(t)) {
            y yVar4 = this.f7292c;
            if (yVar4 == null) {
                p.B("layoutResult");
            } else {
                yVar2 = yVar4;
            }
            return yVar2.t(i11);
        }
        y yVar5 = this.f7292c;
        if (yVar5 == null) {
            p.B("layoutResult");
            yVar5 = null;
        }
        return y.o(yVar5, i11, false, 2, (Object) null) - 1;
    }

    public int[] a(int i11) {
        int i12;
        y yVar = null;
        if (d().length() <= 0 || i11 >= d().length()) {
            return null;
        }
        try {
            SemanticsNode semanticsNode = this.f7293d;
            if (semanticsNode == null) {
                p.B("node");
                semanticsNode = null;
            }
            int c11 = c.c(semanticsNode.f().h());
            int d11 = l.d(0, i11);
            y yVar2 = this.f7292c;
            if (yVar2 == null) {
                p.B("layoutResult");
                yVar2 = null;
            }
            int p11 = yVar2.p(d11);
            y yVar3 = this.f7292c;
            if (yVar3 == null) {
                p.B("layoutResult");
                yVar3 = null;
            }
            float u11 = yVar3.u(p11) + ((float) c11);
            y yVar4 = this.f7292c;
            if (yVar4 == null) {
                p.B("layoutResult");
                yVar4 = null;
            }
            y yVar5 = this.f7292c;
            if (yVar5 == null) {
                p.B("layoutResult");
                yVar5 = null;
            }
            if (u11 < yVar4.u(yVar5.m() - 1)) {
                y yVar6 = this.f7292c;
                if (yVar6 == null) {
                    p.B("layoutResult");
                } else {
                    yVar = yVar6;
                }
                i12 = yVar.q(u11);
            } else {
                y yVar7 = this.f7292c;
                if (yVar7 == null) {
                    p.B("layoutResult");
                } else {
                    yVar = yVar7;
                }
                i12 = yVar.m();
            }
            return c(d11, i(i12 - 1, j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public int[] b(int i11) {
        int i12;
        y yVar = null;
        if (d().length() <= 0 || i11 <= 0) {
            return null;
        }
        try {
            SemanticsNode semanticsNode = this.f7293d;
            if (semanticsNode == null) {
                p.B("node");
                semanticsNode = null;
            }
            int c11 = c.c(semanticsNode.f().h());
            int i13 = l.i(d().length(), i11);
            y yVar2 = this.f7292c;
            if (yVar2 == null) {
                p.B("layoutResult");
                yVar2 = null;
            }
            int p11 = yVar2.p(i13);
            y yVar3 = this.f7292c;
            if (yVar3 == null) {
                p.B("layoutResult");
                yVar3 = null;
            }
            float u11 = yVar3.u(p11) - ((float) c11);
            if (u11 > 0.0f) {
                y yVar4 = this.f7292c;
                if (yVar4 == null) {
                    p.B("layoutResult");
                } else {
                    yVar = yVar4;
                }
                i12 = yVar.q(u11);
            } else {
                i12 = 0;
            }
            if (i13 == d().length() && i12 < p11) {
                i12++;
            }
            return c(i(i12, f7291i), i13);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String str, y yVar, SemanticsNode semanticsNode) {
        p.j(str, "text");
        p.j(yVar, "layoutResult");
        p.j(semanticsNode, "node");
        f(str);
        this.f7292c = yVar;
        this.f7293d = semanticsNode;
    }
}

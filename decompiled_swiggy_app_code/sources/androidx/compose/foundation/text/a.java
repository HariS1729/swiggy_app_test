package androidx.compose.foundation.text;

import androidx.compose.ui.unit.LayoutDirection;
import d2.e;
import kotlin.jvm.internal.p;
import p1.c0;
import u1.i;

/* compiled from: TextFieldSize.kt */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private LayoutDirection f4660a;

    /* renamed from: b  reason: collision with root package name */
    private e f4661b;

    /* renamed from: c  reason: collision with root package name */
    private i.b f4662c;

    /* renamed from: d  reason: collision with root package name */
    private c0 f4663d;

    /* renamed from: e  reason: collision with root package name */
    private Object f4664e;

    /* renamed from: f  reason: collision with root package name */
    private long f4665f = a();

    public a(LayoutDirection layoutDirection, e eVar, i.b bVar, c0 c0Var, Object obj) {
        p.j(layoutDirection, "layoutDirection");
        p.j(eVar, "density");
        p.j(bVar, "fontFamilyResolver");
        p.j(c0Var, "resolvedStyle");
        p.j(obj, "typeface");
        this.f4660a = layoutDirection;
        this.f4661b = eVar;
        this.f4662c = bVar;
        this.f4663d = c0Var;
        this.f4664e = obj;
    }

    private final long a() {
        return a0.p.b(this.f4663d, this.f4661b, this.f4662c, (String) null, 0, 24, (Object) null);
    }

    public final long b() {
        return this.f4665f;
    }

    public final void c(LayoutDirection layoutDirection, e eVar, i.b bVar, c0 c0Var, Object obj) {
        p.j(layoutDirection, "layoutDirection");
        p.j(eVar, "density");
        p.j(bVar, "fontFamilyResolver");
        p.j(c0Var, "resolvedStyle");
        p.j(obj, "typeface");
        if (layoutDirection != this.f4660a || !p.e(eVar, this.f4661b) || !p.e(bVar, this.f4662c) || !p.e(c0Var, this.f4663d) || !p.e(obj, this.f4664e)) {
            this.f4660a = layoutDirection;
            this.f4661b = eVar;
            this.f4662c = bVar;
            this.f4663d = c0Var;
            this.f4664e = obj;
            this.f4665f = a();
        }
    }
}

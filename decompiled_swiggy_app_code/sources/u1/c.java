package u1;

import kotlin.jvm.internal.p;

/* compiled from: AndroidFontResolveInterceptor.android.kt */
public final class c implements c0 {

    /* renamed from: b  reason: collision with root package name */
    private final int f16907b;

    public c(int i11) {
        this.f16907b = i11;
    }

    public /* synthetic */ int a(int i11) {
        return b0.b(this, i11);
    }

    public v b(v vVar) {
        p.j(vVar, "fontWeight");
        int i11 = this.f16907b;
        return (i11 == 0 || i11 == Integer.MAX_VALUE) ? vVar : new v(l.m(vVar.s() + this.f16907b, 1, 1000));
    }

    public /* synthetic */ int c(int i11) {
        return b0.c(this, i11);
    }

    public /* synthetic */ i d(i iVar) {
        return b0.a(this, iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f16907b == ((c) obj).f16907b;
    }

    public int hashCode() {
        return this.f16907b;
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f16907b + ')';
    }
}

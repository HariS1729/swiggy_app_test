package androidx.compose.foundation;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import u0.l0;
import u0.o;
import u0.w0;
import u0.x;
import w0.a;

/* compiled from: Border.kt */
final class b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public l0 f3178a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public x f3179b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public a f3180c;

    /* renamed from: d  reason: collision with root package name */
    private w0 f3181d;

    public b() {
        this((l0) null, (x) null, (a) null, (w0) null, 15, (i) null);
    }

    public b(l0 l0Var, x xVar, a aVar, w0 w0Var) {
        this.f3178a = l0Var;
        this.f3179b = xVar;
        this.f3180c = aVar;
        this.f3181d = w0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p.e(this.f3178a, bVar.f3178a) && p.e(this.f3179b, bVar.f3179b) && p.e(this.f3180c, bVar.f3180c) && p.e(this.f3181d, bVar.f3181d);
    }

    public final w0 g() {
        w0 w0Var = this.f3181d;
        if (w0Var != null) {
            return w0Var;
        }
        w0 a11 = o.a();
        this.f3181d = a11;
        return a11;
    }

    public int hashCode() {
        l0 l0Var = this.f3178a;
        int i11 = 0;
        int hashCode = (l0Var == null ? 0 : l0Var.hashCode()) * 31;
        x xVar = this.f3179b;
        int hashCode2 = (hashCode + (xVar == null ? 0 : xVar.hashCode())) * 31;
        a aVar = this.f3180c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        w0 w0Var = this.f3181d;
        if (w0Var != null) {
            i11 = w0Var.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f3178a + ", canvas=" + this.f3179b + ", canvasDrawScope=" + this.f3180c + ", borderPath=" + this.f3181d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(l0 l0Var, x xVar, a aVar, w0 w0Var, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : l0Var, (i11 & 2) != 0 ? null : xVar, (i11 & 4) != 0 ? null : aVar, (i11 & 8) != 0 ? null : w0Var);
    }
}

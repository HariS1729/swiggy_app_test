package x0;

import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.l;
import u0.d0;
import u0.e0;
import w0.e;
import w0.f;
import w0.g;

/* compiled from: ColorPainter.kt */
public final class c extends Painter {

    /* renamed from: g  reason: collision with root package name */
    private final long f17659g;

    /* renamed from: h  reason: collision with root package name */
    private float f17660h;

    /* renamed from: i  reason: collision with root package name */
    private e0 f17661i;
    private final long j;

    private c(long j11) {
        this.f17659g = j11;
        this.f17660h = 1.0f;
        this.j = l.f16682b.a();
    }

    public /* synthetic */ c(long j11, i iVar) {
        this(j11);
    }

    /* access modifiers changed from: protected */
    public boolean a(float f11) {
        this.f17660h = f11;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(e0 e0Var) {
        this.f17661i = e0Var;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && d0.n(this.f17659g, ((c) obj).f17659g);
    }

    public int hashCode() {
        return d0.t(this.f17659g);
    }

    public long k() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public void m(f fVar) {
        p.j(fVar, "<this>");
        e.n(fVar, this.f17659g, 0, 0, this.f17660h, (g) null, this.f17661i, 0, 86, (Object) null);
    }

    public String toString() {
        return "ColorPainter(color=" + d0.u(this.f17659g) + ')';
    }
}

package y6;

import a0.h;
import android.view.View;
import coil.size.ViewSizeResolver;
import fp0.c;
import kotlin.jvm.internal.p;

/* compiled from: RealViewSizeResolver.kt */
public final class f<T extends View> implements ViewSizeResolver<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f18028a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f18029b;

    public f(T t, boolean z11) {
        this.f18028a = t;
        this.f18029b = z11;
    }

    public Object a(c<? super g> cVar) {
        return ViewSizeResolver.DefaultImpls.h(this, cVar);
    }

    public T c() {
        return this.f18028a;
    }

    public boolean d() {
        return this.f18029b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (!p.e(c(), fVar.c()) || d() != fVar.d()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + h.a(d());
    }
}

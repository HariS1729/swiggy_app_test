package u0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import kotlin.jvm.internal.p;

/* compiled from: AndroidPathMeasure.android.kt */
public final class m implements z0 {

    /* renamed from: a  reason: collision with root package name */
    private final PathMeasure f16829a;

    public m(PathMeasure pathMeasure) {
        p.j(pathMeasure, "internalPathMeasure");
        this.f16829a = pathMeasure;
    }

    public float a() {
        return this.f16829a.getLength();
    }

    public boolean b(float f11, float f12, w0 w0Var, boolean z11) {
        p.j(w0Var, "destination");
        PathMeasure pathMeasure = this.f16829a;
        if (w0Var instanceof j) {
            return pathMeasure.getSegment(f11, f12, ((j) w0Var).s(), z11);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void c(w0 w0Var, boolean z11) {
        Path path;
        PathMeasure pathMeasure = this.f16829a;
        if (w0Var == null) {
            path = null;
        } else if (w0Var instanceof j) {
            path = ((j) w0Var).s();
        } else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        pathMeasure.setPath(path, z11);
    }
}

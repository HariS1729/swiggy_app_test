package f1;

import android.view.MotionEvent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: InternalPointerEvent.android.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final Map<u, v> f14494a;

    /* renamed from: b  reason: collision with root package name */
    private final x f14495b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14496c;

    public h(Map<u, v> map, x xVar) {
        p.j(map, "changes");
        p.j(xVar, "pointerInputEvent");
        this.f14494a = map;
        this.f14495b = xVar;
    }

    public final Map<u, v> a() {
        return this.f14494a;
    }

    public final MotionEvent b() {
        return this.f14495b.a();
    }

    public final boolean c() {
        return this.f14496c;
    }

    public final boolean d(long j) {
        y yVar;
        List<y> b11 = this.f14495b.b();
        int size = b11.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                yVar = null;
                break;
            }
            yVar = b11.get(i11);
            if (u.d(yVar.c(), j)) {
                break;
            }
            i11++;
        }
        y yVar2 = yVar;
        if (yVar2 != null) {
            return yVar2.d();
        }
        return false;
    }

    public final void e(boolean z11) {
        this.f14496c = z11;
    }
}

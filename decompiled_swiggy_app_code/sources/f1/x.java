package f1;

import android.view.MotionEvent;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: PointerInputEvent.android.kt */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final long f14546a;

    /* renamed from: b  reason: collision with root package name */
    private final List<y> f14547b;

    /* renamed from: c  reason: collision with root package name */
    private final MotionEvent f14548c;

    public x(long j, List<y> list, MotionEvent motionEvent) {
        p.j(list, "pointers");
        p.j(motionEvent, "motionEvent");
        this.f14546a = j;
        this.f14547b = list;
        this.f14548c = motionEvent;
    }

    public final MotionEvent a() {
        return this.f14548c;
    }

    public final List<y> b() {
        return this.f14547b;
    }
}

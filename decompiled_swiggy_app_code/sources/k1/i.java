package k1;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import k1.i;
import kotlin.jvm.internal.p;
import p0.d;

/* compiled from: LayoutNodeEntity.kt */
public class i<T extends i<T, M>, M extends d> {

    /* renamed from: a  reason: collision with root package name */
    private final LayoutNodeWrapper f15356a;

    /* renamed from: b  reason: collision with root package name */
    private final M f15357b;

    /* renamed from: c  reason: collision with root package name */
    private T f15358c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15359d;

    public i(LayoutNodeWrapper layoutNodeWrapper, M m11) {
        p.j(layoutNodeWrapper, "layoutNodeWrapper");
        p.j(m11, "modifier");
        this.f15356a = layoutNodeWrapper;
        this.f15357b = m11;
    }

    public final LayoutNode a() {
        return this.f15356a.j1();
    }

    public final LayoutNodeWrapper b() {
        return this.f15356a;
    }

    public final M c() {
        return this.f15357b;
    }

    public final T d() {
        return this.f15358c;
    }

    public final long e() {
        return this.f15356a.a();
    }

    public final boolean f() {
        return this.f15359d;
    }

    public void g() {
        this.f15359d = true;
    }

    public void h() {
        this.f15359d = false;
    }

    public final void i(T t) {
        this.f15358c = t;
    }
}

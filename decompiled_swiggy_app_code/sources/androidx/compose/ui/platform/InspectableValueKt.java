package androidx.compose.ui.platform;

import bp0.k;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;

/* compiled from: InspectableValue.kt */
public final class InspectableValueKt {

    /* renamed from: a  reason: collision with root package name */
    private static final l<n0, k> f7153a = InspectableValueKt$NoInspectorInfo$1.f7156a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f7154b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f7155c = 0;

    public static final l<n0, k> a() {
        return f7153a;
    }

    public static final d b(d dVar, l<? super n0, k> lVar, d dVar2) {
        p.j(dVar, "<this>");
        p.j(lVar, "inspectorInfo");
        p.j(dVar2, "wrapped");
        m0 m0Var = new m0(lVar);
        return dVar.N(m0Var).N(dVar2).N(m0Var.c());
    }

    public static final boolean c() {
        return f7154b;
    }
}

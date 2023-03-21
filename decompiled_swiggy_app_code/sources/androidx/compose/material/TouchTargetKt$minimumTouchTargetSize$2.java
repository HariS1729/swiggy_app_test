package androidx.compose.material;

import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.q;
import p0.d;

/* compiled from: TouchTarget.kt */
final class TouchTargetKt$minimumTouchTargetSize$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    public static final TouchTargetKt$minimumTouchTargetSize$2 f5767a = new TouchTargetKt$minimumTouchTargetSize$2();

    TouchTargetKt$minimumTouchTargetSize$2() {
        super(3);
    }

    public final d a(d dVar, g gVar, int i11) {
        d dVar2;
        p.j(dVar, "$this$composed");
        gVar.E(88894699);
        if (((Boolean) gVar.z(TouchTargetKt.a())).booleanValue()) {
            dVar2 = new MinimumTouchTargetModifier(((n1) gVar.z(CompositionLocalsKt.n())).e(), (i) null);
        } else {
            dVar2 = d.f16037h0;
        }
        gVar.P();
        return dVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}

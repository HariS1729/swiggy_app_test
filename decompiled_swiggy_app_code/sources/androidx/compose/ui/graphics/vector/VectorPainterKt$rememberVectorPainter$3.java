package androidx.compose.ui.graphics.vector;

import bp0.k;
import e0.g;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import lp0.r;
import y0.c;

/* compiled from: VectorPainter.kt */
final class VectorPainterKt$rememberVectorPainter$3 extends Lambda implements r<Float, Float, g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f6598a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VectorPainterKt$rememberVectorPainter$3(c cVar) {
        super(4);
        this.f6598a = cVar;
    }

    public final void a(float f11, float f12, g gVar, int i11) {
        if ((i11 & 11) != 2 || !gVar.b()) {
            VectorPainterKt.a(this.f6598a.e(), (Map<String, ? extends y0.k>) null, gVar, 0, 2);
        } else {
            gVar.h();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        a(((Number) obj).floatValue(), ((Number) obj2).floatValue(), (g) obj3, ((Number) obj4).intValue());
        return k.f22762a;
    }
}

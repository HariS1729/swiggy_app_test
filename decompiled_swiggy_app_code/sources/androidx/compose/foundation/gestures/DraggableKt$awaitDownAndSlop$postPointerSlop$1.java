package androidx.compose.foundation.gestures;

import bp0.k;
import f1.v;
import g1.g;
import g1.h;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import lp0.p;

/* compiled from: Draggable.kt */
final class DraggableKt$awaitDownAndSlop$postPointerSlop$1 extends Lambda implements p<v, Float, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f3366a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Ref$FloatRef f3367b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DraggableKt$awaitDownAndSlop$postPointerSlop$1(g gVar, Ref$FloatRef ref$FloatRef) {
        super(2);
        this.f3366a = gVar;
        this.f3367b = ref$FloatRef;
    }

    public final void a(v vVar, float f11) {
        kotlin.jvm.internal.p.j(vVar, "event");
        h.b(this.f3366a, vVar);
        vVar.a();
        this.f3367b.f25663a = f11;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((v) obj, ((Number) obj2).floatValue());
        return k.f22762a;
    }
}

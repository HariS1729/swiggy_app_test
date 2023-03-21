package androidx.compose.foundation.gestures;

import bp0.k;
import defpackage.y1;
import f1.o;
import f1.v;
import g1.g;
import g1.h;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import yp0.w;

/* compiled from: Draggable.kt */
final class DraggableKt$awaitDrag$dragTick$1 extends Lambda implements l<v, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f3368a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Orientation f3369b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ w<y1.g> f3370c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f3371d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DraggableKt$awaitDrag$dragTick$1(g gVar, Orientation orientation, w<? super y1.g> wVar, boolean z11) {
        super(1);
        this.f3368a = gVar;
        this.f3369b = orientation;
        this.f3370c = wVar;
        this.f3371d = z11;
    }

    public final void a(v vVar) {
        p.j(vVar, "event");
        h.b(this.f3368a, vVar);
        float d11 = DraggableKt.l(o.g(vVar), this.f3369b);
        vVar.a();
        w<y1.g> wVar = this.f3370c;
        if (this.f3371d) {
            d11 *= (float) -1;
        }
        wVar.e(new y1.g.b(d11, vVar.f(), (i) null));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((v) obj);
        return k.f22762a;
    }
}

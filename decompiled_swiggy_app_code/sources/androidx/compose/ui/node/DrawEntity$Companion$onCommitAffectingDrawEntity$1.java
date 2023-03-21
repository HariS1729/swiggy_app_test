package androidx.compose.ui.node;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: DrawEntity.kt */
final class DrawEntity$Companion$onCommitAffectingDrawEntity$1 extends Lambda implements l<DrawEntity, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final DrawEntity$Companion$onCommitAffectingDrawEntity$1 f6824a = new DrawEntity$Companion$onCommitAffectingDrawEntity$1();

    DrawEntity$Companion$onCommitAffectingDrawEntity$1() {
        super(1);
    }

    public final void a(DrawEntity drawEntity) {
        p.j(drawEntity, "drawEntity");
        if (drawEntity.o0()) {
            drawEntity.f6822g = true;
            drawEntity.b().y1();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((DrawEntity) obj);
        return k.f22762a;
    }
}

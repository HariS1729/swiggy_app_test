package androidx.compose.ui.graphics.vector;

import bp0.k;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import y0.d;

/* compiled from: VectorCompose.kt */
final class VectorComposeKt$Path$2$2 extends Lambda implements p<PathComponent, List<? extends d>, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final VectorComposeKt$Path$2$2 f6555a = new VectorComposeKt$Path$2$2();

    VectorComposeKt$Path$2$2() {
        super(2);
    }

    public final void a(PathComponent pathComponent, List<? extends d> list) {
        kotlin.jvm.internal.p.j(pathComponent, "$this$set");
        kotlin.jvm.internal.p.j(list, "it");
        pathComponent.i(list);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((PathComponent) obj, (List) obj2);
        return k.f22762a;
    }
}

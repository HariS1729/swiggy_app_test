package androidx.compose.ui.graphics.vector;

import e0.h;
import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: VectorPainter.kt */
final class VectorPainter$RenderVector$2 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f6581a;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f6582a;

        public a(h hVar) {
            this.f6582a = hVar;
        }

        public void dispose() {
            this.f6582a.dispose();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VectorPainter$RenderVector$2(h hVar) {
        super(1);
        this.f6581a = hVar;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        return new a(this.f6581a);
    }
}

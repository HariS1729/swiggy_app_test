package androidx.compose.ui.node;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import r0.e;

/* compiled from: DrawEntity.kt */
final class DrawEntity$updateCache$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DrawEntity f6828a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawEntity$updateCache$1(DrawEntity drawEntity) {
        super(0);
        this.f6828a = drawEntity;
    }

    public final void invoke() {
        e k = this.f6828a.f6820e;
        if (k != null) {
            k.t(this.f6828a.f6821f);
        }
        this.f6828a.f6822g = false;
    }
}

package androidx.compose.animation;

import i1.i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AnimatedVisibility.kt */
final class AnimatedEnterExitMeasurePolicy$maxIntrinsicWidth$1 extends Lambda implements l<i, Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f2459a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedEnterExitMeasurePolicy$maxIntrinsicWidth$1(int i11) {
        super(1);
        this.f2459a = i11;
    }

    /* renamed from: a */
    public final Integer invoke(i iVar) {
        p.j(iVar, "it");
        return Integer.valueOf(iVar.L(this.f2459a));
    }
}

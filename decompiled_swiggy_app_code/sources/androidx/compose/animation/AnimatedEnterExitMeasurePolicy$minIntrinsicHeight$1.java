package androidx.compose.animation;

import i1.i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AnimatedVisibility.kt */
final class AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1 extends Lambda implements l<i, Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f2461a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1(int i11) {
        super(1);
        this.f2461a = i11;
    }

    /* renamed from: a */
    public final Integer invoke(i iVar) {
        p.j(iVar, "it");
        return Integer.valueOf(iVar.J(this.f2461a));
    }
}

package androidx.compose.foundation.selection;

import e0.h0;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: Toggleable.kt */
final class ToggleableKt$toggleableImpl$1$delayPressInteraction$1 extends Lambda implements a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h0<Boolean> f4193a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a<Boolean> f4194b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ToggleableKt$toggleableImpl$1$delayPressInteraction$1(h0<Boolean> h0Var, a<Boolean> aVar) {
        super(0);
        this.f4193a = h0Var;
        this.f4194b = aVar;
    }

    /* renamed from: a */
    public final Boolean invoke() {
        return Boolean.valueOf(this.f4193a.getValue().booleanValue() || this.f4194b.invoke().booleanValue());
    }
}

package androidx.compose.foundation;

import e0.h0;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: Clickable.kt */
final class ClickableKt$clickable$4$delayPressInteraction$1 extends Lambda implements a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h0<Boolean> f2913a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a<Boolean> f2914b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$clickable$4$delayPressInteraction$1(h0<Boolean> h0Var, a<Boolean> aVar) {
        super(0);
        this.f2913a = h0Var;
        this.f2914b = aVar;
    }

    /* renamed from: a */
    public final Boolean invoke() {
        return Boolean.valueOf(this.f2913a.getValue().booleanValue() || this.f2914b.invoke().booleanValue());
    }
}

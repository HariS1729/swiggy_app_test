package androidx.compose.foundation.selection;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import lp0.l;

/* compiled from: Toggleable.kt */
final class ToggleableKt$toggleable$4$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<Boolean, k> f4184a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f4185b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ToggleableKt$toggleable$4$1(l<? super Boolean, k> lVar, boolean z11) {
        super(0);
        this.f4184a = lVar;
        this.f4185b = z11;
    }

    public final void invoke() {
        this.f4184a.invoke(Boolean.valueOf(!this.f4185b));
    }
}

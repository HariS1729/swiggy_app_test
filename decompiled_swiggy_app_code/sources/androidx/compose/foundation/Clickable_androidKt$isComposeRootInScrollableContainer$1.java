package androidx.compose.foundation;

import android.view.View;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: Clickable.android.kt */
final class Clickable_androidKt$isComposeRootInScrollableContainer$1 extends Lambda implements a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f2956a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Clickable_androidKt$isComposeRootInScrollableContainer$1(View view) {
        super(0);
        this.f2956a = view;
    }

    /* renamed from: a */
    public final Boolean invoke() {
        return Boolean.valueOf(Clickable_androidKt.e(this.f2956a));
    }
}

package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import lp0.a;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$scrollerPosition$1$1 extends Lambda implements a<TextFieldScrollerPosition> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Orientation f4410a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(Orientation orientation) {
        super(0);
        this.f4410a = orientation;
    }

    /* renamed from: a */
    public final TextFieldScrollerPosition invoke() {
        return new TextFieldScrollerPosition(this.f4410a, 0.0f, 2, (i) null);
    }
}

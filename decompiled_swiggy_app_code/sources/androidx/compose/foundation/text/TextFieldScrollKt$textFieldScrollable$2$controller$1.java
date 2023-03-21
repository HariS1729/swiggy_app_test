package androidx.compose.foundation.text;

import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: TextFieldScroll.kt */
final class TextFieldScrollKt$textFieldScrollable$2$controller$1 extends Lambda implements l<Float, Float> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldScrollerPosition f4613a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldScrollKt$textFieldScrollable$2$controller$1(TextFieldScrollerPosition textFieldScrollerPosition) {
        super(1);
        this.f4613a = textFieldScrollerPosition;
    }

    public final Float a(float f11) {
        float d11 = this.f4613a.d() + f11;
        if (d11 > this.f4613a.c()) {
            f11 = this.f4613a.c() - this.f4613a.d();
        } else if (d11 < 0.0f) {
            f11 = -this.f4613a.d();
        }
        TextFieldScrollerPosition textFieldScrollerPosition = this.f4613a;
        textFieldScrollerPosition.h(textFieldScrollerPosition.d() + f11);
        return Float.valueOf(f11);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).floatValue());
    }
}

package androidx.compose.ui.text.input;

import android.view.inputmethod.BaseInputConnection;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: TextInputServiceAndroid.android.kt */
final class TextInputServiceAndroid$baseInputConnection$2 extends Lambda implements a<BaseInputConnection> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextInputServiceAndroid f7630a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextInputServiceAndroid$baseInputConnection$2(TextInputServiceAndroid textInputServiceAndroid) {
        super(0);
        this.f7630a = textInputServiceAndroid;
    }

    /* renamed from: a */
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.f7630a.k(), false);
    }
}

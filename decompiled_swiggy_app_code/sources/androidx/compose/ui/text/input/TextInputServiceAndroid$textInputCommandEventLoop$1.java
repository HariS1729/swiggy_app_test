package androidx.compose.ui.text.input;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.ui.text.input.TextInputServiceAndroid", f = "TextInputServiceAndroid.android.kt", l = {189}, m = "textInputCommandEventLoop")
/* compiled from: TextInputServiceAndroid.android.kt */
final class TextInputServiceAndroid$textInputCommandEventLoop$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7635a;

    /* renamed from: b  reason: collision with root package name */
    Object f7636b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f7637c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ TextInputServiceAndroid f7638d;

    /* renamed from: e  reason: collision with root package name */
    int f7639e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextInputServiceAndroid$textInputCommandEventLoop$1(TextInputServiceAndroid textInputServiceAndroid, c<? super TextInputServiceAndroid$textInputCommandEventLoop$1> cVar) {
        super(cVar);
        this.f7638d = textInputServiceAndroid;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7637c = obj;
        this.f7639e |= Integer.MIN_VALUE;
        return this.f7638d.o(this);
    }
}

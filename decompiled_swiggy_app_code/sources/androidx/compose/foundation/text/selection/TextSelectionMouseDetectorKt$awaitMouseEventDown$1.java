package androidx.compose.foundation.text.selection;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", f = "TextSelectionMouseDetector.kt", l = {127}, m = "awaitMouseEventDown")
/* compiled from: TextSelectionMouseDetector.kt */
final class TextSelectionMouseDetectorKt$awaitMouseEventDown$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f4782a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f4783b;

    /* renamed from: c  reason: collision with root package name */
    int f4784c;

    TextSelectionMouseDetectorKt$awaitMouseEventDown$1(c<? super TextSelectionMouseDetectorKt$awaitMouseEventDown$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.f4783b = obj;
        this.f4784c |= Integer.MIN_VALUE;
        return TextSelectionMouseDetectorKt.b((f1.d) null, this);
    }
}

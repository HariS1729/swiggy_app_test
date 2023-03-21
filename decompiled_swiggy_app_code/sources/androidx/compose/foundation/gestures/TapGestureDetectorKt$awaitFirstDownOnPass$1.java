package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {244}, m = "awaitFirstDownOnPass")
/* compiled from: TapGestureDetector.kt */
final class TapGestureDetectorKt$awaitFirstDownOnPass$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f3547a;

    /* renamed from: b  reason: collision with root package name */
    Object f3548b;

    /* renamed from: c  reason: collision with root package name */
    boolean f3549c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f3550d;

    /* renamed from: e  reason: collision with root package name */
    int f3551e;

    TapGestureDetectorKt$awaitFirstDownOnPass$1(c<? super TapGestureDetectorKt$awaitFirstDownOnPass$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.f3550d = obj;
        this.f3551e |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.f((f1.d) null, (PointerEventPass) null, false, this);
    }
}

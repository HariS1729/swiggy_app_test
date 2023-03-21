package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import bp0.g;
import bp0.k;
import f1.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$mouseDragGestureDetector$1", f = "TextFieldGestureModifiers.kt", l = {56}, m = "invokeSuspend")
/* compiled from: TextFieldGestureModifiers.kt */
final class TextFieldGestureModifiersKt$mouseDragGestureDetector$1 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4544a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f4545b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b0.c f4546c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldGestureModifiersKt$mouseDragGestureDetector$1(b0.c cVar, c<? super TextFieldGestureModifiersKt$mouseDragGestureDetector$1> cVar2) {
        super(2, cVar2);
        this.f4546c = cVar;
    }

    /* renamed from: a */
    public final Object invoke(d0 d0Var, c<? super k> cVar) {
        return ((TextFieldGestureModifiersKt$mouseDragGestureDetector$1) create(d0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        TextFieldGestureModifiersKt$mouseDragGestureDetector$1 textFieldGestureModifiersKt$mouseDragGestureDetector$1 = new TextFieldGestureModifiersKt$mouseDragGestureDetector$1(this.f4546c, cVar);
        textFieldGestureModifiersKt$mouseDragGestureDetector$1.f4545b = obj;
        return textFieldGestureModifiersKt$mouseDragGestureDetector$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4544a;
        if (i11 == 0) {
            g.b(obj);
            b0.c cVar = this.f4546c;
            this.f4544a = 1;
            if (TextSelectionMouseDetectorKt.c((d0) this.f4545b, cVar, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}

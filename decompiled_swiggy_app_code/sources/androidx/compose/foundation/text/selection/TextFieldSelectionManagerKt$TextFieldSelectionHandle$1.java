package androidx.compose.foundation.text.selection;

import a0.o;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import bp0.g;
import bp0.k;
import f1.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1", f = "TextFieldSelectionManager.kt", l = {818}, m = "invokeSuspend")
/* compiled from: TextFieldSelectionManager.kt */
final class TextFieldSelectionManagerKt$TextFieldSelectionHandle$1 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4762a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f4763b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o f4764c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManagerKt$TextFieldSelectionHandle$1(o oVar, c<? super TextFieldSelectionManagerKt$TextFieldSelectionHandle$1> cVar) {
        super(2, cVar);
        this.f4764c = oVar;
    }

    /* renamed from: a */
    public final Object invoke(d0 d0Var, c<? super k> cVar) {
        return ((TextFieldSelectionManagerKt$TextFieldSelectionHandle$1) create(d0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        TextFieldSelectionManagerKt$TextFieldSelectionHandle$1 textFieldSelectionManagerKt$TextFieldSelectionHandle$1 = new TextFieldSelectionManagerKt$TextFieldSelectionHandle$1(this.f4764c, cVar);
        textFieldSelectionManagerKt$TextFieldSelectionHandle$1.f4763b = obj;
        return textFieldSelectionManagerKt$TextFieldSelectionHandle$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4762a;
        if (i11 == 0) {
            g.b(obj);
            o oVar = this.f4764c;
            this.f4762a = 1;
            if (LongPressTextDragObserverKt.c((d0) this.f4763b, oVar, this) == d11) {
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

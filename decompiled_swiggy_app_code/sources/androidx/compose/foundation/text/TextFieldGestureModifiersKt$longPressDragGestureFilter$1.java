package androidx.compose.foundation.text;

import a0.o;
import bp0.g;
import bp0.k;
import f1.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$longPressDragGestureFilter$1", f = "TextFieldGestureModifiers.kt", l = {35}, m = "invokeSuspend")
/* compiled from: TextFieldGestureModifiers.kt */
final class TextFieldGestureModifiersKt$longPressDragGestureFilter$1 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4541a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f4542b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o f4543c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldGestureModifiersKt$longPressDragGestureFilter$1(o oVar, c<? super TextFieldGestureModifiersKt$longPressDragGestureFilter$1> cVar) {
        super(2, cVar);
        this.f4543c = oVar;
    }

    /* renamed from: a */
    public final Object invoke(d0 d0Var, c<? super k> cVar) {
        return ((TextFieldGestureModifiersKt$longPressDragGestureFilter$1) create(d0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        TextFieldGestureModifiersKt$longPressDragGestureFilter$1 textFieldGestureModifiersKt$longPressDragGestureFilter$1 = new TextFieldGestureModifiersKt$longPressDragGestureFilter$1(this.f4543c, cVar);
        textFieldGestureModifiersKt$longPressDragGestureFilter$1.f4542b = obj;
        return textFieldGestureModifiersKt$longPressDragGestureFilter$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4541a;
        if (i11 == 0) {
            g.b(obj);
            o oVar = this.f4543c;
            this.f4541a = 1;
            if (LongPressTextDragObserverKt.d((d0) this.f4542b, oVar, this) == d11) {
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

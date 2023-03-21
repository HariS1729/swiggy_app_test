package androidx.compose.foundation.text;

import a0.o;
import bp0.g;
import bp0.k;
import f1.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1", f = "CoreTextField.kt", l = {947}, m = "invokeSuspend")
/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$TextFieldCursorHandle$1 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4441a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f4442b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o f4443c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$TextFieldCursorHandle$1(o oVar, c<? super CoreTextFieldKt$TextFieldCursorHandle$1> cVar) {
        super(2, cVar);
        this.f4443c = oVar;
    }

    /* renamed from: a */
    public final Object invoke(d0 d0Var, c<? super k> cVar) {
        return ((CoreTextFieldKt$TextFieldCursorHandle$1) create(d0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        CoreTextFieldKt$TextFieldCursorHandle$1 coreTextFieldKt$TextFieldCursorHandle$1 = new CoreTextFieldKt$TextFieldCursorHandle$1(this.f4443c, cVar);
        coreTextFieldKt$TextFieldCursorHandle$1.f4442b = obj;
        return coreTextFieldKt$TextFieldCursorHandle$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4441a;
        if (i11 == 0) {
            g.b(obj);
            o oVar = this.f4443c;
            this.f4441a = 1;
            if (LongPressTextDragObserverKt.c((d0) this.f4442b, oVar, this) == d11) {
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

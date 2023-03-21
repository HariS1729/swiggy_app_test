package androidx.compose.foundation.text;

import a0.n;
import a0.s;
import androidx.compose.ui.text.input.TextFieldValue;
import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import p1.y;
import wp0.j0;

@d(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", f = "CoreTextField.kt", l = {298}, m = "invokeSuspend")
/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4396a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ y.d f4397b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextFieldValue f4398c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ TextFieldState f4399d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ s f4400e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ v1.s f4401f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(y.d dVar, TextFieldValue textFieldValue, TextFieldState textFieldState, s sVar, v1.s sVar2, c<? super CoreTextFieldKt$CoreTextField$focusModifier$1$1$1> cVar) {
        super(2, cVar);
        this.f4397b = dVar;
        this.f4398c = textFieldValue;
        this.f4399d = textFieldState;
        this.f4400e = sVar;
        this.f4401f = sVar2;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(this.f4397b, this.f4398c, this.f4399d, this.f4400e, this.f4401f, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((CoreTextFieldKt$CoreTextField$focusModifier$1$1$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4396a;
        if (i11 == 0) {
            g.b(obj);
            y.d dVar = this.f4397b;
            TextFieldValue textFieldValue = this.f4398c;
            n q = this.f4399d.q();
            y i12 = this.f4400e.i();
            v1.s sVar = this.f4401f;
            this.f4396a = 1;
            if (CoreTextFieldKt.j(dVar, textFieldValue, q, i12, sVar, this) == d11) {
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

package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.input.TextFieldValue;
import bp0.k;
import fp0.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineStart;
import lp0.l;
import s0.r;
import t0.f;
import v1.a0;
import v1.m;
import v1.s;
import wp0.j0;
import wp0.k1;
import y.d;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$focusModifier$1 extends Lambda implements l<r, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldState f4388a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a0 f4389b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextFieldValue f4390c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ m f4391d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionManager f4392e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ j0 f4393f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ d f4394g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ s f4395h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$focusModifier$1(TextFieldState textFieldState, a0 a0Var, TextFieldValue textFieldValue, m mVar, TextFieldSelectionManager textFieldSelectionManager, j0 j0Var, d dVar, s sVar) {
        super(1);
        this.f4388a = textFieldState;
        this.f4389b = a0Var;
        this.f4390c = textFieldValue;
        this.f4391d = mVar;
        this.f4392e = textFieldSelectionManager;
        this.f4393f = j0Var;
        this.f4394g = dVar;
        this.f4395h = sVar;
    }

    public final void a(r rVar) {
        a0.s g11;
        p.j(rVar, "it");
        if (this.f4388a.d() != rVar.isFocused()) {
            this.f4388a.s(rVar.isFocused());
            a0 a0Var = this.f4389b;
            if (a0Var != null) {
                CoreTextFieldKt.k(a0Var, this.f4388a, this.f4390c, this.f4391d);
                if (rVar.isFocused() && (g11 = this.f4388a.g()) != null) {
                    k1 unused = j.d(this.f4393f, (CoroutineContext) null, (CoroutineStart) null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(this.f4394g, this.f4390c, this.f4388a, g11, this.f4395h, (c<? super CoreTextFieldKt$CoreTextField$focusModifier$1$1$1>) null), 3, (Object) null);
                }
            }
            if (!rVar.isFocused()) {
                TextFieldSelectionManager.q(this.f4392e, (f) null, 1, (Object) null);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((r) obj);
        return k.f22762a;
    }
}

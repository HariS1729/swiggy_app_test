package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.input.TextFieldValue;
import bp0.k;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;
import n1.q;
import p1.a0;
import p1.b;
import p1.b0;
import p1.y;
import s0.o;
import v1.d0;
import v1.m;
import v1.s;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$semanticsModifier$1 extends Lambda implements l<q, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f4411a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d0 f4412b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextFieldValue f4413c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f4414d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f4415e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f4416f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ TextFieldState f4417g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ s f4418h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionManager f4419i;
    final /* synthetic */ o j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$semanticsModifier$1(m mVar, d0 d0Var, TextFieldValue textFieldValue, boolean z11, boolean z12, boolean z13, TextFieldState textFieldState, s sVar, TextFieldSelectionManager textFieldSelectionManager, o oVar) {
        super(1);
        this.f4411a = mVar;
        this.f4412b = d0Var;
        this.f4413c = textFieldValue;
        this.f4414d = z11;
        this.f4415e = z12;
        this.f4416f = z13;
        this.f4417g = textFieldState;
        this.f4418h = sVar;
        this.f4419i = textFieldSelectionManager;
        this.j = oVar;
    }

    public final void a(q qVar) {
        p.j(qVar, "$this$semantics");
        n1.o.G(qVar, this.f4411a.d());
        n1.o.D(qVar, this.f4412b.b());
        n1.o.R(qVar, this.f4413c.g());
        if (!this.f4414d) {
            n1.o.f(qVar);
        }
        if (this.f4415e) {
            n1.o.r(qVar);
        }
        final TextFieldState textFieldState = this.f4417g;
        n1.o.k(qVar, (String) null, new l<List<y>, Boolean>() {
            /* renamed from: a */
            public final Boolean invoke(List<y> list) {
                boolean z11;
                p.j(list, "it");
                if (textFieldState.g() != null) {
                    a0.s g11 = textFieldState.g();
                    p.g(g11);
                    list.add(g11.i());
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        }, 1, (Object) null);
        final TextFieldState textFieldState2 = this.f4417g;
        n1.o.Q(qVar, (String) null, new l<b, Boolean>() {
            /* renamed from: a */
            public final Boolean invoke(b bVar) {
                p.j(bVar, "it");
                textFieldState2.i().invoke(new TextFieldValue(bVar.g(), b0.a(bVar.g().length()), (a0) null, 4, (i) null));
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
        final s sVar = this.f4418h;
        final boolean z11 = this.f4414d;
        final TextFieldValue textFieldValue = this.f4413c;
        final TextFieldSelectionManager textFieldSelectionManager = this.f4419i;
        final TextFieldState textFieldState3 = this.f4417g;
        n1.o.M(qVar, (String) null, new lp0.q<Integer, Integer, Boolean, Boolean>() {
            public final Boolean a(int i11, int i12, boolean z11) {
                if (!z11) {
                    i11 = sVar.a(i11);
                }
                if (!z11) {
                    i12 = sVar.a(i12);
                }
                boolean z12 = false;
                if (z11 && !(i11 == a0.n(textFieldValue.g()) && i12 == a0.i(textFieldValue.g()))) {
                    if (l.i(i11, i12) < 0 || l.d(i11, i12) > textFieldValue.e().length()) {
                        textFieldSelectionManager.s();
                    } else {
                        if (z11 || i11 == i12) {
                            textFieldSelectionManager.s();
                        } else {
                            textFieldSelectionManager.r();
                        }
                        textFieldState3.i().invoke(new TextFieldValue(textFieldValue.e(), b0.b(i11, i12), (a0) null, 4, (i) null));
                        z12 = true;
                    }
                }
                return Boolean.valueOf(z12);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        }, 1, (Object) null);
        final TextFieldState textFieldState4 = this.f4417g;
        final o oVar = this.j;
        final boolean z12 = this.f4416f;
        n1.o.o(qVar, (String) null, new a<Boolean>() {
            /* renamed from: a */
            public final Boolean invoke() {
                CoreTextFieldKt.n(textFieldState4, oVar, !z12);
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
        final TextFieldSelectionManager textFieldSelectionManager2 = this.f4419i;
        n1.o.q(qVar, (String) null, new a<Boolean>() {
            /* renamed from: a */
            public final Boolean invoke() {
                textFieldSelectionManager2.r();
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
        if (!a0.h(this.f4413c.g()) && !this.f4415e) {
            final TextFieldSelectionManager textFieldSelectionManager3 = this.f4419i;
            n1.o.b(qVar, (String) null, new a<Boolean>() {
                /* renamed from: a */
                public final Boolean invoke() {
                    TextFieldSelectionManager.l(textFieldSelectionManager3, false, 1, (Object) null);
                    return Boolean.TRUE;
                }
            }, 1, (Object) null);
            if (this.f4414d && !this.f4416f) {
                final TextFieldSelectionManager textFieldSelectionManager4 = this.f4419i;
                n1.o.d(qVar, (String) null, new a<Boolean>() {
                    /* renamed from: a */
                    public final Boolean invoke() {
                        textFieldSelectionManager4.o();
                        return Boolean.TRUE;
                    }
                }, 1, (Object) null);
            }
        }
        if (this.f4414d && !this.f4416f) {
            final TextFieldSelectionManager textFieldSelectionManager5 = this.f4419i;
            n1.o.t(qVar, (String) null, new a<Boolean>() {
                /* renamed from: a */
                public final Boolean invoke() {
                    textFieldSelectionManager5.L();
                    return Boolean.TRUE;
                }
            }, 1, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((q) obj);
        return k.f22762a;
    }
}

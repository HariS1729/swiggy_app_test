package androidx.compose.foundation.text;

import a0.c;
import a0.w;
import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.TextFieldValue;
import b0.n;
import bp0.k;
import d1.b;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import p0.d;
import v1.s;

/* compiled from: TextFieldKeyInput.kt */
final class TextFieldKeyInputKt$textFieldKeyInput$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldState f4569a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionManager f4570b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextFieldValue f4571c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f4572d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f4573e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ s f4574f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ w f4575g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ l<TextFieldValue, k> f4576h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldKeyInputKt$textFieldKeyInput$2(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z11, boolean z12, s sVar, w wVar, l<? super TextFieldValue, k> lVar) {
        super(3);
        this.f4569a = textFieldState;
        this.f4570b = textFieldSelectionManager;
        this.f4571c = textFieldValue;
        this.f4572d = z11;
        this.f4573e = z12;
        this.f4574f = sVar;
        this.f4575g = wVar;
        this.f4576h = lVar;
    }

    public final d a(d dVar, g gVar, int i11) {
        g gVar2 = gVar;
        p.j(dVar, "$this$composed");
        gVar2.E(58482146);
        gVar2.E(-492369756);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            F = new n();
            gVar2.y(F);
        }
        gVar.P();
        d b11 = KeyInputModifierKt.b(d.f16037h0, new l<b, Boolean>(new TextFieldKeyInput(this.f4569a, this.f4570b, this.f4571c, this.f4572d, this.f4573e, (n) F, this.f4574f, this.f4575g, (c) null, this.f4576h, 256, (i) null)) {
            public final Boolean h(KeyEvent keyEvent) {
                p.j(keyEvent, "p0");
                return Boolean.valueOf(((TextFieldKeyInput) this.receiver).j(keyEvent));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return h(((b) obj).f());
            }
        });
        gVar.P();
        return b11;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}

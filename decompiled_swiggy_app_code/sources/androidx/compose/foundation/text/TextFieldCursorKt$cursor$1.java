package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.q;
import p0.d;
import u0.u;
import v1.s;

/* compiled from: TextFieldCursor.kt */
final class TextFieldCursorKt$cursor$1 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ u f4526a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TextFieldState f4527b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextFieldValue f4528c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ s f4529d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldCursorKt$cursor$1(u uVar, TextFieldState textFieldState, TextFieldValue textFieldValue, s sVar) {
        super(3);
        this.f4526a = uVar;
        this.f4527b = textFieldState;
        this.f4528c = textFieldValue;
        this.f4529d = sVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004a, code lost:
        if ((((u0.k1) r13).b() == u0.d0.f16756b.f()) == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p0.d a(p0.d r11, e0.g r12, int r13) {
        /*
            r10 = this;
            java.lang.String r13 = "$this$composed"
            kotlin.jvm.internal.p.j(r11, r13)
            r13 = 1634330012(0x6169e59c, float:2.6966478E20)
            r12.E(r13)
            r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.E(r13)
            java.lang.Object r13 = r12.F()
            e0.g$a r0 = e0.g.f14172a
            java.lang.Object r0 = r0.a()
            r1 = 0
            if (r13 != r0) goto L_0x0029
            r13 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            r2 = 2
            androidx.compose.animation.core.Animatable r13 = defpackage.v1.b.b(r13, r0, r2, r1)
            r12.y(r13)
        L_0x0029:
            r12.P()
            r3 = r13
            androidx.compose.animation.core.Animatable r3 = (androidx.compose.animation.core.Animatable) r3
            u0.u r13 = r10.f4526a
            boolean r0 = r13 instanceof u0.k1
            r2 = 0
            r4 = 1
            if (r0 == 0) goto L_0x004c
            u0.k1 r13 = (u0.k1) r13
            long r5 = r13.b()
            u0.d0$a r13 = u0.d0.f16756b
            long r7 = r13.f()
            int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r13 != 0) goto L_0x0049
            r13 = 1
            goto L_0x004a
        L_0x0049:
            r13 = 0
        L_0x004a:
            if (r13 != 0) goto L_0x004d
        L_0x004c:
            r2 = 1
        L_0x004d:
            androidx.compose.foundation.text.TextFieldState r13 = r10.f4527b
            boolean r13 = r13.d()
            if (r13 == 0) goto L_0x0092
            androidx.compose.ui.text.input.TextFieldValue r13 = r10.f4528c
            long r4 = r13.g()
            boolean r13 = p1.a0.h(r4)
            if (r13 == 0) goto L_0x0092
            if (r2 == 0) goto L_0x0092
            u0.u r4 = r10.f4526a
            androidx.compose.ui.text.input.TextFieldValue r13 = r10.f4528c
            p1.b r5 = r13.e()
            androidx.compose.ui.text.input.TextFieldValue r13 = r10.f4528c
            long r6 = r13.g()
            p1.a0 r6 = p1.a0.b(r6)
            androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1 r7 = new androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1
            r7.<init>(r3, r1)
            r9 = 0
            r8 = r12
            e0.u.c(r4, r5, r6, r7, r8, r9)
            androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2 r13 = new androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2
            v1.s r4 = r10.f4529d
            androidx.compose.ui.text.input.TextFieldValue r5 = r10.f4528c
            androidx.compose.foundation.text.TextFieldState r6 = r10.f4527b
            u0.u r7 = r10.f4526a
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            p0.d r11 = androidx.compose.ui.draw.DrawModifierKt.c(r11, r13)
            goto L_0x0094
        L_0x0092:
            p0.d$a r11 = p0.d.f16037h0
        L_0x0094:
            r12.P()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.a(p0.d, e0.g, int):p0.d");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}

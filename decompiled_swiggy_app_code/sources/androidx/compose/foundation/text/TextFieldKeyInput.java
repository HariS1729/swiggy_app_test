package androidx.compose.foundation.text;

import a0.c;
import a0.m;
import a0.q;
import a0.w;
import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.input.TextFieldValue;
import b0.n;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.p;
import lp0.l;
import p1.a0;
import v1.a;
import v1.d;
import v1.f;
import v1.i;
import v1.s;

/* compiled from: TextFieldKeyInput.kt */
public final class TextFieldKeyInput {

    /* renamed from: a  reason: collision with root package name */
    private final TextFieldState f4547a;

    /* renamed from: b  reason: collision with root package name */
    private final TextFieldSelectionManager f4548b;

    /* renamed from: c  reason: collision with root package name */
    private final TextFieldValue f4549c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4550d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4551e;

    /* renamed from: f  reason: collision with root package name */
    private final n f4552f;

    /* renamed from: g  reason: collision with root package name */
    private final s f4553g;

    /* renamed from: h  reason: collision with root package name */
    private final w f4554h;

    /* renamed from: i  reason: collision with root package name */
    private final c f4555i;
    /* access modifiers changed from: private */
    public final l<TextFieldValue, k> j;

    public TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z11, boolean z12, n nVar, s sVar, w wVar, c cVar, l<? super TextFieldValue, k> lVar) {
        p.j(textFieldState, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(textFieldSelectionManager, "selectionManager");
        p.j(textFieldValue, "value");
        p.j(nVar, "preparedSelectionState");
        p.j(sVar, "offsetMapping");
        p.j(cVar, "keyMapping");
        p.j(lVar, "onValueChange");
        this.f4547a = textFieldState;
        this.f4548b = textFieldSelectionManager;
        this.f4549c = textFieldValue;
        this.f4550d = z11;
        this.f4551e = z12;
        this.f4552f = nVar;
        this.f4553g = sVar;
        this.f4554h = wVar;
        this.f4555i = cVar;
        this.j = lVar;
    }

    /* access modifiers changed from: private */
    public final void d(List<? extends d> list) {
        f j11 = this.f4547a.j();
        List G0 = s.G0(list);
        G0.add(0, new i());
        this.j.invoke(j11.a(G0));
    }

    /* access modifiers changed from: private */
    public final void e(d dVar) {
        d(j.d(dVar));
    }

    private final void f(l<? super b0.l, k> lVar) {
        b0.l lVar2 = new b0.l(this.f4549c, this.f4553g, this.f4547a.g(), this.f4552f);
        lVar.invoke(lVar2);
        if (!a0.g(lVar2.w(), this.f4549c.g()) || !p.e(lVar2.e(), this.f4549c.e())) {
            this.j.invoke(lVar2.b0());
        }
    }

    private final a k(KeyEvent keyEvent) {
        if (!q.a(keyEvent)) {
            return null;
        }
        String sb2 = m.a(new StringBuilder(), d1.d.c(keyEvent)).toString();
        p.i(sb2, "StringBuilder().appendCo…              .toString()");
        return new a(sb2, 1);
    }

    public final TextFieldSelectionManager g() {
        return this.f4548b;
    }

    public final boolean h() {
        return this.f4551e;
    }

    public final w i() {
        return this.f4554h;
    }

    public final boolean j(KeyEvent keyEvent) {
        KeyCommand a11;
        p.j(keyEvent, "event");
        a k = k(keyEvent);
        if (k != null) {
            if (!this.f4550d) {
                return false;
            }
            e(k);
            this.f4552f.b();
            return true;
        } else if (!d1.c.e(d1.d.b(keyEvent), d1.c.f13981a.a()) || (a11 = this.f4555i.a(keyEvent)) == null || (a11.getEditsText() && !this.f4550d)) {
            return false;
        } else {
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.f25661a = true;
            f(new TextFieldKeyInput$process$2(a11, this, ref$BooleanRef));
            w wVar = this.f4554h;
            if (wVar != null) {
                wVar.a();
            }
            return ref$BooleanRef.f25661a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextFieldKeyInput(androidx.compose.foundation.text.TextFieldState r21, androidx.compose.foundation.text.selection.TextFieldSelectionManager r22, androidx.compose.ui.text.input.TextFieldValue r23, boolean r24, boolean r25, b0.n r26, v1.s r27, a0.w r28, a0.c r29, lp0.l r30, int r31, kotlin.jvm.internal.i r32) {
        /*
            r20 = this;
            r0 = r31
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0014
            androidx.compose.ui.text.input.TextFieldValue r1 = new androidx.compose.ui.text.input.TextFieldValue
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 7
            r8 = 0
            r2 = r1
            r2.<init>((java.lang.String) r3, (long) r4, (p1.a0) r6, (int) r7, (kotlin.jvm.internal.i) r8)
            r12 = r1
            goto L_0x0016
        L_0x0014:
            r12 = r23
        L_0x0016:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001d
            r1 = 1
            r13 = 1
            goto L_0x001f
        L_0x001d:
            r13 = r24
        L_0x001f:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0026
            r1 = 0
            r14 = 0
            goto L_0x0028
        L_0x0026:
            r14 = r25
        L_0x0028:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0035
            v1.s$a r1 = v1.s.f17192a
            v1.s r1 = r1.a()
            r16 = r1
            goto L_0x0037
        L_0x0035:
            r16 = r27
        L_0x0037:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003f
            r1 = 0
            r17 = r1
            goto L_0x0041
        L_0x003f:
            r17 = r28
        L_0x0041:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004c
            a0.c r1 = a0.d.a()
            r18 = r1
            goto L_0x004e
        L_0x004c:
            r18 = r29
        L_0x004e:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0057
            androidx.compose.foundation.text.TextFieldKeyInput$1 r0 = androidx.compose.foundation.text.TextFieldKeyInput.AnonymousClass1.f4556a
            r19 = r0
            goto L_0x0059
        L_0x0057:
            r19 = r30
        L_0x0059:
            r9 = r20
            r10 = r21
            r11 = r22
            r15 = r26
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldKeyInput.<init>(androidx.compose.foundation.text.TextFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager, androidx.compose.ui.text.input.TextFieldValue, boolean, boolean, b0.n, v1.s, a0.w, a0.c, lp0.l, int, kotlin.jvm.internal.i):void");
    }
}

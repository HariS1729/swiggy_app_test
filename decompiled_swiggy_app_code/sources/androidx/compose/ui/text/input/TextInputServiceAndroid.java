package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import bp0.f;
import bp0.k;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.channels.BufferOverflow;
import lp0.l;
import p1.a0;
import v1.b0;
import v1.d;
import v1.m;
import v1.n;
import v1.o;
import v1.u;
import v1.v;

/* compiled from: TextInputServiceAndroid.android.kt */
public final class TextInputServiceAndroid implements u {

    /* renamed from: a  reason: collision with root package name */
    private final View f7619a;

    /* renamed from: b  reason: collision with root package name */
    private final o f7620b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7621c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public l<? super List<? extends d>, k> f7622d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public l<? super v1.l, k> f7623e;

    /* renamed from: f  reason: collision with root package name */
    private TextFieldValue f7624f;

    /* renamed from: g  reason: collision with root package name */
    private m f7625g;

    /* renamed from: h  reason: collision with root package name */
    private v f7626h;

    /* renamed from: i  reason: collision with root package name */
    private final f f7627i;
    private Rect j;
    private final yp0.f<TextInputCommand> k;

    /* compiled from: TextInputServiceAndroid.android.kt */
    private enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7628a;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            iArr[TextInputCommand.StartInput.ordinal()] = 1;
            iArr[TextInputCommand.StopInput.ordinal()] = 2;
            iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            f7628a = iArr;
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    public static final class b implements n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextInputServiceAndroid f7629a;

        b(TextInputServiceAndroid textInputServiceAndroid) {
            this.f7629a = textInputServiceAndroid;
        }

        public void a(KeyEvent keyEvent) {
            p.j(keyEvent, "event");
            this.f7629a.j().sendKeyEvent(keyEvent);
        }

        public void b(int i11) {
            this.f7629a.f7623e.invoke(v1.l.i(i11));
        }

        public void c(List<? extends d> list) {
            p.j(list, "editCommands");
            this.f7629a.f7622d.invoke(list);
        }
    }

    public TextInputServiceAndroid(View view, o oVar) {
        p.j(view, "view");
        p.j(oVar, "inputMethodManager");
        this.f7619a = view;
        this.f7620b = oVar;
        this.f7622d = TextInputServiceAndroid$onEditCommand$1.f7631a;
        this.f7623e = TextInputServiceAndroid$onImeActionPerformed$1.f7632a;
        this.f7624f = new TextFieldValue("", a0.f16041b.a(), (a0) null, 4, (i) null);
        this.f7625g = m.f17149f.a();
        this.f7627i = b.a(LazyThreadSafetyMode.NONE, new TextInputServiceAndroid$baseInputConnection$2(this));
        this.k = yp0.i.b(Integer.MAX_VALUE, (BufferOverflow) null, (l) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    public final BaseInputConnection j() {
        return (BaseInputConnection) this.f7627i.getValue();
    }

    private final void m() {
        this.f7620b.e(this.f7619a);
    }

    private final void n(boolean z11) {
        if (z11) {
            this.f7620b.a(this.f7619a);
        } else {
            this.f7620b.b(this.f7619a.getWindowToken());
        }
    }

    private static final void p(TextInputCommand textInputCommand, Ref$ObjectRef<Boolean> ref$ObjectRef, Ref$ObjectRef<Boolean> ref$ObjectRef2) {
        int i11 = a.f7628a[textInputCommand.ordinal()];
        boolean z11 = true;
        if (i11 == 1) {
            T t = Boolean.TRUE;
            ref$ObjectRef.f25666a = t;
            ref$ObjectRef2.f25666a = t;
        } else if (i11 == 2) {
            T t11 = Boolean.FALSE;
            ref$ObjectRef.f25666a = t11;
            ref$ObjectRef2.f25666a = t11;
        } else if ((i11 == 3 || i11 == 4) && !p.e(ref$ObjectRef.f25666a, Boolean.FALSE)) {
            if (textInputCommand != TextInputCommand.ShowKeyboard) {
                z11 = false;
            }
            ref$ObjectRef2.f25666a = Boolean.valueOf(z11);
        }
    }

    public void a(TextFieldValue textFieldValue, m mVar, l<? super List<? extends d>, k> lVar, l<? super v1.l, k> lVar2) {
        p.j(textFieldValue, "value");
        p.j(mVar, "imeOptions");
        p.j(lVar, "onEditCommand");
        p.j(lVar2, "onImeActionPerformed");
        this.f7621c = true;
        this.f7624f = textFieldValue;
        this.f7625g = mVar;
        this.f7622d = lVar;
        this.f7623e = lVar2;
        this.k.e(TextInputCommand.StartInput);
    }

    public void b() {
        this.f7621c = false;
        this.f7622d = TextInputServiceAndroid$stopInput$1.f7633a;
        this.f7623e = TextInputServiceAndroid$stopInput$2.f7634a;
        this.j = null;
        this.k.e(TextInputCommand.StopInput);
    }

    public void c(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        p.j(textFieldValue2, "newValue");
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = !a0.g(this.f7624f.g(), textFieldValue2.g()) || !p.e(this.f7624f.f(), textFieldValue2.f());
        this.f7624f = textFieldValue2;
        v vVar = this.f7626h;
        if (vVar != null) {
            vVar.e(textFieldValue2);
        }
        if (!p.e(textFieldValue, textFieldValue2)) {
            if (textFieldValue != null) {
                if (p.e(textFieldValue.h(), textFieldValue2.h()) && (!a0.g(textFieldValue.g(), textFieldValue2.g()) || p.e(textFieldValue.f(), textFieldValue2.f()))) {
                    z11 = false;
                }
                z12 = z11;
            }
            if (z12) {
                m();
                return;
            }
            v vVar2 = this.f7626h;
            if (vVar2 != null) {
                vVar2.f(this.f7624f, this.f7620b, this.f7619a);
            }
        } else if (z13) {
            o oVar = this.f7620b;
            View view = this.f7619a;
            int l11 = a0.l(textFieldValue2.g());
            int k11 = a0.k(textFieldValue2.g());
            a0 f11 = this.f7624f.f();
            int l12 = f11 != null ? a0.l(f11.r()) : -1;
            a0 f12 = this.f7624f.f();
            oVar.c(view, l11, k11, l12, f12 != null ? a0.k(f12.r()) : -1);
        }
    }

    public void d() {
        this.k.e(TextInputCommand.HideKeyboard);
    }

    public void e() {
        this.k.e(TextInputCommand.ShowKeyboard);
    }

    public final InputConnection i(EditorInfo editorInfo) {
        p.j(editorInfo, "outAttrs");
        if (!this.f7621c) {
            return null;
        }
        b0.b(editorInfo, this.f7625g, this.f7624f);
        v vVar = new v(this.f7624f, new b(this), this.f7625g.b());
        this.f7626h = vVar;
        return vVar;
    }

    public final View k() {
        return this.f7619a;
    }

    public final boolean l() {
        return this.f7621c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(fp0.c<? super bp0.k> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1 r0 = (androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1) r0
            int r1 = r0.f7639e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7639e = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1 r0 = new androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f7637c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f7639e
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r2 = r0.f7636b
            yp0.h r2 = (yp0.h) r2
            java.lang.Object r4 = r0.f7635a
            androidx.compose.ui.text.input.TextInputServiceAndroid r4 = (androidx.compose.ui.text.input.TextInputServiceAndroid) r4
            bp0.g.b(r9)
            goto L_0x0051
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0039:
            bp0.g.b(r9)
            yp0.f<androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand> r9 = r8.k
            yp0.h r9 = r9.iterator()
            r4 = r8
            r2 = r9
        L_0x0044:
            r0.f7635a = r4
            r0.f7636b = r2
            r0.f7639e = r3
            java.lang.Object r9 = r2.a(r0)
            if (r9 != r1) goto L_0x0051
            return r1
        L_0x0051:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00bd
            java.lang.Object r9 = r2.next()
            androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r9 = (androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand) r9
            android.view.View r5 = r4.f7619a
            boolean r5 = r5.isFocused()
            if (r5 != 0) goto L_0x0074
        L_0x0067:
            yp0.f<androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand> r9 = r4.k
            java.lang.Object r9 = r9.h()
            boolean r9 = yp0.j.j(r9)
            if (r9 != 0) goto L_0x0067
            goto L_0x0044
        L_0x0074:
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
        L_0x007e:
            if (r9 == 0) goto L_0x0090
            p(r9, r5, r6)
            yp0.f<androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand> r9 = r4.k
            java.lang.Object r9 = r9.h()
            java.lang.Object r9 = yp0.j.f(r9)
            androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r9 = (androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand) r9
            goto L_0x007e
        L_0x0090:
            T r9 = r5.f25666a
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.a.a(r3)
            boolean r9 = kotlin.jvm.internal.p.e(r9, r7)
            if (r9 == 0) goto L_0x009f
            r4.m()
        L_0x009f:
            T r9 = r6.f25666a
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L_0x00ac
            boolean r9 = r9.booleanValue()
            r4.n(r9)
        L_0x00ac:
            T r9 = r5.f25666a
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
            boolean r9 = kotlin.jvm.internal.p.e(r9, r5)
            if (r9 == 0) goto L_0x0044
            r4.m()
            goto L_0x0044
        L_0x00bd:
            bp0.k r9 = bp0.k.f22762a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.TextInputServiceAndroid.o(fp0.c):java.lang.Object");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputServiceAndroid(android.view.View r4) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.p.j(r4, r0)
            androidx.compose.ui.text.input.InputMethodManagerImpl r0 = new androidx.compose.ui.text.input.InputMethodManagerImpl
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "view.context"
            kotlin.jvm.internal.p.i(r1, r2)
            r0.<init>(r1)
            r3.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.TextInputServiceAndroid.<init>(android.view.View):void");
    }
}

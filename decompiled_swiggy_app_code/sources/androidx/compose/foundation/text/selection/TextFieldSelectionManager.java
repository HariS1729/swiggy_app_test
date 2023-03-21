package androidx.compose.foundation.text.selection;

import a0.w;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.platform.e0;
import androidx.compose.ui.platform.g1;
import androidx.compose.ui.text.input.TextFieldValue;
import b0.i;
import bp0.k;
import d2.e;
import e0.a1;
import e0.h0;
import kotlin.jvm.internal.p;
import lp0.l;
import p1.a0;
import p1.b0;
import p1.y;
import s0.o;
import t0.f;
import t0.g;
import t0.h;
import v1.f0;
import v1.s;
import v1.z;

/* compiled from: TextFieldSelectionManager.kt */
public final class TextFieldSelectionManager {

    /* renamed from: a  reason: collision with root package name */
    private final w f4737a;

    /* renamed from: b  reason: collision with root package name */
    private s f4738b;

    /* renamed from: c  reason: collision with root package name */
    private l<? super TextFieldValue, k> f4739c;

    /* renamed from: d  reason: collision with root package name */
    private TextFieldState f4740d;

    /* renamed from: e  reason: collision with root package name */
    private final h0 f4741e;

    /* renamed from: f  reason: collision with root package name */
    private f0 f4742f;

    /* renamed from: g  reason: collision with root package name */
    private e0 f4743g;

    /* renamed from: h  reason: collision with root package name */
    private g1 f4744h;

    /* renamed from: i  reason: collision with root package name */
    private a1.a f4745i;
    private o j;
    private final h0 k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public long f4746l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public Integer f4747m;
    /* access modifiers changed from: private */
    public long n;

    /* renamed from: o  reason: collision with root package name */
    private final h0 f4748o;

    /* renamed from: p  reason: collision with root package name */
    private final h0 f4749p;
    private TextFieldValue q;

    /* renamed from: r  reason: collision with root package name */
    private final a0.o f4750r;

    /* renamed from: s  reason: collision with root package name */
    private final b0.c f4751s;

    /* compiled from: TextFieldSelectionManager.kt */
    public static final class a implements a0.o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextFieldSelectionManager f4752a;

        a(TextFieldSelectionManager textFieldSelectionManager) {
            this.f4752a = textFieldSelectionManager;
        }

        public void d() {
            this.f4752a.P((Handle) null);
            this.f4752a.O((f) null);
        }

        public void e() {
        }

        public void f(long j) {
            this.f4752a.P(Handle.Cursor);
            TextFieldSelectionManager textFieldSelectionManager = this.f4752a;
            textFieldSelectionManager.O(f.d(i.a(textFieldSelectionManager.z(true))));
        }

        public void g(long j) {
            a0.s g11;
            y i11;
            TextFieldSelectionManager textFieldSelectionManager = this.f4752a;
            textFieldSelectionManager.n = f.r(textFieldSelectionManager.n, j);
            TextFieldState E = this.f4752a.E();
            if (E != null && (g11 = E.g()) != null && (i11 = g11.i()) != null) {
                TextFieldSelectionManager textFieldSelectionManager2 = this.f4752a;
                textFieldSelectionManager2.O(f.d(f.r(textFieldSelectionManager2.f4746l, textFieldSelectionManager2.n)));
                f u11 = textFieldSelectionManager2.u();
                p.g(u11);
                int w11 = i11.w(u11.u());
                long b11 = b0.b(w11, w11);
                if (!a0.g(b11, textFieldSelectionManager2.H().g())) {
                    a1.a A = textFieldSelectionManager2.A();
                    if (A != null) {
                        A.a(a1.b.f879a.b());
                    }
                    textFieldSelectionManager2.D().invoke(textFieldSelectionManager2.m(textFieldSelectionManager2.H().e(), b11));
                }
            }
        }

        public void h(long j) {
            TextFieldSelectionManager textFieldSelectionManager = this.f4752a;
            textFieldSelectionManager.f4746l = i.a(textFieldSelectionManager.z(true));
            TextFieldSelectionManager textFieldSelectionManager2 = this.f4752a;
            textFieldSelectionManager2.O(f.d(textFieldSelectionManager2.f4746l));
            this.f4752a.n = f.f16662b.c();
            this.f4752a.P(Handle.Cursor);
        }

        public void i() {
            this.f4752a.P((Handle) null);
            this.f4752a.O((f) null);
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    public static final class b implements a0.o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextFieldSelectionManager f4753a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f4754b;

        b(TextFieldSelectionManager textFieldSelectionManager, boolean z11) {
            this.f4753a = textFieldSelectionManager;
            this.f4754b = z11;
        }

        public void d() {
            TextToolbarStatus textToolbarStatus = null;
            this.f4753a.P((Handle) null);
            this.f4753a.O((f) null);
            TextFieldState E = this.f4753a.E();
            if (E != null) {
                E.x(true);
            }
            g1 F = this.f4753a.F();
            if (F != null) {
                textToolbarStatus = F.getStatus();
            }
            if (textToolbarStatus == TextToolbarStatus.Hidden) {
                this.f4753a.a0();
            }
        }

        public void e() {
        }

        public void f(long j) {
            this.f4753a.P(this.f4754b ? Handle.SelectionStart : Handle.SelectionEnd);
            TextFieldSelectionManager textFieldSelectionManager = this.f4753a;
            textFieldSelectionManager.O(f.d(i.a(textFieldSelectionManager.z(this.f4754b))));
        }

        public void g(long j) {
            a0.s g11;
            y i11;
            int i12;
            int i13;
            TextFieldSelectionManager textFieldSelectionManager = this.f4753a;
            textFieldSelectionManager.n = f.r(textFieldSelectionManager.n, j);
            TextFieldState E = this.f4753a.E();
            if (!(E == null || (g11 = E.g()) == null || (i11 = g11.i()) == null)) {
                TextFieldSelectionManager textFieldSelectionManager2 = this.f4753a;
                boolean z11 = this.f4754b;
                textFieldSelectionManager2.O(f.d(f.r(textFieldSelectionManager2.f4746l, textFieldSelectionManager2.n)));
                if (z11) {
                    f u11 = textFieldSelectionManager2.u();
                    p.g(u11);
                    i12 = i11.w(u11.u());
                } else {
                    i12 = textFieldSelectionManager2.C().b(a0.n(textFieldSelectionManager2.H().g()));
                }
                int i14 = i12;
                if (z11) {
                    i13 = textFieldSelectionManager2.C().b(a0.i(textFieldSelectionManager2.H().g()));
                } else {
                    f u12 = textFieldSelectionManager2.u();
                    p.g(u12);
                    i13 = i11.w(u12.u());
                }
                textFieldSelectionManager2.b0(textFieldSelectionManager2.H(), i14, i13, z11, SelectionAdjustment.f4703a.c());
            }
            TextFieldState E2 = this.f4753a.E();
            if (E2 != null) {
                E2.x(false);
            }
        }

        public void h(long j) {
            TextFieldSelectionManager textFieldSelectionManager = this.f4753a;
            textFieldSelectionManager.f4746l = i.a(textFieldSelectionManager.z(this.f4754b));
            TextFieldSelectionManager textFieldSelectionManager2 = this.f4753a;
            textFieldSelectionManager2.O(f.d(textFieldSelectionManager2.f4746l));
            this.f4753a.n = f.f16662b.c();
            this.f4753a.P(this.f4754b ? Handle.SelectionStart : Handle.SelectionEnd);
            TextFieldState E = this.f4753a.E();
            if (E != null) {
                E.x(false);
            }
        }

        public void i() {
            this.f4753a.P((Handle) null);
            this.f4753a.O((f) null);
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    public static final class c implements b0.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextFieldSelectionManager f4755a;

        c(TextFieldSelectionManager textFieldSelectionManager) {
            this.f4755a = textFieldSelectionManager;
        }

        public boolean a(long j, SelectionAdjustment selectionAdjustment) {
            TextFieldState E;
            a0.s g11;
            p.j(selectionAdjustment, "adjustment");
            if ((this.f4755a.H().h().length() == 0) || (E = this.f4755a.E()) == null || (g11 = E.g()) == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager = this.f4755a;
            int g12 = g11.g(j, false);
            TextFieldValue H = textFieldSelectionManager.H();
            Integer b11 = textFieldSelectionManager.f4747m;
            p.g(b11);
            textFieldSelectionManager.b0(H, b11.intValue(), g12, false, selectionAdjustment);
            return true;
        }

        public boolean b(long j) {
            TextFieldState E;
            a0.s g11;
            if ((this.f4755a.H().h().length() == 0) || (E = this.f4755a.E()) == null || (g11 = E.g()) == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager = this.f4755a;
            textFieldSelectionManager.b0(textFieldSelectionManager.H(), textFieldSelectionManager.C().b(a0.n(textFieldSelectionManager.H().g())), g11.g(j, false), false, SelectionAdjustment.f4703a.e());
            return true;
        }

        public boolean c(long j, SelectionAdjustment selectionAdjustment) {
            a0.s g11;
            p.j(selectionAdjustment, "adjustment");
            o y11 = this.f4755a.y();
            if (y11 != null) {
                y11.c();
            }
            this.f4755a.f4746l = j;
            TextFieldState E = this.f4755a.E();
            if (E == null || (g11 = E.g()) == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager = this.f4755a;
            a0.s sVar = g11;
            textFieldSelectionManager.f4747m = Integer.valueOf(a0.s.h(sVar, j, false, 2, (Object) null));
            int h11 = a0.s.h(sVar, textFieldSelectionManager.f4746l, false, 2, (Object) null);
            textFieldSelectionManager.b0(textFieldSelectionManager.H(), h11, h11, false, selectionAdjustment);
            return true;
        }

        public boolean d(long j) {
            a0.s g11;
            TextFieldState E = this.f4755a.E();
            if (E == null || (g11 = E.g()) == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager = this.f4755a;
            TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
            textFieldSelectionManager2.b0(textFieldSelectionManager.H(), textFieldSelectionManager.C().b(a0.n(textFieldSelectionManager.H().g())), a0.s.h(g11, j, false, 2, (Object) null), false, SelectionAdjustment.f4703a.e());
            return true;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    public static final class d implements a0.o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextFieldSelectionManager f4756a;

        d(TextFieldSelectionManager textFieldSelectionManager) {
            this.f4756a = textFieldSelectionManager;
        }

        public void d() {
            this.f4756a.P((Handle) null);
            this.f4756a.O((f) null);
            TextFieldState E = this.f4756a.E();
            if (E != null) {
                E.x(true);
            }
            g1 F = this.f4756a.F();
            if ((F != null ? F.getStatus() : null) == TextToolbarStatus.Hidden) {
                this.f4756a.a0();
            }
            this.f4756a.f4747m = null;
        }

        public void e() {
        }

        public void f(long j) {
        }

        public void g(long j) {
            a0.s g11;
            int i11;
            if (!(this.f4756a.H().h().length() == 0)) {
                TextFieldSelectionManager textFieldSelectionManager = this.f4756a;
                textFieldSelectionManager.n = f.r(textFieldSelectionManager.n, j);
                TextFieldState E = this.f4756a.E();
                if (!(E == null || (g11 = E.g()) == null)) {
                    TextFieldSelectionManager textFieldSelectionManager2 = this.f4756a;
                    textFieldSelectionManager2.O(f.d(f.r(textFieldSelectionManager2.f4746l, textFieldSelectionManager2.n)));
                    Integer b11 = textFieldSelectionManager2.f4747m;
                    if (b11 != null) {
                        i11 = b11.intValue();
                    } else {
                        i11 = g11.g(textFieldSelectionManager2.f4746l, false);
                    }
                    int i12 = i11;
                    f u11 = textFieldSelectionManager2.u();
                    p.g(u11);
                    textFieldSelectionManager2.b0(textFieldSelectionManager2.H(), i12, g11.g(u11.u(), false), false, SelectionAdjustment.f4703a.g());
                }
                TextFieldState E2 = this.f4756a.E();
                if (E2 != null) {
                    E2.x(false);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
            r0 = r0.g();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h(long r9) {
            /*
                r8 = this;
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r8.f4756a
                androidx.compose.foundation.text.Handle r0 = r0.w()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r8.f4756a
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionEnd
                r0.P(r1)
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r8.f4756a
                r0.J()
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r8.f4756a
                androidx.compose.foundation.text.TextFieldState r0 = r0.E()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x002d
                a0.s r0 = r0.g()
                if (r0 == 0) goto L_0x002d
                boolean r0 = r0.j(r9)
                if (r0 != r1) goto L_0x002d
                r0 = 1
                goto L_0x002e
            L_0x002d:
                r0 = 0
            L_0x002e:
                if (r0 != 0) goto L_0x0080
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r8.f4756a
                androidx.compose.foundation.text.TextFieldState r0 = r0.E()
                if (r0 == 0) goto L_0x0080
                a0.s r0 = r0.g()
                if (r0 == 0) goto L_0x0080
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r1 = r8.f4756a
                v1.s r3 = r1.C()
                float r9 = t0.f.n(r9)
                int r9 = r0.f(r9)
                r10 = 2
                r4 = 0
                int r9 = a0.s.e(r0, r9, r2, r10, r4)
                int r9 = r3.a(r9)
                a1.a r10 = r1.A()
                if (r10 == 0) goto L_0x0065
                a1.b$a r0 = a1.b.f879a
                int r0 = r0.b()
                r10.a(r0)
            L_0x0065:
                androidx.compose.ui.text.input.TextFieldValue r10 = r1.H()
                p1.b r10 = r10.e()
                long r2 = p1.b0.b(r9, r9)
                androidx.compose.ui.text.input.TextFieldValue r9 = r1.m(r10, r2)
                r1.r()
                lp0.l r10 = r1.D()
                r10.invoke(r9)
                return
            L_0x0080:
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r8.f4756a
                androidx.compose.ui.text.input.TextFieldValue r0 = r0.H()
                java.lang.String r0 = r0.h()
                int r0 = r0.length()
                if (r0 != 0) goto L_0x0091
                goto L_0x0092
            L_0x0091:
                r1 = 0
            L_0x0092:
                if (r1 == 0) goto L_0x0095
                return
            L_0x0095:
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r8.f4756a
                r0.r()
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r8.f4756a
                androidx.compose.foundation.text.TextFieldState r0 = r0.E()
                if (r0 == 0) goto L_0x00ca
                a0.s r1 = r0.g()
                if (r1 == 0) goto L_0x00ca
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r8.f4756a
                r4 = 0
                r5 = 2
                r6 = 0
                r2 = r9
                int r1 = a0.s.h(r1, r2, r4, r5, r6)
                androidx.compose.ui.text.input.TextFieldValue r3 = r0.H()
                r6 = 0
                androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r2 = androidx.compose.foundation.text.selection.SelectionAdjustment.f4703a
                androidx.compose.foundation.text.selection.SelectionAdjustment r7 = r2.g()
                r2 = r0
                r4 = r1
                r5 = r1
                r2.b0(r3, r4, r5, r6, r7)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.f4747m = r1
            L_0x00ca:
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r8.f4756a
                r0.f4746l = r9
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r9 = r8.f4756a
                long r0 = r9.f4746l
                t0.f r10 = t0.f.d(r0)
                r9.O(r10)
                androidx.compose.foundation.text.selection.TextFieldSelectionManager r9 = r8.f4756a
                t0.f$a r10 = t0.f.f16662b
                long r0 = r10.c()
                r9.n = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.d.h(long):void");
        }

        public void i() {
        }
    }

    public TextFieldSelectionManager() {
        this((w) null, 1, (kotlin.jvm.internal.i) null);
    }

    public TextFieldSelectionManager(w wVar) {
        this.f4737a = wVar;
        this.f4738b = s.f17192a.a();
        this.f4739c = TextFieldSelectionManager$onValueChange$1.f4757a;
        this.f4741e = j.e(new TextFieldValue((String) null, 0, (a0) null, 7, (kotlin.jvm.internal.i) null), (a1) null, 2, (Object) null);
        this.f4742f = f0.f17091a.c();
        this.k = j.e(Boolean.TRUE, (a1) null, 2, (Object) null);
        f.a aVar = f.f16662b;
        this.f4746l = aVar.c();
        this.n = aVar.c();
        this.f4748o = j.e((Object) null, (a1) null, 2, (Object) null);
        this.f4749p = j.e((Object) null, (a1) null, 2, (Object) null);
        this.q = new TextFieldValue((String) null, 0, (a0) null, 7, (kotlin.jvm.internal.i) null);
        this.f4750r = new d(this);
        this.f4751s = new c(this);
    }

    /* access modifiers changed from: private */
    public final void O(f fVar) {
        this.f4749p.setValue(fVar);
    }

    /* access modifiers changed from: private */
    public final void P(Handle handle) {
        this.f4748o.setValue(handle);
    }

    private final void S(HandleState handleState) {
        TextFieldState textFieldState = this.f4740d;
        if (textFieldState != null) {
            textFieldState.r(handleState);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0025, code lost:
        r2 = r2.g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b0(androidx.compose.ui.text.input.TextFieldValue r11, int r12, int r13, boolean r14, androidx.compose.foundation.text.selection.SelectionAdjustment r15) {
        /*
            r10 = this;
            v1.s r0 = r10.f4738b
            long r1 = r11.g()
            int r1 = p1.a0.n(r1)
            int r0 = r0.b(r1)
            v1.s r1 = r10.f4738b
            long r2 = r11.g()
            int r2 = p1.a0.i(r2)
            int r1 = r1.b(r2)
            long r0 = p1.b0.b(r0, r1)
            androidx.compose.foundation.text.TextFieldState r2 = r10.f4740d
            r3 = 0
            if (r2 == 0) goto L_0x0031
            a0.s r2 = r2.g()
            if (r2 == 0) goto L_0x0031
            p1.y r2 = r2.i()
            r4 = r2
            goto L_0x0032
        L_0x0031:
            r4 = r3
        L_0x0032:
            boolean r2 = p1.a0.h(r0)
            if (r2 == 0) goto L_0x0039
            goto L_0x003d
        L_0x0039:
            p1.a0 r3 = p1.a0.b(r0)
        L_0x003d:
            r7 = r3
            r5 = r12
            r6 = r13
            r8 = r14
            r9 = r15
            long r12 = b0.m.a(r4, r5, r6, r7, r8, r9)
            v1.s r14 = r10.f4738b
            int r15 = p1.a0.n(r12)
            int r14 = r14.a(r15)
            v1.s r15 = r10.f4738b
            int r12 = p1.a0.i(r12)
            int r12 = r15.a(r12)
            long r12 = p1.b0.b(r14, r12)
            long r14 = r11.g()
            boolean r14 = p1.a0.g(r12, r14)
            if (r14 == 0) goto L_0x0069
            return
        L_0x0069:
            a1.a r14 = r10.f4745i
            if (r14 == 0) goto L_0x0076
            a1.b$a r15 = a1.b.f879a
            int r15 = r15.b()
            r14.a(r15)
        L_0x0076:
            p1.b r11 = r11.e()
            androidx.compose.ui.text.input.TextFieldValue r11 = r10.m(r11, r12)
            lp0.l<? super androidx.compose.ui.text.input.TextFieldValue, bp0.k> r12 = r10.f4739c
            r12.invoke(r11)
            androidx.compose.foundation.text.TextFieldState r11 = r10.f4740d
            if (r11 != 0) goto L_0x0088
            goto L_0x0090
        L_0x0088:
            r12 = 1
            boolean r12 = androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.c(r10, r12)
            r11.z(r12)
        L_0x0090:
            androidx.compose.foundation.text.TextFieldState r11 = r10.f4740d
            if (r11 != 0) goto L_0x0095
            goto L_0x009d
        L_0x0095:
            r12 = 0
            boolean r12 = androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.c(r10, r12)
            r11.y(r12)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.b0(androidx.compose.ui.text.input.TextFieldValue, int, int, boolean, androidx.compose.foundation.text.selection.SelectionAdjustment):void");
    }

    public static /* synthetic */ void l(TextFieldSelectionManager textFieldSelectionManager, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        textFieldSelectionManager.k(z11);
    }

    /* access modifiers changed from: private */
    public final TextFieldValue m(p1.b bVar, long j11) {
        return new TextFieldValue(bVar, j11, (a0) null, 4, (kotlin.jvm.internal.i) null);
    }

    public static /* synthetic */ void q(TextFieldSelectionManager textFieldSelectionManager, f fVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fVar = null;
        }
        textFieldSelectionManager.p(fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r2 = r0.f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final t0.h t() {
        /*
            r13 = this;
            androidx.compose.foundation.text.TextFieldState r0 = r13.f4740d
            if (r0 == 0) goto L_0x011b
            r1 = 1
            if (r0 == 0) goto L_0x0016
            i1.m r2 = r0.f()
            if (r2 == 0) goto L_0x0016
            long r3 = r13.z(r1)
            long r2 = r2.t(r3)
            goto L_0x001c
        L_0x0016:
            t0.f$a r2 = t0.f.f16662b
            long r2 = r2.c()
        L_0x001c:
            androidx.compose.foundation.text.TextFieldState r4 = r13.f4740d
            r5 = 0
            if (r4 == 0) goto L_0x0030
            i1.m r4 = r4.f()
            if (r4 == 0) goto L_0x0030
            long r6 = r13.z(r5)
            long r6 = r4.t(r6)
            goto L_0x0036
        L_0x0030:
            t0.f$a r4 = t0.f.f16662b
            long r6 = r4.c()
        L_0x0036:
            androidx.compose.foundation.text.TextFieldState r4 = r13.f4740d
            r8 = 0
            if (r4 == 0) goto L_0x0087
            i1.m r4 = r4.f()
            if (r4 == 0) goto L_0x0087
            a0.s r9 = r0.g()
            if (r9 == 0) goto L_0x0079
            p1.y r9 = r9.i()
            if (r9 == 0) goto L_0x0079
            androidx.compose.ui.text.input.TextFieldValue r10 = r13.H()
            long r10 = r10.g()
            int r10 = p1.a0.n(r10)
            androidx.compose.ui.text.input.TextFieldValue r11 = r13.H()
            java.lang.String r11 = r11.h()
            int r11 = r11.length()
            int r11 = r11 - r1
            int r11 = java.lang.Math.max(r5, r11)
            int r10 = rp0.l.m(r10, r5, r11)
            t0.h r9 = r9.d(r10)
            if (r9 == 0) goto L_0x0079
            float r9 = r9.l()
            goto L_0x007a
        L_0x0079:
            r9 = 0
        L_0x007a:
            long r9 = t0.g.a(r8, r9)
            long r9 = r4.t(r9)
            float r4 = t0.f.n(r9)
            goto L_0x0088
        L_0x0087:
            r4 = 0
        L_0x0088:
            androidx.compose.foundation.text.TextFieldState r9 = r13.f4740d
            if (r9 == 0) goto L_0x00d7
            i1.m r9 = r9.f()
            if (r9 == 0) goto L_0x00d7
            a0.s r10 = r0.g()
            if (r10 == 0) goto L_0x00ca
            p1.y r10 = r10.i()
            if (r10 == 0) goto L_0x00ca
            androidx.compose.ui.text.input.TextFieldValue r11 = r13.H()
            long r11 = r11.g()
            int r11 = p1.a0.i(r11)
            androidx.compose.ui.text.input.TextFieldValue r12 = r13.H()
            java.lang.String r12 = r12.h()
            int r12 = r12.length()
            int r12 = r12 - r1
            int r1 = java.lang.Math.max(r5, r12)
            int r1 = rp0.l.m(r11, r5, r1)
            t0.h r1 = r10.d(r1)
            if (r1 == 0) goto L_0x00ca
            float r1 = r1.l()
            goto L_0x00cb
        L_0x00ca:
            r1 = 0
        L_0x00cb:
            long r10 = t0.g.a(r8, r1)
            long r8 = r9.t(r10)
            float r8 = t0.f.n(r8)
        L_0x00d7:
            float r1 = t0.f.m(r2)
            float r5 = t0.f.m(r6)
            float r1 = java.lang.Math.min(r1, r5)
            float r5 = t0.f.m(r2)
            float r9 = t0.f.m(r6)
            float r5 = java.lang.Math.max(r5, r9)
            float r4 = java.lang.Math.min(r4, r8)
            float r2 = t0.f.n(r2)
            float r3 = t0.f.n(r6)
            float r2 = java.lang.Math.max(r2, r3)
            r3 = 25
            float r3 = (float) r3
            float r3 = d2.h.n(r3)
            a0.n r0 = r0.q()
            d2.e r0 = r0.a()
            float r0 = r0.getDensity()
            float r3 = r3 * r0
            float r2 = r2 + r3
            t0.h r0 = new t0.h
            r0.<init>(r1, r4, r5, r2)
            return r0
        L_0x011b:
            t0.h$a r0 = t0.h.f16667e
            t0.h r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.t():t0.h");
    }

    public final a1.a A() {
        return this.f4745i;
    }

    public final b0.c B() {
        return this.f4751s;
    }

    public final s C() {
        return this.f4738b;
    }

    public final l<TextFieldValue, k> D() {
        return this.f4739c;
    }

    public final TextFieldState E() {
        return this.f4740d;
    }

    public final g1 F() {
        return this.f4744h;
    }

    public final a0.o G() {
        return this.f4750r;
    }

    public final TextFieldValue H() {
        return (TextFieldValue) this.f4741e.getValue();
    }

    public final a0.o I(boolean z11) {
        return new b(this, z11);
    }

    public final void J() {
        g1 g1Var;
        g1 g1Var2 = this.f4744h;
        if ((g1Var2 != null ? g1Var2.getStatus() : null) == TextToolbarStatus.Shown && (g1Var = this.f4744h) != null) {
            g1Var.b();
        }
    }

    public final boolean K() {
        return !p.e(this.q.h(), H().h());
    }

    public final void L() {
        p1.b text;
        e0 e0Var = this.f4743g;
        if (e0Var != null && (text = e0Var.getText()) != null) {
            p1.b i11 = z.c(H(), H().h().length()).i(text).i(z.b(H(), H().h().length()));
            int l11 = a0.l(H().g()) + text.length();
            this.f4739c.invoke(m(i11, b0.b(l11, l11)));
            S(HandleState.None);
            w wVar = this.f4737a;
            if (wVar != null) {
                wVar.a();
            }
        }
    }

    public final void M() {
        TextFieldValue m11 = m(H().e(), b0.b(0, H().h().length()));
        this.f4739c.invoke(m11);
        this.q = TextFieldValue.d(this.q, (p1.b) null, m11.g(), (a0) null, 5, (Object) null);
        TextFieldState textFieldState = this.f4740d;
        if (textFieldState != null) {
            textFieldState.x(true);
        }
    }

    public final void N(e0 e0Var) {
        this.f4743g = e0Var;
    }

    public final void Q(boolean z11) {
        this.k.setValue(Boolean.valueOf(z11));
    }

    public final void R(o oVar) {
        this.j = oVar;
    }

    public final void T(a1.a aVar) {
        this.f4745i = aVar;
    }

    public final void U(s sVar) {
        p.j(sVar, "<set-?>");
        this.f4738b = sVar;
    }

    public final void V(l<? super TextFieldValue, k> lVar) {
        p.j(lVar, "<set-?>");
        this.f4739c = lVar;
    }

    public final void W(TextFieldState textFieldState) {
        this.f4740d = textFieldState;
    }

    public final void X(g1 g1Var) {
        this.f4744h = g1Var;
    }

    public final void Y(TextFieldValue textFieldValue) {
        p.j(textFieldValue, "<set-?>");
        this.f4741e.setValue(textFieldValue);
    }

    public final void Z(f0 f0Var) {
        p.j(f0Var, "<set-?>");
        this.f4742f = f0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a0() {
        /*
            r8 = this;
            androidx.compose.ui.text.input.TextFieldValue r0 = r8.H()
            long r0 = r0.g()
            boolean r0 = p1.a0.h(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0016
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1
            r0.<init>(r8)
            r4 = r0
            goto L_0x0017
        L_0x0016:
            r4 = r1
        L_0x0017:
            androidx.compose.ui.text.input.TextFieldValue r0 = r8.H()
            long r2 = r0.g()
            boolean r0 = p1.a0.h(r2)
            if (r0 != 0) goto L_0x0032
            boolean r0 = r8.x()
            if (r0 == 0) goto L_0x0032
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1
            r0.<init>(r8)
            r6 = r0
            goto L_0x0033
        L_0x0032:
            r6 = r1
        L_0x0033:
            boolean r0 = r8.x()
            if (r0 == 0) goto L_0x004c
            androidx.compose.ui.platform.e0 r0 = r8.f4743g
            if (r0 == 0) goto L_0x0042
            p1.b r0 = r0.getText()
            goto L_0x0043
        L_0x0042:
            r0 = r1
        L_0x0043:
            if (r0 == 0) goto L_0x004c
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1
            r0.<init>(r8)
            r5 = r0
            goto L_0x004d
        L_0x004c:
            r5 = r1
        L_0x004d:
            androidx.compose.ui.text.input.TextFieldValue r0 = r8.H()
            long r2 = r0.g()
            int r0 = p1.a0.j(r2)
            androidx.compose.ui.text.input.TextFieldValue r2 = r8.H()
            java.lang.String r2 = r2.h()
            int r2 = r2.length()
            if (r0 == r2) goto L_0x006c
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1 r1 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
            r1.<init>(r8)
        L_0x006c:
            r7 = r1
            androidx.compose.ui.platform.g1 r2 = r8.f4744h
            if (r2 == 0) goto L_0x0078
            t0.h r3 = r8.t()
            r2.a(r3, r4, r5, r6, r7)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.a0():void");
    }

    public final void k(boolean z11) {
        if (!a0.h(H().g())) {
            e0 e0Var = this.f4743g;
            if (e0Var != null) {
                e0Var.a(z.a(H()));
            }
            if (z11) {
                int k11 = a0.k(H().g());
                this.f4739c.invoke(m(H().e(), b0.b(k11, k11)));
                S(HandleState.None);
            }
        }
    }

    public final a0.o n() {
        return new a(this);
    }

    public final void o() {
        if (!a0.h(H().g())) {
            e0 e0Var = this.f4743g;
            if (e0Var != null) {
                e0Var.a(z.a(H()));
            }
            p1.b i11 = z.c(H(), H().h().length()).i(z.b(H(), H().h().length()));
            int l11 = a0.l(H().g());
            this.f4739c.invoke(m(i11, b0.b(l11, l11)));
            S(HandleState.None);
            w wVar = this.f4737a;
            if (wVar != null) {
                wVar.a();
            }
        }
    }

    public final void p(f fVar) {
        HandleState handleState;
        int i11;
        if (!a0.h(H().g())) {
            TextFieldState textFieldState = this.f4740d;
            a0.s g11 = textFieldState != null ? textFieldState.g() : null;
            if (fVar == null || g11 == null) {
                i11 = a0.k(H().g());
            } else {
                i11 = this.f4738b.a(a0.s.h(g11, fVar.u(), false, 2, (Object) null));
            }
            this.f4739c.invoke(TextFieldValue.d(H(), (p1.b) null, b0.a(i11), (a0) null, 5, (Object) null));
        }
        if (fVar != null) {
            if (H().h().length() > 0) {
                handleState = HandleState.Cursor;
                S(handleState);
                J();
            }
        }
        handleState = HandleState.None;
        S(handleState);
        J();
    }

    public final void r() {
        o oVar;
        TextFieldState textFieldState = this.f4740d;
        boolean z11 = false;
        if (textFieldState != null && !textFieldState.d()) {
            z11 = true;
        }
        if (z11 && (oVar = this.j) != null) {
            oVar.c();
        }
        this.q = H();
        TextFieldState textFieldState2 = this.f4740d;
        if (textFieldState2 != null) {
            textFieldState2.x(true);
        }
        S(HandleState.Selection);
    }

    public final void s() {
        TextFieldState textFieldState = this.f4740d;
        if (textFieldState != null) {
            textFieldState.x(false);
        }
        S(HandleState.None);
    }

    public final f u() {
        return (f) this.f4749p.getValue();
    }

    public final long v(e eVar) {
        p.j(eVar, "density");
        int b11 = this.f4738b.b(a0.n(H().g()));
        TextFieldState textFieldState = this.f4740d;
        a0.s g11 = textFieldState != null ? textFieldState.g() : null;
        p.g(g11);
        y i11 = g11.i();
        h d11 = i11.d(l.m(b11, 0, i11.k().j().length()));
        return g.a(d11.i() + (eVar.v0(TextFieldCursorKt.d()) / ((float) 2)), d11.e());
    }

    public final Handle w() {
        return (Handle) this.f4748o.getValue();
    }

    public final boolean x() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final o y() {
        return this.j;
    }

    public final long z(boolean z11) {
        long g11 = H().g();
        int n11 = z11 ? a0.n(g11) : a0.i(g11);
        TextFieldState textFieldState = this.f4740d;
        a0.s g12 = textFieldState != null ? textFieldState.g() : null;
        p.g(g12);
        return b0.p.b(g12.i(), this.f4738b.b(n11), z11, a0.m(H().g()));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldSelectionManager(w wVar, int i11, kotlin.jvm.internal.i iVar) {
        this((i11 & 1) != 0 ? null : wVar);
    }
}

package s0;

import androidx.compose.ui.focus.FocusEventModifierKt;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusStateImpl;
import bp0.k;
import f0.e;
import j1.b;
import j1.f;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;

/* compiled from: FocusEventModifier.kt */
public final class d implements j1.d<d>, b {

    /* renamed from: a  reason: collision with root package name */
    private final l<r, k> f16566a;

    /* renamed from: b  reason: collision with root package name */
    private d f16567b;

    /* renamed from: c  reason: collision with root package name */
    private final e<d> f16568c = new e<>(new d[16], 0);

    /* renamed from: d  reason: collision with root package name */
    private final e<FocusModifier> f16569d = new e<>(new FocusModifier[16], 0);

    /* compiled from: FocusEventModifier.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16570a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            iArr[FocusStateImpl.Captured.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f16570a = iArr;
        }
    }

    public d(l<? super r, k> lVar) {
        p.j(lVar, "onFocusEvent");
        this.f16566a = lVar;
    }

    private final void c(e<FocusModifier> eVar) {
        e<FocusModifier> eVar2 = this.f16569d;
        eVar2.c(eVar2.m(), eVar);
        d dVar = this.f16567b;
        if (dVar != null) {
            dVar.c(eVar);
        }
    }

    private final void h(e<FocusModifier> eVar) {
        this.f16569d.s(eVar);
        d dVar = this.f16567b;
        if (dVar != null) {
            dVar.h(eVar);
        }
    }

    public void D(j1.e eVar) {
        p.j(eVar, "scope");
        d dVar = (d) eVar.a(FocusEventModifierKt.a());
        if (!p.e(dVar, this.f16567b)) {
            d dVar2 = this.f16567b;
            if (dVar2 != null) {
                dVar2.f16568c.r(this);
                dVar2.h(this.f16569d);
            }
            this.f16567b = dVar;
            if (dVar != null) {
                dVar.f16568c.b(this);
                dVar.c(this.f16569d);
            }
        }
        this.f16567b = (d) eVar.a(FocusEventModifierKt.a());
    }

    public /* synthetic */ p0.d N(p0.d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public final void a(FocusModifier focusModifier) {
        p.j(focusModifier, "focusModifier");
        this.f16569d.b(focusModifier);
        d dVar = this.f16567b;
        if (dVar != null) {
            dVar.a(focusModifier);
        }
    }

    /* renamed from: d */
    public d getValue() {
        return this;
    }

    public final void e() {
        if (this.f16569d.o()) {
            this.f16566a.invoke(FocusStateImpl.Inactive);
        }
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Boolean] */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.lang.Boolean] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.Boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r3 != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r3 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        r4 = r5;
        r3 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r8 = this;
            f0.e<androidx.compose.ui.focus.FocusModifier> r0 = r8.f16569d
            int r0 = r0.m()
            if (r0 == 0) goto L_0x0066
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0057
            f0.e<androidx.compose.ui.focus.FocusModifier> r0 = r8.f16569d
            int r2 = r0.m()
            r3 = 0
            if (r2 <= 0) goto L_0x0040
            java.lang.Object[] r0 = r0.l()
            r4 = r3
        L_0x001a:
            r5 = r0[r1]
            androidx.compose.ui.focus.FocusModifier r5 = (androidx.compose.ui.focus.FocusModifier) r5
            androidx.compose.ui.focus.FocusStateImpl r6 = r5.i()
            int[] r7 = s0.d.a.f16570a
            int r6 = r6.ordinal()
            r6 = r7[r6]
            switch(r6) {
                case 1: goto L_0x0036;
                case 2: goto L_0x0036;
                case 3: goto L_0x0036;
                case 4: goto L_0x0036;
                case 5: goto L_0x0031;
                case 6: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0039
        L_0x002e:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            goto L_0x0039
        L_0x0031:
            if (r3 != 0) goto L_0x0039
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x0039
        L_0x0036:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4 = r5
        L_0x0039:
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x001a
            r0 = r3
            r3 = r4
            goto L_0x0041
        L_0x0040:
            r0 = r3
        L_0x0041:
            if (r3 == 0) goto L_0x0049
            androidx.compose.ui.focus.FocusStateImpl r1 = r3.i()
            if (r1 != 0) goto L_0x0068
        L_0x0049:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.p.e(r0, r1)
            if (r0 == 0) goto L_0x0054
            androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Deactivated
            goto L_0x0068
        L_0x0054:
            androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Inactive
            goto L_0x0068
        L_0x0057:
            f0.e<androidx.compose.ui.focus.FocusModifier> r0 = r8.f16569d
            java.lang.Object[] r0 = r0.l()
            r0 = r0[r1]
            androidx.compose.ui.focus.FocusModifier r0 = (androidx.compose.ui.focus.FocusModifier) r0
            androidx.compose.ui.focus.FocusStateImpl r1 = r0.i()
            goto L_0x0068
        L_0x0066:
            androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Inactive
        L_0x0068:
            lp0.l<s0.r, bp0.k> r0 = r8.f16566a
            r0.invoke(r1)
            s0.d r0 = r8.f16567b
            if (r0 == 0) goto L_0x0074
            r0.f()
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.d.f():void");
    }

    public final void g(FocusModifier focusModifier) {
        p.j(focusModifier, "focusModifier");
        this.f16569d.r(focusModifier);
        d dVar = this.f16567b;
        if (dVar != null) {
            dVar.g(focusModifier);
        }
    }

    public f<d> getKey() {
        return FocusEventModifierKt.a();
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }
}

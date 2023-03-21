package k1;

import androidx.compose.ui.node.DrawEntity;
import androidx.compose.ui.node.LayoutNodeWrapper;
import f1.c0;
import i1.a0;
import i1.b0;
import i1.d0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import n1.k;
import n1.l;
import p0.d;
import r0.f;

/* compiled from: EntityList.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15323a = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f15324b = C0141b.a(0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f15325c = C0141b.a(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f15326d = C0141b.a(2);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f15327e = C0141b.a(3);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f15328f = C0141b.a(4);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f15329g = C0141b.a(5);

    /* compiled from: EntityList.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return b.f15324b;
        }

        public final int b() {
            return b.f15328f;
        }

        public final int c() {
            return b.f15327e;
        }

        public final int d() {
            return b.f15325c;
        }

        public final int e() {
            return b.f15329g;
        }

        public final int f() {
            return b.f15326d;
        }
    }

    /* renamed from: k1.b$b  reason: collision with other inner class name */
    /* compiled from: EntityList.kt */
    public static final class C0141b<T extends i<T, M>, M extends d> {
        public static <T extends i<T, M>, M extends d> int a(int i11) {
            return i11;
        }
    }

    private static final <T extends i<T, ?>> void g(i<?, ?>[] iVarArr, T t, int i11) {
        t.i(iVarArr[i11]);
        iVarArr[i11] = t;
    }

    public static final void h(i<?, ?>[] iVarArr, LayoutNodeWrapper layoutNodeWrapper, d dVar) {
        p.j(layoutNodeWrapper, "layoutNodeWrapper");
        p.j(dVar, "modifier");
        if (dVar instanceof a0) {
            g(iVarArr, new v(layoutNodeWrapper, dVar), f15328f);
        }
        if (dVar instanceof b0) {
            g(iVarArr, new v(layoutNodeWrapper, dVar), f15329g);
        }
    }

    public static final void i(i<?, ?>[] iVarArr, LayoutNodeWrapper layoutNodeWrapper, d dVar) {
        p.j(layoutNodeWrapper, "layoutNodeWrapper");
        p.j(dVar, "modifier");
        if (dVar instanceof f) {
            g(iVarArr, new DrawEntity(layoutNodeWrapper, (f) dVar), f15324b);
        }
        if (dVar instanceof c0) {
            g(iVarArr, new s(layoutNodeWrapper, (c0) dVar), f15325c);
        }
        if (dVar instanceof l) {
            g(iVarArr, new k(layoutNodeWrapper, (l) dVar), f15326d);
        }
        if (dVar instanceof d0) {
            g(iVarArr, new v(layoutNodeWrapper, dVar), f15327e);
        }
    }

    public static final void j(i<?, ?>[] iVarArr) {
        for (i<?, ?> iVar : iVarArr) {
            while (iVar != null) {
                if (iVar.f()) {
                    iVar.h();
                }
                iVar = iVar.d();
            }
        }
        int length = iVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            iVarArr[i11] = null;
        }
    }

    public static i<?, ?>[] k(i<?, ?>[] iVarArr) {
        p.j(iVarArr, "entities");
        return iVarArr;
    }

    public static /* synthetic */ i[] l(i[] iVarArr, int i11, i iVar) {
        if ((i11 & 1) != 0) {
            iVarArr = new i[6];
        }
        return k(iVarArr);
    }

    public static final boolean m(i<?, ?>[] iVarArr, int i11) {
        return iVarArr[i11] != null;
    }

    public static final <T extends i<T, M>, M extends d> T n(i<?, ?>[] iVarArr, int i11) {
        return iVarArr[i11];
    }
}

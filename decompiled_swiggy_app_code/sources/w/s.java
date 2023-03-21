package w;

import androidx.compose.foundation.lazy.LazyListItemPlacementAnimator;
import androidx.compose.ui.unit.LayoutDirection;
import d2.m;
import i1.e0;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import p0.a;

/* compiled from: LazyMeasuredItem.kt */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final int f17403a;

    /* renamed from: b  reason: collision with root package name */
    private final e0[] f17404b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f17405c;

    /* renamed from: d  reason: collision with root package name */
    private final a.b f17406d;

    /* renamed from: e  reason: collision with root package name */
    private final a.c f17407e;

    /* renamed from: f  reason: collision with root package name */
    private final LayoutDirection f17408f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f17409g;

    /* renamed from: h  reason: collision with root package name */
    private final int f17410h;

    /* renamed from: i  reason: collision with root package name */
    private final int f17411i;
    private final LazyListItemPlacementAnimator j;
    private final int k;

    /* renamed from: l  reason: collision with root package name */
    private final long f17412l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f17413m;
    private final int n;

    /* renamed from: o  reason: collision with root package name */
    private final int f17414o;

    /* renamed from: p  reason: collision with root package name */
    private final int f17415p;

    private s(int i11, e0[] e0VarArr, boolean z11, a.b bVar, a.c cVar, LayoutDirection layoutDirection, boolean z12, int i12, int i13, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i14, long j11, Object obj) {
        this.f17403a = i11;
        this.f17404b = e0VarArr;
        this.f17405c = z11;
        this.f17406d = bVar;
        this.f17407e = cVar;
        this.f17408f = layoutDirection;
        this.f17409g = z12;
        this.f17410h = i12;
        this.f17411i = i13;
        this.j = lazyListItemPlacementAnimator;
        this.k = i14;
        this.f17412l = j11;
        this.f17413m = obj;
        int i15 = 0;
        int i16 = 0;
        for (e0 e0Var : e0VarArr) {
            i15 += this.f17405c ? e0Var.e0() : e0Var.A0();
            i16 = Math.max(i16, !this.f17405c ? e0Var.e0() : e0Var.A0());
        }
        this.n = i15;
        this.f17414o = i15 + this.k;
        this.f17415p = i16;
    }

    public /* synthetic */ s(int i11, e0[] e0VarArr, boolean z11, a.b bVar, a.c cVar, LayoutDirection layoutDirection, boolean z12, int i12, int i13, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i14, long j11, Object obj, i iVar) {
        this(i11, e0VarArr, z11, bVar, cVar, layoutDirection, z12, i12, i13, lazyListItemPlacementAnimator, i14, j11, obj);
    }

    public final int a() {
        return this.f17415p;
    }

    public final int b() {
        return this.f17403a;
    }

    public final Object c() {
        return this.f17413m;
    }

    public final int d() {
        return this.n;
    }

    public final int e() {
        return this.f17414o;
    }

    public final q f(int i11, int i12, int i13) {
        int i14;
        long j11;
        ArrayList arrayList = new ArrayList();
        int i15 = this.f17405c ? i13 : i12;
        boolean z11 = this.f17409g;
        int i16 = z11 ? (i15 - i11) - this.n : i11;
        int O = z11 ? ArraysKt___ArraysKt.O(this.f17404b) : 0;
        while (true) {
            boolean z12 = this.f17409g;
            boolean z13 = true;
            if (!z12 ? O >= this.f17404b.length : O < 0) {
                z13 = false;
            }
            if (z13) {
                e0 e0Var = this.f17404b[O];
                if (z12) {
                    i14 = 0;
                } else {
                    i14 = arrayList.size();
                }
                if (this.f17405c) {
                    a.b bVar = this.f17406d;
                    if (bVar != null) {
                        j11 = m.a(bVar.a(e0Var.A0(), i12, this.f17408f), i16);
                        int i17 = i13;
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    int i18 = i12;
                    a.c cVar = this.f17407e;
                    if (cVar != null) {
                        j11 = m.a(i16, cVar.a(e0Var.e0(), i13));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                long j12 = j11;
                i16 += this.f17405c ? e0Var.e0() : e0Var.A0();
                arrayList.add(i14, new p(j12, e0Var, this.f17404b[O].p(), (i) null));
                O = this.f17409g ? O - 1 : O + 1;
            } else {
                return new q(i11, this.f17403a, this.f17413m, this.n, this.f17414o, -(!z12 ? this.f17410h : this.f17411i), i15 + (!z12 ? this.f17411i : this.f17410h), this.f17405c, arrayList, this.j, this.f17412l, (i) null);
            }
        }
    }
}

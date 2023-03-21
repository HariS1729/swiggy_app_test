package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.runtime.g;
import androidx.compose.runtime.saveable.SaverKt;
import defpackage.y1;
import e0.h0;
import kotlin.jvm.internal.i;
import lp0.p;
import m0.c;
import u.j;
import u.k;

/* compiled from: Scroll.kt */
public final class ScrollState implements y1.r {

    /* renamed from: f  reason: collision with root package name */
    public static final a f3154f = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final c<ScrollState, ?> f3155g = SaverKt.a(ScrollState$Companion$Saver$1.f3161a, ScrollState$Companion$Saver$2.f3162a);

    /* renamed from: a  reason: collision with root package name */
    private final h0 f3156a;

    /* renamed from: b  reason: collision with root package name */
    private final k f3157b = j.a();

    /* renamed from: c  reason: collision with root package name */
    private h0<Integer> f3158c = g.g(Integer.MAX_VALUE, g.o());
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public float f3159d;

    /* renamed from: e  reason: collision with root package name */
    private final y1.r f3160e = ScrollableStateKt.a(new ScrollState$scrollableState$1(this));

    /* compiled from: Scroll.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final c<ScrollState, ?> a() {
            return ScrollState.f3155g;
        }
    }

    public ScrollState(int i11) {
        this.f3156a = g.g(Integer.valueOf(i11), g.o());
    }

    /* access modifiers changed from: private */
    public final void l(int i11) {
        this.f3156a.setValue(Integer.valueOf(i11));
    }

    public boolean a() {
        return this.f3160e.a();
    }

    public float b(float f11) {
        return this.f3160e.b(f11);
    }

    public Object c(MutatePriority mutatePriority, p<? super y1.p, ? super fp0.c<? super bp0.k>, ? extends Object> pVar, fp0.c<? super bp0.k> cVar) {
        Object c11 = this.f3160e.c(mutatePriority, pVar, cVar);
        return c11 == b.d() ? c11 : bp0.k.f22762a;
    }

    public final k h() {
        return this.f3157b;
    }

    public final int i() {
        return this.f3158c.getValue().intValue();
    }

    public final int j() {
        return ((Number) this.f3156a.getValue()).intValue();
    }

    public final void k(int i11) {
        this.f3158c.setValue(Integer.valueOf(i11));
        if (j() > i11) {
            l(i11);
        }
    }
}

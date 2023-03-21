package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutState */
class k {

    /* renamed from: a  reason: collision with root package name */
    boolean f11437a = true;

    /* renamed from: b  reason: collision with root package name */
    int f11438b;

    /* renamed from: c  reason: collision with root package name */
    int f11439c;

    /* renamed from: d  reason: collision with root package name */
    int f11440d;

    /* renamed from: e  reason: collision with root package name */
    int f11441e;

    /* renamed from: f  reason: collision with root package name */
    int f11442f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f11443g = 0;

    /* renamed from: h  reason: collision with root package name */
    boolean f11444h;

    /* renamed from: i  reason: collision with root package name */
    boolean f11445i;

    k() {
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.a0 a0Var) {
        int i11 = this.f11439c;
        return i11 >= 0 && i11 < a0Var.b();
    }

    /* access modifiers changed from: package-private */
    public View b(RecyclerView.v vVar) {
        View o11 = vVar.o(this.f11439c);
        this.f11439c += this.f11440d;
        return o11;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f11438b + ", mCurrentPosition=" + this.f11439c + ", mItemDirection=" + this.f11440d + ", mLayoutDirection=" + this.f11441e + ", mStartLine=" + this.f11442f + ", mEndLine=" + this.f11443g + '}';
    }
}

package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.o f11457a;

    /* renamed from: b  reason: collision with root package name */
    private int f11458b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f11459c;

    /* compiled from: OrientationHelper */
    class a extends q {
        a(RecyclerView.o oVar) {
            super(oVar, (a) null);
        }

        public int d(View view) {
            return this.f11457a.e0(view) + ((RecyclerView.p) view.getLayoutParams()).rightMargin;
        }

        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f11457a.d0(view) + pVar.leftMargin + pVar.rightMargin;
        }

        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f11457a.c0(view) + pVar.topMargin + pVar.bottomMargin;
        }

        public int g(View view) {
            return this.f11457a.b0(view) - ((RecyclerView.p) view.getLayoutParams()).leftMargin;
        }

        public int h() {
            return this.f11457a.v0();
        }

        public int i() {
            return this.f11457a.v0() - this.f11457a.getPaddingRight();
        }

        public int j() {
            return this.f11457a.getPaddingRight();
        }

        public int k() {
            return this.f11457a.w0();
        }

        public int l() {
            return this.f11457a.i0();
        }

        public int m() {
            return this.f11457a.getPaddingLeft();
        }

        public int n() {
            return (this.f11457a.v0() - this.f11457a.getPaddingLeft()) - this.f11457a.getPaddingRight();
        }

        public int p(View view) {
            this.f11457a.u0(view, true, this.f11459c);
            return this.f11459c.right;
        }

        public int q(View view) {
            this.f11457a.u0(view, true, this.f11459c);
            return this.f11459c.left;
        }

        public void r(int i11) {
            this.f11457a.K0(i11);
        }
    }

    /* compiled from: OrientationHelper */
    class b extends q {
        b(RecyclerView.o oVar) {
            super(oVar, (a) null);
        }

        public int d(View view) {
            return this.f11457a.Z(view) + ((RecyclerView.p) view.getLayoutParams()).bottomMargin;
        }

        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f11457a.c0(view) + pVar.topMargin + pVar.bottomMargin;
        }

        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f11457a.d0(view) + pVar.leftMargin + pVar.rightMargin;
        }

        public int g(View view) {
            return this.f11457a.f0(view) - ((RecyclerView.p) view.getLayoutParams()).topMargin;
        }

        public int h() {
            return this.f11457a.h0();
        }

        public int i() {
            return this.f11457a.h0() - this.f11457a.getPaddingBottom();
        }

        public int j() {
            return this.f11457a.getPaddingBottom();
        }

        public int k() {
            return this.f11457a.i0();
        }

        public int l() {
            return this.f11457a.w0();
        }

        public int m() {
            return this.f11457a.getPaddingTop();
        }

        public int n() {
            return (this.f11457a.h0() - this.f11457a.getPaddingTop()) - this.f11457a.getPaddingBottom();
        }

        public int p(View view) {
            this.f11457a.u0(view, true, this.f11459c);
            return this.f11459c.bottom;
        }

        public int q(View view) {
            this.f11457a.u0(view, true, this.f11459c);
            return this.f11459c.top;
        }

        public void r(int i11) {
            this.f11457a.L0(i11);
        }
    }

    /* synthetic */ q(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static q a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static q b(RecyclerView.o oVar, int i11) {
        if (i11 == 0) {
            return a(oVar);
        }
        if (i11 == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static q c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f11458b) {
            return 0;
        }
        return n() - this.f11458b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i11);

    public void s() {
        this.f11458b = n();
    }

    private q(RecyclerView.o oVar) {
        this.f11458b = Integer.MIN_VALUE;
        this.f11459c = new Rect();
        this.f11457a = oVar;
    }
}

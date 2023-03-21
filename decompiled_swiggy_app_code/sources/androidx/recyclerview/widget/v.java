package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper */
public abstract class v extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f11466a;

    /* renamed from: b  reason: collision with root package name */
    private Scroller f11467b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView.t f11468c = new a();

    /* compiled from: SnapHelper */
    class a extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        boolean f11469a = false;

        a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            super.onScrollStateChanged(recyclerView, i11);
            if (i11 == 0 && this.f11469a) {
                this.f11469a = false;
                v.this.l();
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            if (i11 != 0 || i12 != 0) {
                this.f11469a = true;
            }
        }
    }

    /* compiled from: SnapHelper */
    class b extends l {
        b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            v vVar = v.this;
            RecyclerView recyclerView = vVar.f11466a;
            if (recyclerView != null) {
                int[] c11 = vVar.c(recyclerView.getLayoutManager(), view);
                int i11 = c11[0];
                int i12 = c11[1];
                int w11 = w(Math.max(Math.abs(i11), Math.abs(i12)));
                if (w11 > 0) {
                    aVar.d(i11, i12, w11, this.j);
                }
            }
        }

        /* access modifiers changed from: protected */
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    private void g() {
        this.f11466a.d1(this.f11468c);
        this.f11466a.setOnFlingListener((RecyclerView.r) null);
    }

    private void j() throws IllegalStateException {
        if (this.f11466a.getOnFlingListener() == null) {
            this.f11466a.l(this.f11468c);
            this.f11466a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean k(RecyclerView.o oVar, int i11, int i12) {
        RecyclerView.z e11;
        int i13;
        if (!(oVar instanceof RecyclerView.z.b) || (e11 = e(oVar)) == null || (i13 = i(oVar, i11, i12)) == -1) {
            return false;
        }
        e11.p(i13);
        oVar.S1(e11);
        return true;
    }

    public boolean a(int i11, int i12) {
        RecyclerView.o layoutManager = this.f11466a.getLayoutManager();
        if (layoutManager == null || this.f11466a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f11466a.getMinFlingVelocity();
        if ((Math.abs(i12) > minFlingVelocity || Math.abs(i11) > minFlingVelocity) && k(layoutManager, i11, i12)) {
            return true;
        }
        return false;
    }

    public void b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f11466a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                g();
            }
            this.f11466a = recyclerView;
            if (recyclerView != null) {
                j();
                this.f11467b = new Scroller(this.f11466a.getContext(), new DecelerateInterpolator());
                l();
            }
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    public int[] d(int i11, int i12) {
        this.f11467b.fling(0, 0, i11, i12, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f11467b.getFinalX(), this.f11467b.getFinalY()};
    }

    /* access modifiers changed from: protected */
    public RecyclerView.z e(RecyclerView.o oVar) {
        return f(oVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public l f(RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.z.b)) {
            return null;
        }
        return new b(this.f11466a.getContext());
    }

    public abstract View h(RecyclerView.o oVar);

    public abstract int i(RecyclerView.o oVar, int i11, int i12);

    /* access modifiers changed from: package-private */
    public void l() {
        RecyclerView.o layoutManager;
        View h11;
        RecyclerView recyclerView = this.f11466a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (h11 = h(layoutManager)) != null) {
            int[] c11 = c(layoutManager, h11);
            if (c11[0] != 0 || c11[1] != 0) {
                this.f11466a.q1(c11[0], c11[1]);
            }
        }
    }
}

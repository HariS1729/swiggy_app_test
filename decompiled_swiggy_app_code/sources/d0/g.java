package d0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import bp0.k;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.f;
import t0.m;
import u.n;
import u0.b1;

/* compiled from: RippleHostView.android.kt */
public final class g extends View {

    /* renamed from: f  reason: collision with root package name */
    public static final a f13811f = new a((i) null);

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f13812g = {16842919, 16842910};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f13813h = new int[0];

    /* renamed from: a  reason: collision with root package name */
    private j f13814a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f13815b;

    /* renamed from: c  reason: collision with root package name */
    private Long f13816c;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f13817d;

    /* renamed from: e  reason: collision with root package name */
    private lp0.a<k> f13818e;

    /* compiled from: RippleHostView.android.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        p.j(context, LogCategory.CONTEXT);
    }

    private final void c(boolean z11) {
        j jVar = new j(z11);
        setBackground(jVar);
        this.f13814a = jVar;
    }

    private final void setRippleState(boolean z11) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f13817d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l11 = this.f13816c;
        long longValue = currentAnimationTimeMillis - (l11 == null ? 0 : l11.longValue());
        if (z11 || longValue >= 5) {
            int[] iArr = z11 ? f13812g : f13813h;
            j jVar = this.f13814a;
            if (jVar != null) {
                jVar.setState(iArr);
            }
        } else {
            f fVar = new f(this);
            this.f13817d = fVar;
            postDelayed(fVar, 50);
        }
        this.f13816c = Long.valueOf(currentAnimationTimeMillis);
    }

    /* access modifiers changed from: private */
    /* renamed from: setRippleState$lambda-2  reason: not valid java name */
    public static final void m2setRippleState$lambda2(g gVar) {
        p.j(gVar, "this$0");
        j jVar = gVar.f13814a;
        if (jVar != null) {
            jVar.setState(f13813h);
        }
        gVar.f13817d = null;
    }

    public final void b(n nVar, boolean z11, long j, int i11, long j11, float f11, lp0.a<k> aVar) {
        boolean z12 = z11;
        lp0.a<k> aVar2 = aVar;
        n nVar2 = nVar;
        p.j(nVar, "interaction");
        p.j(aVar2, "onInvalidateRipple");
        if (this.f13814a == null || !p.e(Boolean.valueOf(z11), this.f13815b)) {
            c(z11);
            this.f13815b = Boolean.valueOf(z11);
        }
        j jVar = this.f13814a;
        p.g(jVar);
        this.f13818e = aVar2;
        f(j, i11, j11, f11);
        if (z12) {
            jVar.setHotspot(f.m(nVar.a()), f.n(nVar.a()));
        } else {
            jVar.setHotspot((float) jVar.getBounds().centerX(), (float) jVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void d() {
        this.f13818e = null;
        Runnable runnable = this.f13817d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f13817d;
            p.g(runnable2);
            runnable2.run();
        } else {
            j jVar = this.f13814a;
            if (jVar != null) {
                jVar.setState(f13813h);
            }
        }
        j jVar2 = this.f13814a;
        if (jVar2 != null) {
            jVar2.setVisible(false, false);
            unscheduleDrawable(jVar2);
        }
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j, int i11, long j11, float f11) {
        j jVar = this.f13814a;
        if (jVar != null) {
            jVar.c(i11);
            jVar.b(j11, f11);
            Rect a11 = b1.a(m.c(j));
            setLeft(a11.left);
            setTop(a11.top);
            setRight(a11.right);
            setBottom(a11.bottom);
            jVar.setBounds(a11);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        p.j(drawable, "who");
        lp0.a<k> aVar = this.f13818e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    public void refreshDrawableState() {
    }
}

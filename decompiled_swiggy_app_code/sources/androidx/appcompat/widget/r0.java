package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.a0;
import androidx.core.view.c0;

/* compiled from: TooltipCompatHandler */
class r0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static r0 j;
    private static r0 k;

    /* renamed from: a  reason: collision with root package name */
    private final View f2250a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f2251b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2252c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f2253d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f2254e = new b();

    /* renamed from: f  reason: collision with root package name */
    private int f2255f;

    /* renamed from: g  reason: collision with root package name */
    private int f2256g;

    /* renamed from: h  reason: collision with root package name */
    private s0 f2257h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2258i;

    /* compiled from: TooltipCompatHandler */
    class a implements Runnable {
        a() {
        }

        public void run() {
            r0.this.g(false);
        }
    }

    /* compiled from: TooltipCompatHandler */
    class b implements Runnable {
        b() {
        }

        public void run() {
            r0.this.c();
        }
    }

    private r0(View view, CharSequence charSequence) {
        this.f2250a = view;
        this.f2251b = charSequence;
        this.f2252c = c0.c(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f2250a.removeCallbacks(this.f2253d);
    }

    private void b() {
        this.f2255f = Integer.MAX_VALUE;
        this.f2256g = Integer.MAX_VALUE;
    }

    private void d() {
        this.f2250a.postDelayed(this.f2253d, (long) ViewConfiguration.getLongPressTimeout());
    }

    private static void e(r0 r0Var) {
        r0 r0Var2 = j;
        if (r0Var2 != null) {
            r0Var2.a();
        }
        j = r0Var;
        if (r0Var != null) {
            r0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        r0 r0Var = j;
        if (r0Var != null && r0Var.f2250a == view) {
            e((r0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            r0 r0Var2 = k;
            if (r0Var2 != null && r0Var2.f2250a == view) {
                r0Var2.c();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new r0(view, charSequence);
    }

    private boolean h(MotionEvent motionEvent) {
        int x11 = (int) motionEvent.getX();
        int y11 = (int) motionEvent.getY();
        if (Math.abs(x11 - this.f2255f) <= this.f2252c && Math.abs(y11 - this.f2256g) <= this.f2252c) {
            return false;
        }
        this.f2255f = x11;
        this.f2256g = y11;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (k == this) {
            k = null;
            s0 s0Var = this.f2257h;
            if (s0Var != null) {
                s0Var.c();
                this.f2257h = null;
                b();
                this.f2250a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (j == this) {
            e((r0) null);
        }
        this.f2250a.removeCallbacks(this.f2254e);
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z11) {
        long j11;
        int i11;
        long j12;
        if (a0.Z(this.f2250a)) {
            e((r0) null);
            r0 r0Var = k;
            if (r0Var != null) {
                r0Var.c();
            }
            k = this;
            this.f2258i = z11;
            s0 s0Var = new s0(this.f2250a.getContext());
            this.f2257h = s0Var;
            s0Var.e(this.f2250a, this.f2255f, this.f2256g, this.f2258i, this.f2251b);
            this.f2250a.addOnAttachStateChangeListener(this);
            if (this.f2258i) {
                j11 = 2500;
            } else {
                if ((a0.S(this.f2250a) & 1) == 1) {
                    j12 = 3000;
                    i11 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j12 = 15000;
                    i11 = ViewConfiguration.getLongPressTimeout();
                }
                j11 = j12 - ((long) i11);
            }
            this.f2250a.removeCallbacks(this.f2254e);
            this.f2250a.postDelayed(this.f2254e, j11);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2257h != null && this.f2258i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2250a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f2250a.isEnabled() && this.f2257h == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f2255f = view.getWidth() / 2;
        this.f2256g = view.getHeight() / 2;
        g(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        c();
    }
}

package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import defpackage.q1;

/* compiled from: ForwardingListener */
public abstract class a0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final float f2064a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2065b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2066c;

    /* renamed from: d  reason: collision with root package name */
    final View f2067d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f2068e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f2069f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2070g;

    /* renamed from: h  reason: collision with root package name */
    private int f2071h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f2072i = new int[2];

    /* compiled from: ForwardingListener */
    private class a implements Runnable {
        a() {
        }

        public void run() {
            ViewParent parent = a0.this.f2067d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener */
    private class b implements Runnable {
        b() {
        }

        public void run() {
            a0.this.e();
        }
    }

    public a0(View view) {
        this.f2067d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2064a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2065b = tapTimeout;
        this.f2066c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f2069f;
        if (runnable != null) {
            this.f2067d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f2068e;
        if (runnable2 != null) {
            this.f2067d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        y yVar;
        View view = this.f2067d;
        q1.f b11 = b();
        if (b11 == null || !b11.b() || (yVar = (y) b11.j()) == null || !yVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(yVar, obtainNoHistory);
        boolean e11 = yVar.e(obtainNoHistory, this.f2071h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = (actionMasked == 1 || actionMasked == 3) ? false : true;
        if (!e11 || !z11) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f2067d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f2071h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f2064a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f2071h = r6
            java.lang.Runnable r6 = r5.f2068e
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.a0$a r6 = new androidx.appcompat.widget.a0$a
            r6.<init>()
            r5.f2068e = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f2068e
            int r1 = r5.f2065b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f2069f
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.a0$b r6 = new androidx.appcompat.widget.a0$b
            r6.<init>()
            r5.f2069f = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f2069f
            int r1 = r5.f2066c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f11, float f12, float f13) {
        float f14 = -f13;
        return f11 >= f14 && f12 >= f14 && f11 < ((float) (view.getRight() - view.getLeft())) + f13 && f12 < ((float) (view.getBottom() - view.getTop())) + f13;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2072i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2072i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public abstract q1.f b();

    /* access modifiers changed from: protected */
    public abstract boolean c();

    /* access modifiers changed from: protected */
    public boolean d() {
        q1.f b11 = b();
        if (b11 == null || !b11.b()) {
            return true;
        }
        b11.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        a();
        View view = this.f2067d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f2070g = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        boolean z12 = this.f2070g;
        if (z12) {
            z11 = f(motionEvent) || !d();
        } else {
            z11 = g(motionEvent) && c();
            if (z11) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f2067d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f2070g = z11;
        if (z11 || z12) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f2070g = false;
        this.f2071h = -1;
        Runnable runnable = this.f2068e;
        if (runnable != null) {
            this.f2067d.removeCallbacks(runnable);
        }
    }
}

package f1;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: MotionEventAdapter.android.kt */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private long f14497a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseLongArray f14498b = new SparseLongArray();

    /* renamed from: c  reason: collision with root package name */
    private final SparseBooleanArray f14499c = new SparseBooleanArray();

    /* renamed from: d  reason: collision with root package name */
    private final List<y> f14500d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private int f14501e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f14502f = -1;

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.f14498b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f14498b;
                long j = this.f14497a;
                this.f14497a = 1 + j;
                sparseLongArray.put(pointerId, j);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    this.f14499c.put(pointerId, true);
                }
            }
        } else if (actionMasked == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (this.f14498b.indexOfKey(pointerId2) < 0) {
                SparseLongArray sparseLongArray2 = this.f14498b;
                long j11 = this.f14497a;
                this.f14497a = 1 + j11;
                sparseLongArray2.put(pointerId2, j11);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType != this.f14501e || source != this.f14502f) {
                this.f14501e = toolType;
                this.f14502f = source;
                this.f14499c.clear();
                this.f14498b.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final f1.y d(f1.h0 r24, android.view.MotionEvent r25, int r26, boolean r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            int r4 = r25.getPointerId(r26)
            long r6 = r0.f(r4)
            float r4 = r25.getX(r26)
            float r5 = r25.getY(r26)
            long r4 = t0.g.a(r4, r5)
            if (r3 != 0) goto L_0x0031
            float r4 = r25.getRawX()
            float r5 = r25.getRawY()
            long r4 = t0.g.a(r4, r5)
            long r8 = r1.c(r4)
        L_0x002e:
            r10 = r4
            r12 = r8
            goto L_0x0048
        L_0x0031:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r8 < r9) goto L_0x0042
            f1.j r4 = f1.j.f14503a
            long r4 = r4.a(r2, r3)
            long r8 = r1.c(r4)
            goto L_0x002e
        L_0x0042:
            long r8 = r1.p(r4)
            r12 = r4
            r10 = r8
        L_0x0048:
            int r1 = r25.getToolType(r26)
            r4 = 1
            if (r1 == 0) goto L_0x007d
            if (r1 == r4) goto L_0x0076
            r5 = 2
            if (r1 == r5) goto L_0x006f
            r5 = 3
            if (r1 == r5) goto L_0x0068
            r5 = 4
            if (r1 == r5) goto L_0x0061
            f1.g0$a r1 = f1.g0.f14488a
            int r1 = r1.e()
            goto L_0x0083
        L_0x0061:
            f1.g0$a r1 = f1.g0.f14488a
            int r1 = r1.a()
            goto L_0x0083
        L_0x0068:
            f1.g0$a r1 = f1.g0.f14488a
            int r1 = r1.b()
            goto L_0x0083
        L_0x006f:
            f1.g0$a r1 = f1.g0.f14488a
            int r1 = r1.c()
            goto L_0x0083
        L_0x0076:
            f1.g0$a r1 = f1.g0.f14488a
            int r1 = r1.d()
            goto L_0x0083
        L_0x007d:
            f1.g0$a r1 = f1.g0.f14488a
            int r1 = r1.e()
        L_0x0083:
            r15 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r5 = r25.getHistorySize()
            r9 = 0
        L_0x008e:
            if (r9 >= r5) goto L_0x00d6
            float r14 = r2.getHistoricalX(r3, r9)
            float r4 = r2.getHistoricalY(r3, r9)
            boolean r16 = java.lang.Float.isInfinite(r14)
            if (r16 != 0) goto L_0x00a7
            boolean r16 = java.lang.Float.isNaN(r14)
            if (r16 != 0) goto L_0x00a7
            r16 = 1
            goto L_0x00a9
        L_0x00a7:
            r16 = 0
        L_0x00a9:
            if (r16 == 0) goto L_0x00d2
            boolean r16 = java.lang.Float.isInfinite(r4)
            if (r16 != 0) goto L_0x00ba
            boolean r16 = java.lang.Float.isNaN(r4)
            if (r16 != 0) goto L_0x00ba
            r16 = 1
            goto L_0x00bc
        L_0x00ba:
            r16 = 0
        L_0x00bc:
            if (r16 == 0) goto L_0x00d2
            f1.f r8 = new f1.f
            long r18 = r2.getHistoricalEventTime(r9)
            long r20 = t0.g.a(r14, r4)
            r22 = 0
            r17 = r8
            r17.<init>(r18, r20, r22)
            r1.add(r8)
        L_0x00d2:
            int r9 = r9 + 1
            r4 = 1
            goto L_0x008e
        L_0x00d6:
            int r4 = r25.getActionMasked()
            r5 = 8
            if (r4 != r5) goto L_0x00f0
            r4 = 10
            float r4 = r2.getAxisValue(r4)
            r5 = 9
            float r5 = r2.getAxisValue(r5)
            float r5 = -r5
            long r4 = t0.g.a(r4, r5)
            goto L_0x00f6
        L_0x00f0:
            t0.f$a r4 = t0.f.f16662b
            long r4 = r4.c()
        L_0x00f6:
            r18 = r4
            android.util.SparseBooleanArray r4 = r0.f14499c
            int r3 = r25.getPointerId(r26)
            r5 = 0
            boolean r16 = r4.get(r3, r5)
            f1.y r3 = new f1.y
            long r8 = r25.getEventTime()
            r20 = 0
            r5 = r3
            r14 = r27
            r17 = r1
            r5.<init>(r6, r8, r10, r12, r14, r15, r16, r17, r18, r20)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.i.d(f1.h0, android.view.MotionEvent, int, boolean):f1.y");
    }

    private final long f(int i11) {
        long j;
        int indexOfKey = this.f14498b.indexOfKey(i11);
        if (indexOfKey >= 0) {
            j = this.f14498b.valueAt(indexOfKey);
        } else {
            j = this.f14497a;
            this.f14497a = 1 + j;
            this.f14498b.put(i11, j);
        }
        return u.b(j);
    }

    private final boolean g(MotionEvent motionEvent, int i11) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (motionEvent.getPointerId(i12) == i11) {
                return true;
            }
        }
        return false;
    }

    private final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f14499c.get(pointerId, false)) {
                this.f14498b.delete(pointerId);
                this.f14499c.delete(pointerId);
            }
        }
        if (this.f14498b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f14498b.size() - 1; -1 < size; size--) {
                int keyAt = this.f14498b.keyAt(size);
                if (!g(motionEvent, keyAt)) {
                    this.f14498b.removeAt(size);
                    this.f14499c.delete(keyAt);
                }
            }
        }
    }

    public final x c(MotionEvent motionEvent, h0 h0Var) {
        int i11;
        p.j(motionEvent, "motionEvent");
        p.j(h0Var, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.f14498b.clear();
            this.f14499c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z11 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z12 = actionMasked == 8;
        if (z11) {
            this.f14499c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            i11 = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i11 = 0;
        }
        this.f14500d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i12 = 0;
        while (i12 < pointerCount) {
            this.f14500d.add(d(h0Var, motionEvent, i12, !z11 && i12 != i11 && (!z12 || motionEvent.getButtonState() != 0)));
            i12++;
        }
        h(motionEvent);
        return new x(motionEvent.getEventTime(), this.f14500d, motionEvent);
    }

    public final void e(int i11) {
        this.f14499c.delete(i11);
        this.f14498b.delete(i11);
    }
}

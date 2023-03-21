package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.t;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import androidx.constraintlayout.widget.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ViewTransitionController */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private final MotionLayout f8672a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<t> f8673b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private HashSet<View> f8674c;

    /* renamed from: d  reason: collision with root package name */
    private String f8675d = "ViewTransitionController";

    /* renamed from: e  reason: collision with root package name */
    ArrayList<t.b> f8676e;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<t.b> f8677f = new ArrayList<>();

    /* compiled from: ViewTransitionController */
    class a implements g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f8678a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f8679b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f8680c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f8681d;

        a(t tVar, int i11, boolean z11, int i12) {
            this.f8678a = tVar;
            this.f8679b = i11;
            this.f8680c = z11;
            this.f8681d = i12;
        }
    }

    public u(MotionLayout motionLayout) {
        this.f8672a = motionLayout;
    }

    private void e(t tVar, boolean z11) {
        ConstraintLayout.getSharedValues().a(tVar.h(), new a(tVar, tVar.h(), z11, tVar.g()));
    }

    private void i(t tVar, View... viewArr) {
        int currentState = this.f8672a.getCurrentState();
        if (tVar.f8647e == 2) {
            tVar.c(this, this.f8672a, currentState, (c) null, viewArr);
        } else if (currentState == -1) {
            String str = this.f8675d;
            Log.w(str, "No support for ViewTransition within transition yet. Currently: " + this.f8672a.toString());
        } else {
            c r02 = this.f8672a.r0(currentState);
            if (r02 != null) {
                tVar.c(this, this.f8672a, currentState, r02, viewArr);
            }
        }
    }

    public void a(t tVar) {
        this.f8673b.add(tVar);
        this.f8674c = null;
        if (tVar.i() == 4) {
            e(tVar, true);
        } else if (tVar.i() == 5) {
            e(tVar, false);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(t.b bVar) {
        if (this.f8676e == null) {
            this.f8676e = new ArrayList<>();
        }
        this.f8676e.add(bVar);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        ArrayList<t.b> arrayList = this.f8676e;
        if (arrayList != null) {
            Iterator<t.b> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
            this.f8676e.removeAll(this.f8677f);
            this.f8677f.clear();
            if (this.f8676e.isEmpty()) {
                this.f8676e = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f8672a.invalidate();
    }

    /* access modifiers changed from: package-private */
    public void f(t.b bVar) {
        this.f8677f.add(bVar);
    }

    /* access modifiers changed from: package-private */
    public void g(MotionEvent motionEvent) {
        t tVar;
        int currentState = this.f8672a.getCurrentState();
        if (currentState != -1) {
            if (this.f8674c == null) {
                this.f8674c = new HashSet<>();
                Iterator<t> it2 = this.f8673b.iterator();
                while (it2.hasNext()) {
                    t next = it2.next();
                    int childCount = this.f8672a.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = this.f8672a.getChildAt(i11);
                        if (next.k(childAt)) {
                            childAt.getId();
                            this.f8674c.add(childAt);
                        }
                    }
                }
            }
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList<t.b> arrayList = this.f8676e;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<t.b> it3 = this.f8676e.iterator();
                while (it3.hasNext()) {
                    it3.next().d(action, x11, y11);
                }
            }
            if (action == 0 || action == 1) {
                c r02 = this.f8672a.r0(currentState);
                Iterator<t> it4 = this.f8673b.iterator();
                while (it4.hasNext()) {
                    t next2 = it4.next();
                    if (next2.m(action)) {
                        Iterator<View> it5 = this.f8674c.iterator();
                        while (it5.hasNext()) {
                            View next3 = it5.next();
                            if (next2.k(next3)) {
                                next3.getHitRect(rect);
                                if (rect.contains((int) x11, (int) y11)) {
                                    tVar = next2;
                                    next2.c(this, this.f8672a, currentState, r02, next3);
                                } else {
                                    tVar = next2;
                                }
                                next2 = tVar;
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(int i11, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<t> it2 = this.f8673b.iterator();
        t tVar = null;
        while (it2.hasNext()) {
            t next = it2.next();
            if (next.e() == i11) {
                for (View view : viewArr) {
                    if (next.d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    i(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                tVar = next;
            }
        }
        if (tVar == null) {
            Log.e(this.f8675d, " Could not find ViewTransition");
        }
    }
}

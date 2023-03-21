package androidx.constraintlayout.motion.widget;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f8640a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View[] f8641b;

    public /* synthetic */ s(t tVar, View[] viewArr) {
        this.f8640a = tVar;
        this.f8641b = viewArr;
    }

    public final void run() {
        this.f8640a.j(this.f8641b);
    }
}

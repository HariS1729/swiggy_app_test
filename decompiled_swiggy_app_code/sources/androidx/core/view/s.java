package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: NestedScrollingParentHelper */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private int f9600a;

    /* renamed from: b  reason: collision with root package name */
    private int f9601b;

    public s(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f9600a | this.f9601b;
    }

    public void b(View view, View view2, int i11) {
        c(view, view2, i11, 0);
    }

    public void c(View view, View view2, int i11, int i12) {
        if (i12 == 1) {
            this.f9601b = i11;
        } else {
            this.f9600a = i11;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i11) {
        if (i11 == 1) {
            this.f9601b = 0;
        } else {
            this.f9600a = 0;
        }
    }
}

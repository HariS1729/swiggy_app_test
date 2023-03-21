package androidx.databinding;

import android.view.View;
import android.view.ViewStub;

/* compiled from: ViewStubProxy */
public class r {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public ViewStub f9736a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ViewDataBinding f9737b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public View f9738c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ViewStub.OnInflateListener f9739d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public ViewDataBinding f9740e;

    /* renamed from: f  reason: collision with root package name */
    private ViewStub.OnInflateListener f9741f;

    /* compiled from: ViewStubProxy */
    class a implements ViewStub.OnInflateListener {
        a() {
        }

        public void onInflate(ViewStub viewStub, View view) {
            View unused = r.this.f9738c = view;
            r rVar = r.this;
            ViewDataBinding unused2 = rVar.f9737b = g.c(rVar.f9740e.f9701l, view, viewStub.getLayoutResource());
            ViewStub unused3 = r.this.f9736a = null;
            if (r.this.f9739d != null) {
                r.this.f9739d.onInflate(viewStub, view);
                ViewStub.OnInflateListener unused4 = r.this.f9739d = null;
            }
            r.this.f9740e.M();
            r.this.f9740e.A();
        }
    }

    public r(ViewStub viewStub) {
        a aVar = new a();
        this.f9741f = aVar;
        this.f9736a = viewStub;
        viewStub.setOnInflateListener(aVar);
    }

    public ViewDataBinding g() {
        return this.f9737b;
    }

    public View h() {
        return this.f9738c;
    }

    public ViewStub i() {
        return this.f9736a;
    }

    public boolean j() {
        return this.f9738c != null;
    }

    public void k(ViewDataBinding viewDataBinding) {
        this.f9740e = viewDataBinding;
    }

    public void l(ViewStub.OnInflateListener onInflateListener) {
        if (this.f9736a != null) {
            this.f9739d = onInflateListener;
        }
    }
}

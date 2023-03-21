package cg0;

import android.app.Activity;
import go0.g;
import in.swiggy.android.swiggylocation.location.b;
import zj.e;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e0 implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f12948a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12949b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f12950c;

    public /* synthetic */ e0(Activity activity, int i11, g gVar) {
        this.f12948a = activity;
        this.f12949b = i11;
        this.f12950c = gVar;
    }

    public final void onFailure(Exception exc) {
        b.G3(this.f12948a, this.f12949b, this.f12950c, exc);
    }
}

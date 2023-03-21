package cg0;

import ao0.e;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import zj.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i1 implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f12962a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j1 f12963b;

    public /* synthetic */ i1(e eVar, j1 j1Var) {
        this.f12962a = eVar;
        this.f12963b = j1Var;
    }

    public final void onSuccess(Object obj) {
        j1.l(this.f12962a, this.f12963b, (FetchPlaceResponse) obj);
    }
}

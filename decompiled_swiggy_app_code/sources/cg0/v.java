package cg0;

import android.app.Activity;
import com.google.android.gms.location.j;
import in.swiggy.android.swiggylocation.location.b;
import java.util.concurrent.atomic.AtomicBoolean;
import zj.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class v implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f12982a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Boolean f12983b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f12984c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f12985d;

    public /* synthetic */ v(b bVar, Boolean bool, Activity activity, AtomicBoolean atomicBoolean) {
        this.f12982a = bVar;
        this.f12983b = bool;
        this.f12984c = activity;
        this.f12985d = atomicBoolean;
    }

    public final void onSuccess(Object obj) {
        this.f12982a.F3(this.f12983b, this.f12984c, this.f12985d, (j) obj);
    }
}

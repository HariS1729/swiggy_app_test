package cg0;

import android.app.Activity;
import android.location.Location;
import in.swiggy.android.swiggylocation.location.b;
import java.util.concurrent.atomic.AtomicBoolean;
import zj.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f12987a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f12988b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f12989c;

    public /* synthetic */ w(b bVar, AtomicBoolean atomicBoolean, Activity activity) {
        this.f12987a = bVar;
        this.f12988b = atomicBoolean;
        this.f12989c = activity;
    }

    public final void onSuccess(Object obj) {
        this.f12987a.E3(this.f12988b, this.f12989c, (Location) obj);
    }
}

package mf0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import in.swiggy.android.services.OverlaysEventWorker;
import ir.b;
import is.a;
import javax.inject.Provider;

/* compiled from: OverlaysEventWorker_AssistedFactory */
public final class z implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<SharedPreferences> f19751a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<b> f19752b;

    public z(Provider<SharedPreferences> provider, Provider<b> provider2) {
        this.f19751a = provider;
        this.f19752b = provider2;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new OverlaysEventWorker(context, workerParameters, this.f19751a.get(), this.f19752b.get());
    }
}

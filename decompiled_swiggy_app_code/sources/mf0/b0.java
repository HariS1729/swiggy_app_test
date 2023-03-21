package mf0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import ar.d;
import ef0.e;
import in.swiggy.android.services.RegistrationWorker;
import in.swiggy.android.tejas.apiinterface.ISpnsApi;
import is.a;
import javax.inject.Provider;

/* compiled from: RegistrationWorker_AssistedFactory */
public final class b0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<e> f19682a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<SharedPreferences> f19683b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<d> f19684c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<os.a> f19685d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<jr.a> f19686e;

    /* renamed from: f  reason: collision with root package name */
    private final Provider<ISpnsApi> f19687f;

    public b0(Provider<e> provider, Provider<SharedPreferences> provider2, Provider<d> provider3, Provider<os.a> provider4, Provider<jr.a> provider5, Provider<ISpnsApi> provider6) {
        this.f19682a = provider;
        this.f19683b = provider2;
        this.f19684c = provider3;
        this.f19685d = provider4;
        this.f19686e = provider5;
        this.f19687f = provider6;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new RegistrationWorker(context, workerParameters, this.f19682a.get(), this.f19683b.get(), this.f19684c.get(), this.f19685d.get(), this.f19686e.get(), this.f19687f.get());
    }
}

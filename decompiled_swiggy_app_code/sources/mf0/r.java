package mf0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import in.swiggy.android.services.ImageCachingUtilWorker;
import is.a;
import javax.inject.Provider;
import pl0.m0;

/* compiled from: ImageCachingUtilWorker_AssistedFactory */
public final class r implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<m0> f19740a;

    public r(Provider<m0> provider) {
        this.f19740a = provider;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new ImageCachingUtilWorker(context, workerParameters, this.f19740a.get());
    }
}

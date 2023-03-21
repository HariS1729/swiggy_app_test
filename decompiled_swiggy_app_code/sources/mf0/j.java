package mf0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.gson.Gson;
import in.swiggy.android.services.EdmPostFeedbackWorker;
import in.swiggy.android.tejas.feature.edm.IEdmApi;
import is.a;
import javax.inject.Provider;

/* compiled from: EdmPostFeedbackWorker_AssistedFactory */
public final class j implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<IEdmApi> f19712a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<Gson> f19713b;

    public j(Provider<IEdmApi> provider, Provider<Gson> provider2) {
        this.f19712a = provider;
        this.f19713b = provider2;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new EdmPostFeedbackWorker(context, workerParameters, this.f19712a.get(), this.f19713b.get());
    }
}

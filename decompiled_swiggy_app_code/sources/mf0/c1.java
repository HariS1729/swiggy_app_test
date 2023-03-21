package mf0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import in.swiggy.android.services.WebResourceDownloadWorker;
import is.a;
import javax.inject.Provider;
import wm0.g;

/* compiled from: WebResourceDownloadWorker_AssistedFactory */
public final class c1 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<g> f19696a;

    public c1(Provider<g> provider) {
        this.f19696a = provider;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new WebResourceDownloadWorker(context, workerParameters, this.f19696a.get());
    }
}

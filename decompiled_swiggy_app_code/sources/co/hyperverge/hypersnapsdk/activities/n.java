package co.hyperverge.hypersnapsdk.activities;

import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HVDocsActivity f13303a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HVError f13304b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f13305c;

    public /* synthetic */ n(HVDocsActivity hVDocsActivity, HVError hVError, b bVar) {
        this.f13303a = hVDocsActivity;
        this.f13304b = hVError;
        this.f13305c = bVar;
    }

    public final void run() {
        this.f13303a.a2(this.f13304b, this.f13305c);
    }
}

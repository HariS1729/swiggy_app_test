package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.r;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f9520a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f9521b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f9522c;

    public /* synthetic */ j(k kVar, Lifecycle.State state, m mVar) {
        this.f9520a = kVar;
        this.f9521b = state;
        this.f9522c = mVar;
    }

    public final void b(r rVar, Lifecycle.Event event) {
        this.f9520a.g(this.f9521b, this.f9522c, rVar, event);
    }
}

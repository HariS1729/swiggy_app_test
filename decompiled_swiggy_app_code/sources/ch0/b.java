package ch0;

import ch0.a;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f13023a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ amazonpay.silentpay.b f13024b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a.c f13025c;

    public /* synthetic */ b(a aVar, amazonpay.silentpay.b bVar, a.c cVar) {
        this.f13023a = aVar;
        this.f13024b = bVar;
        this.f13025c = cVar;
    }

    public final Object call() {
        return a.c.d(this.f13023a, this.f13024b, this.f13025c);
    }
}

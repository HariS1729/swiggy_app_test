package coil.fetch;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {76, 105}, m = "fetch")
/* compiled from: HttpUriFetcher.kt */
final class HttpUriFetcher$fetch$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f13559a;

    /* renamed from: b  reason: collision with root package name */
    Object f13560b;

    /* renamed from: c  reason: collision with root package name */
    Object f13561c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f13562d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ HttpUriFetcher f13563e;

    /* renamed from: f  reason: collision with root package name */
    int f13564f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HttpUriFetcher$fetch$1(HttpUriFetcher httpUriFetcher, c<? super HttpUriFetcher$fetch$1> cVar) {
        super(cVar);
        this.f13563e = httpUriFetcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.f13562d = obj;
        this.f13564f |= Integer.MIN_VALUE;
        return this.f13563e.a(this);
    }
}

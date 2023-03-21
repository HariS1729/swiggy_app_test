package coil.fetch;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import okhttp3.Request;

@d(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {223}, m = "executeNetworkRequest")
/* compiled from: HttpUriFetcher.kt */
final class HttpUriFetcher$executeNetworkRequest$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f13556a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HttpUriFetcher f13557b;

    /* renamed from: c  reason: collision with root package name */
    int f13558c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HttpUriFetcher$executeNetworkRequest$1(HttpUriFetcher httpUriFetcher, c<? super HttpUriFetcher$executeNetworkRequest$1> cVar) {
        super(cVar);
        this.f13557b = httpUriFetcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.f13556a = obj;
        this.f13558c |= Integer.MIN_VALUE;
        return this.f13557b.c((Request) null, this);
    }
}

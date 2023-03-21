package coil.network;

import kotlin.jvm.internal.Lambda;
import lp0.a;
import okhttp3.CacheControl;

/* compiled from: CacheResponse.kt */
final class CacheResponse$cacheControl$2 extends Lambda implements a<CacheControl> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CacheResponse f13660a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CacheResponse$cacheControl$2(CacheResponse cacheResponse) {
        super(0);
        this.f13660a = cacheResponse;
    }

    /* renamed from: a */
    public final CacheControl invoke() {
        return CacheControl.Companion.parse(this.f13660a.d());
    }
}

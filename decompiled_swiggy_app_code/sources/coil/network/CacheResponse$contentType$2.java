package coil.network;

import kotlin.jvm.internal.Lambda;
import lp0.a;
import okhttp3.MediaType;

/* compiled from: CacheResponse.kt */
final class CacheResponse$contentType$2 extends Lambda implements a<MediaType> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CacheResponse f13661a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CacheResponse$contentType$2(CacheResponse cacheResponse) {
        super(0);
        this.f13661a = cacheResponse;
    }

    /* renamed from: a */
    public final MediaType invoke() {
        String str = this.f13661a.d().get("Content-Type");
        if (str == null) {
            return null;
        }
        return MediaType.Companion.parse(str);
    }
}

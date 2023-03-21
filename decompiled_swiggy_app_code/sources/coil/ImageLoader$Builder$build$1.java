package coil;

import coil.ImageLoader;
import coil.memory.MemoryCache;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: ImageLoader.kt */
final class ImageLoader$Builder$build$1 extends Lambda implements a<MemoryCache> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ImageLoader.Builder f13363a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ImageLoader$Builder$build$1(ImageLoader.Builder builder) {
        super(0);
        this.f13363a = builder;
    }

    /* renamed from: a */
    public final MemoryCache invoke() {
        return new MemoryCache.a(this.f13363a.f13354a).a();
    }
}

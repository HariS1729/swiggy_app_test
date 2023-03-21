package coil;

import android.content.Context;
import bp0.f;
import c7.h;
import c7.n;
import c7.q;
import coil.memory.MemoryCache;
import kotlin.jvm.internal.i;
import m6.b;
import m6.c;
import okhttp3.Call;
import x6.a;
import x6.g;

/* compiled from: ImageLoader.kt */
public interface ImageLoader {

    /* compiled from: ImageLoader.kt */
    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Context f13354a;

        /* renamed from: b  reason: collision with root package name */
        private a f13355b = h.b();

        /* renamed from: c  reason: collision with root package name */
        private f<? extends MemoryCache> f13356c = null;

        /* renamed from: d  reason: collision with root package name */
        private f<? extends p6.a> f13357d = null;

        /* renamed from: e  reason: collision with root package name */
        private f<? extends Call.Factory> f13358e = null;

        /* renamed from: f  reason: collision with root package name */
        private c.d f13359f = null;

        /* renamed from: g  reason: collision with root package name */
        private b f13360g = null;

        /* renamed from: h  reason: collision with root package name */
        private n f13361h = new n(false, false, false, 0, 15, (i) null);

        /* renamed from: i  reason: collision with root package name */
        private q f13362i = null;

        public Builder(Context context) {
            this.f13354a = context.getApplicationContext();
        }

        public final ImageLoader b() {
            Context context = this.f13354a;
            a aVar = this.f13355b;
            f<? extends MemoryCache> fVar = this.f13356c;
            if (fVar == null) {
                fVar = b.b(new ImageLoader$Builder$build$1(this));
            }
            f<? extends MemoryCache> fVar2 = fVar;
            f<? extends p6.a> fVar3 = this.f13357d;
            if (fVar3 == null) {
                fVar3 = b.b(new ImageLoader$Builder$build$2(this));
            }
            f<? extends p6.a> fVar4 = fVar3;
            f<? extends Call.Factory> fVar5 = this.f13358e;
            if (fVar5 == null) {
                fVar5 = b.b(ImageLoader$Builder$build$3.f13365a);
            }
            f<? extends Call.Factory> fVar6 = fVar5;
            c.d dVar = this.f13359f;
            if (dVar == null) {
                dVar = c.d.f15728b;
            }
            c.d dVar2 = dVar;
            b bVar = this.f13360g;
            if (bVar == null) {
                bVar = new b();
            }
            return new RealImageLoader(context, aVar, fVar2, fVar4, fVar6, dVar2, bVar, this.f13361h, this.f13362i);
        }
    }

    x6.c a(g gVar);

    Object b(g gVar, fp0.c<? super x6.h> cVar);

    a c();

    MemoryCache d();

    b getComponents();
}

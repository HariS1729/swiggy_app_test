package p6;

import coil.disk.DiskLruCache;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.CoroutineDispatcher;
import okio.ByteString;
import okio.z;
import p6.a;

/* compiled from: RealDiskCache.kt */
public final class c implements a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f16258e = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f16259a;

    /* renamed from: b  reason: collision with root package name */
    private final z f16260b;

    /* renamed from: c  reason: collision with root package name */
    private final okio.i f16261c;

    /* renamed from: d  reason: collision with root package name */
    private final DiskLruCache f16262d;

    /* compiled from: RealDiskCache.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: RealDiskCache.kt */
    private static final class b implements a.b {

        /* renamed from: a  reason: collision with root package name */
        private final DiskLruCache.b f16263a;

        public b(DiskLruCache.b bVar) {
            this.f16263a = bVar;
        }

        public void abort() {
            this.f16263a.a();
        }

        /* renamed from: b */
        public C0170c a() {
            DiskLruCache.d c11 = this.f16263a.c();
            if (c11 == null) {
                return null;
            }
            return new C0170c(c11);
        }

        public z getData() {
            return this.f16263a.f(1);
        }

        public z getMetadata() {
            return this.f16263a.f(0);
        }
    }

    /* renamed from: p6.c$c  reason: collision with other inner class name */
    /* compiled from: RealDiskCache.kt */
    private static final class C0170c implements a.c {

        /* renamed from: a  reason: collision with root package name */
        private final DiskLruCache.d f16264a;

        public C0170c(DiskLruCache.d dVar) {
            this.f16264a = dVar;
        }

        /* renamed from: a */
        public b V() {
            DiskLruCache.b a11 = this.f16264a.a();
            if (a11 == null) {
                return null;
            }
            return new b(a11);
        }

        public void close() {
            this.f16264a.close();
        }

        public z getData() {
            return this.f16264a.b(1);
        }

        public z getMetadata() {
            return this.f16264a.b(0);
        }
    }

    public c(long j, z zVar, okio.i iVar, CoroutineDispatcher coroutineDispatcher) {
        this.f16259a = j;
        this.f16260b = zVar;
        this.f16261c = iVar;
        this.f16262d = new DiskLruCache(b(), d(), coroutineDispatcher, e(), 1, 2);
    }

    private final String f(String str) {
        return ByteString.f27172d.d(str).N().s();
    }

    public a.c a(String str) {
        DiskLruCache.d Y = this.f16262d.Y(f(str));
        if (Y == null) {
            return null;
        }
        return new C0170c(Y);
    }

    public okio.i b() {
        return this.f16261c;
    }

    public a.b c(String str) {
        DiskLruCache.b Q = this.f16262d.Q(f(str));
        if (Q == null) {
            return null;
        }
        return new b(Q);
    }

    public z d() {
        return this.f16260b;
    }

    public long e() {
        return this.f16259a;
    }
}

package p6;

import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import kotlinx.coroutines.CoroutineDispatcher;
import okio.i;
import okio.z;
import wp0.u0;

/* compiled from: DiskCache.kt */
public interface a {

    /* renamed from: p6.a$a  reason: collision with other inner class name */
    /* compiled from: DiskCache.kt */
    public static final class C0169a {

        /* renamed from: a  reason: collision with root package name */
        private z f16249a;

        /* renamed from: b  reason: collision with root package name */
        private i f16250b = i.f27240b;

        /* renamed from: c  reason: collision with root package name */
        private double f16251c = 0.02d;

        /* renamed from: d  reason: collision with root package name */
        private long f16252d = 10485760;

        /* renamed from: e  reason: collision with root package name */
        private long f16253e = 262144000;

        /* renamed from: f  reason: collision with root package name */
        private long f16254f;

        /* renamed from: g  reason: collision with root package name */
        private CoroutineDispatcher f16255g = u0.b();

        public final a a() {
            long j;
            z zVar = this.f16249a;
            if (zVar != null) {
                if (this.f16251c > 0.0d) {
                    try {
                        StatFs statFs = new StatFs(zVar.r().getAbsolutePath());
                        j = l.o((long) (this.f16251c * ((double) statFs.getBlockCountLong()) * ((double) statFs.getBlockSizeLong())), this.f16252d, this.f16253e);
                    } catch (Exception unused) {
                        j = this.f16252d;
                    }
                } else {
                    j = this.f16254f;
                }
                return new c(j, zVar, this.f16250b, this.f16255g);
            }
            throw new IllegalStateException("directory == null".toString());
        }

        public final C0169a b(File file) {
            return c(z.a.d(z.f27295b, file, false, 1, (Object) null));
        }

        public final C0169a c(z zVar) {
            this.f16249a = zVar;
            return this;
        }
    }

    /* compiled from: DiskCache.kt */
    public interface b {
        c a();

        void abort();

        z getData();

        z getMetadata();
    }

    /* compiled from: DiskCache.kt */
    public interface c extends Closeable {
        b V();

        z getData();

        z getMetadata();
    }

    c a(String str);

    i b();

    b c(String str);
}

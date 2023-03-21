package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.common.util.concurrent.b;
import d4.c;
import d4.o;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {

    /* renamed from: a  reason: collision with root package name */
    private Context f12284a;

    /* renamed from: b  reason: collision with root package name */
    private WorkerParameters f12285b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f12286c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12287d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12288e;

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        public static final class C0092a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final b f12289a;

            public C0092a() {
                this(b.f12339c);
            }

            public b e() {
                return this.f12289a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0092a.class != obj.getClass()) {
                    return false;
                }
                return this.f12289a.equals(((C0092a) obj).f12289a);
            }

            public int hashCode() {
                return (C0092a.class.getName().hashCode() * 31) + this.f12289a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f12289a + '}';
            }

            public C0092a(b bVar) {
                this.f12289a = bVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final b f12290a;

            public c() {
                this(b.f12339c);
            }

            public b e() {
                return this.f12290a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f12290a.equals(((c) obj).f12290a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f12290a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f12290a + '}';
            }

            public c(b bVar) {
                this.f12290a = bVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0092a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(b bVar) {
            return new c(bVar);
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f12284a = context;
            this.f12285b = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context b() {
        return this.f12284a;
    }

    public Executor c() {
        return this.f12285b.a();
    }

    public b<c> d() {
        androidx.work.impl.utils.futures.b t = androidx.work.impl.utils.futures.b.t();
        t.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return t;
    }

    public final UUID e() {
        return this.f12285b.c();
    }

    public final b g() {
        return this.f12285b.d();
    }

    public final int h() {
        return this.f12285b.e();
    }

    public n4.a i() {
        return this.f12285b.f();
    }

    public o j() {
        return this.f12285b.g();
    }

    public boolean k() {
        return this.f12288e;
    }

    public final boolean l() {
        return this.f12286c;
    }

    public final boolean m() {
        return this.f12287d;
    }

    public void n() {
    }

    public final b<Void> o(c cVar) {
        this.f12288e = true;
        return this.f12285b.b().a(b(), e(), cVar);
    }

    public void q(boolean z11) {
        this.f12288e = z11;
    }

    public final void r() {
        this.f12287d = true;
    }

    public abstract b<a> u();

    public final void v() {
        this.f12286c = true;
        n();
    }
}

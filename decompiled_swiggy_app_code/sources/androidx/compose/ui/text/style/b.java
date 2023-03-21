package androidx.compose.ui.text.style;

import kotlin.jvm.internal.i;
import u0.d0;
import u0.u;

/* compiled from: TextDrawStyle.kt */
public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7668a = a.f7669a;

    /* compiled from: TextDrawStyle.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f7669a = new a();

        private a() {
        }

        public final b a(long j) {
            return (j > d0.f16756b.f() ? 1 : (j == d0.f16756b.f() ? 0 : -1)) != 0 ? new a(j, (i) null) : C0025b.f7670b;
        }
    }

    /* renamed from: androidx.compose.ui.text.style.b$b  reason: collision with other inner class name */
    /* compiled from: TextDrawStyle.kt */
    public static final class C0025b implements b {

        /* renamed from: b  reason: collision with root package name */
        public static final C0025b f7670b = new C0025b();

        private C0025b() {
        }

        public long a() {
            return d0.f16756b.f();
        }

        public /* synthetic */ b b(b bVar) {
            return TextDrawStyle$CC.a(this, bVar);
        }

        public /* synthetic */ b c(lp0.a aVar) {
            return TextDrawStyle$CC.b(this, aVar);
        }

        public u d() {
            return null;
        }
    }

    long a();

    b b(b bVar);

    b c(lp0.a<? extends b> aVar);

    u d();
}

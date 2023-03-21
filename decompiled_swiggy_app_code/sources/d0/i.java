package d0;

import androidx.compose.material.ripple.RippleThemeKt;
import e0.g;
import u0.d0;
import u0.f0;

/* compiled from: RippleTheme.kt */
public interface i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13820a = a.f13821a;

    /* compiled from: RippleTheme.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f13821a = new a();

        private a() {
        }

        public final b a(long j, boolean z11) {
            if (!z11) {
                return RippleThemeKt.f5849d;
            }
            if (((double) f0.h(j)) > 0.5d) {
                return RippleThemeKt.f5847b;
            }
            return RippleThemeKt.f5848c;
        }

        public final long b(long j, boolean z11) {
            return (z11 || ((double) f0.h(j)) >= 0.5d) ? j : d0.f16756b.g();
        }
    }

    b a(g gVar, int i11);

    long b(g gVar, int i11);
}

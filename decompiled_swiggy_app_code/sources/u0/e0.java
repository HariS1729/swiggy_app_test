package u0;

import android.graphics.ColorFilter;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ColorFilter.kt */
public final class e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16769b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final ColorFilter f16770a;

    /* compiled from: ColorFilter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public static /* synthetic */ e0 c(a aVar, long j, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = s.f16866b.z();
            }
            return aVar.b(j, i11);
        }

        public final e0 a(float[] fArr) {
            p.j(fArr, "colorMatrix");
            return d.a(fArr);
        }

        public final e0 b(long j, int i11) {
            return d.b(j, i11);
        }
    }

    public e0(ColorFilter colorFilter) {
        p.j(colorFilter, "nativeColorFilter");
        this.f16770a = colorFilter;
    }

    public final ColorFilter a() {
        return this.f16770a;
    }
}

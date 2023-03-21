package i1;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import i1.e0;
import java.util.Map;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: MeasureScope.kt */
public final /* synthetic */ class v {

    /* compiled from: MeasureScope.kt */
    public static final class a implements u {

        /* renamed from: a  reason: collision with root package name */
        private final int f14889a;

        /* renamed from: b  reason: collision with root package name */
        private final int f14890b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<a, Integer> f14891c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f14892d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ w f14893e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l<e0.a, k> f14894f;

        a(int i11, int i12, Map<a, Integer> map, w wVar, l<? super e0.a, k> lVar) {
            this.f14892d = i11;
            this.f14893e = wVar;
            this.f14894f = lVar;
            this.f14889a = i11;
            this.f14890b = i12;
            this.f14891c = map;
        }

        public Map<a, Integer> a() {
            return this.f14891c;
        }

        public void d() {
            e0.a.C0133a aVar = e0.a.f14880a;
            int i11 = this.f14892d;
            LayoutDirection layoutDirection = this.f14893e.getLayoutDirection();
            l<e0.a, k> lVar = this.f14894f;
            int z11 = aVar.h();
            LayoutDirection y11 = aVar.g();
            e0.a.f14882c = i11;
            e0.a.f14881b = layoutDirection;
            lVar.invoke(aVar);
            e0.a.f14882c = z11;
            e0.a.f14881b = y11;
        }

        public int getHeight() {
            return this.f14890b;
        }

        public int getWidth() {
            return this.f14889a;
        }
    }

    public static u a(w wVar, int i11, int i12, Map map, l lVar) {
        p.j(map, "alignmentLines");
        p.j(lVar, "placementBlock");
        return new a(i11, i12, map, wVar, lVar);
    }

    public static /* synthetic */ u b(w wVar, int i11, int i12, Map map, l lVar, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 4) != 0) {
                map = x.f();
            }
            return wVar.x0(i11, i12, map, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }
}

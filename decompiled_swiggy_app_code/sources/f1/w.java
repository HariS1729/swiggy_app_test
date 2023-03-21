package f1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: PointerInputEventProcessor.kt */
final class w {

    /* renamed from: a  reason: collision with root package name */
    private final Map<u, a> f14541a = new LinkedHashMap();

    /* compiled from: PointerInputEventProcessor.kt */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f14542a;

        /* renamed from: b  reason: collision with root package name */
        private final long f14543b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f14544c;

        /* renamed from: d  reason: collision with root package name */
        private final int f14545d;

        private a(long j, long j11, boolean z11, int i11) {
            this.f14542a = j;
            this.f14543b = j11;
            this.f14544c = z11;
            this.f14545d = i11;
        }

        public /* synthetic */ a(long j, long j11, boolean z11, int i11, i iVar) {
            this(j, j11, z11, i11);
        }

        public final boolean a() {
            return this.f14544c;
        }

        public final long b() {
            return this.f14543b;
        }

        public final long c() {
            return this.f14542a;
        }
    }

    public final void a() {
        this.f14541a.clear();
    }

    public final h b(x xVar, h0 h0Var) {
        boolean z11;
        long j;
        long j11;
        x xVar2 = xVar;
        h0 h0Var2 = h0Var;
        p.j(xVar2, "pointerInputEvent");
        p.j(h0Var2, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(xVar.b().size());
        List<y> b11 = xVar.b();
        int size = b11.size();
        for (int i11 = 0; i11 < size; i11++) {
            y yVar = b11.get(i11);
            a aVar = this.f14541a.get(u.a(yVar.c()));
            if (aVar == null) {
                j11 = yVar.i();
                j = yVar.e();
                z11 = false;
            } else {
                long c11 = aVar.c();
                j11 = c11;
                z11 = aVar.a();
                j = h0Var2.c(aVar.b());
            }
            linkedHashMap.put(u.a(yVar.c()), new v(yVar.c(), yVar.i(), yVar.e(), yVar.a(), j11, j, z11, false, yVar.h(), (List) yVar.b(), yVar.g(), (i) null));
            if (yVar.a()) {
                Map<u, a> map = this.f14541a;
                u a11 = u.a(yVar.c());
                a aVar2 = r11;
                a aVar3 = new a(yVar.i(), yVar.f(), yVar.a(), yVar.h(), (i) null);
                map.put(a11, aVar2);
            } else {
                this.f14541a.remove(u.a(yVar.c()));
            }
        }
        return new h(linkedHashMap, xVar2);
    }
}

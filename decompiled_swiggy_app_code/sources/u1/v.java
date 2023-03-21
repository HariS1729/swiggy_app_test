package u1;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;

/* compiled from: FontWeight.kt */
public final class v implements Comparable<v> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16949b = new a((i) null);

    /* renamed from: c  reason: collision with root package name */
    private static final v f16950c;

    /* renamed from: d  reason: collision with root package name */
    private static final v f16951d;

    /* renamed from: e  reason: collision with root package name */
    private static final v f16952e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final v f16953f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final v f16954g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final v f16955h;

    /* renamed from: i  reason: collision with root package name */
    private static final v f16956i;
    private static final v j;
    private static final v k;

    /* renamed from: l  reason: collision with root package name */
    private static final v f16957l;

    /* renamed from: m  reason: collision with root package name */
    private static final v f16958m;
    /* access modifiers changed from: private */
    public static final v n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final v f16959o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final v f16960p;
    /* access modifiers changed from: private */
    public static final v q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final v f16961r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final v f16962s;
    /* access modifiers changed from: private */
    public static final v t;

    /* renamed from: u  reason: collision with root package name */
    private static final List<v> f16963u;

    /* renamed from: a  reason: collision with root package name */
    private final int f16964a;

    /* compiled from: FontWeight.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final v a() {
            return v.t;
        }

        public final v b() {
            return v.f16961r;
        }

        public final v c() {
            return v.f16962s;
        }

        public final v d() {
            return v.n;
        }

        public final v e() {
            return v.f16960p;
        }

        public final v f() {
            return v.f16959o;
        }

        public final v g() {
            return v.q;
        }

        public final v h() {
            return v.f16953f;
        }

        public final v i() {
            return v.f16954g;
        }

        public final v j() {
            return v.f16955h;
        }
    }

    static {
        v vVar = new v(100);
        f16950c = vVar;
        v vVar2 = new v(OS2WindowsMetricsTable.WEIGHT_CLASS_ULTRA_LIGHT);
        f16951d = vVar2;
        v vVar3 = new v(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
        f16952e = vVar3;
        v vVar4 = new v(OS2WindowsMetricsTable.WEIGHT_CLASS_NORMAL);
        f16953f = vVar4;
        v vVar5 = new v(OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM);
        f16954g = vVar5;
        v vVar6 = new v(600);
        f16955h = vVar6;
        v vVar7 = new v(OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD);
        f16956i = vVar7;
        v vVar8 = new v(OS2WindowsMetricsTable.WEIGHT_CLASS_EXTRA_BOLD);
        j = vVar8;
        v vVar9 = new v(OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK);
        k = vVar9;
        f16957l = vVar;
        f16958m = vVar2;
        n = vVar3;
        f16959o = vVar4;
        f16960p = vVar5;
        q = vVar6;
        f16961r = vVar7;
        f16962s = vVar8;
        t = vVar9;
        f16963u = k.m(vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, vVar9);
    }

    public v(int i11) {
        this.f16964a = i11;
        boolean z11 = false;
        if (1 <= i11 && i11 < 1001) {
            z11 = true;
        }
        if (!z11) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i11).toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f16964a == ((v) obj).f16964a;
    }

    public int hashCode() {
        return this.f16964a;
    }

    /* renamed from: r */
    public int compareTo(v vVar) {
        p.j(vVar, "other");
        return p.l(this.f16964a, vVar.f16964a);
    }

    public final int s() {
        return this.f16964a;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f16964a + ')';
    }
}

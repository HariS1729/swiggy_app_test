package in.swiggy.android.swiggylynx.plugin.cart.getcart.response;

import fq0.d;
import gq0.a1;
import gq0.f0;
import gq0.n;
import gq0.x0;
import in.swiggy.android.tejas.oldapi.models.menu.Variation;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: GroupVariation2.kt */
public final class GroupVariation2 {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private Double f19042a;

    /* renamed from: b  reason: collision with root package name */
    private Long f19043b;

    /* renamed from: c  reason: collision with root package name */
    private String f19044c;

    /* renamed from: d  reason: collision with root package name */
    private Long f19045d;

    /* compiled from: GroupVariation2.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<GroupVariation2> serializer() {
            return GroupVariation2$$serializer.INSTANCE;
        }
    }

    public GroupVariation2() {
        this((Double) null, (Long) null, (String) null, (Long) null, 15, (i) null);
    }

    public /* synthetic */ GroupVariation2(int i11, Double d11, Long l11, String str, Long l12, x0 x0Var) {
        this.f19042a = (i11 & 1) == 0 ? Double.valueOf(0.0d) : d11;
        if ((i11 & 2) == 0) {
            this.f19043b = 0L;
        } else {
            this.f19043b = l11;
        }
        if ((i11 & 4) == 0) {
            this.f19044c = null;
        } else {
            this.f19044c = str;
        }
        if ((i11 & 8) == 0) {
            this.f19045d = 0L;
        } else {
            this.f19045d = l12;
        }
    }

    public static final void g(GroupVariation2 groupVariation2, d dVar, SerialDescriptor serialDescriptor) {
        boolean z11;
        boolean z12;
        Long l11;
        Long l12;
        p.j(groupVariation2, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z13 = false;
        if (!dVar.o(serialDescriptor, 0) && p.e(groupVariation2.f19042a, Double.valueOf(0.0d))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 0, n.f23109b, groupVariation2.f19042a);
        }
        if (!dVar.o(serialDescriptor, 1) && (l12 = groupVariation2.f19043b) != null && l12.longValue() == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            dVar.E(serialDescriptor, 1, f0.f23081b, groupVariation2.f19043b);
        }
        if (dVar.o(serialDescriptor, 2) || groupVariation2.f19044c != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, groupVariation2.f19044c);
        }
        if (dVar.o(serialDescriptor, 3) || (l11 = groupVariation2.f19045d) == null || l11.longValue() != 0) {
            z13 = true;
        }
        if (z13) {
            dVar.E(serialDescriptor, 3, f0.f23081b, groupVariation2.f19045d);
        }
    }

    public final Long a() {
        return this.f19043b;
    }

    public final Variation b() {
        Variation variation = new Variation();
        variation.mId = String.valueOf(this.f19045d);
        variation.mName = this.f19044c;
        Double d11 = this.f19042a;
        p.g(d11);
        variation.mPrice = d11.doubleValue();
        return variation;
    }

    public final void c(Long l11) {
        this.f19043b = l11;
    }

    public final void d(Long l11) {
        this.f19045d = l11;
    }

    public final void e(String str) {
        this.f19044c = str;
    }

    public final void f(Double d11) {
        this.f19042a = d11;
    }

    public GroupVariation2(Double d11, Long l11, String str, Long l12) {
        this.f19042a = d11;
        this.f19043b = l11;
        this.f19044c = str;
        this.f19045d = l12;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GroupVariation2(Double d11, Long l11, String str, Long l12, int i11, i iVar) {
        this((i11 & 1) != 0 ? Double.valueOf(0.0d) : d11, (i11 & 2) != 0 ? 0L : l11, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? 0L : l12);
    }
}

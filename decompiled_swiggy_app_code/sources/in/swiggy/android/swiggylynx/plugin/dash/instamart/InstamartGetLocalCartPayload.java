package in.swiggy.android.swiggylynx.plugin.dash.instamart;

import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.h;
import gq0.x0;
import in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem;
import in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem$$serializer;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InstamartGetLocalCartPayload.kt */
public final class InstamartGetLocalCartPayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final List<LocalInstamartItem> f19110a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19111b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19112c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19113d;

    /* renamed from: e  reason: collision with root package name */
    private final Boolean f19114e;

    /* renamed from: f  reason: collision with root package name */
    private final String f19115f;

    /* renamed from: g  reason: collision with root package name */
    private final String f19116g;

    /* renamed from: h  reason: collision with root package name */
    private final String f19117h;

    /* compiled from: InstamartGetLocalCartPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartGetLocalCartPayload> serializer() {
            return InstamartGetLocalCartPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InstamartGetLocalCartPayload(int i11, List list, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.f19110a = null;
        } else {
            this.f19110a = list;
        }
        if ((i11 & 2) != 0) {
            this.f19111b = str;
            if ((i11 & 4) == 0) {
                this.f19112c = null;
            } else {
                this.f19112c = str2;
            }
            if ((i11 & 8) == 0) {
                this.f19113d = null;
            } else {
                this.f19113d = str3;
            }
            if ((i11 & 16) == 0) {
                this.f19114e = null;
            } else {
                this.f19114e = bool;
            }
            if ((i11 & 32) == 0) {
                this.f19115f = null;
            } else {
                this.f19115f = str4;
            }
            if ((i11 & 64) == 0) {
                this.f19116g = null;
            } else {
                this.f19116g = str5;
            }
            if ((i11 & 128) == 0) {
                this.f19117h = null;
            } else {
                this.f19117h = str6;
            }
        } else {
            throw new MissingFieldException("storeId");
        }
    }

    public static final void a(InstamartGetLocalCartPayload instamartGetLocalCartPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartGetLocalCartPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || instamartGetLocalCartPayload.f19110a != null) {
            dVar.E(serialDescriptor, 0, new f(LocalInstamartItem$$serializer.INSTANCE), instamartGetLocalCartPayload.f19110a);
        }
        dVar.n(serialDescriptor, 1, instamartGetLocalCartPayload.f19111b);
        if (dVar.o(serialDescriptor, 2) || instamartGetLocalCartPayload.f19112c != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, instamartGetLocalCartPayload.f19112c);
        }
        if (dVar.o(serialDescriptor, 3) || instamartGetLocalCartPayload.f19113d != null) {
            dVar.E(serialDescriptor, 3, a1.f23069b, instamartGetLocalCartPayload.f19113d);
        }
        if (dVar.o(serialDescriptor, 4) || instamartGetLocalCartPayload.f19114e != null) {
            dVar.E(serialDescriptor, 4, h.f23089b, instamartGetLocalCartPayload.f19114e);
        }
        if (dVar.o(serialDescriptor, 5) || instamartGetLocalCartPayload.f19115f != null) {
            dVar.E(serialDescriptor, 5, a1.f23069b, instamartGetLocalCartPayload.f19115f);
        }
        if (dVar.o(serialDescriptor, 6) || instamartGetLocalCartPayload.f19116g != null) {
            dVar.E(serialDescriptor, 6, a1.f23069b, instamartGetLocalCartPayload.f19116g);
        }
        if (dVar.o(serialDescriptor, 7) || instamartGetLocalCartPayload.f19117h != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 7, a1.f23069b, instamartGetLocalCartPayload.f19117h);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartGetLocalCartPayload)) {
            return false;
        }
        InstamartGetLocalCartPayload instamartGetLocalCartPayload = (InstamartGetLocalCartPayload) obj;
        return p.e(this.f19110a, instamartGetLocalCartPayload.f19110a) && p.e(this.f19111b, instamartGetLocalCartPayload.f19111b) && p.e(this.f19112c, instamartGetLocalCartPayload.f19112c) && p.e(this.f19113d, instamartGetLocalCartPayload.f19113d) && p.e(this.f19114e, instamartGetLocalCartPayload.f19114e) && p.e(this.f19115f, instamartGetLocalCartPayload.f19115f) && p.e(this.f19116g, instamartGetLocalCartPayload.f19116g) && p.e(this.f19117h, instamartGetLocalCartPayload.f19117h);
    }

    public int hashCode() {
        List<LocalInstamartItem> list = this.f19110a;
        int i11 = 0;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.f19111b.hashCode()) * 31;
        String str = this.f19112c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19113d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f19114e;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f19115f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19116g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f19117h;
        if (str5 != null) {
            i11 = str5.hashCode();
        }
        return hashCode6 + i11;
    }

    public String toString() {
        return "InstamartGetLocalCartPayload(items=" + this.f19110a + ", storeId=" + this.f19111b + ", couponCode=" + this.f19112c + ", subscriptionPlanId=" + this.f19113d + ", contactlessDelivery=" + this.f19114e + ", preferredAddressId=" + this.f19115f + ", deliveryType=" + this.f19116g + ", preferredSlotId=" + this.f19117h + ')';
    }

    public InstamartGetLocalCartPayload(List<LocalInstamartItem> list, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6) {
        p.j(str, "storeId");
        this.f19110a = list;
        this.f19111b = str;
        this.f19112c = str2;
        this.f19113d = str3;
        this.f19114e = bool;
        this.f19115f = str4;
        this.f19116g = str5;
        this.f19117h = str6;
    }
}

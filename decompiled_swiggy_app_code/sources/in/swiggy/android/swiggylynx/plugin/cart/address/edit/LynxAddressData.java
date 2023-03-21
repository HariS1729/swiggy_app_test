package in.swiggy.android.swiggylynx.plugin.cart.address.edit;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.truecaller.android.sdk.TruecallerSdkScope;
import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: EditAddressRequestPayload.kt */
public final class LynxAddressData {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19006a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19007b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19008c;

    /* renamed from: d  reason: collision with root package name */
    private final int f19009d;

    /* renamed from: e  reason: collision with root package name */
    private final String f19010e;

    /* renamed from: f  reason: collision with root package name */
    private final String f19011f;

    /* renamed from: g  reason: collision with root package name */
    private final String f19012g;

    /* renamed from: h  reason: collision with root package name */
    private final String f19013h;

    /* renamed from: i  reason: collision with root package name */
    private final String f19014i;
    private final String j;
    private final String k;

    /* renamed from: l  reason: collision with root package name */
    private final String f19015l;

    /* renamed from: m  reason: collision with root package name */
    private final double f19016m;
    private final double n;

    /* renamed from: o  reason: collision with root package name */
    private final String f19017o;

    /* compiled from: EditAddressRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<LynxAddressData> serializer() {
            return LynxAddressData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LynxAddressData(int i11, String str, String str2, String str3, int i12, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, double d11, double d12, String str12, x0 x0Var) {
        int i13 = i11;
        if ((i13 & 1) != 0) {
            this.f19006a = str;
            if ((i13 & 2) != 0) {
                this.f19007b = str2;
                if ((i13 & 4) != 0) {
                    this.f19008c = str3;
                    if ((i13 & 8) != 0) {
                        this.f19009d = i12;
                        if ((i13 & 16) != 0) {
                            this.f19010e = str4;
                            if ((i13 & 32) != 0) {
                                this.f19011f = str5;
                                if ((i13 & 64) != 0) {
                                    this.f19012g = str6;
                                    if ((i13 & 128) != 0) {
                                        this.f19013h = str7;
                                        if ((i13 & 256) != 0) {
                                            this.f19014i = str8;
                                            if ((i13 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0) {
                                                this.j = str9;
                                                if ((i13 & 1024) != 0) {
                                                    this.k = str10;
                                                    if ((i13 & 2048) != 0) {
                                                        this.f19015l = str11;
                                                        if ((i13 & 4096) != 0) {
                                                            this.f19016m = d11;
                                                            if ((i13 & 8192) != 0) {
                                                                this.n = d12;
                                                                this.f19017o = (i13 & 16384) == 0 ? null : str12;
                                                                return;
                                                            }
                                                            throw new MissingFieldException("lng");
                                                        }
                                                        throw new MissingFieldException("lat");
                                                    }
                                                    throw new MissingFieldException("landmark");
                                                }
                                                throw new MissingFieldException(DistributedTracing.NR_ID_ATTRIBUTE);
                                            }
                                            throw new MissingFieldException("flat_no");
                                        }
                                        throw new MissingFieldException("instructions");
                                    }
                                    throw new MissingFieldException("name");
                                }
                                throw new MissingFieldException("mobile");
                            }
                            throw new MissingFieldException("city");
                        }
                        throw new MissingFieldException("area");
                    }
                    throw new MissingFieldException("annotationTag");
                }
                throw new MissingFieldException("annotation");
            }
            throw new MissingFieldException("address");
        }
        throw new MissingFieldException("address_line2");
    }

    public static final void p(LynxAddressData lynxAddressData, d dVar, SerialDescriptor serialDescriptor) {
        p.j(lynxAddressData, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        a1 a1Var = a1.f23069b;
        boolean z11 = false;
        dVar.E(serialDescriptor, 0, a1Var, lynxAddressData.f19006a);
        dVar.E(serialDescriptor, 1, a1Var, lynxAddressData.f19007b);
        dVar.E(serialDescriptor, 2, a1Var, lynxAddressData.f19008c);
        dVar.l(serialDescriptor, 3, lynxAddressData.f19009d);
        dVar.E(serialDescriptor, 4, a1Var, lynxAddressData.f19010e);
        dVar.E(serialDescriptor, 5, a1Var, lynxAddressData.f19011f);
        dVar.E(serialDescriptor, 6, a1Var, lynxAddressData.f19012g);
        dVar.E(serialDescriptor, 7, a1Var, lynxAddressData.f19013h);
        dVar.E(serialDescriptor, 8, a1Var, lynxAddressData.f19014i);
        dVar.E(serialDescriptor, 9, a1Var, lynxAddressData.j);
        dVar.n(serialDescriptor, 10, lynxAddressData.k);
        dVar.E(serialDescriptor, 11, a1Var, lynxAddressData.f19015l);
        dVar.C(serialDescriptor, 12, lynxAddressData.f19016m);
        dVar.C(serialDescriptor, 13, lynxAddressData.n);
        if (dVar.o(serialDescriptor, 14) || lynxAddressData.f19017o != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 14, a1Var, lynxAddressData.f19017o);
        }
    }

    public final String a() {
        return this.f19007b;
    }

    public final String b() {
        return this.f19006a;
    }

    public final String c() {
        return this.f19008c;
    }

    public final int d() {
        return this.f19009d;
    }

    public final String e() {
        return this.f19010e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LynxAddressData)) {
            return false;
        }
        LynxAddressData lynxAddressData = (LynxAddressData) obj;
        return p.e(this.f19006a, lynxAddressData.f19006a) && p.e(this.f19007b, lynxAddressData.f19007b) && p.e(this.f19008c, lynxAddressData.f19008c) && this.f19009d == lynxAddressData.f19009d && p.e(this.f19010e, lynxAddressData.f19010e) && p.e(this.f19011f, lynxAddressData.f19011f) && p.e(this.f19012g, lynxAddressData.f19012g) && p.e(this.f19013h, lynxAddressData.f19013h) && p.e(this.f19014i, lynxAddressData.f19014i) && p.e(this.j, lynxAddressData.j) && p.e(this.k, lynxAddressData.k) && p.e(this.f19015l, lynxAddressData.f19015l) && p.e(Double.valueOf(this.f19016m), Double.valueOf(lynxAddressData.f19016m)) && p.e(Double.valueOf(this.n), Double.valueOf(lynxAddressData.n)) && p.e(this.f19017o, lynxAddressData.f19017o);
    }

    public final String f() {
        return this.f19011f;
    }

    public final String g() {
        return this.j;
    }

    public final String h() {
        return this.k;
    }

    public int hashCode() {
        String str = this.f19006a;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19007b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19008c;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f19009d) * 31;
        String str4 = this.f19010e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f19011f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f19012g;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f19013h;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f19014i;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.j;
        int hashCode9 = (((hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.k.hashCode()) * 31;
        String str10 = this.f19015l;
        int hashCode10 = (((((hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31) + Double.doubleToLongBits(this.f19016m)) * 31) + Double.doubleToLongBits(this.n)) * 31;
        String str11 = this.f19017o;
        if (str11 != null) {
            i11 = str11.hashCode();
        }
        return hashCode10 + i11;
    }

    public final String i() {
        return this.f19014i;
    }

    public final String j() {
        return this.f19015l;
    }

    public final double k() {
        return this.f19016m;
    }

    public final double l() {
        return this.n;
    }

    public final String m() {
        return this.f19012g;
    }

    public final String n() {
        return this.f19013h;
    }

    public final String o() {
        return this.f19017o;
    }

    public String toString() {
        return "LynxAddressData(addressLine2=" + this.f19006a + ", address=" + this.f19007b + ", annotation=" + this.f19008c + ", annotationTag=" + this.f19009d + ", area=" + this.f19010e + ", city=" + this.f19011f + ", mobile=" + this.f19012g + ", name=" + this.f19013h + ", instructions=" + this.f19014i + ", flatNumber=" + this.j + ", id=" + this.k + ", landmark=" + this.f19015l + ", lat=" + this.f19016m + ", lng=" + this.n + ", voiceDirectionsUri=" + this.f19017o + ')';
    }
}

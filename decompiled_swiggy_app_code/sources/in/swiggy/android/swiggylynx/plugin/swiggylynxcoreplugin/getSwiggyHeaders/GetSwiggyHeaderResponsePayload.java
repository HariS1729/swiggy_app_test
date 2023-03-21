package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getSwiggyHeaders;

import com.newrelic.agent.android.agentdata.HexAttribute;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import com.truecaller.android.sdk.TruecallerSdkScope;
import fq0.d;
import gq0.a1;
import gq0.x0;
import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: GetSwiggyHeaderResponsePayload.kt */
public final class GetSwiggyHeaderResponsePayload {
    public static final Companion Companion = new Companion((i) null);
    private String A;
    private String B;
    private final String C;
    private final String D;
    private final String E;

    /* renamed from: a  reason: collision with root package name */
    private String f19414a;

    /* renamed from: b  reason: collision with root package name */
    private String f19415b;

    /* renamed from: c  reason: collision with root package name */
    private String f19416c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19417d;

    /* renamed from: e  reason: collision with root package name */
    private final String f19418e;

    /* renamed from: f  reason: collision with root package name */
    private final String f19419f;

    /* renamed from: g  reason: collision with root package name */
    private final String f19420g;

    /* renamed from: h  reason: collision with root package name */
    private final String f19421h;

    /* renamed from: i  reason: collision with root package name */
    private final String f19422i;
    private final String j;
    private final String k;

    /* renamed from: l  reason: collision with root package name */
    private final String f19423l;

    /* renamed from: m  reason: collision with root package name */
    private final String f19424m;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final String f19425o;

    /* renamed from: p  reason: collision with root package name */
    private final String f19426p;
    private final String q;

    /* renamed from: r  reason: collision with root package name */
    private final String f19427r;

    /* renamed from: s  reason: collision with root package name */
    private final String f19428s;
    private final String t;

    /* renamed from: u  reason: collision with root package name */
    private final String f19429u;
    private final String v;

    /* renamed from: w  reason: collision with root package name */
    private final String f19430w;

    /* renamed from: x  reason: collision with root package name */
    private final String f19431x;

    /* renamed from: y  reason: collision with root package name */
    private final String f19432y;

    /* renamed from: z  reason: collision with root package name */
    private String f19433z;

    /* compiled from: GetSwiggyHeaderResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<GetSwiggyHeaderResponsePayload> serializer() {
            return GetSwiggyHeaderResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetSwiggyHeaderResponsePayload(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, x0 x0Var) {
        int i12 = i11;
        if ((i12 & 1) == 0) {
            this.f19414a = null;
        } else {
            this.f19414a = str;
        }
        if ((i12 & 2) == 0) {
            this.f19415b = null;
        } else {
            this.f19415b = str2;
        }
        if ((i12 & 4) == 0) {
            this.f19416c = null;
        } else {
            this.f19416c = str3;
        }
        if ((i12 & 8) == 0) {
            this.f19417d = null;
        } else {
            this.f19417d = str4;
        }
        if ((i12 & 16) != 0) {
            this.f19418e = str5;
            if ((i12 & 32) != 0) {
                this.f19419f = str6;
                if ((i12 & 64) != 0) {
                    this.f19420g = str7;
                    if ((i12 & 128) != 0) {
                        this.f19421h = str8;
                        if ((i12 & 256) != 0) {
                            this.f19422i = str9;
                            if ((i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0) {
                                this.j = str10;
                                if ((i12 & 1024) != 0) {
                                    this.k = str11;
                                    if ((i12 & 2048) != 0) {
                                        this.f19423l = str12;
                                        if ((i12 & 4096) != 0) {
                                            this.f19424m = str13;
                                            if ((i12 & 8192) != 0) {
                                                this.n = str14;
                                                if ((i12 & 16384) != 0) {
                                                    this.f19425o = str15;
                                                    if ((32768 & i12) != 0) {
                                                        this.f19426p = str16;
                                                        if ((65536 & i12) != 0) {
                                                            this.q = str17;
                                                            if ((131072 & i12) != 0) {
                                                                this.f19427r = str18;
                                                                if ((262144 & i12) != 0) {
                                                                    this.f19428s = str19;
                                                                    if ((524288 & i12) != 0) {
                                                                        this.t = str20;
                                                                        if ((1048576 & i12) != 0) {
                                                                            this.f19429u = str21;
                                                                            if ((2097152 & i12) == 0) {
                                                                                this.v = null;
                                                                            } else {
                                                                                this.v = str22;
                                                                            }
                                                                            if ((4194304 & i12) == 0) {
                                                                                this.f19430w = null;
                                                                            } else {
                                                                                this.f19430w = str23;
                                                                            }
                                                                            if ((8388608 & i12) == 0) {
                                                                                this.f19431x = null;
                                                                            } else {
                                                                                this.f19431x = str24;
                                                                            }
                                                                            if ((16777216 & i12) == 0) {
                                                                                this.f19432y = null;
                                                                            } else {
                                                                                this.f19432y = str25;
                                                                            }
                                                                            if ((33554432 & i12) == 0) {
                                                                                this.f19433z = null;
                                                                            } else {
                                                                                this.f19433z = str26;
                                                                            }
                                                                            if ((67108864 & i12) == 0) {
                                                                                this.A = null;
                                                                            } else {
                                                                                this.A = str27;
                                                                            }
                                                                            if ((134217728 & i12) == 0) {
                                                                                this.B = null;
                                                                            } else {
                                                                                this.B = str28;
                                                                            }
                                                                            if ((268435456 & i12) == 0) {
                                                                                this.C = null;
                                                                            } else {
                                                                                this.C = str29;
                                                                            }
                                                                            if ((536870912 & i12) == 0) {
                                                                                this.D = null;
                                                                            } else {
                                                                                this.D = str30;
                                                                            }
                                                                            if ((i12 & 1073741824) == 0) {
                                                                                this.E = null;
                                                                            } else {
                                                                                this.E = str31;
                                                                            }
                                                                        } else {
                                                                            throw new MissingFieldException("payment-secret-key");
                                                                        }
                                                                    } else {
                                                                        throw new MissingFieldException("x-web-checkout-flow");
                                                                    }
                                                                } else {
                                                                    throw new MissingFieldException("isFromBottomBar");
                                                                }
                                                            } else {
                                                                throw new MissingFieldException("marketplaceBusinessLine");
                                                            }
                                                        } else {
                                                            throw new MissingFieldException("marketplaceCategory");
                                                        }
                                                    } else {
                                                        throw new MissingFieldException("marketplaceId");
                                                    }
                                                } else {
                                                    throw new MissingFieldException("cartAddressId");
                                                }
                                            } else {
                                                throw new MissingFieldException(AnalyticsAttribute.DEVICE_MODEL_ATTRIBUTE);
                                            }
                                        } else {
                                            throw new MissingFieldException(AnalyticsAttribute.OS_VERSION_ATTRIBUTE);
                                        }
                                    } else {
                                        throw new MissingFieldException(HexAttribute.HEX_ATTR_APP_VERSION);
                                    }
                                } else {
                                    throw new MissingFieldException("analyticsPlatform");
                                }
                            } else {
                                throw new MissingFieldException(AnalyticsAttribute.APPLICATION_PLATFORM_ATTRIBUTE);
                            }
                        } else {
                            throw new MissingFieldException("address");
                        }
                    } else {
                        throw new MissingFieldException(HttpRequest.SWIGGY_HEADER_UID);
                    }
                } else {
                    throw new MissingFieldException(HttpRequest.SWIGGY_HEADER_VERSION_CODE);
                }
            } else {
                throw new MissingFieldException("token");
            }
        } else {
            throw new MissingFieldException("currentLocation");
        }
    }

    public static final void d(GetSwiggyHeaderResponsePayload getSwiggyHeaderResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(getSwiggyHeaderResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || getSwiggyHeaderResponsePayload.f19414a != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, getSwiggyHeaderResponsePayload.f19414a);
        }
        if (dVar.o(serialDescriptor, 1) || getSwiggyHeaderResponsePayload.f19415b != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, getSwiggyHeaderResponsePayload.f19415b);
        }
        if (dVar.o(serialDescriptor, 2) || getSwiggyHeaderResponsePayload.f19416c != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, getSwiggyHeaderResponsePayload.f19416c);
        }
        if (dVar.o(serialDescriptor, 3) || getSwiggyHeaderResponsePayload.f19417d != null) {
            dVar.E(serialDescriptor, 3, a1.f23069b, getSwiggyHeaderResponsePayload.f19417d);
        }
        dVar.n(serialDescriptor, 4, getSwiggyHeaderResponsePayload.f19418e);
        dVar.n(serialDescriptor, 5, getSwiggyHeaderResponsePayload.f19419f);
        dVar.n(serialDescriptor, 6, getSwiggyHeaderResponsePayload.f19420g);
        dVar.n(serialDescriptor, 7, getSwiggyHeaderResponsePayload.f19421h);
        dVar.n(serialDescriptor, 8, getSwiggyHeaderResponsePayload.f19422i);
        dVar.n(serialDescriptor, 9, getSwiggyHeaderResponsePayload.j);
        dVar.n(serialDescriptor, 10, getSwiggyHeaderResponsePayload.k);
        dVar.n(serialDescriptor, 11, getSwiggyHeaderResponsePayload.f19423l);
        dVar.n(serialDescriptor, 12, getSwiggyHeaderResponsePayload.f19424m);
        dVar.n(serialDescriptor, 13, getSwiggyHeaderResponsePayload.n);
        dVar.n(serialDescriptor, 14, getSwiggyHeaderResponsePayload.f19425o);
        dVar.n(serialDescriptor, 15, getSwiggyHeaderResponsePayload.f19426p);
        dVar.n(serialDescriptor, 16, getSwiggyHeaderResponsePayload.q);
        dVar.n(serialDescriptor, 17, getSwiggyHeaderResponsePayload.f19427r);
        dVar.n(serialDescriptor, 18, getSwiggyHeaderResponsePayload.f19428s);
        dVar.n(serialDescriptor, 19, getSwiggyHeaderResponsePayload.t);
        dVar.n(serialDescriptor, 20, getSwiggyHeaderResponsePayload.f19429u);
        if (dVar.o(serialDescriptor, 21) || getSwiggyHeaderResponsePayload.v != null) {
            dVar.E(serialDescriptor, 21, a1.f23069b, getSwiggyHeaderResponsePayload.v);
        }
        if (dVar.o(serialDescriptor, 22) || getSwiggyHeaderResponsePayload.f19430w != null) {
            dVar.E(serialDescriptor, 22, a1.f23069b, getSwiggyHeaderResponsePayload.f19430w);
        }
        if (dVar.o(serialDescriptor, 23) || getSwiggyHeaderResponsePayload.f19431x != null) {
            dVar.E(serialDescriptor, 23, a1.f23069b, getSwiggyHeaderResponsePayload.f19431x);
        }
        if (dVar.o(serialDescriptor, 24) || getSwiggyHeaderResponsePayload.f19432y != null) {
            dVar.E(serialDescriptor, 24, a1.f23069b, getSwiggyHeaderResponsePayload.f19432y);
        }
        if (dVar.o(serialDescriptor, 25) || getSwiggyHeaderResponsePayload.f19433z != null) {
            dVar.E(serialDescriptor, 25, a1.f23069b, getSwiggyHeaderResponsePayload.f19433z);
        }
        if (dVar.o(serialDescriptor, 26) || getSwiggyHeaderResponsePayload.A != null) {
            dVar.E(serialDescriptor, 26, a1.f23069b, getSwiggyHeaderResponsePayload.A);
        }
        if (dVar.o(serialDescriptor, 27) || getSwiggyHeaderResponsePayload.B != null) {
            dVar.E(serialDescriptor, 27, a1.f23069b, getSwiggyHeaderResponsePayload.B);
        }
        if (dVar.o(serialDescriptor, 28) || getSwiggyHeaderResponsePayload.C != null) {
            dVar.E(serialDescriptor, 28, a1.f23069b, getSwiggyHeaderResponsePayload.C);
        }
        if (dVar.o(serialDescriptor, 29) || getSwiggyHeaderResponsePayload.D != null) {
            dVar.E(serialDescriptor, 29, a1.f23069b, getSwiggyHeaderResponsePayload.D);
        }
        if (dVar.o(serialDescriptor, 30) || getSwiggyHeaderResponsePayload.E != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 30, a1.f23069b, getSwiggyHeaderResponsePayload.E);
        }
    }

    public final void a(String str) {
        this.f19416c = str;
    }

    public final void b(String str) {
        this.f19415b = str;
    }

    public final void c(String str) {
        this.f19414a = str;
    }

    public GetSwiggyHeaderResponsePayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31) {
        String str32 = str5;
        String str33 = str6;
        String str34 = str7;
        String str35 = str8;
        String str36 = str9;
        String str37 = str10;
        String str38 = str11;
        String str39 = str12;
        String str40 = str13;
        String str41 = str14;
        String str42 = str15;
        String str43 = str16;
        String str44 = str17;
        String str45 = str18;
        String str46 = str20;
        p.j(str32, "currentLocation");
        p.j(str33, "token");
        p.j(str34, "versionCode");
        p.j(str35, HttpRequest.SWIGGY_HEADER_UID);
        p.j(str36, "address");
        p.j(str37, AnalyticsAttribute.APPLICATION_PLATFORM_ATTRIBUTE);
        p.j(str38, "analyticsPlatform");
        p.j(str39, HexAttribute.HEX_ATTR_APP_VERSION);
        p.j(str40, AnalyticsAttribute.OS_VERSION_ATTRIBUTE);
        p.j(str41, AnalyticsAttribute.DEVICE_MODEL_ATTRIBUTE);
        p.j(str42, "cartAddressId");
        p.j(str43, "marketplaceId");
        p.j(str44, "marketplaceCategory");
        p.j(str45, "marketplaceBusinessLine");
        p.j(str19, "isFromBottomBar");
        p.j(str20, "webCheckoutFlow");
        p.j(str21, "paymentSecretKey");
        this.f19414a = str;
        this.f19415b = str2;
        this.f19416c = str3;
        this.f19417d = str4;
        this.f19418e = str32;
        this.f19419f = str33;
        this.f19420g = str34;
        this.f19421h = str35;
        this.f19422i = str36;
        this.j = str37;
        this.k = str38;
        this.f19423l = str39;
        this.f19424m = str40;
        this.n = str41;
        this.f19425o = str42;
        this.f19426p = str43;
        this.q = str44;
        this.f19427r = str45;
        this.f19428s = str19;
        this.t = str20;
        this.f19429u = str21;
        this.v = str22;
        this.f19430w = str23;
        this.f19431x = str24;
        this.f19432y = str25;
        this.f19433z = str26;
        this.A = str27;
        this.B = str28;
        this.C = str29;
        this.D = str30;
        this.E = str31;
    }
}

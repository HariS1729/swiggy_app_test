package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility;

import com.truecaller.android.sdk.TruecallerSdkScope;
import fq0.d;
import gq0.a1;
import gq0.h;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: JuspayRequestParams.kt */
public final class JuspayRequestParams {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19229a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19230b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19231c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19232d;

    /* renamed from: e  reason: collision with root package name */
    private final String f19233e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f19234f;

    /* renamed from: g  reason: collision with root package name */
    private final Boolean f19235g;

    /* renamed from: h  reason: collision with root package name */
    private final String f19236h;

    /* renamed from: i  reason: collision with root package name */
    private final String f19237i;
    private final String j;
    private final String k;

    /* renamed from: l  reason: collision with root package name */
    private final String f19238l;

    /* renamed from: m  reason: collision with root package name */
    private final Boolean f19239m;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final String f19240o;

    /* renamed from: p  reason: collision with root package name */
    private final String f19241p;
    private final String q;

    /* renamed from: r  reason: collision with root package name */
    private final String f19242r;

    /* renamed from: s  reason: collision with root package name */
    private final String f19243s;
    private final String t;

    /* renamed from: u  reason: collision with root package name */
    private final String f19244u;

    /* compiled from: JuspayRequestParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<JuspayRequestParams> serializer() {
            return JuspayRequestParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ JuspayRequestParams(int i11, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, String str7, String str8, String str9, String str10, Boolean bool3, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, x0 x0Var) {
        int i12 = i11;
        if ((i12 & 1) != 0) {
            this.f19229a = str;
            if ((i12 & 2) != 0) {
                this.f19230b = str2;
                if ((i12 & 4) != 0) {
                    this.f19231c = str3;
                    if ((i12 & 8) == 0) {
                        this.f19232d = null;
                    } else {
                        this.f19232d = str4;
                    }
                    if ((i12 & 16) == 0) {
                        this.f19233e = null;
                    } else {
                        this.f19233e = str5;
                    }
                    if ((i12 & 32) == 0) {
                        this.f19234f = null;
                    } else {
                        this.f19234f = bool;
                    }
                    if ((i12 & 64) == 0) {
                        this.f19235g = null;
                    } else {
                        this.f19235g = bool2;
                    }
                    if ((i12 & 128) == 0) {
                        this.f19236h = null;
                    } else {
                        this.f19236h = str6;
                    }
                    if ((i12 & 256) == 0) {
                        this.f19237i = null;
                    } else {
                        this.f19237i = str7;
                    }
                    if ((i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) == 0) {
                        this.j = null;
                    } else {
                        this.j = str8;
                    }
                    if ((i12 & 1024) == 0) {
                        this.k = null;
                    } else {
                        this.k = str9;
                    }
                    if ((i12 & 2048) == 0) {
                        this.f19238l = null;
                    } else {
                        this.f19238l = str10;
                    }
                    if ((i12 & 4096) == 0) {
                        this.f19239m = null;
                    } else {
                        this.f19239m = bool3;
                    }
                    if ((i12 & 8192) == 0) {
                        this.n = null;
                    } else {
                        this.n = str11;
                    }
                    if ((i12 & 16384) == 0) {
                        this.f19240o = null;
                    } else {
                        this.f19240o = str12;
                    }
                    if ((32768 & i12) == 0) {
                        this.f19241p = null;
                    } else {
                        this.f19241p = str13;
                    }
                    if ((65536 & i12) == 0) {
                        this.q = null;
                    } else {
                        this.q = str14;
                    }
                    if ((131072 & i12) == 0) {
                        this.f19242r = null;
                    } else {
                        this.f19242r = str15;
                    }
                    if ((262144 & i12) == 0) {
                        this.f19243s = null;
                    } else {
                        this.f19243s = str16;
                    }
                    if ((524288 & i12) == 0) {
                        this.t = null;
                    } else {
                        this.t = str17;
                    }
                    this.f19244u = (i12 & 1048576) == 0 ? "" : str18;
                    return;
                }
                throw new MissingFieldException("paymentMethodType");
            }
            throw new MissingFieldException("returnUrl");
        }
        throw new MissingFieldException("orderId");
    }

    public static final void t(JuspayRequestParams juspayRequestParams, d dVar, SerialDescriptor serialDescriptor) {
        p.j(juspayRequestParams, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.n(serialDescriptor, 0, juspayRequestParams.f19229a);
        dVar.n(serialDescriptor, 1, juspayRequestParams.f19230b);
        dVar.n(serialDescriptor, 2, juspayRequestParams.f19231c);
        if (dVar.o(serialDescriptor, 3) || juspayRequestParams.f19232d != null) {
            dVar.E(serialDescriptor, 3, a1.f23069b, juspayRequestParams.f19232d);
        }
        if (dVar.o(serialDescriptor, 4) || juspayRequestParams.f19233e != null) {
            dVar.E(serialDescriptor, 4, a1.f23069b, juspayRequestParams.f19233e);
        }
        if (dVar.o(serialDescriptor, 5) || juspayRequestParams.f19234f != null) {
            dVar.E(serialDescriptor, 5, h.f23089b, juspayRequestParams.f19234f);
        }
        if (dVar.o(serialDescriptor, 6) || juspayRequestParams.f19235g != null) {
            dVar.E(serialDescriptor, 6, h.f23089b, juspayRequestParams.f19235g);
        }
        if (dVar.o(serialDescriptor, 7) || juspayRequestParams.f19236h != null) {
            dVar.E(serialDescriptor, 7, a1.f23069b, juspayRequestParams.f19236h);
        }
        if (dVar.o(serialDescriptor, 8) || juspayRequestParams.f19237i != null) {
            dVar.E(serialDescriptor, 8, a1.f23069b, juspayRequestParams.f19237i);
        }
        if (dVar.o(serialDescriptor, 9) || juspayRequestParams.j != null) {
            dVar.E(serialDescriptor, 9, a1.f23069b, juspayRequestParams.j);
        }
        if (dVar.o(serialDescriptor, 10) || juspayRequestParams.k != null) {
            dVar.E(serialDescriptor, 10, a1.f23069b, juspayRequestParams.k);
        }
        if (dVar.o(serialDescriptor, 11) || juspayRequestParams.f19238l != null) {
            dVar.E(serialDescriptor, 11, a1.f23069b, juspayRequestParams.f19238l);
        }
        if (dVar.o(serialDescriptor, 12) || juspayRequestParams.f19239m != null) {
            dVar.E(serialDescriptor, 12, h.f23089b, juspayRequestParams.f19239m);
        }
        if (dVar.o(serialDescriptor, 13) || juspayRequestParams.n != null) {
            dVar.E(serialDescriptor, 13, a1.f23069b, juspayRequestParams.n);
        }
        if (dVar.o(serialDescriptor, 14) || juspayRequestParams.f19240o != null) {
            dVar.E(serialDescriptor, 14, a1.f23069b, juspayRequestParams.f19240o);
        }
        if (dVar.o(serialDescriptor, 15) || juspayRequestParams.f19241p != null) {
            dVar.E(serialDescriptor, 15, a1.f23069b, juspayRequestParams.f19241p);
        }
        if (dVar.o(serialDescriptor, 16) || juspayRequestParams.q != null) {
            dVar.E(serialDescriptor, 16, a1.f23069b, juspayRequestParams.q);
        }
        if (dVar.o(serialDescriptor, 17) || juspayRequestParams.f19242r != null) {
            dVar.E(serialDescriptor, 17, a1.f23069b, juspayRequestParams.f19242r);
        }
        if (dVar.o(serialDescriptor, 18) || juspayRequestParams.f19243s != null) {
            dVar.E(serialDescriptor, 18, a1.f23069b, juspayRequestParams.f19243s);
        }
        if (dVar.o(serialDescriptor, 19) || juspayRequestParams.t != null) {
            dVar.E(serialDescriptor, 19, a1.f23069b, juspayRequestParams.t);
        }
        if (dVar.o(serialDescriptor, 20) || !p.e(juspayRequestParams.f19244u, "")) {
            z11 = true;
        }
        if (z11) {
            dVar.n(serialDescriptor, 20, juspayRequestParams.f19244u);
        }
    }

    public final String a() {
        return this.f19238l;
    }

    public final String b() {
        return this.f19232d;
    }

    public final String c() {
        return this.f19241p;
    }

    public final String d() {
        return this.q;
    }

    public final String e() {
        return this.f19242r;
    }

    public final String f() {
        return this.f19240o;
    }

    public final String g() {
        return this.j;
    }

    public final String h() {
        return this.f19233e;
    }

    public final String i() {
        return this.f19243s;
    }

    public final String j() {
        return this.k;
    }

    public final String k() {
        return this.n;
    }

    public final String l() {
        return this.t;
    }

    public final String m() {
        return this.f19244u;
    }

    public final String n() {
        return this.f19229a;
    }

    public final String o() {
        return this.f19237i;
    }

    public final String p() {
        return this.f19231c;
    }

    public final String q() {
        return this.f19230b;
    }

    public final Boolean r() {
        return this.f19239m;
    }

    public final Boolean s() {
        return this.f19235g;
    }
}

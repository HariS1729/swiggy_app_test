package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.setlocation;

import com.truecaller.android.sdk.TruecallerSdkScope;
import fq0.d;
import gq0.a1;
import gq0.w;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;
import org.apache.pdfbox.pdmodel.interactive.form.PDChoice;

/* compiled from: SetLocationRequestPayload.kt */
public final class SetLocationRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final double f19470a;

    /* renamed from: b  reason: collision with root package name */
    private final double f19471b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19472c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19473d;

    /* renamed from: e  reason: collision with root package name */
    private final String f19474e;

    /* renamed from: f  reason: collision with root package name */
    private final String f19475f;

    /* renamed from: g  reason: collision with root package name */
    private final String f19476g;

    /* renamed from: h  reason: collision with root package name */
    private final String f19477h;

    /* renamed from: i  reason: collision with root package name */
    private final String f19478i;
    private final String j;
    private final int k;

    /* renamed from: l  reason: collision with root package name */
    private final String f19479l;

    /* renamed from: m  reason: collision with root package name */
    private final String f19480m;
    private final int n;

    /* renamed from: o  reason: collision with root package name */
    private final int f19481o;

    /* renamed from: p  reason: collision with root package name */
    private final Integer f19482p;
    private String q;

    /* renamed from: r  reason: collision with root package name */
    private String f19483r;

    /* compiled from: SetLocationRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<SetLocationRequestPayload> serializer() {
            return SetLocationRequestPayload$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SetLocationRequestPayload(int i11, double d11, double d12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i12, String str9, String str10, int i13, int i14, Integer num, String str11, String str12, x0 x0Var) {
        super(i11, x0Var);
        int i15 = i11;
        if ((i15 & 1) != 0) {
            this.f19470a = d11;
            if ((i15 & 2) != 0) {
                this.f19471b = d12;
                if ((i15 & 4) != 0) {
                    this.f19472c = str;
                    if ((i15 & 8) != 0) {
                        this.f19473d = str2;
                        if ((i15 & 16) != 0) {
                            this.f19474e = str3;
                            if ((i15 & 32) == 0) {
                                this.f19475f = null;
                            } else {
                                this.f19475f = str4;
                            }
                            if ((i15 & 64) == 0) {
                                this.f19476g = null;
                            } else {
                                this.f19476g = str5;
                            }
                            if ((i15 & 128) == 0) {
                                this.f19477h = null;
                            } else {
                                this.f19477h = str6;
                            }
                            if ((i15 & 256) == 0) {
                                this.f19478i = null;
                            } else {
                                this.f19478i = str7;
                            }
                            if ((i15 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) == 0) {
                                this.j = null;
                            } else {
                                this.j = str8;
                            }
                            if ((i15 & 1024) == 0) {
                                this.k = 0;
                            } else {
                                this.k = i12;
                            }
                            if ((i15 & 2048) == 0) {
                                this.f19479l = null;
                            } else {
                                this.f19479l = str9;
                            }
                            if ((i15 & 4096) == 0) {
                                this.f19480m = null;
                            } else {
                                this.f19480m = str10;
                            }
                            if ((i15 & 8192) == 0) {
                                this.n = 0;
                            } else {
                                this.n = i13;
                            }
                            if ((i15 & 16384) == 0) {
                                this.f19481o = 0;
                            } else {
                                this.f19481o = i14;
                            }
                            if ((32768 & i15) == 0) {
                                this.f19482p = null;
                            } else {
                                this.f19482p = num;
                            }
                            if ((65536 & i15) == 0) {
                                this.q = null;
                            } else {
                                this.q = str11;
                            }
                            this.f19483r = (i15 & PDChoice.FLAG_COMBO) == 0 ? "" : str12;
                            return;
                        }
                        throw new MissingFieldException("address");
                    }
                    throw new MissingFieldException("area");
                }
                throw new MissingFieldException("city");
            }
            throw new MissingFieldException("lng");
        }
        throw new MissingFieldException("lat");
    }

    public static final void p(SetLocationRequestPayload setLocationRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(setLocationRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.C(serialDescriptor, 0, setLocationRequestPayload.f19470a);
        dVar.C(serialDescriptor, 1, setLocationRequestPayload.f19471b);
        dVar.n(serialDescriptor, 2, setLocationRequestPayload.f19472c);
        dVar.n(serialDescriptor, 3, setLocationRequestPayload.f19473d);
        dVar.n(serialDescriptor, 4, setLocationRequestPayload.f19474e);
        if (dVar.o(serialDescriptor, 5) || setLocationRequestPayload.f19475f != null) {
            dVar.E(serialDescriptor, 5, a1.f23069b, setLocationRequestPayload.f19475f);
        }
        if (dVar.o(serialDescriptor, 6) || setLocationRequestPayload.f19476g != null) {
            dVar.E(serialDescriptor, 6, a1.f23069b, setLocationRequestPayload.f19476g);
        }
        if (dVar.o(serialDescriptor, 7) || setLocationRequestPayload.f19477h != null) {
            dVar.E(serialDescriptor, 7, a1.f23069b, setLocationRequestPayload.f19477h);
        }
        if (dVar.o(serialDescriptor, 8) || setLocationRequestPayload.f19478i != null) {
            dVar.E(serialDescriptor, 8, a1.f23069b, setLocationRequestPayload.f19478i);
        }
        if (dVar.o(serialDescriptor, 9) || setLocationRequestPayload.j != null) {
            dVar.E(serialDescriptor, 9, a1.f23069b, setLocationRequestPayload.j);
        }
        if (dVar.o(serialDescriptor, 10) || setLocationRequestPayload.k != 0) {
            dVar.l(serialDescriptor, 10, setLocationRequestPayload.k);
        }
        if (dVar.o(serialDescriptor, 11) || setLocationRequestPayload.f19479l != null) {
            dVar.E(serialDescriptor, 11, a1.f23069b, setLocationRequestPayload.f19479l);
        }
        if (dVar.o(serialDescriptor, 12) || setLocationRequestPayload.f19480m != null) {
            dVar.E(serialDescriptor, 12, a1.f23069b, setLocationRequestPayload.f19480m);
        }
        if (dVar.o(serialDescriptor, 13) || setLocationRequestPayload.n != 0) {
            dVar.l(serialDescriptor, 13, setLocationRequestPayload.n);
        }
        if (dVar.o(serialDescriptor, 14) || setLocationRequestPayload.f19481o != 0) {
            dVar.l(serialDescriptor, 14, setLocationRequestPayload.f19481o);
        }
        if (dVar.o(serialDescriptor, 15) || setLocationRequestPayload.f19482p != null) {
            dVar.E(serialDescriptor, 15, w.f23130b, setLocationRequestPayload.f19482p);
        }
        if (dVar.o(serialDescriptor, 16) || setLocationRequestPayload.q != null) {
            dVar.E(serialDescriptor, 16, a1.f23069b, setLocationRequestPayload.q);
        }
        if (dVar.o(serialDescriptor, 17) || !p.e(setLocationRequestPayload.f19483r, "")) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 17, a1.f23069b, setLocationRequestPayload.f19483r);
        }
    }

    public final String b() {
        return this.f19474e;
    }

    public final String c() {
        return this.f19479l;
    }

    public final String d() {
        return this.f19473d;
    }

    public final String e() {
        return this.f19472c;
    }

    public final String f() {
        return this.f19483r;
    }

    public final int g() {
        return this.f19481o;
    }

    public final String h() {
        return this.f19480m;
    }

    public final String i() {
        return this.f19476g;
    }

    public final String j() {
        return this.j;
    }

    public final double k() {
        return this.f19470a;
    }

    public final double l() {
        return this.f19471b;
    }

    public final String m() {
        return this.q;
    }

    public final int n() {
        return this.n;
    }

    public final Integer o() {
        return this.f19482p;
    }
}

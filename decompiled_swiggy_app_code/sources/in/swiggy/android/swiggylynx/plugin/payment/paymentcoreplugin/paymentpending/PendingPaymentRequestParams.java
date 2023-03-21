package in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.paymentpending;

import fq0.d;
import gq0.a1;
import gq0.x0;
import gq0.z;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: PendingPaymentRequestParams.kt */
public final class PendingPaymentRequestParams {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19301a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19302b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19303c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f19304d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f19305e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f19306f;

    /* compiled from: PendingPaymentRequestParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<PendingPaymentRequestParams> serializer() {
            return PendingPaymentRequestParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PendingPaymentRequestParams(int i11, String str, String str2, String str3, Map map, Map map2, Map map3, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19301a = str;
            if ((i11 & 2) != 0) {
                this.f19302b = str2;
                if ((i11 & 4) != 0) {
                    this.f19303c = str3;
                    if ((i11 & 8) != 0) {
                        this.f19304d = map;
                        if ((i11 & 16) == 0) {
                            this.f19305e = x.f();
                        } else {
                            this.f19305e = map2;
                        }
                        if ((i11 & 32) == 0) {
                            this.f19306f = x.f();
                        } else {
                            this.f19306f = map3;
                        }
                    } else {
                        throw new MissingFieldException("headers");
                    }
                } else {
                    throw new MissingFieldException("endpoint");
                }
            } else {
                throw new MissingFieldException("host");
            }
        } else {
            throw new MissingFieldException("method");
        }
    }

    public static final void g(PendingPaymentRequestParams pendingPaymentRequestParams, d dVar, SerialDescriptor serialDescriptor) {
        boolean z11;
        p.j(pendingPaymentRequestParams, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z12 = false;
        dVar.n(serialDescriptor, 0, pendingPaymentRequestParams.f19301a);
        dVar.n(serialDescriptor, 1, pendingPaymentRequestParams.f19302b);
        dVar.n(serialDescriptor, 2, pendingPaymentRequestParams.f19303c);
        a1 a1Var = a1.f23069b;
        dVar.v(serialDescriptor, 3, new z(a1Var, a1Var), pendingPaymentRequestParams.f19304d);
        if (!dVar.o(serialDescriptor, 4) && p.e(pendingPaymentRequestParams.f19305e, x.f())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            dVar.v(serialDescriptor, 4, new z(a1Var, a1Var), pendingPaymentRequestParams.f19305e);
        }
        if (dVar.o(serialDescriptor, 5) || !p.e(pendingPaymentRequestParams.f19306f, x.f())) {
            z12 = true;
        }
        if (z12) {
            dVar.v(serialDescriptor, 5, new z(a1Var, a1Var), pendingPaymentRequestParams.f19306f);
        }
    }

    public final Map<String, String> a() {
        return this.f19306f;
    }

    public final String b() {
        return this.f19303c;
    }

    public final Map<String, String> c() {
        return this.f19304d;
    }

    public final String d() {
        return this.f19302b;
    }

    public final String e() {
        return this.f19301a;
    }

    public final Map<String, String> f() {
        return this.f19305e;
    }
}

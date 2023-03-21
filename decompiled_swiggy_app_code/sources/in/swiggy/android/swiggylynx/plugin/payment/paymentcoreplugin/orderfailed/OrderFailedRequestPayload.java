package in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.orderfailed;

import fq0.d;
import gq0.a1;
import gq0.x0;
import hq0.o;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import lp.b;

/* compiled from: OrderFailedRequestPayload.kt */
public final class OrderFailedRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private JsonObject f19292a;

    /* renamed from: b  reason: collision with root package name */
    private String f19293b;

    /* renamed from: c  reason: collision with root package name */
    private String f19294c;

    /* renamed from: d  reason: collision with root package name */
    private String f19295d;

    /* renamed from: e  reason: collision with root package name */
    private String f19296e;

    /* compiled from: OrderFailedRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<OrderFailedRequestPayload> serializer() {
            return OrderFailedRequestPayload$$serializer.INSTANCE;
        }
    }

    public OrderFailedRequestPayload() {
        this((JsonObject) null, (String) null, (String) null, (String) null, (String) null, 31, (i) null);
    }

    public /* synthetic */ OrderFailedRequestPayload(int i11, JsonObject jsonObject, String str, String str2, String str3, String str4, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) == 0) {
            this.f19292a = null;
        } else {
            this.f19292a = jsonObject;
        }
        if ((i11 & 2) == 0) {
            this.f19293b = null;
        } else {
            this.f19293b = str;
        }
        if ((i11 & 4) == 0) {
            this.f19294c = null;
        } else {
            this.f19294c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f19295d = null;
        } else {
            this.f19295d = str3;
        }
        if ((i11 & 16) == 0) {
            this.f19296e = null;
        } else {
            this.f19296e = str4;
        }
    }

    public static final void f(OrderFailedRequestPayload orderFailedRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(orderFailedRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || orderFailedRequestPayload.f19292a != null) {
            dVar.E(serialDescriptor, 0, o.f23170b, orderFailedRequestPayload.f19292a);
        }
        if (dVar.o(serialDescriptor, 1) || orderFailedRequestPayload.f19293b != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, orderFailedRequestPayload.f19293b);
        }
        if (dVar.o(serialDescriptor, 2) || orderFailedRequestPayload.f19294c != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, orderFailedRequestPayload.f19294c);
        }
        if (dVar.o(serialDescriptor, 3) || orderFailedRequestPayload.f19295d != null) {
            dVar.E(serialDescriptor, 3, a1.f23069b, orderFailedRequestPayload.f19295d);
        }
        if (dVar.o(serialDescriptor, 4) || orderFailedRequestPayload.f19296e != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 4, a1.f23069b, orderFailedRequestPayload.f19296e);
        }
    }

    public final String b() {
        return this.f19295d;
    }

    public final String c() {
        return this.f19293b;
    }

    public final JsonObject d() {
        return this.f19292a;
    }

    public final String e() {
        return this.f19296e;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrderFailedRequestPayload(kotlinx.serialization.json.JsonObject r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.i r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.orderfailed.OrderFailedRequestPayload.<init>(kotlinx.serialization.json.JsonObject, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    public OrderFailedRequestPayload(JsonObject jsonObject, String str, String str2, String str3, String str4) {
        this.f19292a = jsonObject;
        this.f19293b = str;
        this.f19294c = str2;
        this.f19295d = str3;
        this.f19296e = str4;
    }
}

package in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request;

import com.google.gson.annotations.SerializedName;
import com.truecaller.android.sdk.TruecallerSdkScope;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.f0;
import gq0.h;
import gq0.w;
import gq0.x0;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartItem;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartItem$$serializer;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* compiled from: CartUpdateParams.kt */
public final class CartUpdateParams {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private String f19052a;

    /* renamed from: b  reason: collision with root package name */
    private String f19053b;

    /* renamed from: c  reason: collision with root package name */
    private String f19054c;

    /* renamed from: d  reason: collision with root package name */
    private String f19055d;

    /* renamed from: e  reason: collision with root package name */
    private int f19056e;

    /* renamed from: f  reason: collision with root package name */
    private Long f19057f;
    @SerializedName("originalCartId")

    /* renamed from: g  reason: collision with root package name */
    private Long f19058g;

    /* renamed from: h  reason: collision with root package name */
    private List<CartItem> f19059h;
    @SerializedName("batch_opt_in")

    /* renamed from: i  reason: collision with root package name */
    private Boolean f19060i;
    private String j;
    private String k;

    /* renamed from: l  reason: collision with root package name */
    private JsonElement f19061l;

    /* renamed from: m  reason: collision with root package name */
    private String f19062m;
    private List<? extends JsonElement> n;

    /* renamed from: o  reason: collision with root package name */
    private List<? extends JsonElement> f19063o;

    /* renamed from: p  reason: collision with root package name */
    private Boolean f19064p;
    private String q;

    /* renamed from: r  reason: collision with root package name */
    private Integer f19065r;

    /* renamed from: s  reason: collision with root package name */
    private JsonElement f19066s;
    private String t;
    @SerializedName("address_sort")

    /* renamed from: u  reason: collision with root package name */
    private JsonElement f19067u;
    private List<String> v;

    /* renamed from: w  reason: collision with root package name */
    private String f19068w;

    /* renamed from: x  reason: collision with root package name */
    private Boolean f19069x;

    /* compiled from: CartUpdateParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<CartUpdateParams> serializer() {
            return CartUpdateParams$$serializer.INSTANCE;
        }
    }

    public CartUpdateParams() {
        this((String) null, (String) null, (String) null, (String) null, 0, (Long) null, (Long) null, (List) null, (Boolean) null, (String) null, (String) null, (JsonElement) null, (String) null, (List) null, (List) null, (Boolean) null, (String) null, (Integer) null, (JsonElement) null, (String) null, (JsonElement) null, (List) null, (String) null, (Boolean) null, 16777215, (i) null);
    }

    public /* synthetic */ CartUpdateParams(int i11, String str, String str2, String str3, String str4, int i12, Long l11, Long l12, List list, Boolean bool, String str5, String str6, JsonElement jsonElement, String str7, List list2, List list3, Boolean bool2, String str8, Integer num, JsonElement jsonElement2, String str9, JsonElement jsonElement3, List list4, String str10, Boolean bool3, x0 x0Var) {
        int i13 = i11;
        if ((i13 & 1) == 0) {
            this.f19052a = "";
        } else {
            this.f19052a = str;
        }
        if ((i13 & 2) == 0) {
            this.f19053b = "";
        } else {
            this.f19053b = str2;
        }
        if ((i13 & 4) == 0) {
            this.f19054c = "";
        } else {
            this.f19054c = str3;
        }
        if ((i13 & 8) == 0) {
            this.f19055d = "";
        } else {
            this.f19055d = str4;
        }
        if ((i13 & 16) == 0) {
            this.f19056e = 0;
        } else {
            this.f19056e = i12;
        }
        this.f19057f = (i13 & 32) == 0 ? 0L : l11;
        this.f19058g = (i13 & 64) == 0 ? 0L : l12;
        if ((i13 & 128) == 0) {
            this.f19059h = null;
        } else {
            this.f19059h = list;
        }
        this.f19060i = (i13 & 256) == 0 ? Boolean.FALSE : bool;
        if ((i13 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) == 0) {
            this.j = "";
        } else {
            this.j = str5;
        }
        if ((i13 & 1024) == 0) {
            this.k = "";
        } else {
            this.k = str6;
        }
        if ((i13 & 2048) == 0) {
            this.f19061l = null;
        } else {
            this.f19061l = jsonElement;
        }
        if ((i13 & 4096) == 0) {
            this.f19062m = "";
        } else {
            this.f19062m = str7;
        }
        if ((i13 & 8192) == 0) {
            this.n = null;
        } else {
            this.n = list2;
        }
        if ((i13 & 16384) == 0) {
            this.f19063o = null;
        } else {
            this.f19063o = list3;
        }
        this.f19064p = (32768 & i13) == 0 ? Boolean.FALSE : bool2;
        if ((65536 & i13) == 0) {
            this.q = "";
        } else {
            this.q = str8;
        }
        this.f19065r = (131072 & i13) == 0 ? 0 : num;
        if ((262144 & i13) == 0) {
            this.f19066s = null;
        } else {
            this.f19066s = jsonElement2;
        }
        if ((524288 & i13) == 0) {
            this.t = "";
        } else {
            this.t = str9;
        }
        if ((1048576 & i13) == 0) {
            this.f19067u = null;
        } else {
            this.f19067u = jsonElement3;
        }
        if ((2097152 & i13) == 0) {
            this.v = null;
        } else {
            this.v = list4;
        }
        if ((4194304 & i13) == 0) {
            this.f19068w = "";
        } else {
            this.f19068w = str10;
        }
        this.f19069x = (i13 & 8388608) == 0 ? Boolean.FALSE : bool3;
    }

    public static final void w(CartUpdateParams cartUpdateParams, d dVar, SerialDescriptor serialDescriptor) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        Integer num;
        Long l11;
        Long l12;
        p.j(cartUpdateParams, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z27 = false;
        if (!dVar.o(serialDescriptor, 0) && p.e(cartUpdateParams.f19052a, "")) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 0, a1.f23069b, cartUpdateParams.f19052a);
        }
        if (!dVar.o(serialDescriptor, 1) && p.e(cartUpdateParams.f19053b, "")) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            dVar.E(serialDescriptor, 1, a1.f23069b, cartUpdateParams.f19053b);
        }
        if (!dVar.o(serialDescriptor, 2) && p.e(cartUpdateParams.f19054c, "")) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            dVar.E(serialDescriptor, 2, a1.f23069b, cartUpdateParams.f19054c);
        }
        if (!dVar.o(serialDescriptor, 3) && p.e(cartUpdateParams.f19055d, "")) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z14) {
            dVar.E(serialDescriptor, 3, a1.f23069b, cartUpdateParams.f19055d);
        }
        if (dVar.o(serialDescriptor, 4) || cartUpdateParams.f19056e != 0) {
            dVar.l(serialDescriptor, 4, cartUpdateParams.f19056e);
        }
        if (!dVar.o(serialDescriptor, 5) && (l12 = cartUpdateParams.f19057f) != null && l12.longValue() == 0) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (z15) {
            dVar.E(serialDescriptor, 5, f0.f23081b, cartUpdateParams.f19057f);
        }
        if (!dVar.o(serialDescriptor, 6) && (l11 = cartUpdateParams.f19058g) != null && l11.longValue() == 0) {
            z16 = false;
        } else {
            z16 = true;
        }
        if (z16) {
            dVar.E(serialDescriptor, 6, f0.f23081b, cartUpdateParams.f19058g);
        }
        if (dVar.o(serialDescriptor, 7) || cartUpdateParams.f19059h != null) {
            dVar.E(serialDescriptor, 7, new f(CartItem$$serializer.INSTANCE), cartUpdateParams.f19059h);
        }
        if (!dVar.o(serialDescriptor, 8) && p.e(cartUpdateParams.f19060i, Boolean.FALSE)) {
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            dVar.E(serialDescriptor, 8, h.f23089b, cartUpdateParams.f19060i);
        }
        if (!dVar.o(serialDescriptor, 9) && p.e(cartUpdateParams.j, "")) {
            z18 = false;
        } else {
            z18 = true;
        }
        if (z18) {
            dVar.E(serialDescriptor, 9, a1.f23069b, cartUpdateParams.j);
        }
        if (!dVar.o(serialDescriptor, 10) && p.e(cartUpdateParams.k, "")) {
            z19 = false;
        } else {
            z19 = true;
        }
        if (z19) {
            dVar.E(serialDescriptor, 10, a1.f23069b, cartUpdateParams.k);
        }
        if (dVar.o(serialDescriptor, 11) || cartUpdateParams.f19061l != null) {
            dVar.E(serialDescriptor, 11, JsonElementSerializer.f26449b, cartUpdateParams.f19061l);
        }
        if (!dVar.o(serialDescriptor, 12) && p.e(cartUpdateParams.f19062m, "")) {
            z21 = false;
        } else {
            z21 = true;
        }
        if (z21) {
            dVar.E(serialDescriptor, 12, a1.f23069b, cartUpdateParams.f19062m);
        }
        if (dVar.o(serialDescriptor, 13) || cartUpdateParams.n != null) {
            dVar.E(serialDescriptor, 13, new f(JsonElementSerializer.f26449b), cartUpdateParams.n);
        }
        if (dVar.o(serialDescriptor, 14) || cartUpdateParams.f19063o != null) {
            dVar.E(serialDescriptor, 14, new f(JsonElementSerializer.f26449b), cartUpdateParams.f19063o);
        }
        if (!dVar.o(serialDescriptor, 15) && p.e(cartUpdateParams.f19064p, Boolean.FALSE)) {
            z22 = false;
        } else {
            z22 = true;
        }
        if (z22) {
            dVar.E(serialDescriptor, 15, h.f23089b, cartUpdateParams.f19064p);
        }
        if (!dVar.o(serialDescriptor, 16) && p.e(cartUpdateParams.q, "")) {
            z23 = false;
        } else {
            z23 = true;
        }
        if (z23) {
            dVar.E(serialDescriptor, 16, a1.f23069b, cartUpdateParams.q);
        }
        if (!dVar.o(serialDescriptor, 17) && (num = cartUpdateParams.f19065r) != null && num.intValue() == 0) {
            z24 = false;
        } else {
            z24 = true;
        }
        if (z24) {
            dVar.E(serialDescriptor, 17, w.f23130b, cartUpdateParams.f19065r);
        }
        if (dVar.o(serialDescriptor, 18) || cartUpdateParams.f19066s != null) {
            dVar.E(serialDescriptor, 18, JsonElementSerializer.f26449b, cartUpdateParams.f19066s);
        }
        if (!dVar.o(serialDescriptor, 19) && p.e(cartUpdateParams.t, "")) {
            z25 = false;
        } else {
            z25 = true;
        }
        if (z25) {
            dVar.E(serialDescriptor, 19, a1.f23069b, cartUpdateParams.t);
        }
        if (dVar.o(serialDescriptor, 20) || cartUpdateParams.f19067u != null) {
            dVar.E(serialDescriptor, 20, JsonElementSerializer.f26449b, cartUpdateParams.f19067u);
        }
        if (dVar.o(serialDescriptor, 21) || cartUpdateParams.v != null) {
            dVar.E(serialDescriptor, 21, new f(a1.f23069b), cartUpdateParams.v);
        }
        if (!dVar.o(serialDescriptor, 22) && p.e(cartUpdateParams.f19068w, "")) {
            z26 = false;
        } else {
            z26 = true;
        }
        if (z26) {
            dVar.E(serialDescriptor, 22, a1.f23069b, cartUpdateParams.f19068w);
        }
        if (dVar.o(serialDescriptor, 23) || !p.e(cartUpdateParams.f19069x, Boolean.FALSE)) {
            z27 = true;
        }
        if (z27) {
            dVar.E(serialDescriptor, 23, h.f23089b, cartUpdateParams.f19069x);
        }
    }

    public final String a() {
        return this.f19055d;
    }

    public final Boolean b() {
        return this.f19064p;
    }

    public final JsonElement c() {
        return this.f19067u;
    }

    public final Boolean d() {
        return this.f19060i;
    }

    public final Long e() {
        return this.f19057f;
    }

    public final String f() {
        return this.k;
    }

    public final JsonElement g() {
        return this.f19061l;
    }

    public final String h() {
        return this.t;
    }

    public final List<CartItem> i() {
        return this.f19059h;
    }

    public final String j() {
        return this.f19062m;
    }

    public final List<JsonElement> k() {
        return this.f19063o;
    }

    public final String l() {
        return this.j;
    }

    public final Long m() {
        return this.f19058g;
    }

    public final String n() {
        return this.f19054c;
    }

    public final String o() {
        return this.f19052a;
    }

    public final String p() {
        return this.f19053b;
    }

    public final JsonElement q() {
        return this.f19066s;
    }

    public final List<String> r() {
        return this.v;
    }

    public final Boolean s() {
        return this.f19069x;
    }

    public final String t() {
        return this.f19068w;
    }

    public final int u() {
        return this.f19056e;
    }

    public final Integer v() {
        return this.f19065r;
    }

    public CartUpdateParams(String str, String str2, String str3, String str4, int i11, Long l11, Long l12, List<CartItem> list, Boolean bool, String str5, String str6, JsonElement jsonElement, String str7, List<? extends JsonElement> list2, List<? extends JsonElement> list3, Boolean bool2, String str8, Integer num, JsonElement jsonElement2, String str9, JsonElement jsonElement3, List<String> list4, String str10, Boolean bool3) {
        this.f19052a = str;
        this.f19053b = str2;
        this.f19054c = str3;
        this.f19055d = str4;
        this.f19056e = i11;
        this.f19057f = l11;
        this.f19058g = l12;
        this.f19059h = list;
        this.f19060i = bool;
        this.j = str5;
        this.k = str6;
        this.f19061l = jsonElement;
        this.f19062m = str7;
        this.n = list2;
        this.f19063o = list3;
        this.f19064p = bool2;
        this.q = str8;
        this.f19065r = num;
        this.f19066s = jsonElement2;
        this.t = str9;
        this.f19067u = jsonElement3;
        this.v = list4;
        this.f19068w = str10;
        this.f19069x = bool3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CartUpdateParams(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, java.lang.Long r31, java.lang.Long r32, java.util.List r33, java.lang.Boolean r34, java.lang.String r35, java.lang.String r36, kotlinx.serialization.json.JsonElement r37, java.lang.String r38, java.util.List r39, java.util.List r40, java.lang.Boolean r41, java.lang.String r42, java.lang.Integer r43, kotlinx.serialization.json.JsonElement r44, java.lang.String r45, kotlinx.serialization.json.JsonElement r46, java.util.List r47, java.lang.String r48, java.lang.Boolean r49, int r50, kotlin.jvm.internal.i r51) {
        /*
            r25 = this;
            r0 = r50
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r26
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r27
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r28
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = r2
            goto L_0x0024
        L_0x0022:
            r5 = r29
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = 0
            goto L_0x002c
        L_0x002a:
            r6 = r30
        L_0x002c:
            r8 = r0 & 32
            r9 = 0
            if (r8 == 0) goto L_0x0037
            java.lang.Long r8 = java.lang.Long.valueOf(r9)
            goto L_0x0039
        L_0x0037:
            r8 = r31
        L_0x0039:
            r11 = r0 & 64
            if (r11 == 0) goto L_0x0042
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            goto L_0x0044
        L_0x0042:
            r9 = r32
        L_0x0044:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x004a
            r10 = 0
            goto L_0x004c
        L_0x004a:
            r10 = r33
        L_0x004c:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x0053
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            goto L_0x0055
        L_0x0053:
            r12 = r34
        L_0x0055:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x005b
            r13 = r2
            goto L_0x005d
        L_0x005b:
            r13 = r35
        L_0x005d:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x0063
            r14 = r2
            goto L_0x0065
        L_0x0063:
            r14 = r36
        L_0x0065:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x006b
            r15 = 0
            goto L_0x006d
        L_0x006b:
            r15 = r37
        L_0x006d:
            r11 = r0 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x0073
            r11 = r2
            goto L_0x0075
        L_0x0073:
            r11 = r38
        L_0x0075:
            r7 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x007b
            r7 = 0
            goto L_0x007d
        L_0x007b:
            r7 = r39
        L_0x007d:
            r51 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0085
            r2 = 0
            goto L_0x0087
        L_0x0085:
            r2 = r40
        L_0x0087:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0091
            java.lang.Boolean r16 = java.lang.Boolean.FALSE
            goto L_0x0093
        L_0x0091:
            r16 = r41
        L_0x0093:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x009c
            r17 = r51
            goto L_0x009e
        L_0x009c:
            r17 = r42
        L_0x009e:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00ab
            r18 = 0
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)
            goto L_0x00ad
        L_0x00ab:
            r18 = r43
        L_0x00ad:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00b6
            r19 = 0
            goto L_0x00b8
        L_0x00b6:
            r19 = r44
        L_0x00b8:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00c1
            r20 = r51
            goto L_0x00c3
        L_0x00c1:
            r20 = r45
        L_0x00c3:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00cc
            r21 = 0
            goto L_0x00ce
        L_0x00cc:
            r21 = r46
        L_0x00ce:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00d7
            r22 = 0
            goto L_0x00d9
        L_0x00d7:
            r22 = r47
        L_0x00d9:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00e2
            r23 = r51
            goto L_0x00e4
        L_0x00e2:
            r23 = r48
        L_0x00e4:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r24
            if (r0 == 0) goto L_0x00ed
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x00ef
        L_0x00ed:
            r0 = r49
        L_0x00ef:
            r26 = r25
            r27 = r1
            r28 = r3
            r29 = r4
            r30 = r5
            r31 = r6
            r32 = r8
            r33 = r9
            r34 = r10
            r35 = r12
            r36 = r13
            r37 = r14
            r38 = r15
            r39 = r11
            r40 = r7
            r41 = r2
            r42 = r16
            r43 = r17
            r44 = r18
            r45 = r19
            r46 = r20
            r47 = r21
            r48 = r22
            r49 = r23
            r50 = r0
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CartUpdateParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Long, java.lang.Long, java.util.List, java.lang.Boolean, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonElement, java.lang.String, java.util.List, java.util.List, java.lang.Boolean, java.lang.String, java.lang.Integer, kotlinx.serialization.json.JsonElement, java.lang.String, kotlinx.serialization.json.JsonElement, java.util.List, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.i):void");
    }
}

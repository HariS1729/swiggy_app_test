package in.swiggy.android.swiggylynx.plugin.cart.getcart.response;

import com.truecaller.android.sdk.TruecallerSdkScope;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.f0;
import gq0.w;
import gq0.x0;
import in.swiggy.android.tejas.oldapi.models.menu.Addon;
import in.swiggy.android.tejas.oldapi.models.menu.Variation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* compiled from: CartItem.kt */
public final class CartItem {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private Integer f19031a;

    /* renamed from: b  reason: collision with root package name */
    private Long f19032b;

    /* renamed from: c  reason: collision with root package name */
    private List<GroupVariation2> f19033c;

    /* renamed from: d  reason: collision with root package name */
    private List<CartAddon> f19034d;

    /* renamed from: e  reason: collision with root package name */
    private String f19035e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f19036f;

    /* renamed from: g  reason: collision with root package name */
    private double f19037g;

    /* renamed from: h  reason: collision with root package name */
    private double f19038h;

    /* renamed from: i  reason: collision with root package name */
    private double f19039i;
    private double j;
    private List<? extends JsonElement> k;

    /* renamed from: l  reason: collision with root package name */
    private JsonElement f19040l;

    /* renamed from: m  reason: collision with root package name */
    private JsonElement f19041m;

    /* compiled from: CartItem.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<CartItem> serializer() {
            return CartItem$$serializer.INSTANCE;
        }
    }

    public CartItem() {
        this((Integer) null, (Long) null, (List) null, (List) null, (String) null, (Integer) null, 0.0d, 0.0d, 0.0d, 0.0d, (List) null, (JsonElement) null, (JsonElement) null, 8191, (i) null);
    }

    public /* synthetic */ CartItem(int i11, Integer num, Long l11, List list, List list2, String str, Integer num2, double d11, double d12, double d13, double d14, List list3, JsonElement jsonElement, JsonElement jsonElement2, x0 x0Var) {
        int i12 = i11;
        if ((i12 & 1) == 0) {
            this.f19031a = null;
        } else {
            this.f19031a = num;
        }
        this.f19032b = (i12 & 2) == 0 ? 0L : l11;
        if ((i12 & 4) == 0) {
            this.f19033c = null;
        } else {
            this.f19033c = list;
        }
        if ((i12 & 8) == 0) {
            this.f19034d = null;
        } else {
            this.f19034d = list2;
        }
        if ((i12 & 16) == 0) {
            this.f19035e = null;
        } else {
            this.f19035e = str;
        }
        this.f19036f = (i12 & 32) == 0 ? 0 : num2;
        double d15 = 0.0d;
        if ((i12 & 64) == 0) {
            this.f19037g = 0.0d;
        } else {
            this.f19037g = d11;
        }
        if ((i12 & 128) == 0) {
            this.f19038h = 0.0d;
        } else {
            this.f19038h = d12;
        }
        if ((i12 & 256) == 0) {
            this.f19039i = 0.0d;
        } else {
            this.f19039i = d13;
        }
        this.j = (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? d14 : d15;
        if ((i12 & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list3;
        }
        if ((i12 & 2048) == 0) {
            this.f19040l = null;
        } else {
            this.f19040l = jsonElement;
        }
        if ((i12 & 4096) == 0) {
            this.f19041m = null;
        } else {
            this.f19041m = jsonElement2;
        }
    }

    public static final void m(CartItem cartItem, d dVar, SerialDescriptor serialDescriptor) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Integer num;
        Long l11;
        p.j(cartItem, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z17 = false;
        if (dVar.o(serialDescriptor, 0) || cartItem.f19031a != null) {
            dVar.E(serialDescriptor, 0, w.f23130b, cartItem.f19031a);
        }
        if (!dVar.o(serialDescriptor, 1) && (l11 = cartItem.f19032b) != null && l11.longValue() == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 1, f0.f23081b, cartItem.f19032b);
        }
        if (dVar.o(serialDescriptor, 2) || cartItem.f19033c != null) {
            dVar.E(serialDescriptor, 2, new f(GroupVariation2$$serializer.INSTANCE), cartItem.f19033c);
        }
        if (dVar.o(serialDescriptor, 3) || cartItem.f19034d != null) {
            dVar.E(serialDescriptor, 3, new f(CartAddon$$serializer.INSTANCE), cartItem.f19034d);
        }
        if (dVar.o(serialDescriptor, 4) || cartItem.f19035e != null) {
            dVar.E(serialDescriptor, 4, a1.f23069b, cartItem.f19035e);
        }
        if (!dVar.o(serialDescriptor, 5) && (num = cartItem.f19036f) != null && num.intValue() == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            dVar.E(serialDescriptor, 5, w.f23130b, cartItem.f19036f);
        }
        if (!dVar.o(serialDescriptor, 6) && p.e(Double.valueOf(cartItem.f19037g), Double.valueOf(0.0d))) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            dVar.C(serialDescriptor, 6, cartItem.f19037g);
        }
        if (!dVar.o(serialDescriptor, 7) && p.e(Double.valueOf(cartItem.f19038h), Double.valueOf(0.0d))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z14) {
            dVar.C(serialDescriptor, 7, cartItem.f19038h);
        }
        if (!dVar.o(serialDescriptor, 8) && p.e(Double.valueOf(cartItem.f19039i), Double.valueOf(0.0d))) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (z15) {
            dVar.C(serialDescriptor, 8, cartItem.f19039i);
        }
        if (!dVar.o(serialDescriptor, 9) && p.e(Double.valueOf(cartItem.j), Double.valueOf(0.0d))) {
            z16 = false;
        } else {
            z16 = true;
        }
        if (z16) {
            dVar.C(serialDescriptor, 9, cartItem.j);
        }
        if (dVar.o(serialDescriptor, 10) || cartItem.k != null) {
            dVar.E(serialDescriptor, 10, new f(JsonElementSerializer.f26449b), cartItem.k);
        }
        if (dVar.o(serialDescriptor, 11) || cartItem.f19040l != null) {
            dVar.E(serialDescriptor, 11, JsonElementSerializer.f26449b, cartItem.f19040l);
        }
        if (dVar.o(serialDescriptor, 12) || cartItem.f19041m != null) {
            z17 = true;
        }
        if (z17) {
            dVar.E(serialDescriptor, 12, JsonElementSerializer.f26449b, cartItem.f19041m);
        }
    }

    public final HashMap<String, List<Addon>> a() {
        HashMap<String, List<Addon>> hashMap = new HashMap<>();
        List<CartAddon> list = this.f19034d;
        if (list != null) {
            for (CartAddon next : list) {
                String b11 = next.b();
                if (hashMap.containsKey(b11)) {
                    List list2 = hashMap.get(b11);
                    Addon a11 = next.a();
                    if (list2 != null) {
                        list2.add(a11);
                    }
                    hashMap.put(b11, list2);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next.a());
                    hashMap.put(b11, arrayList);
                }
            }
        }
        return hashMap;
    }

    public final double b() {
        return this.f19037g;
    }

    public final double c() {
        return this.f19038h;
    }

    public final double d() {
        return this.f19039i;
    }

    public final double e() {
        return this.j;
    }

    public final List<JsonElement> f() {
        return this.k;
    }

    public final JsonElement g() {
        return this.f19040l;
    }

    public final JsonElement h() {
        return this.f19041m;
    }

    public final Long i() {
        return this.f19032b;
    }

    public final Integer j() {
        return this.f19031a;
    }

    public final String k() {
        return this.f19035e;
    }

    public final HashMap<String, Variation> l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<GroupVariation2> list = this.f19033c;
        if (list != null) {
            for (GroupVariation2 next : list) {
                Long a11 = next.a();
                if (!linkedHashMap.containsKey(String.valueOf(a11))) {
                    linkedHashMap.put(String.valueOf(a11), next.b());
                }
            }
        }
        return linkedHashMap;
    }

    public CartItem(Integer num, Long l11, List<GroupVariation2> list, List<CartAddon> list2, String str, Integer num2, double d11, double d12, double d13, double d14, List<? extends JsonElement> list3, JsonElement jsonElement, JsonElement jsonElement2) {
        this.f19031a = num;
        this.f19032b = l11;
        this.f19033c = list;
        this.f19034d = list2;
        this.f19035e = str;
        this.f19036f = num2;
        this.f19037g = d11;
        this.f19038h = d12;
        this.f19039i = d13;
        this.j = d14;
        this.k = list3;
        this.f19040l = jsonElement;
        this.f19041m = jsonElement2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CartItem(java.lang.Integer r18, java.lang.Long r19, java.util.List r20, java.util.List r21, java.lang.String r22, java.lang.Integer r23, double r24, double r26, double r28, double r30, java.util.List r32, kotlinx.serialization.json.JsonElement r33, kotlinx.serialization.json.JsonElement r34, int r35, kotlin.jvm.internal.i r36) {
        /*
            r17 = this;
            r0 = r35
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r18
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0015
            r3 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0017
        L_0x0015:
            r3 = r19
        L_0x0017:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001d
            r4 = 0
            goto L_0x001f
        L_0x001d:
            r4 = r20
        L_0x001f:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0025
            r5 = 0
            goto L_0x0027
        L_0x0025:
            r5 = r21
        L_0x0027:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002d
            r6 = 0
            goto L_0x002f
        L_0x002d:
            r6 = r22
        L_0x002f:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0039
            r7 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x003b
        L_0x0039:
            r7 = r23
        L_0x003b:
            r8 = r0 & 64
            r9 = 0
            if (r8 == 0) goto L_0x0043
            r11 = r9
            goto L_0x0045
        L_0x0043:
            r11 = r24
        L_0x0045:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x004b
            r13 = r9
            goto L_0x004d
        L_0x004b:
            r13 = r26
        L_0x004d:
            r8 = r0 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x0053
            r15 = r9
            goto L_0x0055
        L_0x0053:
            r15 = r28
        L_0x0055:
            r8 = r0 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            r9 = r30
        L_0x005c:
            r8 = r0 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x0062
            r8 = 0
            goto L_0x0064
        L_0x0062:
            r8 = r32
        L_0x0064:
            r2 = r0 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x006a
            r2 = 0
            goto L_0x006c
        L_0x006a:
            r2 = r33
        L_0x006c:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0072
            r0 = 0
            goto L_0x0074
        L_0x0072:
            r0 = r34
        L_0x0074:
            r18 = r17
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r11
            r27 = r13
            r29 = r15
            r31 = r9
            r33 = r8
            r34 = r2
            r35 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r27, r29, r31, r33, r34, r35)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartItem.<init>(java.lang.Integer, java.lang.Long, java.util.List, java.util.List, java.lang.String, java.lang.Integer, double, double, double, double, java.util.List, kotlinx.serialization.json.JsonElement, kotlinx.serialization.json.JsonElement, int, kotlin.jvm.internal.i):void");
    }
}

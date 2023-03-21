package y0;

import com.truecaller.android.sdk.TruecallerSdkScope;
import d2.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import u0.d0;
import u0.s;
import u0.u;

/* compiled from: ImageVector.kt */
public final class c {
    public static final b j = new b((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f17868a;

    /* renamed from: b  reason: collision with root package name */
    private final float f17869b;

    /* renamed from: c  reason: collision with root package name */
    private final float f17870c;

    /* renamed from: d  reason: collision with root package name */
    private final float f17871d;

    /* renamed from: e  reason: collision with root package name */
    private final float f17872e;

    /* renamed from: f  reason: collision with root package name */
    private final l f17873f;

    /* renamed from: g  reason: collision with root package name */
    private final long f17874g;

    /* renamed from: h  reason: collision with root package name */
    private final int f17875h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f17876i;

    /* compiled from: ImageVector.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    private c(String str, float f11, float f12, float f13, float f14, l lVar, long j11, int i11, boolean z11) {
        this.f17868a = str;
        this.f17869b = f11;
        this.f17870c = f12;
        this.f17871d = f13;
        this.f17872e = f14;
        this.f17873f = lVar;
        this.f17874g = j11;
        this.f17875h = i11;
        this.f17876i = z11;
    }

    public /* synthetic */ c(String str, float f11, float f12, float f13, float f14, l lVar, long j11, int i11, boolean z11, i iVar) {
        this(str, f11, f12, f13, f14, lVar, j11, i11, z11);
    }

    public final boolean a() {
        return this.f17876i;
    }

    public final float b() {
        return this.f17870c;
    }

    public final float c() {
        return this.f17869b;
    }

    public final String d() {
        return this.f17868a;
    }

    public final l e() {
        return this.f17873f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!p.e(this.f17868a, cVar.f17868a) || !h.p(this.f17869b, cVar.f17869b) || !h.p(this.f17870c, cVar.f17870c)) {
            return false;
        }
        if (!(this.f17871d == cVar.f17871d)) {
            return false;
        }
        return ((this.f17872e > cVar.f17872e ? 1 : (this.f17872e == cVar.f17872e ? 0 : -1)) == 0) && p.e(this.f17873f, cVar.f17873f) && d0.n(this.f17874g, cVar.f17874g) && s.G(this.f17875h, cVar.f17875h) && this.f17876i == cVar.f17876i;
    }

    public final int f() {
        return this.f17875h;
    }

    public final long g() {
        return this.f17874g;
    }

    public final float h() {
        return this.f17872e;
    }

    public int hashCode() {
        return (((((((((((((((this.f17868a.hashCode() * 31) + h.q(this.f17869b)) * 31) + h.q(this.f17870c)) * 31) + Float.floatToIntBits(this.f17871d)) * 31) + Float.floatToIntBits(this.f17872e)) * 31) + this.f17873f.hashCode()) * 31) + d0.t(this.f17874g)) * 31) + s.H(this.f17875h)) * 31) + a0.h.a(this.f17876i);
    }

    public final float i() {
        return this.f17871d;
    }

    /* compiled from: ImageVector.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f17877a;

        /* renamed from: b  reason: collision with root package name */
        private final float f17878b;

        /* renamed from: c  reason: collision with root package name */
        private final float f17879c;

        /* renamed from: d  reason: collision with root package name */
        private final float f17880d;

        /* renamed from: e  reason: collision with root package name */
        private final float f17881e;

        /* renamed from: f  reason: collision with root package name */
        private final long f17882f;

        /* renamed from: g  reason: collision with root package name */
        private final int f17883g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f17884h;

        /* renamed from: i  reason: collision with root package name */
        private final ArrayList<C0211a> f17885i;
        private C0211a j;
        private boolean k;

        private a(String str, float f11, float f12, float f13, float f14, long j11, int i11, boolean z11) {
            this.f17877a = str;
            this.f17878b = f11;
            this.f17879c = f12;
            this.f17880d = f13;
            this.f17881e = f14;
            this.f17882f = j11;
            this.f17883g = i11;
            this.f17884h = z11;
            ArrayList<C0211a> b11 = g.b((ArrayList) null, 1, (i) null);
            this.f17885i = b11;
            C0211a aVar = new C0211a((String) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (List) null, (List) null, 1023, (i) null);
            this.j = aVar;
            g.f(b11, aVar);
        }

        public /* synthetic */ a(String str, float f11, float f12, float f13, float f14, long j11, int i11, boolean z11, i iVar) {
            this(str, f11, f12, f13, f14, j11, i11, z11);
        }

        public static /* synthetic */ a b(a aVar, String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List list, int i11, Object obj) {
            int i12 = i11;
            String str2 = (i12 & 1) != 0 ? "" : str;
            float f18 = 0.0f;
            float f19 = (i12 & 2) != 0 ? 0.0f : f11;
            float f21 = (i12 & 4) != 0 ? 0.0f : f12;
            float f22 = (i12 & 8) != 0 ? 0.0f : f13;
            float f23 = 1.0f;
            float f24 = (i12 & 16) != 0 ? 1.0f : f14;
            if ((i12 & 32) == 0) {
                f23 = f15;
            }
            float f25 = (i12 & 64) != 0 ? 0.0f : f16;
            if ((i12 & 128) == 0) {
                f18 = f17;
            }
            return aVar.a(str2, f19, f21, f22, f24, f23, f25, f18, (i12 & 256) != 0 ? m.e() : list);
        }

        private final l d(C0211a aVar) {
            return new l(aVar.c(), aVar.f(), aVar.d(), aVar.e(), aVar.g(), aVar.h(), aVar.i(), aVar.j(), aVar.b(), aVar.a());
        }

        private final void g() {
            if (!(!this.k)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }

        private final C0211a h() {
            return (C0211a) g.d(this.f17885i);
        }

        public final a a(String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List<? extends d> list) {
            String str2 = str;
            p.j(str2, "name");
            List<? extends d> list2 = list;
            p.j(list2, "clipPathData");
            g();
            g.f(this.f17885i, new C0211a(str2, f11, f12, f13, f14, f15, f16, f17, list2, (List) null, TruecallerSdkScope.FOOTER_TYPE_MANUALLY, (i) null));
            return this;
        }

        public final a c(List<? extends d> list, int i11, String str, u uVar, float f11, u uVar2, float f12, float f13, int i12, int i13, float f14, float f15, float f16, float f17) {
            List<? extends d> list2 = list;
            p.j(list2, "pathData");
            String str2 = str;
            p.j(str2, "name");
            g();
            List<n> a11 = h().a();
            o oVar = r1;
            o oVar2 = new o(str2, list2, i11, uVar, f11, uVar2, f12, f13, i12, i13, f14, f15, f16, f17, (i) null);
            a11.add(oVar);
            return this;
        }

        public final c e() {
            g();
            while (g.c(this.f17885i) > 1) {
                f();
            }
            c cVar = new c(this.f17877a, this.f17878b, this.f17879c, this.f17880d, this.f17881e, d(this.j), this.f17882f, this.f17883g, this.f17884h, (i) null);
            this.k = true;
            return cVar;
        }

        public final a f() {
            g();
            h().a().add(d((C0211a) g.e(this.f17885i)));
            return this;
        }

        /* renamed from: y0.c$a$a  reason: collision with other inner class name */
        /* compiled from: ImageVector.kt */
        private static final class C0211a {

            /* renamed from: a  reason: collision with root package name */
            private String f17886a;

            /* renamed from: b  reason: collision with root package name */
            private float f17887b;

            /* renamed from: c  reason: collision with root package name */
            private float f17888c;

            /* renamed from: d  reason: collision with root package name */
            private float f17889d;

            /* renamed from: e  reason: collision with root package name */
            private float f17890e;

            /* renamed from: f  reason: collision with root package name */
            private float f17891f;

            /* renamed from: g  reason: collision with root package name */
            private float f17892g;

            /* renamed from: h  reason: collision with root package name */
            private float f17893h;

            /* renamed from: i  reason: collision with root package name */
            private List<? extends d> f17894i;
            private List<n> j;

            public C0211a() {
                this((String) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (List) null, (List) null, 1023, (i) null);
            }

            public C0211a(String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List<? extends d> list, List<n> list2) {
                p.j(str, "name");
                p.j(list, "clipPathData");
                p.j(list2, "children");
                this.f17886a = str;
                this.f17887b = f11;
                this.f17888c = f12;
                this.f17889d = f13;
                this.f17890e = f14;
                this.f17891f = f15;
                this.f17892g = f16;
                this.f17893h = f17;
                this.f17894i = list;
                this.j = list2;
            }

            public final List<n> a() {
                return this.j;
            }

            public final List<d> b() {
                return this.f17894i;
            }

            public final String c() {
                return this.f17886a;
            }

            public final float d() {
                return this.f17888c;
            }

            public final float e() {
                return this.f17889d;
            }

            public final float f() {
                return this.f17887b;
            }

            public final float g() {
                return this.f17890e;
            }

            public final float h() {
                return this.f17891f;
            }

            public final float i() {
                return this.f17892g;
            }

            public final float j() {
                return this.f17893h;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C0211a(java.lang.String r11, float r12, float r13, float r14, float r15, float r16, float r17, float r18, java.util.List r19, java.util.List r20, int r21, kotlin.jvm.internal.i r22) {
                /*
                    r10 = this;
                    r0 = r21
                    r1 = r0 & 1
                    if (r1 == 0) goto L_0x0009
                    java.lang.String r1 = ""
                    goto L_0x000a
                L_0x0009:
                    r1 = r11
                L_0x000a:
                    r2 = r0 & 2
                    r3 = 0
                    if (r2 == 0) goto L_0x0011
                    r2 = 0
                    goto L_0x0012
                L_0x0011:
                    r2 = r12
                L_0x0012:
                    r4 = r0 & 4
                    if (r4 == 0) goto L_0x0018
                    r4 = 0
                    goto L_0x0019
                L_0x0018:
                    r4 = r13
                L_0x0019:
                    r5 = r0 & 8
                    if (r5 == 0) goto L_0x001f
                    r5 = 0
                    goto L_0x0020
                L_0x001f:
                    r5 = r14
                L_0x0020:
                    r6 = r0 & 16
                    r7 = 1065353216(0x3f800000, float:1.0)
                    if (r6 == 0) goto L_0x0029
                    r6 = 1065353216(0x3f800000, float:1.0)
                    goto L_0x002a
                L_0x0029:
                    r6 = r15
                L_0x002a:
                    r8 = r0 & 32
                    if (r8 == 0) goto L_0x002f
                    goto L_0x0031
                L_0x002f:
                    r7 = r16
                L_0x0031:
                    r8 = r0 & 64
                    if (r8 == 0) goto L_0x0037
                    r8 = 0
                    goto L_0x0039
                L_0x0037:
                    r8 = r17
                L_0x0039:
                    r9 = r0 & 128(0x80, float:1.794E-43)
                    if (r9 == 0) goto L_0x003e
                    goto L_0x0040
                L_0x003e:
                    r3 = r18
                L_0x0040:
                    r9 = r0 & 256(0x100, float:3.59E-43)
                    if (r9 == 0) goto L_0x0049
                    java.util.List r9 = y0.m.e()
                    goto L_0x004b
                L_0x0049:
                    r9 = r19
                L_0x004b:
                    r0 = r0 & 512(0x200, float:7.175E-43)
                    if (r0 == 0) goto L_0x0055
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    goto L_0x0057
                L_0x0055:
                    r0 = r20
                L_0x0057:
                    r11 = r10
                    r12 = r1
                    r13 = r2
                    r14 = r4
                    r15 = r5
                    r16 = r6
                    r17 = r7
                    r18 = r8
                    r19 = r3
                    r20 = r9
                    r21 = r0
                    r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: y0.c.a.C0211a.<init>(java.lang.String, float, float, float, float, float, float, float, java.util.List, java.util.List, int, kotlin.jvm.internal.i):void");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(java.lang.String r14, float r15, float r16, float r17, float r18, long r19, int r21, boolean r22, int r23, kotlin.jvm.internal.i r24) {
            /*
                r13 = this;
                r0 = r23
                r1 = r0 & 1
                if (r1 == 0) goto L_0x000a
                java.lang.String r1 = ""
                r3 = r1
                goto L_0x000b
            L_0x000a:
                r3 = r14
            L_0x000b:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0017
                u0.d0$a r1 = u0.d0.f16756b
                long r1 = r1.f()
                r8 = r1
                goto L_0x0019
            L_0x0017:
                r8 = r19
            L_0x0019:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0025
                u0.s$a r1 = u0.s.f16866b
                int r1 = r1.z()
                r10 = r1
                goto L_0x0027
            L_0x0025:
                r10 = r21
            L_0x0027:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x002e
                r0 = 0
                r11 = 0
                goto L_0x0030
            L_0x002e:
                r11 = r22
            L_0x0030:
                r12 = 0
                r2 = r13
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r18
                r2.<init>(r3, r4, r5, r6, r7, r8, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.c.a.<init>(java.lang.String, float, float, float, float, long, int, boolean, int, kotlin.jvm.internal.i):void");
        }
    }
}

package y0;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ImageVector.kt */
public final class l extends n implements Iterable<n>, mp0.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f17966a;

    /* renamed from: b  reason: collision with root package name */
    private final float f17967b;

    /* renamed from: c  reason: collision with root package name */
    private final float f17968c;

    /* renamed from: d  reason: collision with root package name */
    private final float f17969d;

    /* renamed from: e  reason: collision with root package name */
    private final float f17970e;

    /* renamed from: f  reason: collision with root package name */
    private final float f17971f;

    /* renamed from: g  reason: collision with root package name */
    private final float f17972g;

    /* renamed from: h  reason: collision with root package name */
    private final float f17973h;

    /* renamed from: i  reason: collision with root package name */
    private final List<d> f17974i;
    /* access modifiers changed from: private */
    public final List<n> j;

    /* compiled from: ImageVector.kt */
    public static final class a implements Iterator<n>, mp0.a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<n> f17975a;

        a(l lVar) {
            this.f17975a = lVar.j.iterator();
        }

        /* renamed from: b */
        public n next() {
            return this.f17975a.next();
        }

        public boolean hasNext() {
            return this.f17975a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l() {
        this((String) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (List) null, (List) null, 1023, (i) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ l(java.lang.String r11, float r12, float r13, float r14, float r15, float r16, float r17, float r18, java.util.List r19, java.util.List r20, int r21, kotlin.jvm.internal.i r22) {
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
            if (r0 == 0) goto L_0x0054
            java.util.List r0 = kotlin.collections.k.j()
            goto L_0x0056
        L_0x0054:
            r0 = r20
        L_0x0056:
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
        throw new UnsupportedOperationException("Method not decompiled: y0.l.<init>(java.lang.String, float, float, float, float, float, float, float, java.util.List, java.util.List, int, kotlin.jvm.internal.i):void");
    }

    public final List<d> c() {
        return this.f17974i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!p.e(this.f17966a, lVar.f17966a)) {
            return false;
        }
        if (!(this.f17967b == lVar.f17967b)) {
            return false;
        }
        if (!(this.f17968c == lVar.f17968c)) {
            return false;
        }
        if (!(this.f17969d == lVar.f17969d)) {
            return false;
        }
        if (!(this.f17970e == lVar.f17970e)) {
            return false;
        }
        if (!(this.f17971f == lVar.f17971f)) {
            return false;
        }
        if (!(this.f17972g == lVar.f17972g)) {
            return false;
        }
        return ((this.f17973h > lVar.f17973h ? 1 : (this.f17973h == lVar.f17973h ? 0 : -1)) == 0) && p.e(this.f17974i, lVar.f17974i) && p.e(this.j, lVar.j);
    }

    public final String f() {
        return this.f17966a;
    }

    public final float g() {
        return this.f17968c;
    }

    public final float h() {
        return this.f17969d;
    }

    public int hashCode() {
        return (((((((((((((((((this.f17966a.hashCode() * 31) + Float.floatToIntBits(this.f17967b)) * 31) + Float.floatToIntBits(this.f17968c)) * 31) + Float.floatToIntBits(this.f17969d)) * 31) + Float.floatToIntBits(this.f17970e)) * 31) + Float.floatToIntBits(this.f17971f)) * 31) + Float.floatToIntBits(this.f17972g)) * 31) + Float.floatToIntBits(this.f17973h)) * 31) + this.f17974i.hashCode()) * 31) + this.j.hashCode();
    }

    public final float i() {
        return this.f17967b;
    }

    public Iterator<n> iterator() {
        return new a(this);
    }

    public final float k() {
        return this.f17970e;
    }

    public final float l() {
        return this.f17971f;
    }

    public final float m() {
        return this.f17972g;
    }

    public final float n() {
        return this.f17973h;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List<? extends d> list, List<? extends n> list2) {
        super((i) null);
        p.j(str, "name");
        p.j(list, "clipPathData");
        p.j(list2, "children");
        this.f17966a = str;
        this.f17967b = f11;
        this.f17968c = f12;
        this.f17969d = f13;
        this.f17970e = f14;
        this.f17971f = f15;
        this.f17972g = f16;
        this.f17973h = f17;
        this.f17974i = list;
        this.j = list2;
    }
}

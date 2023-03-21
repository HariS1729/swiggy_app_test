package v1;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: GapBuffer.kt */
public final class t {

    /* renamed from: e  reason: collision with root package name */
    public static final a f17206e = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private String f17207a;

    /* renamed from: b  reason: collision with root package name */
    private j f17208b;

    /* renamed from: c  reason: collision with root package name */
    private int f17209c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f17210d = -1;

    /* compiled from: GapBuffer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public t(String str) {
        p.j(str, "text");
        this.f17207a = str;
    }

    public final char a(int i11) {
        j jVar = this.f17208b;
        if (jVar == null) {
            return this.f17207a.charAt(i11);
        }
        if (i11 < this.f17209c) {
            return this.f17207a.charAt(i11);
        }
        int e11 = jVar.e();
        int i12 = this.f17209c;
        if (i11 < e11 + i12) {
            return jVar.d(i11 - i12);
        }
        return this.f17207a.charAt(i11 - ((e11 - this.f17210d) + i12));
    }

    public final int b() {
        j jVar = this.f17208b;
        if (jVar == null) {
            return this.f17207a.length();
        }
        return (this.f17207a.length() - (this.f17210d - this.f17209c)) + jVar.e();
    }

    public final void c(int i11, int i12, String str) {
        p.j(str, "text");
        j jVar = this.f17208b;
        if (jVar == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i11, 64);
            int min2 = Math.min(this.f17207a.length() - i12, 64);
            int i13 = i11 - min;
            k.b(this.f17207a, cArr, 0, i13, i11);
            int i14 = max - min2;
            int i15 = i12 + min2;
            k.b(this.f17207a, cArr, i14, i12, i15);
            k.c(str, cArr, min, 0, 0, 12, (Object) null);
            this.f17208b = new j(cArr, min + str.length(), i14);
            this.f17209c = i13;
            this.f17210d = i15;
            return;
        }
        int i16 = this.f17209c;
        int i17 = i11 - i16;
        int i18 = i12 - i16;
        if (i17 < 0 || i18 > jVar.e()) {
            this.f17207a = toString();
            this.f17208b = null;
            this.f17209c = -1;
            this.f17210d = -1;
            c(i11, i12, str);
            return;
        }
        jVar.g(i17, i18, str);
    }

    public String toString() {
        j jVar = this.f17208b;
        if (jVar == null) {
            return this.f17207a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17207a, 0, this.f17209c);
        jVar.a(sb2);
        String str = this.f17207a;
        sb2.append(str, this.f17210d, str.length());
        String sb3 = sb2.toString();
        p.i(sb3, "sb.toString()");
        return sb3;
    }
}

package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* compiled from: BidiFormatter */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    static final d f9371d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f9372e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    private static final String f9373f = Character.toString(8207);

    /* renamed from: g  reason: collision with root package name */
    static final a f9374g;

    /* renamed from: h  reason: collision with root package name */
    static final a f9375h;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9376a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9377b;

    /* renamed from: c  reason: collision with root package name */
    private final d f9378c;

    /* renamed from: androidx.core.text.a$a  reason: collision with other inner class name */
    /* compiled from: BidiFormatter */
    public static final class C0043a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f9379a;

        /* renamed from: b  reason: collision with root package name */
        private int f9380b;

        /* renamed from: c  reason: collision with root package name */
        private d f9381c;

        public C0043a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z11) {
            return z11 ? a.f9375h : a.f9374g;
        }

        private void c(boolean z11) {
            this.f9379a = z11;
            this.f9381c = a.f9371d;
            this.f9380b = 2;
        }

        public a a() {
            if (this.f9380b == 2 && this.f9381c == a.f9371d) {
                return b(this.f9379a);
            }
            return new a(this.f9379a, this.f9380b, this.f9381c);
        }
    }

    /* compiled from: BidiFormatter */
    private static class b {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f9382f = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        private final CharSequence f9383a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f9384b;

        /* renamed from: c  reason: collision with root package name */
        private final int f9385c;

        /* renamed from: d  reason: collision with root package name */
        private int f9386d;

        /* renamed from: e  reason: collision with root package name */
        private char f9387e;

        static {
            for (int i11 = 0; i11 < 1792; i11++) {
                f9382f[i11] = Character.getDirectionality(i11);
            }
        }

        b(CharSequence charSequence, boolean z11) {
            this.f9383a = charSequence;
            this.f9384b = z11;
            this.f9385c = charSequence.length();
        }

        private static byte c(char c11) {
            return c11 < 1792 ? f9382f[c11] : Character.getDirectionality(c11);
        }

        private byte f() {
            char charAt;
            int i11 = this.f9386d;
            do {
                int i12 = this.f9386d;
                if (i12 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f9383a;
                int i13 = i12 - 1;
                this.f9386d = i13;
                charAt = charSequence.charAt(i13);
                this.f9387e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f9386d = i11;
            this.f9387e = ';';
            return 13;
        }

        private byte g() {
            char charAt;
            do {
                int i11 = this.f9386d;
                if (i11 >= this.f9385c) {
                    return 12;
                }
                CharSequence charSequence = this.f9383a;
                this.f9386d = i11 + 1;
                charAt = charSequence.charAt(i11);
                this.f9387e = charAt;
            } while (charAt != ';');
            return 12;
        }

        private byte h() {
            char charAt;
            int i11 = this.f9386d;
            while (true) {
                int i12 = this.f9386d;
                if (i12 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f9383a;
                int i13 = i12 - 1;
                this.f9386d = i13;
                char charAt2 = charSequence.charAt(i13);
                this.f9387e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i14 = this.f9386d;
                        if (i14 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f9383a;
                        int i15 = i14 - 1;
                        this.f9386d = i15;
                        charAt = charSequence2.charAt(i15);
                        this.f9387e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f9386d = i11;
            this.f9387e = '>';
            return 13;
        }

        private byte i() {
            char charAt;
            int i11 = this.f9386d;
            while (true) {
                int i12 = this.f9386d;
                if (i12 < this.f9385c) {
                    CharSequence charSequence = this.f9383a;
                    this.f9386d = i12 + 1;
                    char charAt2 = charSequence.charAt(i12);
                    this.f9387e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i13 = this.f9386d;
                            if (i13 >= this.f9385c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f9383a;
                            this.f9386d = i13 + 1;
                            charAt = charSequence2.charAt(i13);
                            this.f9387e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f9386d = i11;
                    this.f9387e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public byte a() {
            char charAt = this.f9383a.charAt(this.f9386d - 1);
            this.f9387e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f9383a, this.f9386d);
                this.f9386d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f9386d--;
            byte c11 = c(this.f9387e);
            if (!this.f9384b) {
                return c11;
            }
            char c12 = this.f9387e;
            if (c12 == '>') {
                return h();
            }
            return c12 == ';' ? f() : c11;
        }

        /* access modifiers changed from: package-private */
        public byte b() {
            char charAt = this.f9383a.charAt(this.f9386d);
            this.f9387e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f9383a, this.f9386d);
                this.f9386d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f9386d++;
            byte c11 = c(this.f9387e);
            if (!this.f9384b) {
                return c11;
            }
            char c12 = this.f9387e;
            if (c12 == '<') {
                return i();
            }
            return c12 == '&' ? g() : c11;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            this.f9386d = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (this.f9386d < this.f9385c && i11 == 0) {
                byte b11 = b();
                if (b11 != 0) {
                    if (b11 == 1 || b11 == 2) {
                        if (i13 == 0) {
                            return 1;
                        }
                    } else if (b11 != 9) {
                        switch (b11) {
                            case 14:
                            case 15:
                                i13++;
                                i12 = -1;
                                continue;
                            case 16:
                            case 17:
                                i13++;
                                i12 = 1;
                                continue;
                            case 18:
                                i13--;
                                i12 = 0;
                                continue;
                        }
                    }
                } else if (i13 == 0) {
                    return -1;
                }
                i11 = i13;
            }
            if (i11 == 0) {
                return 0;
            }
            if (i12 != 0) {
                return i12;
            }
            while (this.f9386d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i11 == i13) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i11 == i13) {
                            return 1;
                        }
                        break;
                    case 18:
                        i13++;
                        continue;
                }
                i13--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r1 = r1 - 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int e() {
            /*
                r7 = this;
                int r0 = r7.f9385c
                r7.f9386d = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f9386d
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0025:
                if (r2 != r1) goto L_0x002b
                return r5
            L_0x0028:
                if (r2 != r1) goto L_0x002b
                return r4
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0007
            L_0x002e:
                if (r1 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r1 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r2 != 0) goto L_0x0007
            L_0x0039:
                r2 = r1
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.a.b.e():int");
        }
    }

    static {
        d dVar = e.f9403c;
        f9371d = dVar;
        f9374g = new a(false, 2, dVar);
        f9375h = new a(true, 2, dVar);
    }

    a(boolean z11, int i11, d dVar) {
        this.f9376a = z11;
        this.f9377b = i11;
        this.f9378c = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0043a().a();
    }

    static boolean e(Locale locale) {
        return f.a(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean a11 = dVar.a(charSequence, 0, charSequence.length());
        if (!this.f9376a && (a11 || b(charSequence) == 1)) {
            return f9372e;
        }
        if (this.f9376a) {
            return (!a11 || b(charSequence) == -1) ? f9373f : "";
        }
        return "";
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean a11 = dVar.a(charSequence, 0, charSequence.length());
        if (!this.f9376a && (a11 || a(charSequence) == 1)) {
            return f9372e;
        }
        if (this.f9376a) {
            return (!a11 || a(charSequence) == -1) ? f9373f : "";
        }
        return "";
    }

    public boolean d() {
        return (this.f9377b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f9378c, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z11) {
        if (charSequence == null) {
            return null;
        }
        boolean a11 = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z11) {
            spannableStringBuilder.append(g(charSequence, a11 ? e.f9402b : e.f9401a));
        }
        if (a11 != this.f9376a) {
            spannableStringBuilder.append(a11 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z11) {
            spannableStringBuilder.append(f(charSequence, a11 ? e.f9402b : e.f9401a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f9378c, true);
    }

    public String k(String str, d dVar, boolean z11) {
        if (str == null) {
            return null;
        }
        return i(str, dVar, z11).toString();
    }
}

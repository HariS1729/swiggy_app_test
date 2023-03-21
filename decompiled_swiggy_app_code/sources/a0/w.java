package a0;

import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: UndoManager.kt */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final int f870a;

    /* renamed from: b  reason: collision with root package name */
    private a f871b;

    /* renamed from: c  reason: collision with root package name */
    private a f872c;

    /* renamed from: d  reason: collision with root package name */
    private int f873d;

    /* renamed from: e  reason: collision with root package name */
    private Long f874e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f875f;

    /* compiled from: UndoManager.kt */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private a f876a;

        /* renamed from: b  reason: collision with root package name */
        private TextFieldValue f877b;

        public a(a aVar, TextFieldValue textFieldValue) {
            p.j(textFieldValue, "value");
            this.f876a = aVar;
            this.f877b = textFieldValue;
        }

        public final a a() {
            return this.f876a;
        }

        public final TextFieldValue b() {
            return this.f877b;
        }

        public final void c(a aVar) {
            this.f876a = aVar;
        }

        public final void d(TextFieldValue textFieldValue) {
            p.j(textFieldValue, "<set-?>");
            this.f877b = textFieldValue;
        }
    }

    public w() {
        this(0, 1, (i) null);
    }

    public w(int i11) {
        this.f870a = i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e A[LOOP:0: B:6:0x000e->B:12:0x001e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023 A[EDGE_INSN: B:15:0x0023->B:13:0x0023 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void d() {
        /*
            r3 = this;
            a0.w$a r0 = r3.f871b
            r1 = 0
            if (r0 == 0) goto L_0x000a
            a0.w$a r2 = r0.a()
            goto L_0x000b
        L_0x000a:
            r2 = r1
        L_0x000b:
            if (r2 != 0) goto L_0x000e
            return
        L_0x000e:
            if (r0 == 0) goto L_0x001b
            a0.w$a r2 = r0.a()
            if (r2 == 0) goto L_0x001b
            a0.w$a r2 = r2.a()
            goto L_0x001c
        L_0x001b:
            r2 = r1
        L_0x001c:
            if (r2 == 0) goto L_0x0023
            a0.w$a r0 = r0.a()
            goto L_0x000e
        L_0x0023:
            if (r0 != 0) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            r0.c(r1)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.w.d():void");
    }

    public static /* synthetic */ void f(w wVar, TextFieldValue textFieldValue, long j, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j = y.a();
        }
        wVar.e(textFieldValue, j);
    }

    public final void a() {
        this.f875f = true;
    }

    public final void b(TextFieldValue textFieldValue) {
        TextFieldValue b11;
        p.j(textFieldValue, "value");
        this.f875f = false;
        a aVar = this.f871b;
        if (!p.e(textFieldValue, aVar != null ? aVar.b() : null)) {
            String h11 = textFieldValue.h();
            a aVar2 = this.f871b;
            if (p.e(h11, (aVar2 == null || (b11 = aVar2.b()) == null) ? null : b11.h())) {
                a aVar3 = this.f871b;
                if (aVar3 != null) {
                    aVar3.d(textFieldValue);
                    return;
                }
                return;
            }
            this.f871b = new a(this.f871b, textFieldValue);
            this.f872c = null;
            int length = this.f873d + textFieldValue.h().length();
            this.f873d = length;
            if (length > this.f870a) {
                d();
            }
        }
    }

    public final TextFieldValue c() {
        a aVar = this.f872c;
        if (aVar == null) {
            return null;
        }
        this.f872c = aVar.a();
        this.f871b = new a(this.f871b, aVar.b());
        this.f873d += aVar.b().h().length();
        return aVar.b();
    }

    public final void e(TextFieldValue textFieldValue, long j) {
        p.j(textFieldValue, "value");
        if (!this.f875f) {
            Long l11 = this.f874e;
            if (j <= (l11 != null ? l11.longValue() : 0) + ((long) x.a())) {
                return;
            }
        }
        this.f874e = Long.valueOf(j);
        b(textFieldValue);
    }

    public final TextFieldValue g() {
        a a11;
        a aVar = this.f871b;
        if (aVar == null || (a11 = aVar.a()) == null) {
            return null;
        }
        this.f871b = a11;
        this.f873d -= aVar.b().h().length();
        this.f872c = new a(this.f872c, aVar.b());
        return a11.b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i11, int i12, i iVar) {
        this((i12 & 1) != 0 ? 100000 : i11);
    }
}

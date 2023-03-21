package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.SaverKt;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import m0.c;
import p1.a0;
import p1.b;
import p1.b0;

/* compiled from: TextFieldValue.kt */
public final class TextFieldValue {

    /* renamed from: d  reason: collision with root package name */
    public static final a f7612d = new a((i) null);

    /* renamed from: e  reason: collision with root package name */
    private static final c<TextFieldValue, Object> f7613e = SaverKt.a(TextFieldValue$Companion$Saver$1.f7617a, TextFieldValue$Companion$Saver$2.f7618a);

    /* renamed from: a  reason: collision with root package name */
    private final b f7614a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7615b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f7616c;

    /* compiled from: TextFieldValue.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public /* synthetic */ TextFieldValue(String str, long j, a0 a0Var, i iVar) {
        this(str, j, a0Var);
    }

    private TextFieldValue(b bVar, long j, a0 a0Var) {
        this.f7614a = bVar;
        this.f7615b = b0.c(j, 0, h().length());
        this.f7616c = a0Var != null ? a0.b(b0.c(a0Var.r(), 0, h().length())) : null;
    }

    public /* synthetic */ TextFieldValue(b bVar, long j, a0 a0Var, i iVar) {
        this(bVar, j, a0Var);
    }

    public static /* synthetic */ TextFieldValue c(TextFieldValue textFieldValue, String str, long j, a0 a0Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j = textFieldValue.f7615b;
        }
        if ((i11 & 4) != 0) {
            a0Var = textFieldValue.f7616c;
        }
        return textFieldValue.a(str, j, a0Var);
    }

    public static /* synthetic */ TextFieldValue d(TextFieldValue textFieldValue, b bVar, long j, a0 a0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = textFieldValue.f7614a;
        }
        if ((i11 & 2) != 0) {
            j = textFieldValue.f7615b;
        }
        if ((i11 & 4) != 0) {
            a0Var = textFieldValue.f7616c;
        }
        return textFieldValue.b(bVar, j, a0Var);
    }

    public final TextFieldValue a(String str, long j, a0 a0Var) {
        p.j(str, "text");
        return new TextFieldValue(new b(str, (List) null, (List) null, 6, (i) null), j, a0Var, (i) null);
    }

    public final TextFieldValue b(b bVar, long j, a0 a0Var) {
        p.j(bVar, "annotatedString");
        return new TextFieldValue(bVar, j, a0Var, (i) null);
    }

    public final b e() {
        return this.f7614a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        if (!a0.g(this.f7615b, textFieldValue.f7615b) || !p.e(this.f7616c, textFieldValue.f7616c) || !p.e(this.f7614a, textFieldValue.f7614a)) {
            return false;
        }
        return true;
    }

    public final a0 f() {
        return this.f7616c;
    }

    public final long g() {
        return this.f7615b;
    }

    public final String h() {
        return this.f7614a.g();
    }

    public int hashCode() {
        int hashCode = ((this.f7614a.hashCode() * 31) + a0.o(this.f7615b)) * 31;
        a0 a0Var = this.f7616c;
        return hashCode + (a0Var != null ? a0.o(a0Var.r()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + this.f7614a + "', selection=" + a0.q(this.f7615b) + ", composition=" + this.f7616c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldValue(b bVar, long j, a0 a0Var, int i11, i iVar) {
        this(bVar, (i11 & 2) != 0 ? a0.f16041b.a() : j, (i11 & 4) != 0 ? null : a0Var, (i) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldValue(String str, long j, a0 a0Var, int i11, i iVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? a0.f16041b.a() : j, (i11 & 4) != 0 ? null : a0Var, (i) null);
    }

    private TextFieldValue(String str, long j, a0 a0Var) {
        this(new b(str, (List) null, (List) null, 6, (i) null), j, a0Var, (i) null);
    }
}

package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSetLiteSchema */
class g1 extends e1<f1, f1> {
    g1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public f1 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int h(f1 f1Var) {
        return f1Var.f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int i(f1 f1Var) {
        return f1Var.g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public f1 k(f1 f1Var, f1 f1Var2) {
        return f1Var2.equals(f1.e()) ? f1Var : f1.k(f1Var, f1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public f1 n() {
        return f1.l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void o(Object obj, f1 f1Var) {
        p(obj, f1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void p(Object obj, f1 f1Var) {
        ((GeneratedMessageLite) obj).unknownFields = f1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public f1 r(f1 f1Var) {
        f1Var.j();
        return f1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void s(f1 f1Var, Writer writer) throws IOException {
        f1Var.o(writer);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void t(f1 f1Var, Writer writer) throws IOException {
        f1Var.q(writer);
    }

    /* access modifiers changed from: package-private */
    public void j(Object obj) {
        g(obj).j();
    }

    /* access modifiers changed from: package-private */
    public boolean q(x0 x0Var) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void a(f1 f1Var, int i11, int i12) {
        f1Var.n(WireFormat.c(i11, 5), Integer.valueOf(i12));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void b(f1 f1Var, int i11, long j) {
        f1Var.n(WireFormat.c(i11, 1), Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void c(f1 f1Var, int i11, f1 f1Var2) {
        f1Var.n(WireFormat.c(i11, 3), f1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void d(f1 f1Var, int i11, ByteString byteString) {
        f1Var.n(WireFormat.c(i11, 2), byteString);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void e(f1 f1Var, int i11, long j) {
        f1Var.n(WireFormat.c(i11, 0), Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public f1 f(Object obj) {
        f1 A = g(obj);
        if (A != f1.e()) {
            return A;
        }
        f1 l11 = f1.l();
        p(obj, l11);
        return l11;
    }
}

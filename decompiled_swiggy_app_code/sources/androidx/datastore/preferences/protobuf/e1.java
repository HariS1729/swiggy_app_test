package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSchema */
abstract class e1<T, B> {
    e1() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(B b11, int i11, int i12);

    /* access modifiers changed from: package-private */
    public abstract void b(B b11, int i11, long j);

    /* access modifiers changed from: package-private */
    public abstract void c(B b11, int i11, T t);

    /* access modifiers changed from: package-private */
    public abstract void d(B b11, int i11, ByteString byteString);

    /* access modifiers changed from: package-private */
    public abstract void e(B b11, int i11, long j);

    /* access modifiers changed from: package-private */
    public abstract B f(Object obj);

    /* access modifiers changed from: package-private */
    public abstract T g(Object obj);

    /* access modifiers changed from: package-private */
    public abstract int h(T t);

    /* access modifiers changed from: package-private */
    public abstract int i(T t);

    /* access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* access modifiers changed from: package-private */
    public abstract T k(T t, T t11);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(B r3, androidx.datastore.preferences.protobuf.x0 r4) throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.getFieldNumber()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.e1.l(java.lang.Object, androidx.datastore.preferences.protobuf.x0):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean m(B b11, x0 x0Var) throws IOException {
        int tag = x0Var.getTag();
        int a11 = WireFormat.a(tag);
        int b12 = WireFormat.b(tag);
        if (b12 == 0) {
            e(b11, a11, x0Var.readInt64());
            return true;
        } else if (b12 == 1) {
            b(b11, a11, x0Var.readFixed64());
            return true;
        } else if (b12 == 2) {
            d(b11, a11, x0Var.readBytes());
            return true;
        } else if (b12 == 3) {
            Object n = n();
            int c11 = WireFormat.c(a11, 4);
            l(n, x0Var);
            if (c11 == x0Var.getTag()) {
                c(b11, a11, r(n));
                return true;
            }
            throw InvalidProtocolBufferException.a();
        } else if (b12 == 4) {
            return false;
        } else {
            if (b12 == 5) {
                a(b11, a11, x0Var.readFixed32());
                return true;
            }
            throw InvalidProtocolBufferException.d();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract B n();

    /* access modifiers changed from: package-private */
    public abstract void o(Object obj, B b11);

    /* access modifiers changed from: package-private */
    public abstract void p(Object obj, T t);

    /* access modifiers changed from: package-private */
    public abstract boolean q(x0 x0Var);

    /* access modifiers changed from: package-private */
    public abstract T r(B b11);

    /* access modifiers changed from: package-private */
    public abstract void s(T t, Writer writer) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void t(T t, Writer writer) throws IOException;
}

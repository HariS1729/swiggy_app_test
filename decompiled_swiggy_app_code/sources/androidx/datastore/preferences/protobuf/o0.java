package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.x;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema */
final class o0<T> implements y0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f10091a;

    /* renamed from: b  reason: collision with root package name */
    private final e1<?, ?> f10092b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10093c;

    /* renamed from: d  reason: collision with root package name */
    private final o<?> f10094d;

    private o0(e1<?, ?> e1Var, o<?> oVar, k0 k0Var) {
        this.f10092b = e1Var;
        this.f10093c = oVar.e(k0Var);
        this.f10094d = oVar;
        this.f10091a = k0Var;
    }

    private <UT, UB> int c(e1<UT, UB> e1Var, T t) {
        return e1Var.i(e1Var.g(t));
    }

    private <UT, UB, ET extends s.b<ET>> void d(e1<UT, UB> e1Var, o<ET> oVar, T t, x0 x0Var, n nVar) throws IOException {
        UB f11 = e1Var.f(t);
        s<ET> d11 = oVar.d(t);
        do {
            try {
                if (x0Var.getFieldNumber() == Integer.MAX_VALUE) {
                    e1Var.o(t, f11);
                    return;
                }
            } finally {
                e1Var.o(t, f11);
            }
        } while (f(x0Var, nVar, oVar, d11, e1Var, f11));
    }

    static <T> o0<T> e(e1<?, ?> e1Var, o<?> oVar, k0 k0Var) {
        return new o0<>(e1Var, oVar, k0Var);
    }

    private <UT, UB, ET extends s.b<ET>> boolean f(x0 x0Var, n nVar, o<ET> oVar, s<ET> sVar, e1<UT, UB> e1Var, UB ub2) throws IOException {
        int tag = x0Var.getTag();
        if (tag == WireFormat.f9942a) {
            int i11 = 0;
            Object obj = null;
            ByteString byteString = null;
            while (x0Var.getFieldNumber() != Integer.MAX_VALUE) {
                int tag2 = x0Var.getTag();
                if (tag2 == WireFormat.f9944c) {
                    i11 = x0Var.readUInt32();
                    obj = oVar.b(nVar, this.f10091a, i11);
                } else if (tag2 == WireFormat.f9945d) {
                    if (obj != null) {
                        oVar.h(x0Var, obj, nVar, sVar);
                    } else {
                        byteString = x0Var.readBytes();
                    }
                } else if (!x0Var.skipField()) {
                    break;
                }
            }
            if (x0Var.getTag() == WireFormat.f9943b) {
                if (byteString != null) {
                    if (obj != null) {
                        oVar.i(byteString, obj, nVar, sVar);
                    } else {
                        e1Var.d(ub2, i11, byteString);
                    }
                }
                return true;
            }
            throw InvalidProtocolBufferException.a();
        } else if (WireFormat.b(tag) != 2) {
            return x0Var.skipField();
        } else {
            Object b11 = oVar.b(nVar, this.f10091a, WireFormat.a(tag));
            if (b11 == null) {
                return e1Var.m(ub2, x0Var);
            }
            oVar.h(x0Var, b11, nVar, sVar);
            return true;
        }
    }

    private <UT, UB> void g(e1<UT, UB> e1Var, T t, Writer writer) throws IOException {
        e1Var.s(e1Var.g(t), writer);
    }

    public void a(T t, Writer writer) throws IOException {
        Iterator<Map.Entry<?, Object>> s11 = this.f10094d.c(t).s();
        while (s11.hasNext()) {
            Map.Entry next = s11.next();
            s.b bVar = (s.b) next.getKey();
            if (bVar.getLiteJavaType() != WireFormat.JavaType.MESSAGE || bVar.isRepeated() || bVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof x.b) {
                writer.writeMessageSetItem(bVar.getNumber(), ((x.b) next).a().e());
            } else {
                writer.writeMessageSetItem(bVar.getNumber(), next.getValue());
            }
        }
        g(this.f10092b, t, writer);
    }

    public void b(T t, x0 x0Var, n nVar) throws IOException {
        d(this.f10092b, this.f10094d, t, x0Var, nVar);
    }

    public boolean equals(T t, T t11) {
        if (!this.f10092b.g(t).equals(this.f10092b.g(t11))) {
            return false;
        }
        if (this.f10093c) {
            return this.f10094d.c(t).equals(this.f10094d.c(t11));
        }
        return true;
    }

    public int getSerializedSize(T t) {
        int c11 = c(this.f10092b, t) + 0;
        return this.f10093c ? c11 + this.f10094d.c(t).j() : c11;
    }

    public int hashCode(T t) {
        int hashCode = this.f10092b.g(t).hashCode();
        return this.f10093c ? (hashCode * 53) + this.f10094d.c(t).hashCode() : hashCode;
    }

    public final boolean isInitialized(T t) {
        return this.f10094d.c(t).p();
    }

    public void makeImmutable(T t) {
        this.f10092b.j(t);
        this.f10094d.f(t);
    }

    public void mergeFrom(T t, T t11) {
        a1.G(this.f10092b, t, t11);
        if (this.f10093c) {
            a1.E(this.f10094d, t, t11);
        }
    }

    public T newInstance() {
        return this.f10091a.newBuilderForType().buildPartial();
    }
}

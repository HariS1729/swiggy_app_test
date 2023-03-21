package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.C0057a;
import androidx.datastore.preferences.protobuf.k0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: AbstractMessageLite */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0057a<MessageType, BuilderType>> implements k0 {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractMessageLite */
    public static abstract class C0057a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0057a<MessageType, BuilderType>> implements k0.a {
        protected static <T> void c(Iterable<T> iterable, List<? super T> list) {
            w.a(iterable);
            if (iterable instanceof a0) {
                List<?> underlyingElements = ((a0) iterable).getUnderlyingElements();
                a0 a0Var = (a0) list;
                int size = list.size();
                for (Object next : underlyingElements) {
                    if (next == null) {
                        String str = "Element at index " + (a0Var.size() - size) + " is null.";
                        for (int size2 = a0Var.size() - 1; size2 >= size; size2--) {
                            a0Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof ByteString) {
                        a0Var.w((ByteString) next);
                    } else {
                        a0Var.add((String) next);
                    }
                }
            } else if (iterable instanceof t0) {
                list.addAll((Collection) iterable);
            } else {
                d(iterable, list);
            }
        }

        private static <T> void d(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        protected static UninitializedMessageException g(k0 k0Var) {
            return new UninitializedMessageException(k0Var);
        }

        /* access modifiers changed from: protected */
        public abstract BuilderType e(MessageType messagetype);

        /* renamed from: f */
        public BuilderType a(k0 k0Var) {
            if (getDefaultInstanceForType().getClass().isInstance(k0Var)) {
                return e((a) k0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static <T> void c(Iterable<T> iterable, List<? super T> list) {
        C0057a.c(iterable, list);
    }

    private String f(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* access modifiers changed from: package-private */
    public int d() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int e(y0 y0Var) {
        int d11 = d();
        if (d11 != -1) {
            return d11;
        }
        int serializedSize = y0Var.getSerializedSize(this);
        h(serializedSize);
        return serializedSize;
    }

    /* access modifiers changed from: package-private */
    public UninitializedMessageException g() {
        return new UninitializedMessageException(this);
    }

    /* access modifiers changed from: package-private */
    public void h(int i11) {
        throw new UnsupportedOperationException();
    }

    public void i(OutputStream outputStream) throws IOException {
        CodedOutputStream f02 = CodedOutputStream.f0(outputStream, CodedOutputStream.I(getSerializedSize()));
        b(f02);
        f02.c0();
    }

    public ByteString toByteString() {
        try {
            ByteString.g o11 = ByteString.o(getSerializedSize());
            b(o11.b());
            return o11.a();
        } catch (IOException e11) {
            throw new RuntimeException(f("ByteString"), e11);
        }
    }
}

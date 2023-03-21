package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.a;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.w;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected f1 unknownFields = f1.e();

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.C0057a<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private final MessageType f9926a;

        /* renamed from: b  reason: collision with root package name */
        protected MessageType f9927b;

        /* renamed from: c  reason: collision with root package name */
        protected boolean f9928c = false;

        protected a(MessageType messagetype) {
            this.f9926a = messagetype;
            this.f9927b = (GeneratedMessageLite) messagetype.m(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        private void o(MessageType messagetype, MessageType messagetype2) {
            u0.a().e(messagetype).mergeFrom(messagetype, messagetype2);
        }

        /* renamed from: h */
        public final MessageType build() {
            MessageType i11 = buildPartial();
            if (i11.isInitialized()) {
                return i11;
            }
            throw a.C0057a.g(i11);
        }

        /* renamed from: i */
        public MessageType buildPartial() {
            if (this.f9928c) {
                return this.f9927b;
            }
            this.f9927b.u();
            this.f9928c = true;
            return this.f9927b;
        }

        /* renamed from: j */
        public BuilderType clone() {
            BuilderType w11 = getDefaultInstanceForType().newBuilderForType();
            w11.n(buildPartial());
            return w11;
        }

        /* access modifiers changed from: protected */
        public void k() {
            if (this.f9928c) {
                MessageType messagetype = (GeneratedMessageLite) this.f9927b.m(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                o(messagetype, this.f9927b);
                this.f9927b = messagetype;
                this.f9928c = false;
            }
        }

        /* renamed from: l */
        public MessageType getDefaultInstanceForType() {
            return this.f9926a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public BuilderType e(MessageType messagetype) {
            return n(messagetype);
        }

        public BuilderType n(MessageType messagetype) {
            k();
            o(this.f9927b, messagetype);
            return this;
        }
    }

    protected static class b<T extends GeneratedMessageLite<T, ?>> extends b<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f9929b;

        public b(T t) {
            this.f9929b = t;
        }

        /* renamed from: g */
        public T a(h hVar, n nVar) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.z(this.f9929b, hVar, nVar);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements l0 {
        protected s<d> extensions = s.h();

        /* access modifiers changed from: package-private */
        public s<d> C() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        public /* bridge */ /* synthetic */ k0 getDefaultInstanceForType() {
            return GeneratedMessageLite.super.getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ k0.a newBuilderForType() {
            return GeneratedMessageLite.super.newBuilderForType();
        }

        public /* bridge */ /* synthetic */ k0.a toBuilder() {
            return GeneratedMessageLite.super.toBuilder();
        }
    }

    static final class d implements s.b<d> {

        /* renamed from: a  reason: collision with root package name */
        final w.d<?> f9930a;

        /* renamed from: b  reason: collision with root package name */
        final int f9931b;

        /* renamed from: c  reason: collision with root package name */
        final WireFormat.FieldType f9932c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f9933d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f9934e;

        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.f9931b - dVar.f9931b;
        }

        public k0.a b(k0.a aVar, k0 k0Var) {
            return ((a) aVar).n((GeneratedMessageLite) k0Var);
        }

        public WireFormat.JavaType getLiteJavaType() {
            return this.f9932c.getJavaType();
        }

        public WireFormat.FieldType getLiteType() {
            return this.f9932c;
        }

        public int getNumber() {
            return this.f9931b;
        }

        public w.d<?> h() {
            return this.f9930a;
        }

        public boolean isPacked() {
            return this.f9934e;
        }

        public boolean isRepeated() {
            return this.f9933d;
        }
    }

    public static class e<ContainingType extends k0, Type> extends l<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        final k0 f9935a;

        /* renamed from: b  reason: collision with root package name */
        final d f9936b;

        public WireFormat.FieldType a() {
            return this.f9936b.getLiteType();
        }

        public k0 b() {
            return this.f9935a;
        }

        public int c() {
            return this.f9936b.getNumber();
        }

        public boolean d() {
            return this.f9936b.f9933d;
        }
    }

    protected static <T extends GeneratedMessageLite<?, ?>> void A(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    private static <T extends GeneratedMessageLite<T, ?>> T k(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.g().a().j(t);
    }

    protected static <E> w.i<E> p() {
        return v0.f();
    }

    static <T extends GeneratedMessageLite<?, ?>> T q(Class<T> cls) {
        T t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (t == null) {
            t = ((GeneratedMessageLite) i1.i(cls)).getDefaultInstanceForType();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    static Object s(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final <T extends GeneratedMessageLite<T, ?>> boolean t(T t, boolean z11) {
        byte byteValue = ((Byte) t.m(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean isInitialized = u0.a().e(t).isInitialized(t);
        if (z11) {
            t.n(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, isInitialized ? t : null);
        }
        return isInitialized;
    }

    protected static <E> w.i<E> v(w.i<E> iVar) {
        int size = iVar.size();
        return iVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static Object x(k0 k0Var, String str, Object[] objArr) {
        return new w0(k0Var, str, objArr);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T y(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return k(z(t, h.f(inputStream), n.b()));
    }

    static <T extends GeneratedMessageLite<T, ?>> T z(T t, h hVar, n nVar) throws InvalidProtocolBufferException {
        T t11 = (GeneratedMessageLite) t.m(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            y0 e11 = u0.a().e(t11);
            e11.b(t11, i.h(hVar), nVar);
            e11.makeImmutable(t11);
            return t11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12.getMessage()).j(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
    }

    /* renamed from: B */
    public final BuilderType toBuilder() {
        BuilderType buildertype = (a) m(MethodToInvoke.NEW_BUILDER);
        buildertype.n(this);
        return buildertype;
    }

    public void b(CodedOutputStream codedOutputStream) throws IOException {
        u0.a().e(this).a(this, j.g(codedOutputStream));
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getDefaultInstanceForType().getClass().isInstance(obj)) {
            return false;
        }
        return u0.a().e(this).equals(this, (GeneratedMessageLite) obj);
    }

    public final s0<MessageType> getParserForType() {
        return (s0) m(MethodToInvoke.GET_PARSER);
    }

    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = u0.a().e(this).getSerializedSize(this);
        }
        return this.memoizedSerializedSize;
    }

    /* access modifiers changed from: package-private */
    public void h(int i11) {
        this.memoizedSerializedSize = i11;
    }

    public int hashCode() {
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = u0.a().e(this).hashCode(this);
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public final boolean isInitialized() {
        return t(this, true);
    }

    /* access modifiers changed from: package-private */
    public Object j() throws Exception {
        return m(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType l() {
        return (a) m(MethodToInvoke.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    public Object m(MethodToInvoke methodToInvoke) {
        return o(methodToInvoke, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Object n(MethodToInvoke methodToInvoke, Object obj) {
        return o(methodToInvoke, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object o(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    /* renamed from: r */
    public final MessageType getDefaultInstanceForType() {
        return (GeneratedMessageLite) m(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public String toString() {
        return m0.e(this, super.toString());
    }

    /* access modifiers changed from: protected */
    public void u() {
        u0.a().e(this).makeImmutable(this);
    }

    /* renamed from: w */
    public final BuilderType newBuilderForType() {
        return (a) m(MethodToInvoke.NEW_BUILDER);
    }
}

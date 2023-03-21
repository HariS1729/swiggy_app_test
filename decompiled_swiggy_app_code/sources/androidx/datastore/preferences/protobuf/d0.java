package androidx.datastore.preferences.protobuf;

/* compiled from: ManifestSchemaFactory */
final class d0 implements z0 {

    /* renamed from: b  reason: collision with root package name */
    private static final j0 f9986b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final j0 f9987a;

    /* compiled from: ManifestSchemaFactory */
    static class a implements j0 {
        a() {
        }

        public boolean isSupported(Class<?> cls) {
            return false;
        }

        public i0 messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* compiled from: ManifestSchemaFactory */
    private static class b implements j0 {

        /* renamed from: a  reason: collision with root package name */
        private j0[] f9988a;

        b(j0... j0VarArr) {
            this.f9988a = j0VarArr;
        }

        public boolean isSupported(Class<?> cls) {
            for (j0 isSupported : this.f9988a) {
                if (isSupported.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        public i0 messageInfoFor(Class<?> cls) {
            for (j0 j0Var : this.f9988a) {
                if (j0Var.isSupported(cls)) {
                    return j0Var.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public d0() {
        this(a());
    }

    private static j0 a() {
        return new b(u.a(), b());
    }

    private static j0 b() {
        try {
            return (j0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f9986b;
        }
    }

    private static boolean c(i0 i0Var) {
        return i0Var.getSyntax() == ProtoSyntax.PROTO2;
    }

    private static <T> y0<T> d(Class<T> cls, i0 i0Var) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            if (c(i0Var)) {
                return n0.G(cls, i0Var, r0.b(), b0.b(), a1.M(), q.b(), h0.b());
            }
            return n0.G(cls, i0Var, r0.b(), b0.b(), a1.M(), (o<?>) null, h0.b());
        } else if (c(i0Var)) {
            return n0.G(cls, i0Var, r0.a(), b0.a(), a1.H(), q.a(), h0.a());
        } else {
            return n0.G(cls, i0Var, r0.a(), b0.a(), a1.I(), (o<?>) null, h0.a());
        }
    }

    public <T> y0<T> createSchema(Class<T> cls) {
        a1.J(cls);
        i0 messageInfoFor = this.f9987a.messageInfoFor(cls);
        if (!messageInfoFor.isMessageSetWireFormat()) {
            return d(cls, messageInfoFor);
        }
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return o0.e(a1.M(), q.b(), messageInfoFor.getDefaultInstance());
        }
        return o0.e(a1.H(), q.a(), messageInfoFor.getDefaultInstance());
    }

    private d0(j0 j0Var) {
        this.f9987a = (j0) w.b(j0Var, "messageInfoFactory");
    }
}

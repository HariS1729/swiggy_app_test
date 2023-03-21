package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.w;
import java.util.List;

/* compiled from: PreferencesProto */
public final class c extends GeneratedMessageLite<c, a> implements l0 {
    /* access modifiers changed from: private */
    public static final c DEFAULT_INSTANCE;
    private static volatile s0<c> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private w.i<String> strings_ = GeneratedMessageLite.p();

    /* compiled from: PreferencesProto */
    public static final class a extends GeneratedMessageLite.a<c, a> implements l0 {
        /* synthetic */ a(a aVar) {
            this();
        }

        public a p(Iterable<String> iterable) {
            k();
            ((c) this.f9927b).E(iterable);
            return this;
        }

        private a() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.A(c.class, cVar);
    }

    private c() {
    }

    /* access modifiers changed from: private */
    public void E(Iterable<String> iterable) {
        F();
        androidx.datastore.preferences.protobuf.a.c(iterable, this.strings_);
    }

    private void F() {
        if (!this.strings_.isModifiable()) {
            this.strings_ = GeneratedMessageLite.v(this.strings_);
        }
    }

    public static c G() {
        return DEFAULT_INSTANCE;
    }

    public static a I() {
        return (a) DEFAULT_INSTANCE.l();
    }

    public List<String> H() {
        return this.strings_;
    }

    /* access modifiers changed from: protected */
    public final Object o(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f9884a[methodToInvoke.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new a((a) null);
            case 3:
                return GeneratedMessageLite.x(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s0<c> s0Var = PARSER;
                if (s0Var == null) {
                    synchronized (c.class) {
                        s0Var = PARSER;
                        if (s0Var == null) {
                            s0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                            PARSER = s0Var;
                        }
                    }
                }
                return s0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

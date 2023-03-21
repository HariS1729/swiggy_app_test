package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.s0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: PreferencesProto */
public final class b extends GeneratedMessageLite<b, a> implements l0 {
    /* access modifiers changed from: private */
    public static final b DEFAULT_INSTANCE;
    private static volatile s0<b> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private MapFieldLite<String, PreferencesProto$Value> preferences_ = MapFieldLite.h();

    /* compiled from: PreferencesProto */
    public static final class a extends GeneratedMessageLite.a<b, a> implements l0 {
        /* synthetic */ a(a aVar) {
            this();
        }

        public a p(String str, PreferencesProto$Value preferencesProto$Value) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(preferencesProto$Value);
            k();
            ((b) this.f9927b).E().put(str, preferencesProto$Value);
            return this;
        }

        private a() {
            super(b.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: androidx.datastore.preferences.b$b  reason: collision with other inner class name */
    /* compiled from: PreferencesProto */
    private static final class C0056b {

        /* renamed from: a  reason: collision with root package name */
        static final e0<String, PreferencesProto$Value> f9885a = e0.d(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, PreferencesProto$Value.L());
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        GeneratedMessageLite.A(b.class, bVar);
    }

    private b() {
    }

    /* access modifiers changed from: private */
    public Map<String, PreferencesProto$Value> E() {
        return G();
    }

    private MapFieldLite<String, PreferencesProto$Value> G() {
        if (!this.preferences_.n()) {
            this.preferences_ = this.preferences_.q();
        }
        return this.preferences_;
    }

    private MapFieldLite<String, PreferencesProto$Value> H() {
        return this.preferences_;
    }

    public static a I() {
        return (a) DEFAULT_INSTANCE.l();
    }

    public static b J(InputStream inputStream) throws IOException {
        return (b) GeneratedMessageLite.y(DEFAULT_INSTANCE, inputStream);
    }

    public Map<String, PreferencesProto$Value> F() {
        return Collections.unmodifiableMap(H());
    }

    /* access modifiers changed from: protected */
    public final Object o(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f9884a[methodToInvoke.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return new a((a) null);
            case 3:
                return GeneratedMessageLite.x(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C0056b.f9885a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s0<b> s0Var = PARSER;
                if (s0Var == null) {
                    synchronized (b.class) {
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

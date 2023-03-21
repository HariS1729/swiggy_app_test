package androidx.datastore.preferences;

import androidx.datastore.preferences.c;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.s0;
import java.util.Objects;

public final class PreferencesProto$Value extends GeneratedMessageLite<PreferencesProto$Value, a> implements l0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final PreferencesProto$Value DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile s0<PreferencesProto$Value> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public enum ValueCase {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);
        
        private final int value;

        private ValueCase(int i11) {
            this.value = i11;
        }

        public static ValueCase forNumber(int i11) {
            switch (i11) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ValueCase valueOf(int i11) {
            return forNumber(i11);
        }
    }

    public static final class a extends GeneratedMessageLite.a<PreferencesProto$Value, a> implements l0 {
        /* synthetic */ a(a aVar) {
            this();
        }

        public a p(boolean z11) {
            k();
            ((PreferencesProto$Value) this.f9927b).U(z11);
            return this;
        }

        public a q(double d11) {
            k();
            ((PreferencesProto$Value) this.f9927b).V(d11);
            return this;
        }

        public a r(float f11) {
            k();
            ((PreferencesProto$Value) this.f9927b).W(f11);
            return this;
        }

        public a s(int i11) {
            k();
            ((PreferencesProto$Value) this.f9927b).X(i11);
            return this;
        }

        public a u(long j) {
            k();
            ((PreferencesProto$Value) this.f9927b).Y(j);
            return this;
        }

        public a v(String str) {
            k();
            ((PreferencesProto$Value) this.f9927b).Z(str);
            return this;
        }

        public a w(c.a aVar) {
            k();
            ((PreferencesProto$Value) this.f9927b).a0(aVar);
            return this;
        }

        private a() {
            super(PreferencesProto$Value.DEFAULT_INSTANCE);
        }
    }

    static {
        PreferencesProto$Value preferencesProto$Value = new PreferencesProto$Value();
        DEFAULT_INSTANCE = preferencesProto$Value;
        GeneratedMessageLite.A(PreferencesProto$Value.class, preferencesProto$Value);
    }

    private PreferencesProto$Value() {
    }

    public static PreferencesProto$Value L() {
        return DEFAULT_INSTANCE;
    }

    public static a T() {
        return (a) DEFAULT_INSTANCE.l();
    }

    /* access modifiers changed from: private */
    public void U(boolean z11) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z11);
    }

    /* access modifiers changed from: private */
    public void V(double d11) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d11);
    }

    /* access modifiers changed from: private */
    public void W(float f11) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f11);
    }

    /* access modifiers changed from: private */
    public void X(int i11) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i11);
    }

    /* access modifiers changed from: private */
    public void Y(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    /* access modifiers changed from: private */
    public void Z(String str) {
        Objects.requireNonNull(str);
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* access modifiers changed from: private */
    public void a0(c.a aVar) {
        this.value_ = aVar.build();
        this.valueCase_ = 6;
    }

    public boolean K() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double M() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float N() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int O() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long P() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0;
    }

    public String Q() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public c R() {
        if (this.valueCase_ == 6) {
            return (c) this.value_;
        }
        return c.G();
    }

    public ValueCase S() {
        return ValueCase.forNumber(this.valueCase_);
    }

    /* access modifiers changed from: protected */
    public final Object o(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f9884a[methodToInvoke.ordinal()]) {
            case 1:
                return new PreferencesProto$Value();
            case 2:
                return new a((a) null);
            case 3:
                return GeneratedMessageLite.x(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s0<PreferencesProto$Value> s0Var = PARSER;
                if (s0Var == null) {
                    synchronized (PreferencesProto$Value.class) {
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

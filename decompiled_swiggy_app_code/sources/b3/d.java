package b3;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.b;
import androidx.datastore.preferences.c;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import b3.a;
import bp0.k;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import y2.f;

/* compiled from: PreferencesSerializer.kt */
public final class d implements f<a> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f12577a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final String f12578b = "preferences_pb";

    /* compiled from: PreferencesSerializer.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12579a;

        static {
            int[] iArr = new int[PreferencesProto$Value.ValueCase.values().length];
            iArr[PreferencesProto$Value.ValueCase.BOOLEAN.ordinal()] = 1;
            iArr[PreferencesProto$Value.ValueCase.FLOAT.ordinal()] = 2;
            iArr[PreferencesProto$Value.ValueCase.DOUBLE.ordinal()] = 3;
            iArr[PreferencesProto$Value.ValueCase.INTEGER.ordinal()] = 4;
            iArr[PreferencesProto$Value.ValueCase.LONG.ordinal()] = 5;
            iArr[PreferencesProto$Value.ValueCase.STRING.ordinal()] = 6;
            iArr[PreferencesProto$Value.ValueCase.STRING_SET.ordinal()] = 7;
            iArr[PreferencesProto$Value.ValueCase.VALUE_NOT_SET.ordinal()] = 8;
            f12579a = iArr;
        }
    }

    private d() {
    }

    private final void c(String str, PreferencesProto$Value preferencesProto$Value, MutablePreferences mutablePreferences) {
        PreferencesProto$Value.ValueCase S = preferencesProto$Value.S();
        switch (S == null ? -1 : a.f12579a[S.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", (Throwable) null, 2, (i) null);
            case 1:
                mutablePreferences.i(c.a(str), Boolean.valueOf(preferencesProto$Value.K()));
                return;
            case 2:
                mutablePreferences.i(c.c(str), Float.valueOf(preferencesProto$Value.N()));
                return;
            case 3:
                mutablePreferences.i(c.b(str), Double.valueOf(preferencesProto$Value.M()));
                return;
            case 4:
                mutablePreferences.i(c.d(str), Integer.valueOf(preferencesProto$Value.O()));
                return;
            case 5:
                mutablePreferences.i(c.e(str), Long.valueOf(preferencesProto$Value.P()));
                return;
            case 6:
                a.C0100a<String> f11 = c.f(str);
                String Q = preferencesProto$Value.Q();
                p.i(Q, "value.string");
                mutablePreferences.i(f11, Q);
                return;
            case 7:
                a.C0100a<Set<String>> g11 = c.g(str);
                List<String> H = preferencesProto$Value.R().H();
                p.i(H, "value.stringSet.stringsList");
                mutablePreferences.i(g11, s.I0(H));
                return;
            case 8:
                throw new CorruptionException("Value not set.", (Throwable) null, 2, (i) null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final PreferencesProto$Value f(Object obj) {
        if (obj instanceof Boolean) {
            GeneratedMessageLite h11 = PreferencesProto$Value.T().p(((Boolean) obj).booleanValue()).build();
            p.i(h11, "newBuilder().setBoolean(value).build()");
            return (PreferencesProto$Value) h11;
        } else if (obj instanceof Float) {
            GeneratedMessageLite h12 = PreferencesProto$Value.T().r(((Number) obj).floatValue()).build();
            p.i(h12, "newBuilder().setFloat(value).build()");
            return (PreferencesProto$Value) h12;
        } else if (obj instanceof Double) {
            GeneratedMessageLite h13 = PreferencesProto$Value.T().q(((Number) obj).doubleValue()).build();
            p.i(h13, "newBuilder().setDouble(value).build()");
            return (PreferencesProto$Value) h13;
        } else if (obj instanceof Integer) {
            GeneratedMessageLite h14 = PreferencesProto$Value.T().s(((Number) obj).intValue()).build();
            p.i(h14, "newBuilder().setInteger(value).build()");
            return (PreferencesProto$Value) h14;
        } else if (obj instanceof Long) {
            GeneratedMessageLite h15 = PreferencesProto$Value.T().u(((Number) obj).longValue()).build();
            p.i(h15, "newBuilder().setLong(value).build()");
            return (PreferencesProto$Value) h15;
        } else if (obj instanceof String) {
            GeneratedMessageLite h16 = PreferencesProto$Value.T().v((String) obj).build();
            p.i(h16, "newBuilder().setString(value).build()");
            return (PreferencesProto$Value) h16;
        } else if (obj instanceof Set) {
            GeneratedMessageLite h17 = PreferencesProto$Value.T().w(c.I().p((Set) obj)).build();
            p.i(h17, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
            return (PreferencesProto$Value) h17;
        } else {
            throw new IllegalStateException(p.s("PreferencesSerializer does not support type: ", obj.getClass().getName()));
        }
    }

    public Object b(InputStream inputStream, fp0.c<? super a> cVar) throws IOException, CorruptionException {
        b a11 = a3.b.f985a.a(inputStream);
        MutablePreferences b11 = b.b(new a.b[0]);
        Map<String, PreferencesProto$Value> F = a11.F();
        p.i(F, "preferencesProto.preferencesMap");
        for (Map.Entry next : F.entrySet()) {
            String str = (String) next.getKey();
            PreferencesProto$Value preferencesProto$Value = (PreferencesProto$Value) next.getValue();
            d dVar = f12577a;
            p.i(str, "name");
            p.i(preferencesProto$Value, "value");
            dVar.c(str, preferencesProto$Value, b11);
        }
        return b11.d();
    }

    /* renamed from: d */
    public a getDefaultValue() {
        return b.a();
    }

    public final String e() {
        return f12578b;
    }

    /* renamed from: g */
    public Object a(a aVar, OutputStream outputStream, fp0.c<? super k> cVar) throws IOException, CorruptionException {
        Map<a.C0100a<?>, Object> a11 = aVar.a();
        b.a I = b.I();
        for (Map.Entry next : a11.entrySet()) {
            I.p(((a.C0100a) next.getKey()).a(), f(next.getValue()));
        }
        ((b) I.build()).i(outputStream);
        return k.f22762a;
    }
}

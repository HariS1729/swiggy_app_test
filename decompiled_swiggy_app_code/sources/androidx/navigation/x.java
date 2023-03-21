package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.w;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* compiled from: NavigatorProvider */
public class x {

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<Class<?>, String> f10995b = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, w<? extends m>> f10996a = new HashMap<>();

    static String c(Class<? extends w> cls) {
        HashMap<Class<?>, String> hashMap = f10995b;
        String str = hashMap.get(cls);
        if (str == null) {
            w.b bVar = (w.b) cls.getAnnotation(w.b.class);
            str = bVar != null ? bVar.value() : null;
            if (f(str)) {
                hashMap.put(cls, str);
            } else {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for " + cls.getSimpleName());
            }
        }
        return str;
    }

    private static boolean f(String str) {
        return str != null && !str.isEmpty();
    }

    public final w<? extends m> a(w<? extends m> wVar) {
        return b(c(wVar.getClass()), wVar);
    }

    public w<? extends m> b(String str, w<? extends m> wVar) {
        if (f(str)) {
            return this.f10996a.put(str, wVar);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public <T extends w<?>> T d(String str) {
        if (f(str)) {
            T t = (w) this.f10996a.get(str);
            if (t != null) {
                return t;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* access modifiers changed from: package-private */
    public Map<String, w<? extends m>> e() {
        return this.f10996a;
    }
}

package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.d;
import bp0.f;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.jvm.internal.p;
import lp0.a;
import sp0.c;

/* compiled from: NavArgsLazy.kt */
public final class e<Args extends d> implements f<Args> {

    /* renamed from: a  reason: collision with root package name */
    private Args f10879a;

    /* renamed from: b  reason: collision with root package name */
    private final c<Args> f10880b;

    /* renamed from: c  reason: collision with root package name */
    private final a<Bundle> f10881c;

    public e(c<Args> cVar, a<Bundle> aVar) {
        p.k(cVar, "navArgsClass");
        p.k(aVar, "argumentProducer");
        this.f10880b = cVar;
        this.f10881c = aVar;
    }

    /* renamed from: a */
    public Args getValue() {
        Args args = this.f10879a;
        if (args != null) {
            return args;
        }
        Bundle invoke = this.f10881c.invoke();
        Method method = f.a().get(this.f10880b);
        if (method == null) {
            Class<Args> a11 = kp0.a.a(this.f10880b);
            Class[] b11 = f.b();
            method = a11.getMethod("fromBundle", (Class[]) Arrays.copyOf(b11, b11.length));
            f.a().put(this.f10880b, method);
            p.f(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Args invoke2 = method.invoke((Object) null, new Object[]{invoke});
        if (invoke2 != null) {
            Args args2 = (d) invoke2;
            this.f10879a = args2;
            return args2;
        }
        throw new TypeCastException("null cannot be cast to non-null type Args");
    }
}

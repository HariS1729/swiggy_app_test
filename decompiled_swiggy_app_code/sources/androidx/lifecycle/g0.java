package androidx.lifecycle;

import android.app.Application;
import in.juspay.hypersdk.core.PaymentConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: SavedStateViewModelFactory.kt */
public final class g0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final List<Class<?>> f10738a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final List<Class<?>> f10739b;

    static {
        Class<d0> cls = d0.class;
        f10738a = k.m(Application.class, cls);
        f10739b = j.d(cls);
    }

    public static final <T> Constructor<T> c(Class<T> cls, List<? extends Class<?>> list) {
        p.j(cls, "modelClass");
        p.j(list, PaymentConstants.SIGNATURE);
        Constructor<T>[] constructors = cls.getConstructors();
        p.i(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i11 = 0;
        while (i11 < length) {
            Constructor<T> constructor = constructors[i11];
            Class[] parameterTypes = constructor.getParameterTypes();
            p.i(parameterTypes, "constructor.parameterTypes");
            List h02 = ArraysKt___ArraysKt.h0(parameterTypes);
            if (p.e(list, h02)) {
                return constructor;
            }
            if (list.size() != h02.size() || !h02.containsAll(list)) {
                i11++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends j0> T d(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        p.j(cls, "modelClass");
        p.j(constructor, "constructor");
        p.j(objArr, "params");
        try {
            return (j0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Failed to access " + cls, e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e13.getCause());
        }
    }
}

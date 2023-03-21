package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: TypefaceCompatApi24Impl */
class g extends k {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f9288b;

    /* renamed from: c  reason: collision with root package name */
    private static final Constructor<?> f9289c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f9290d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f9291e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e11) {
            Log.e("TypefaceCompatApi24Impl", e11.getClass().getName(), e11);
            cls = null;
            method2 = null;
            method = null;
        }
        f9289c = constructor;
        f9288b = cls;
        f9290d = method;
        f9291e = method2;
    }

    g() {
    }

    private static boolean g(Object obj, ByteBuffer byteBuffer, int i11, int i12, boolean z11) {
        try {
            return ((Boolean) f9290d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i11), null, Integer.valueOf(i12), Boolean.valueOf(z11)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface h(Object obj) {
        try {
            Object newInstance = Array.newInstance(f9288b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f9291e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean i() {
        Method method = f9290d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object j() {
        try {
            return f9289c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i11) {
        Object j = j();
        if (j == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            ByteBuffer b11 = l.b(context, resources, dVar.b());
            if (b11 == null || !g(j, b11, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return h(j);
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i11) {
        Object j = j();
        if (j == null) {
            return null;
        }
        androidx.collection.g gVar = new androidx.collection.g();
        for (g.b bVar : bVarArr) {
            Uri d11 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d11);
            if (byteBuffer == null) {
                byteBuffer = l.f(context, cancellationSignal, d11);
                gVar.put(d11, byteBuffer);
            }
            if (byteBuffer == null || !g(j, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface h11 = h(j);
        if (h11 == null) {
            return null;
        }
        return Typeface.create(h11, i11);
    }
}

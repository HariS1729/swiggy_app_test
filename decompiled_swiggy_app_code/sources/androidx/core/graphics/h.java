package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import org.apache.pdfbox.pdmodel.common.PDPageLabelRange;

/* compiled from: TypefaceCompatApi26Impl */
public class h extends f {

    /* renamed from: g  reason: collision with root package name */
    protected final Class<?> f9292g;

    /* renamed from: h  reason: collision with root package name */
    protected final Constructor<?> f9293h;

    /* renamed from: i  reason: collision with root package name */
    protected final Method f9294i;
    protected final Method j;
    protected final Method k;

    /* renamed from: l  reason: collision with root package name */
    protected final Method f9295l;

    /* renamed from: m  reason: collision with root package name */
    protected final Method f9296m;

    public h() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> u11 = u();
            constructor = v(u11);
            method4 = r(u11);
            method3 = s(u11);
            method2 = w(u11);
            method = q(u11);
            Class<?> cls2 = u11;
            method5 = t(u11);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e11) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e11.getClass().getName(), e11);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f9292g = cls;
        this.f9293h = constructor;
        this.f9294i = method4;
        this.j = method3;
        this.k = method2;
        this.f9295l = method;
        this.f9296m = method5;
    }

    private Object k() {
        try {
            return this.f9293h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void l(Object obj) {
        try {
            this.f9295l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean m(Context context, Object obj, String str, int i11, int i12, int i13, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f9294i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean n(Object obj, ByteBuffer byteBuffer, int i11, int i12, int i13) {
        try {
            return ((Boolean) this.j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i11), null, Integer.valueOf(i12), Integer.valueOf(i13)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p() {
        if (this.f9294i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f9294i != null;
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i11) {
        if (!p()) {
            return super.a(context, cVar, resources, i11);
        }
        Object k11 = k();
        if (k11 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            if (!m(context, k11, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                l(k11);
                return null;
            }
        }
        if (!o(k11)) {
            return null;
        }
        return h(k11);
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i11) {
        Typeface h11;
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!p()) {
            g.b f11 = f(bVarArr, i11);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(f11.d(), PDPageLabelRange.STYLE_ROMAN_LOWER, cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f11.e()).setItalic(f11.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            Map<Uri, ByteBuffer> h12 = l.h(context, bVarArr, cancellationSignal);
            Object k11 = k();
            if (k11 == null) {
                return null;
            }
            boolean z11 = false;
            for (g.b bVar : bVarArr) {
                ByteBuffer byteBuffer = h12.get(bVar.d());
                if (byteBuffer != null) {
                    if (!n(k11, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                        l(k11);
                        return null;
                    }
                    z11 = true;
                }
            }
            if (!z11) {
                l(k11);
                return null;
            } else if (o(k11) && (h11 = h(k11)) != null) {
                return Typeface.create(h11, i11);
            } else {
                return null;
            }
        }
        throw th;
    }

    public Typeface d(Context context, Resources resources, int i11, String str, int i12) {
        if (!p()) {
            return super.d(context, resources, i11, str, i12);
        }
        Object k11 = k();
        if (k11 == null) {
            return null;
        }
        if (!m(context, k11, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            l(k11);
            return null;
        } else if (!o(k11)) {
            return null;
        } else {
            return h(k11);
        }
    }

    /* access modifiers changed from: protected */
    public Typeface h(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f9292g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f9296m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Method q(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method r(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    public Method s(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    public Method t(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public Class<?> u() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    public Constructor<?> v(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method w(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }
}

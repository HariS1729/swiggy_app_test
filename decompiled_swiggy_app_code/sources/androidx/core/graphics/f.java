package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import io.sentry.instrumentation.file.h;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.pdfbox.pdmodel.common.PDPageLabelRange;

/* compiled from: TypefaceCompatApi21Impl */
class f extends k {

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f9283b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Constructor<?> f9284c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Method f9285d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Method f9286e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f9287f = false;

    f() {
    }

    private static boolean g(Object obj, String str, int i11, boolean z11) {
        j();
        try {
            return ((Boolean) f9285d.invoke(obj, new Object[]{str, Integer.valueOf(i11), Boolean.valueOf(z11)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static Typeface h(Object obj) {
        j();
        try {
            Object newInstance = Array.newInstance(f9283b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f9286e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    private File i(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void j() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f9287f) {
            f9287f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e11) {
                Log.e("TypefaceCompatApi21Impl", e11.getClass().getName(), e11);
                method2 = null;
                cls = null;
                method = null;
            }
            f9284c = constructor;
            f9283b = cls;
            f9285d = method;
            f9286e = method2;
        }
    }

    private static Object k() {
        j();
        try {
            return f9284c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i11) {
        Object k = k();
        e.d[] a11 = cVar.a();
        int length = a11.length;
        int i12 = 0;
        while (i12 < length) {
            e.d dVar = a11[i12];
            File e11 = l.e(context);
            if (e11 == null) {
                return null;
            }
            try {
                if (!l.c(e11, resources, dVar.b())) {
                    e11.delete();
                    return null;
                } else if (!g(k, e11.getPath(), dVar.e(), dVar.f())) {
                    return null;
                } else {
                    e11.delete();
                    i12++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e11.delete();
            }
        }
        return h(k);
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i11) {
        FileInputStream b11;
        if (bVarArr.length < 1) {
            return null;
        }
        g.b f11 = f(bVarArr, i11);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f11.d(), PDPageLabelRange.STYLE_ROMAN_LOWER, cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File i12 = i(openFileDescriptor);
                if (i12 != null) {
                    if (i12.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(i12);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                }
                FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
                b11 = h.b.b(new FileInputStream(fileDescriptor), fileDescriptor);
                Typeface c11 = super.c(context, b11);
                b11.close();
                openFileDescriptor.close();
                return c11;
            } catch (Throwable th2) {
                openFileDescriptor.close();
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
        throw th;
    }
}

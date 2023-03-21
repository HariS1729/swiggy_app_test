package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;

/* compiled from: TypefaceCompatBaseImpl */
class k {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<Long, e.c> f9297a = new ConcurrentHashMap<>();

    /* compiled from: TypefaceCompatBaseImpl */
    class a implements b<g.b> {
        a() {
        }

        /* renamed from: c */
        public int a(g.b bVar) {
            return bVar.e();
        }

        /* renamed from: d */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl */
    private interface b<T> {
        int a(T t);

        boolean b(T t);
    }

    k() {
    }

    private static <T> T e(T[] tArr, int i11, b<T> bVar) {
        int i12 = (i11 & 1) == 0 ? OS2WindowsMetricsTable.WEIGHT_CLASS_NORMAL : OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD;
        boolean z11 = (i11 & 2) != 0;
        T t = null;
        int i13 = Integer.MAX_VALUE;
        for (T t11 : tArr) {
            int abs = (Math.abs(bVar.a(t11) - i12) * 2) + (bVar.b(t11) == z11 ? 0 : 1);
            if (t == null || i13 > abs) {
                t = t11;
                i13 = abs;
            }
        }
        return t;
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i11) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i11) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public Typeface c(Context context, InputStream inputStream) {
        File e11 = l.e(context);
        if (e11 == null) {
            return null;
        }
        try {
            if (!l.d(e11, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e11.getPath());
            e11.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e11.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i11, String str, int i12) {
        File e11 = l.e(context);
        if (e11 == null) {
            return null;
        }
        try {
            if (!l.c(e11, resources, i11)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e11.getPath());
            e11.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e11.delete();
        }
    }

    /* access modifiers changed from: protected */
    public g.b f(g.b[] bVarArr, int i11) {
        return (g.b) e(bVarArr, i11, new a());
    }
}

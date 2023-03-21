package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.f;
import androidx.core.content.res.e;
import androidx.core.content.res.h;
import androidx.core.provider.g;

/* compiled from: TypefaceCompat */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final k f9280a;

    /* renamed from: b  reason: collision with root package name */
    private static final f<String, Typeface> f9281b = new f<>(16);

    /* compiled from: TypefaceCompat */
    public static class a extends g.c {

        /* renamed from: a  reason: collision with root package name */
        private h.e f9282a;

        public a(h.e eVar) {
            this.f9282a = eVar;
        }

        public void a(int i11) {
            h.e eVar = this.f9282a;
            if (eVar != null) {
                eVar.f(i11);
            }
        }

        public void b(Typeface typeface) {
            h.e eVar = this.f9282a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            f9280a = new j();
        } else if (i11 >= 28) {
            f9280a = new i();
        } else if (i11 >= 26) {
            f9280a = new h();
        } else if (i11 < 24 || !g.i()) {
            f9280a = new f();
        } else {
            f9280a = new g();
        }
    }

    public static Typeface a(Context context, Typeface typeface, int i11) {
        if (context != null) {
            return Typeface.create(typeface, i11);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i11) {
        return f9280a.b(context, cancellationSignal, bVarArr, i11);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i11, String str, int i12, int i13, h.e eVar, Handler handler, boolean z11) {
        Typeface typeface;
        e.b bVar2 = bVar;
        h.e eVar2 = eVar;
        Handler handler2 = handler;
        if (bVar2 instanceof e.C0038e) {
            e.C0038e eVar3 = (e.C0038e) bVar2;
            Typeface g11 = g(eVar3.c());
            if (g11 != null) {
                if (eVar2 != null) {
                    eVar2.d(g11, handler2);
                }
                return g11;
            }
            typeface = g.c(context, eVar3.b(), i13, !z11 ? eVar2 == null : eVar3.a() == 0, z11 ? eVar3.d() : -1, h.e.e(handler), new a(eVar2));
            Resources resources2 = resources;
            int i14 = i13;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f9280a.a(context, (e.c) bVar2, resources, i13);
            if (eVar2 != null) {
                if (typeface != null) {
                    eVar2.d(typeface, handler2);
                } else {
                    eVar2.c(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f9281b.put(e(resources, i11, str, i12, i13), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int i11, String str, int i12, int i13) {
        Typeface d11 = f9280a.d(context, resources, i11, str, i13);
        if (d11 != null) {
            f9281b.put(e(resources, i11, str, i12, i13), d11);
        }
        return d11;
    }

    private static String e(Resources resources, int i11, String str, int i12, int i13) {
        return resources.getResourcePackageName(i11) + '-' + str + '-' + i12 + '-' + i11 + '-' + i13;
    }

    public static Typeface f(Resources resources, int i11, String str, int i12, int i13) {
        return f9281b.get(e(resources, i11, str, i12, i13));
    }

    private static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}

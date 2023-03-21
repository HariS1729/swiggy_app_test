package c7;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import b7.c;
import coil.request.CachePolicy;
import coil.size.Precision;
import coil.size.ViewSizeResolver;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.CoroutineDispatcher;
import x6.g;
import y6.d;
import z6.b;

/* compiled from: Requests.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final x6.a f12852a = new x6.a((CoroutineDispatcher) null, (CoroutineDispatcher) null, (CoroutineDispatcher) null, (CoroutineDispatcher) null, (c.a) null, (Precision) null, (Bitmap.Config) null, false, false, (Drawable) null, (Drawable) null, (Drawable) null, (CachePolicy) null, (CachePolicy) null, (CachePolicy) null, 32767, (i) null);

    /* compiled from: Requests.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12853a;

        static {
            int[] iArr = new int[Precision.values().length];
            iArr[Precision.EXACT.ordinal()] = 1;
            iArr[Precision.INEXACT.ordinal()] = 2;
            iArr[Precision.AUTOMATIC.ordinal()] = 3;
            f12853a = iArr;
        }
    }

    public static final boolean a(g gVar) {
        int i11 = a.f12853a[gVar.H().ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            } else if ((gVar.q().m() != null || !(gVar.K() instanceof d)) && (!(gVar.M() instanceof b) || !(gVar.K() instanceof ViewSizeResolver) || !(((b) gVar.M()).c() instanceof ImageView) || ((b) gVar.M()).c() != ((ViewSizeResolver) gVar.K()).c())) {
                return false;
            }
        }
        return true;
    }

    public static final x6.a b() {
        return f12852a;
    }

    public static final Drawable c(g gVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return d.a(gVar.l(), num.intValue());
    }
}

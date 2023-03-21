package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources */
class n0 extends f0 {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f2218b;

    public n0(Context context, Resources resources) {
        super(resources);
        this.f2218b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i11) throws Resources.NotFoundException {
        Drawable a11 = a(i11);
        Context context = (Context) this.f2218b.get();
        if (!(a11 == null || context == null)) {
            e0.h().x(context, i11, a11);
        }
        return a11;
    }
}

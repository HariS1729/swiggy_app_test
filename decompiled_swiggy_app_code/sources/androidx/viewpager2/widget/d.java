package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* compiled from: PageTransformerAdapter */
final class d extends ViewPager2.i {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayoutManager f12253a;

    /* renamed from: b  reason: collision with root package name */
    private ViewPager2.k f12254b;

    d(LinearLayoutManager linearLayoutManager) {
        this.f12253a = linearLayoutManager;
    }

    public void a(int i11) {
    }

    public void b(int i11, float f11, int i12) {
        if (this.f12254b != null) {
            float f12 = -f11;
            int i13 = 0;
            while (i13 < this.f12253a.U()) {
                View T = this.f12253a.T(i13);
                if (T != null) {
                    this.f12254b.a(T, ((float) (this.f12253a.o0(T) - i11)) + f12);
                    i13++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i13), Integer.valueOf(this.f12253a.U())}));
                }
            }
        }
    }

    public void c(int i11) {
    }

    /* access modifiers changed from: package-private */
    public ViewPager2.k d() {
        return this.f12254b;
    }

    /* access modifiers changed from: package-private */
    public void e(ViewPager2.k kVar) {
        this.f12254b = kVar;
    }
}

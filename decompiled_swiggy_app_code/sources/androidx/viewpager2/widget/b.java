package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* compiled from: CompositeOnPageChangeCallback */
final class b extends ViewPager2.i {

    /* renamed from: a  reason: collision with root package name */
    private final List<ViewPager2.i> f12249a;

    b(int i11) {
        this.f12249a = new ArrayList(i11);
    }

    private void f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    public void a(int i11) {
        try {
            for (ViewPager2.i a11 : this.f12249a) {
                a11.a(i11);
            }
        } catch (ConcurrentModificationException e11) {
            f(e11);
        }
    }

    public void b(int i11, float f11, int i12) {
        try {
            for (ViewPager2.i b11 : this.f12249a) {
                b11.b(i11, f11, i12);
            }
        } catch (ConcurrentModificationException e11) {
            f(e11);
        }
    }

    public void c(int i11) {
        try {
            for (ViewPager2.i c11 : this.f12249a) {
                c11.c(i11);
            }
        } catch (ConcurrentModificationException e11) {
            f(e11);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(ViewPager2.i iVar) {
        this.f12249a.add(iVar);
    }

    /* access modifiers changed from: package-private */
    public void e(ViewPager2.i iVar) {
        this.f12249a.remove(iVar);
    }
}

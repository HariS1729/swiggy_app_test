package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PagerAdapter */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final DataSetObservable f12180a = new DataSetObservable();

    /* renamed from: b  reason: collision with root package name */
    private DataSetObserver f12181b;

    public abstract void a(ViewGroup viewGroup, int i11, Object obj);

    @Deprecated
    public void b(View view) {
    }

    public void c(ViewGroup viewGroup) {
        b(viewGroup);
    }

    public abstract int d();

    public int e(Object obj) {
        return -1;
    }

    public CharSequence f(int i11) {
        return null;
    }

    public float g(int i11) {
        return 1.0f;
    }

    public abstract Object h(ViewGroup viewGroup, int i11);

    public abstract boolean i(View view, Object obj);

    public void j() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f12181b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f12180a.notifyChanged();
    }

    public void k(DataSetObserver dataSetObserver) {
        this.f12180a.registerObserver(dataSetObserver);
    }

    public void l(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable m() {
        return null;
    }

    @Deprecated
    public void n(View view, int i11, Object obj) {
    }

    public void o(ViewGroup viewGroup, int i11, Object obj) {
        n(viewGroup, i11, obj);
    }

    /* access modifiers changed from: package-private */
    public void p(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f12181b = dataSetObserver;
        }
    }

    @Deprecated
    public void q(View view) {
    }

    public void r(ViewGroup viewGroup) {
        q(viewGroup);
    }

    public void s(DataSetObserver dataSetObserver) {
        this.f12180a.unregisterObserver(dataSetObserver);
    }
}

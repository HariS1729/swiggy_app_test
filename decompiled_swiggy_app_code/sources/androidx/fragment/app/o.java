package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.a;
import com.xiaomi.mipush.sdk.Constants;

@Deprecated
/* compiled from: FragmentPagerAdapter */
public abstract class o extends a {

    /* renamed from: c  reason: collision with root package name */
    private final FragmentManager f10498c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10499d;

    /* renamed from: e  reason: collision with root package name */
    private s f10500e;

    /* renamed from: f  reason: collision with root package name */
    private Fragment f10501f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10502g;

    @Deprecated
    public o(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    private static String v(int i11, long j) {
        return "android:switcher:" + i11 + Constants.COLON_SEPARATOR + j;
    }

    public void a(ViewGroup viewGroup, int i11, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f10500e == null) {
            this.f10500e = this.f10498c.n();
        }
        this.f10500e.n(fragment);
        if (fragment.equals(this.f10501f)) {
            this.f10501f = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void c(ViewGroup viewGroup) {
        s sVar = this.f10500e;
        if (sVar != null) {
            if (!this.f10502g) {
                try {
                    this.f10502g = true;
                    sVar.m();
                    this.f10502g = false;
                } catch (Throwable th2) {
                    this.f10502g = false;
                    throw th2;
                }
            }
            this.f10500e = null;
        }
    }

    public Object h(ViewGroup viewGroup, int i11) {
        if (this.f10500e == null) {
            this.f10500e = this.f10498c.n();
        }
        long u11 = u(i11);
        Fragment k02 = this.f10498c.k0(v(viewGroup.getId(), u11));
        if (k02 != null) {
            this.f10500e.i(k02);
        } else {
            k02 = t(i11);
            this.f10500e.c(viewGroup.getId(), k02, v(viewGroup.getId(), u11));
        }
        if (k02 != this.f10501f) {
            k02.setMenuVisibility(false);
            if (this.f10499d == 1) {
                this.f10500e.y(k02, Lifecycle.State.STARTED);
            } else {
                k02.setUserVisibleHint(false);
            }
        }
        return k02;
    }

    public boolean i(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public void l(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable m() {
        return null;
    }

    public void o(ViewGroup viewGroup, int i11, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f10501f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f10499d == 1) {
                    if (this.f10500e == null) {
                        this.f10500e = this.f10498c.n();
                    }
                    this.f10500e.y(this.f10501f, Lifecycle.State.STARTED);
                } else {
                    this.f10501f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f10499d == 1) {
                if (this.f10500e == null) {
                    this.f10500e = this.f10498c.n();
                }
                this.f10500e.y(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f10501f = fragment;
        }
    }

    public void r(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public abstract Fragment t(int i11);

    public long u(int i11) {
        return (long) i11;
    }

    public o(FragmentManager fragmentManager, int i11) {
        this.f10500e = null;
        this.f10501f = null;
        this.f10498c = fragmentManager;
        this.f10499d = i11;
    }
}

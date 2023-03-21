package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.collection.e;
import androidx.core.util.g;
import androidx.core.view.a0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public abstract class FragmentStateAdapter extends RecyclerView.Adapter<a> implements b {

    /* renamed from: a  reason: collision with root package name */
    final Lifecycle f12182a;

    /* renamed from: b  reason: collision with root package name */
    final FragmentManager f12183b;

    /* renamed from: c  reason: collision with root package name */
    final e<Fragment> f12184c;

    /* renamed from: d  reason: collision with root package name */
    private final e<Fragment.SavedState> f12185d;

    /* renamed from: e  reason: collision with root package name */
    private final e<Integer> f12186e;

    /* renamed from: f  reason: collision with root package name */
    private FragmentMaxLifecycleEnforcer f12187f;

    /* renamed from: g  reason: collision with root package name */
    boolean f12188g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12189h;

    class FragmentMaxLifecycleEnforcer {

        /* renamed from: a  reason: collision with root package name */
        private ViewPager2.i f12195a;

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView.i f12196b;

        /* renamed from: c  reason: collision with root package name */
        private o f12197c;

        /* renamed from: d  reason: collision with root package name */
        private ViewPager2 f12198d;

        /* renamed from: e  reason: collision with root package name */
        private long f12199e = -1;

        class a extends ViewPager2.i {
            a() {
            }

            public void a(int i11) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }

            public void c(int i11) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }
        }

        class b extends d {
            b() {
                super((a) null);
            }

            public void a() {
                FragmentMaxLifecycleEnforcer.this.d(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
        }

        private ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* access modifiers changed from: package-private */
        public void b(RecyclerView recyclerView) {
            this.f12198d = a(recyclerView);
            a aVar = new a();
            this.f12195a = aVar;
            this.f12198d.g(aVar);
            b bVar = new b();
            this.f12196b = bVar;
            FragmentStateAdapter.this.registerAdapterDataObserver(bVar);
            AnonymousClass3 r22 = new o() {
                public void b(r rVar, Lifecycle.Event event) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.f12197c = r22;
            FragmentStateAdapter.this.f12182a.a(r22);
        }

        /* access modifiers changed from: package-private */
        public void c(RecyclerView recyclerView) {
            a(recyclerView).n(this.f12195a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f12196b);
            FragmentStateAdapter.this.f12182a.c(this.f12197c);
            this.f12198d = null;
        }

        /* access modifiers changed from: package-private */
        public void d(boolean z11) {
            int currentItem;
            Fragment i11;
            if (!FragmentStateAdapter.this.w() && this.f12198d.getScrollState() == 0 && !FragmentStateAdapter.this.f12184c.l() && FragmentStateAdapter.this.getItemCount() != 0 && (currentItem = this.f12198d.getCurrentItem()) < FragmentStateAdapter.this.getItemCount()) {
                long itemId = FragmentStateAdapter.this.getItemId(currentItem);
                if ((itemId != this.f12199e || z11) && (i11 = FragmentStateAdapter.this.f12184c.i(itemId)) != null && i11.isAdded()) {
                    this.f12199e = itemId;
                    s n = FragmentStateAdapter.this.f12183b.n();
                    Fragment fragment = null;
                    for (int i12 = 0; i12 < FragmentStateAdapter.this.f12184c.q(); i12++) {
                        long m11 = FragmentStateAdapter.this.f12184c.m(i12);
                        Fragment r11 = FragmentStateAdapter.this.f12184c.r(i12);
                        if (r11.isAdded()) {
                            if (m11 != this.f12199e) {
                                n.y(r11, Lifecycle.State.STARTED);
                            } else {
                                fragment = r11;
                            }
                            r11.setMenuVisibility(m11 == this.f12199e);
                        }
                    }
                    if (fragment != null) {
                        n.y(fragment, Lifecycle.State.RESUMED);
                    }
                    if (!n.r()) {
                        n.l();
                    }
                }
            }
        }
    }

    class a implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FrameLayout f12204a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f12205b;

        a(FrameLayout frameLayout, a aVar) {
            this.f12204a = frameLayout;
            this.f12205b = aVar;
        }

        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            if (this.f12204a.getParent() != null) {
                this.f12204a.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.s(this.f12205b);
            }
        }
    }

    class b extends FragmentManager.FragmentLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f12207a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FrameLayout f12208b;

        b(Fragment fragment, FrameLayout frameLayout) {
            this.f12207a = fragment;
            this.f12208b = frameLayout;
        }

        public void m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f12207a) {
                fragmentManager.C1(this);
                FragmentStateAdapter.this.a(view, this.f12208b);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f12188g = false;
            fragmentStateAdapter.i();
        }
    }

    private static abstract class d extends RecyclerView.i {
        private d() {
        }

        public abstract void a();

        public final void b(int i11, int i12) {
            a();
        }

        public final void c(int i11, int i12, Object obj) {
            a();
        }

        public final void d(int i11, int i12) {
            a();
        }

        public final void e(int i11, int i12, int i13) {
            a();
        }

        public final void f(int i11, int i12) {
            a();
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    public FragmentStateAdapter(FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    private static String g(String str, long j) {
        return str + j;
    }

    private void h(int i11) {
        long itemId = getItemId(i11);
        if (!this.f12184c.g(itemId)) {
            Fragment f11 = f(i11);
            f11.setInitialSavedState(this.f12185d.i(itemId));
            this.f12184c.n(itemId, f11);
        }
    }

    private boolean j(long j) {
        View view;
        if (this.f12186e.g(j)) {
            return true;
        }
        Fragment i11 = this.f12184c.i(j);
        if (i11 == null || (view = i11.getView()) == null || view.getParent() == null) {
            return false;
        }
        return true;
    }

    private static boolean k(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long l(int i11) {
        Long l11 = null;
        for (int i12 = 0; i12 < this.f12186e.q(); i12++) {
            if (this.f12186e.r(i12).intValue() == i11) {
                if (l11 == null) {
                    l11 = Long.valueOf(this.f12186e.m(i12));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l11;
    }

    private static long r(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void t(long j) {
        ViewParent parent;
        Fragment i11 = this.f12184c.i(j);
        if (i11 != null) {
            if (!(i11.getView() == null || (parent = i11.getView().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            if (!b(j)) {
                this.f12185d.o(j);
            }
            if (!i11.isAdded()) {
                this.f12184c.o(j);
            } else if (w()) {
                this.f12189h = true;
            } else {
                if (i11.isAdded() && b(j)) {
                    this.f12185d.n(j, this.f12183b.r1(i11));
                }
                this.f12183b.n().s(i11).l();
                this.f12184c.o(j);
            }
        }
    }

    private void u() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final c cVar = new c();
        this.f12182a.a(new o() {
            public void b(r rVar, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    rVar.getLifecycle().c(this);
                }
            }
        });
        handler.postDelayed(cVar, 10000);
    }

    private void v(Fragment fragment, FrameLayout frameLayout) {
        this.f12183b.i1(new b(fragment, frameLayout), false);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public boolean b(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    public final Parcelable c() {
        Bundle bundle = new Bundle(this.f12184c.q() + this.f12185d.q());
        for (int i11 = 0; i11 < this.f12184c.q(); i11++) {
            long m11 = this.f12184c.m(i11);
            Fragment i12 = this.f12184c.i(m11);
            if (i12 != null && i12.isAdded()) {
                this.f12183b.h1(bundle, g("f#", m11), i12);
            }
        }
        for (int i13 = 0; i13 < this.f12185d.q(); i13++) {
            long m12 = this.f12185d.m(i13);
            if (b(m12)) {
                bundle.putParcelable(g("s#", m12), this.f12185d.i(m12));
            }
        }
        return bundle;
    }

    public final void e(Parcelable parcelable) {
        if (!this.f12185d.l() || !this.f12184c.l()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (k(str, "f#")) {
                this.f12184c.n(r(str, "f#"), this.f12183b.s0(bundle, str));
            } else if (k(str, "s#")) {
                long r11 = r(str, "s#");
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (b(r11)) {
                    this.f12185d.n(r11, savedState);
                }
            } else {
                throw new IllegalArgumentException("Unexpected key in savedState: " + str);
            }
        }
        if (!this.f12184c.l()) {
            this.f12189h = true;
            this.f12188g = true;
            i();
            u();
        }
    }

    public abstract Fragment f(int i11);

    public long getItemId(int i11) {
        return (long) i11;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (this.f12189h && !w()) {
            androidx.collection.b<Long> bVar = new androidx.collection.b<>();
            for (int i11 = 0; i11 < this.f12184c.q(); i11++) {
                long m11 = this.f12184c.m(i11);
                if (!b(m11)) {
                    bVar.add(Long.valueOf(m11));
                    this.f12186e.o(m11);
                }
            }
            if (!this.f12188g) {
                this.f12189h = false;
                for (int i12 = 0; i12 < this.f12184c.q(); i12++) {
                    long m12 = this.f12184c.m(i12);
                    if (!j(m12)) {
                        bVar.add(Long.valueOf(m12));
                    }
                }
            }
            for (Long longValue : bVar) {
                t(longValue.longValue());
            }
        }
    }

    /* renamed from: m */
    public final void onBindViewHolder(a aVar, int i11) {
        long itemId = aVar.getItemId();
        int id2 = aVar.b().getId();
        Long l11 = l(id2);
        if (!(l11 == null || l11.longValue() == itemId)) {
            t(l11.longValue());
            this.f12186e.o(l11.longValue());
        }
        this.f12186e.n(itemId, Integer.valueOf(id2));
        h(i11);
        FrameLayout b11 = aVar.b();
        if (a0.Z(b11)) {
            if (b11.getParent() == null) {
                b11.addOnLayoutChangeListener(new a(b11, aVar));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        i();
    }

    /* renamed from: n */
    public final a onCreateViewHolder(ViewGroup viewGroup, int i11) {
        return a.a(viewGroup);
    }

    /* renamed from: o */
    public final boolean onFailedToRecycleView(a aVar) {
        return true;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        g.a(this.f12187f == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f12187f = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.b(recyclerView);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f12187f.c(recyclerView);
        this.f12187f = null;
    }

    /* renamed from: p */
    public final void onViewAttachedToWindow(a aVar) {
        s(aVar);
        i();
    }

    /* renamed from: q */
    public final void onViewRecycled(a aVar) {
        Long l11 = l(aVar.b().getId());
        if (l11 != null) {
            t(l11.longValue());
            this.f12186e.o(l11.longValue());
        }
    }

    /* access modifiers changed from: package-private */
    public void s(final a aVar) {
        Fragment i11 = this.f12184c.i(aVar.getItemId());
        if (i11 != null) {
            FrameLayout b11 = aVar.b();
            View view = i11.getView();
            if (!i11.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            } else if (i11.isAdded() && view == null) {
                v(i11, b11);
            } else if (!i11.isAdded() || view.getParent() == null) {
                if (i11.isAdded()) {
                    a(view, b11);
                } else if (!w()) {
                    v(i11, b11);
                    s n = this.f12183b.n();
                    n.e(i11, "f" + aVar.getItemId()).y(i11, Lifecycle.State.STARTED).l();
                    this.f12187f.d(false);
                } else if (!this.f12183b.I0()) {
                    this.f12182a.a(new o() {
                        public void b(r rVar, Lifecycle.Event event) {
                            if (!FragmentStateAdapter.this.w()) {
                                rVar.getLifecycle().c(this);
                                if (a0.Z(aVar.b())) {
                                    FragmentStateAdapter.this.s(aVar);
                                }
                            }
                        }
                    });
                }
            } else if (view.getParent() != b11) {
                a(view, b11);
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    public final void setHasStableIds(boolean z11) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    /* access modifiers changed from: package-private */
    public boolean w() {
        return this.f12183b.O0();
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        this.f12184c = new e<>();
        this.f12185d = new e<>();
        this.f12186e = new e<>();
        this.f12188g = false;
        this.f12189h = false;
        this.f12183b = fragmentManager;
        this.f12182a = lifecycle;
        super.setHasStableIds(true);
    }
}

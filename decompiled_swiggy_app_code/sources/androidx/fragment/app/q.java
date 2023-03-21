package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.a0;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.p0;

/* compiled from: FragmentStateManager */
class q {

    /* renamed from: a  reason: collision with root package name */
    private final k f10503a;

    /* renamed from: b  reason: collision with root package name */
    private final r f10504b;

    /* renamed from: c  reason: collision with root package name */
    private final Fragment f10505c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10506d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f10507e = -1;

    /* compiled from: FragmentStateManager */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f10508a;

        a(View view) {
            this.f10508a = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f10508a.removeOnAttachStateChangeListener(this);
            a0.t0(this.f10508a);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: FragmentStateManager */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10510a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10510a = r0
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10510a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10510a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10510a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q.b.<clinit>():void");
        }
    }

    q(k kVar, r rVar, Fragment fragment) {
        this.f10503a = kVar;
        this.f10504b = rVar;
        this.f10505c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f10505c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f10505c.mView) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f10505c.performSaveInstanceState(bundle);
        this.f10503a.j(this.f10505c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f10505c.mView != null) {
            t();
        }
        if (this.f10505c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f10505c.mSavedViewState);
        }
        if (this.f10505c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f10505c.mSavedViewRegistryState);
        }
        if (!this.f10505c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f10505c.mUserVisibleHint);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f10505c);
        }
        Fragment fragment = this.f10505c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        k kVar = this.f10503a;
        Fragment fragment2 = this.f10505c;
        kVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int j = this.f10504b.j(this.f10505c);
        Fragment fragment = this.f10505c;
        fragment.mContainer.addView(fragment.mView, j);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f10505c);
        }
        Fragment fragment = this.f10505c;
        Fragment fragment2 = fragment.mTarget;
        q qVar = null;
        if (fragment2 != null) {
            q m11 = this.f10504b.m(fragment2.mWho);
            if (m11 != null) {
                Fragment fragment3 = this.f10505c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                qVar = m11;
            } else {
                throw new IllegalStateException("Fragment " + this.f10505c + " declared target fragment " + this.f10505c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (qVar = this.f10504b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f10505c + " declared target fragment " + this.f10505c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (qVar != null && (FragmentManager.P || qVar.k().mState < 1)) {
            qVar.m();
        }
        Fragment fragment4 = this.f10505c;
        fragment4.mHost = fragment4.mFragmentManager.x0();
        Fragment fragment5 = this.f10505c;
        fragment5.mParentFragment = fragment5.mFragmentManager.A0();
        this.f10503a.g(this.f10505c, false);
        this.f10505c.performAttach();
        this.f10503a.b(this.f10505c, false);
    }

    /* access modifiers changed from: package-private */
    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f10505c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int i11 = this.f10507e;
        int i12 = b.f10510a[fragment2.mMaxState.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                i11 = Math.min(i11, 5);
            } else if (i12 == 3) {
                i11 = Math.min(i11, 1);
            } else if (i12 != 4) {
                i11 = Math.min(i11, -1);
            } else {
                i11 = Math.min(i11, 0);
            }
        }
        Fragment fragment3 = this.f10505c;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                i11 = Math.max(this.f10507e, 2);
                View view = this.f10505c.mView;
                if (view != null && view.getParent() == null) {
                    i11 = Math.min(i11, 2);
                }
            } else {
                i11 = this.f10507e < 4 ? Math.min(i11, fragment3.mState) : Math.min(i11, 1);
            }
        }
        if (!this.f10505c.mAdded) {
            i11 = Math.min(i11, 1);
        }
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = null;
        if (FragmentManager.P && (viewGroup = fragment.mContainer) != null) {
            lifecycleImpact = SpecialEffectsController.n(viewGroup, (fragment = this.f10505c).getParentFragmentManager()).l(this);
        }
        if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            i11 = Math.min(i11, 6);
        } else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            i11 = Math.max(i11, 3);
        } else {
            Fragment fragment4 = this.f10505c;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i11 = Math.min(i11, 1);
                } else {
                    i11 = Math.min(i11, -1);
                }
            }
        }
        Fragment fragment5 = this.f10505c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i11 = Math.min(i11, 4);
        }
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i11 + " for " + this.f10505c);
        }
        return i11;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f10505c);
        }
        Fragment fragment = this.f10505c;
        if (!fragment.mIsCreated) {
            this.f10503a.h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f10505c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            k kVar = this.f10503a;
            Fragment fragment3 = this.f10505c;
            kVar.c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f10505c.mState = 1;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        String str;
        if (!this.f10505c.mFromLayout) {
            if (FragmentManager.J0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f10505c);
            }
            Fragment fragment = this.f10505c;
            LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f10505c;
            ViewGroup viewGroup2 = fragment2.mContainer;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i11 = fragment2.mContainerId;
                if (i11 != 0) {
                    if (i11 != -1) {
                        viewGroup = (ViewGroup) fragment2.mFragmentManager.r0().c(this.f10505c.mContainerId);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f10505c;
                            if (!fragment3.mRestored) {
                                try {
                                    str = fragment3.getResources().getResourceName(this.f10505c.mContainerId);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f10505c.mContainerId) + " (" + str + ") for fragment " + this.f10505c);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f10505c + " for a container view with no id");
                    }
                }
            }
            Fragment fragment4 = this.f10505c;
            fragment4.mContainer = viewGroup;
            fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
            View view = this.f10505c.mView;
            if (view != null) {
                boolean z11 = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.f10505c;
                fragment5.mView.setTag(R.id.fragment_container_view_tag, fragment5);
                if (viewGroup != null) {
                    b();
                }
                Fragment fragment6 = this.f10505c;
                if (fragment6.mHidden) {
                    fragment6.mView.setVisibility(8);
                }
                if (a0.Z(this.f10505c.mView)) {
                    a0.t0(this.f10505c.mView);
                } else {
                    View view2 = this.f10505c.mView;
                    view2.addOnAttachStateChangeListener(new a(view2));
                }
                this.f10505c.performViewCreated();
                k kVar = this.f10503a;
                Fragment fragment7 = this.f10505c;
                kVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
                int visibility = this.f10505c.mView.getVisibility();
                float alpha = this.f10505c.mView.getAlpha();
                if (FragmentManager.P) {
                    this.f10505c.setPostOnViewCreatedAlpha(alpha);
                    Fragment fragment8 = this.f10505c;
                    if (fragment8.mContainer != null && visibility == 0) {
                        View findFocus = fragment8.mView.findFocus();
                        if (findFocus != null) {
                            this.f10505c.setFocusedView(findFocus);
                            if (FragmentManager.J0(2)) {
                                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f10505c);
                            }
                        }
                        this.f10505c.mView.setAlpha(0.0f);
                    }
                } else {
                    Fragment fragment9 = this.f10505c;
                    if (visibility == 0 && fragment9.mContainer != null) {
                        z11 = true;
                    }
                    fragment9.mIsNewlyAdded = z11;
                }
            }
            this.f10505c.mState = 2;
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        Fragment f11;
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f10505c);
        }
        Fragment fragment = this.f10505c;
        boolean z11 = true;
        boolean z12 = fragment.mRemoving && !fragment.isInBackStack();
        if (z12 || this.f10504b.o().u1(this.f10505c)) {
            h<?> hVar = this.f10505c.mHost;
            if (hVar instanceof p0) {
                z11 = this.f10504b.o().r1();
            } else if (hVar.f() instanceof Activity) {
                z11 = true ^ ((Activity) hVar.f()).isChangingConfigurations();
            }
            if (z12 || z11) {
                this.f10504b.o().l1(this.f10505c);
            }
            this.f10505c.performDestroy();
            this.f10503a.d(this.f10505c, false);
            for (q next : this.f10504b.k()) {
                if (next != null) {
                    Fragment k = next.k();
                    if (this.f10505c.mWho.equals(k.mTargetWho)) {
                        k.mTarget = this.f10505c;
                        k.mTargetWho = null;
                    }
                }
            }
            Fragment fragment2 = this.f10505c;
            String str = fragment2.mTargetWho;
            if (str != null) {
                fragment2.mTarget = this.f10504b.f(str);
            }
            this.f10504b.q(this);
            return;
        }
        String str2 = this.f10505c.mTargetWho;
        if (!(str2 == null || (f11 = this.f10504b.f(str2)) == null || !f11.mRetainInstance)) {
            this.f10505c.mTarget = f11;
        }
        this.f10505c.mState = 0;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        View view;
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f10505c);
        }
        Fragment fragment = this.f10505c;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.f10505c.performDestroyView();
        this.f10503a.n(this.f10505c, false);
        Fragment fragment2 = this.f10505c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.q(null);
        this.f10505c.mInLayout = false;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f10505c);
        }
        this.f10505c.performDetach();
        boolean z11 = false;
        this.f10503a.e(this.f10505c, false);
        Fragment fragment = this.f10505c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z11 = true;
        }
        if (z11 || this.f10504b.o().u1(this.f10505c)) {
            if (FragmentManager.J0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f10505c);
            }
            this.f10505c.initState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        Fragment fragment = this.f10505c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.J0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f10505c);
            }
            Fragment fragment2 = this.f10505c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), (ViewGroup) null, this.f10505c.mSavedFragmentState);
            View view = this.f10505c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f10505c;
                fragment3.mView.setTag(R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f10505c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f10505c.performViewCreated();
                k kVar = this.f10503a;
                Fragment fragment5 = this.f10505c;
                kVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f10505c.mState = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment k() {
        return this.f10505c;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f10506d) {
            boolean z11 = false;
            z11 = true;
            try {
                while (true) {
                    int d11 = d();
                    Fragment fragment = this.f10505c;
                    int i11 = fragment.mState;
                    if (d11 != i11) {
                        if (d11 <= i11) {
                            switch (i11 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f10505c.mState = z11 ? 1 : 0;
                                    break;
                                case 2:
                                    fragment.mInLayout = z11;
                                    fragment.mState = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.J0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f10505c);
                                    }
                                    Fragment fragment2 = this.f10505c;
                                    if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                        t();
                                    }
                                    Fragment fragment3 = this.f10505c;
                                    if (!(fragment3.mView == null || (viewGroup2 = fragment3.mContainer) == null)) {
                                        SpecialEffectsController.n(viewGroup2, fragment3.getParentFragmentManager()).d(this);
                                    }
                                    this.f10505c.mState = 3;
                                    break;
                                case 4:
                                    w();
                                    break;
                                case 5:
                                    fragment.mState = 5;
                                    break;
                                case 6:
                                    n();
                                    break;
                            }
                        } else {
                            switch (i11 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(fragment.mView == null || (viewGroup3 = fragment.mContainer) == null)) {
                                        SpecialEffectsController.n(viewGroup3, fragment.getParentFragmentManager()).b(SpecialEffectsController.Operation.State.from(this.f10505c.mView.getVisibility()), this);
                                    }
                                    this.f10505c.mState = 4;
                                    break;
                                case 5:
                                    v();
                                    break;
                                case 6:
                                    fragment.mState = 6;
                                    break;
                                case 7:
                                    p();
                                    break;
                            }
                        }
                    } else {
                        if (FragmentManager.P && fragment.mHiddenChanged) {
                            if (!(fragment.mView == null || (viewGroup = fragment.mContainer) == null)) {
                                SpecialEffectsController n = SpecialEffectsController.n(viewGroup, fragment.getParentFragmentManager());
                                if (this.f10505c.mHidden) {
                                    n.c(this);
                                } else {
                                    n.e(this);
                                }
                            }
                            Fragment fragment4 = this.f10505c;
                            FragmentManager fragmentManager = fragment4.mFragmentManager;
                            if (fragmentManager != null) {
                                fragmentManager.H0(fragment4);
                            }
                            Fragment fragment5 = this.f10505c;
                            fragment5.mHiddenChanged = z11;
                            fragment5.onHiddenChanged(fragment5.mHidden);
                        }
                        this.f10506d = z11;
                        return;
                    }
                }
            } finally {
                this.f10506d = z11;
            }
        } else if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f10505c);
        }
        this.f10505c.performPause();
        this.f10503a.f(this.f10505c, false);
    }

    /* access modifiers changed from: package-private */
    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f10505c.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f10505c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f10505c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f10505c;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
            Fragment fragment4 = this.f10505c;
            if (fragment4.mTargetWho != null) {
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f10505c;
            Boolean bool = fragment5.mSavedUserVisibleHint;
            if (bool != null) {
                fragment5.mUserVisibleHint = bool.booleanValue();
                this.f10505c.mSavedUserVisibleHint = null;
            } else {
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f10505c;
            if (!fragment6.mUserVisibleHint) {
                fragment6.mDeferStart = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f10505c);
        }
        View focusedView = this.f10505c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.J0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f10505c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f10505c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f10505c.setFocusedView((View) null);
        this.f10505c.performResume();
        this.f10503a.i(this.f10505c, false);
        Fragment fragment = this.f10505c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* access modifiers changed from: package-private */
    public Fragment.SavedState r() {
        Bundle q;
        if (this.f10505c.mState <= -1 || (q = q()) == null) {
            return null;
        }
        return new Fragment.SavedState(q);
    }

    /* access modifiers changed from: package-private */
    public FragmentState s() {
        FragmentState fragmentState = new FragmentState(this.f10505c);
        Fragment fragment = this.f10505c;
        if (fragment.mState <= -1 || fragmentState.f10389m != null) {
            fragmentState.f10389m = fragment.mSavedFragmentState;
        } else {
            Bundle q = q();
            fragmentState.f10389m = q;
            if (this.f10505c.mTargetWho != null) {
                if (q == null) {
                    fragmentState.f10389m = new Bundle();
                }
                fragmentState.f10389m.putString("android:target_state", this.f10505c.mTargetWho);
                int i11 = this.f10505c.mTargetRequestCode;
                if (i11 != 0) {
                    fragmentState.f10389m.putInt("android:target_req_state", i11);
                }
            }
        }
        return fragmentState;
    }

    /* access modifiers changed from: package-private */
    public void t() {
        if (this.f10505c.mView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f10505c.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f10505c.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f10505c.mViewLifecycleOwner.e(bundle);
            if (!bundle.isEmpty()) {
                this.f10505c.mSavedViewRegistryState = bundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u(int i11) {
        this.f10507e = i11;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f10505c);
        }
        this.f10505c.performStart();
        this.f10503a.k(this.f10505c, false);
    }

    /* access modifiers changed from: package-private */
    public void w() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f10505c);
        }
        this.f10505c.performStop();
        this.f10503a.l(this.f10505c, false);
    }

    q(k kVar, r rVar, ClassLoader classLoader, g gVar, FragmentState fragmentState) {
        this.f10503a = kVar;
        this.f10504b = rVar;
        Fragment a11 = gVar.a(classLoader, fragmentState.f10379a);
        this.f10505c = a11;
        Bundle bundle = fragmentState.j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a11.setArguments(fragmentState.j);
        a11.mWho = fragmentState.f10380b;
        a11.mFromLayout = fragmentState.f10381c;
        a11.mRestored = true;
        a11.mFragmentId = fragmentState.f10382d;
        a11.mContainerId = fragmentState.f10383e;
        a11.mTag = fragmentState.f10384f;
        a11.mRetainInstance = fragmentState.f10385g;
        a11.mRemoving = fragmentState.f10386h;
        a11.mDetached = fragmentState.f10387i;
        a11.mHidden = fragmentState.k;
        a11.mMaxState = Lifecycle.State.values()[fragmentState.f10388l];
        Bundle bundle2 = fragmentState.f10389m;
        if (bundle2 != null) {
            a11.mSavedFragmentState = bundle2;
        } else {
            a11.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a11);
        }
    }

    q(k kVar, r rVar, Fragment fragment, FragmentState fragmentState) {
        this.f10503a = kVar;
        this.f10504b = rVar;
        this.f10505c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f10389m;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}

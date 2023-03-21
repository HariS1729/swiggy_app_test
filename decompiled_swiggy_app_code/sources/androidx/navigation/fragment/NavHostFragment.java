package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.NavController;
import androidx.navigation.R;
import androidx.navigation.fragment.b;
import androidx.navigation.q;
import androidx.navigation.v;
import androidx.navigation.w;

public class NavHostFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private q f10889a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f10890b = null;

    /* renamed from: c  reason: collision with root package name */
    private View f10891c;

    /* renamed from: d  reason: collision with root package name */
    private int f10892d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10893e;

    public static NavController d0(Fragment fragment) {
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).g0();
            }
            Fragment B0 = fragment2.getParentFragmentManager().B0();
            if (B0 instanceof NavHostFragment) {
                return ((NavHostFragment) B0).g0();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return v.a(view);
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
    }

    private int f0() {
        int id2 = getId();
        if (id2 == 0 || id2 == -1) {
            return R.id.nav_host_fragment_container;
        }
        return id2;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public w<? extends b.a> c0() {
        return new b(requireContext(), getChildFragmentManager(), f0());
    }

    public final NavController g0() {
        q qVar = this.f10889a;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    /* access modifiers changed from: protected */
    public void h0(NavController navController) {
        navController.l().a(new DialogFragmentNavigator(requireContext(), getChildFragmentManager()));
        navController.l().a(c0());
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.f10893e) {
            getParentFragmentManager().n().z(this).j();
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        q qVar = new q(requireContext());
        this.f10889a = qVar;
        qVar.D(this);
        this.f10889a.E(requireActivity().getOnBackPressedDispatcher());
        q qVar2 = this.f10889a;
        Boolean bool = this.f10890b;
        int i11 = 0;
        qVar2.b(bool != null && bool.booleanValue());
        Bundle bundle3 = null;
        this.f10890b = null;
        this.f10889a.F(getViewModelStore());
        h0(this.f10889a);
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f10893e = true;
                getParentFragmentManager().n().z(this).j();
            }
            this.f10892d = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            this.f10889a.x(bundle2);
        }
        int i12 = this.f10892d;
        if (i12 != 0) {
            this.f10889a.z(i12);
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            i11 = arguments.getInt("android-support-nav:fragment:graphId");
        }
        if (arguments != null) {
            bundle3 = arguments.getBundle("android-support-nav:fragment:startDestinationArgs");
        }
        if (i11 != 0) {
            this.f10889a.A(i11, bundle3);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(f0());
        return fragmentContainerView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        View view = this.f10891c;
        if (view != null && v.a(view) == this.f10889a) {
            v.d(this.f10891c, (NavController) null);
        }
        this.f10891c = null;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.NavHost);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.f10892d = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.NavHostFragment);
        if (obtainStyledAttributes2.getBoolean(R.styleable.NavHostFragment_defaultNavHost, false)) {
            this.f10893e = true;
        }
        obtainStyledAttributes2.recycle();
    }

    public void onPrimaryNavigationFragmentChanged(boolean z11) {
        q qVar = this.f10889a;
        if (qVar != null) {
            qVar.b(z11);
        } else {
            this.f10890b = Boolean.valueOf(z11);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle y11 = this.f10889a.y();
        if (y11 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", y11);
        }
        if (this.f10893e) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i11 = this.f10892d;
        if (i11 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i11);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            v.d(view, this.f10889a);
            if (view.getParent() != null) {
                View view2 = (View) view.getParent();
                this.f10891c = view2;
                if (view2.getId() == getId()) {
                    v.d(this.f10891c, this.f10889a);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
    }
}

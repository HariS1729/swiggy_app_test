package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R;

/* compiled from: FragmentLayoutInflaterFactory */
class j implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    final FragmentManager f10485a;

    /* compiled from: FragmentLayoutInflaterFactory */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f10486a;

        a(q qVar) {
            this.f10486a = qVar;
        }

        public void onViewAttachedToWindow(View view) {
            Fragment k = this.f10486a.k();
            this.f10486a.m();
            SpecialEffectsController.n((ViewGroup) k.mView.getParent(), j.this.f10485a).j();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    j(FragmentManager fragmentManager) {
        this.f10485a = fragmentManager;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        q qVar;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f10485a);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(R.styleable.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(R.styleable.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !g.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f10485a.j0(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f10485a.k0(string);
        }
        if (fragment == null && id2 != -1) {
            fragment = this.f10485a.j0(id2);
        }
        if (fragment == null) {
            fragment = this.f10485a.u0().a(context.getClassLoader(), attributeValue);
            fragment.mFromLayout = true;
            fragment.mFragmentId = resourceId != 0 ? resourceId : id2;
            fragment.mContainerId = id2;
            fragment.mTag = string;
            fragment.mInLayout = true;
            FragmentManager fragmentManager = this.f10485a;
            fragment.mFragmentManager = fragmentManager;
            fragment.mHost = fragmentManager.x0();
            fragment.onInflate(this.f10485a.x0().f(), attributeSet, fragment.mSavedFragmentState);
            qVar = this.f10485a.g(fragment);
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            FragmentManager fragmentManager2 = this.f10485a;
            fragment.mFragmentManager = fragmentManager2;
            fragment.mHost = fragmentManager2.x0();
            fragment.onInflate(this.f10485a.x0().f(), attributeSet, fragment.mSavedFragmentState);
            qVar = this.f10485a.x(fragment);
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
        }
        fragment.mContainer = (ViewGroup) view;
        qVar.m();
        qVar.j();
        View view2 = fragment.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            fragment.mView.addOnAttachStateChangeListener(new a(qVar));
            return fragment.mView;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}

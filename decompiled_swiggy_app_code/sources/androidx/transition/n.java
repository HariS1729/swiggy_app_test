package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* compiled from: GhostViewHolder */
class n extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f11978a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11979b = true;

    n(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f11978a = viewGroup;
        viewGroup.setTag(R.id.ghost_view_holder, this);
        m0.b(this.f11978a).c(this);
    }

    static n b(ViewGroup viewGroup) {
        return (n) viewGroup.getTag(R.id.ghost_view_holder);
    }

    private int c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i11 = 0;
        while (i11 <= childCount) {
            int i12 = (i11 + childCount) / 2;
            d(((p) getChildAt(i12)).f11990c, arrayList2);
            if (f(arrayList, arrayList2)) {
                i11 = i12 + 1;
            } else {
                childCount = i12 - 1;
            }
            arrayList2.clear();
        }
        return i11;
    }

    private static void d(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    private static boolean e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() == view2.getZ()) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(m0.a(viewGroup, i11));
                if (childAt == view) {
                    return false;
                }
                if (childAt == view2) {
                    break;
                }
            }
            return true;
        } else if (view.getZ() > view2.getZ()) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i11 = 1; i11 < min; i11++) {
            View view = arrayList.get(i11);
            View view2 = arrayList2.get(i11);
            if (view != view2) {
                return e(view, view2);
            }
        }
        if (arrayList2.size() == min) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void a(p pVar) {
        ArrayList arrayList = new ArrayList();
        d(pVar.f11990c, arrayList);
        int c11 = c(arrayList);
        if (c11 < 0 || c11 >= getChildCount()) {
            addView(pVar);
        } else {
            addView(pVar, c11);
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (this.f11979b) {
            m0.b(this.f11978a).d(this);
            m0.b(this.f11978a).c(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewAdded(View view) {
        if (this.f11979b) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f11978a.setTag(R.id.ghost_view_holder, (Object) null);
            m0.b(this.f11978a).d(this);
            this.f11979b = false;
        }
    }
}

package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator */
public abstract class u extends RecyclerView.l {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    public abstract boolean animateAdd(RecyclerView.d0 d0Var);

    public boolean animateAppearance(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i11;
        int i12;
        if (cVar == null || ((i11 = cVar.f11189a) == (i12 = cVar2.f11189a) && cVar.f11190b == cVar2.f11190b)) {
            return animateAdd(d0Var);
        }
        return animateMove(d0Var, i11, cVar.f11190b, i12, cVar2.f11190b);
    }

    public abstract boolean animateChange(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i11, int i12, int i13, int i14);

    public boolean animateChange(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i11;
        int i12;
        int i13 = cVar.f11189a;
        int i14 = cVar.f11190b;
        if (d0Var2.shouldIgnore()) {
            int i15 = cVar.f11189a;
            i11 = cVar.f11190b;
            i12 = i15;
        } else {
            i12 = cVar2.f11189a;
            i11 = cVar2.f11190b;
        }
        return animateChange(d0Var, d0Var2, i13, i14, i12, i11);
    }

    public boolean animateDisappearance(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i11 = cVar.f11189a;
        int i12 = cVar.f11190b;
        View view = d0Var.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f11189a;
        int top = cVar2 == null ? view.getTop() : cVar2.f11190b;
        if (d0Var.isRemoved() || (i11 == left && i12 == top)) {
            return animateRemove(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return animateMove(d0Var, i11, i12, left, top);
    }

    public abstract boolean animateMove(RecyclerView.d0 d0Var, int i11, int i12, int i13, int i14);

    public boolean animatePersistence(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i11 = cVar.f11189a;
        int i12 = cVar2.f11189a;
        if (i11 == i12 && cVar.f11190b == cVar2.f11190b) {
            dispatchMoveFinished(d0Var);
            return false;
        }
        return animateMove(d0Var, i11, cVar.f11190b, i12, cVar2.f11190b);
    }

    public abstract boolean animateRemove(RecyclerView.d0 d0Var);

    public boolean canReuseUpdatedViewHolder(RecyclerView.d0 d0Var) {
        return !this.mSupportsChangeAnimations || d0Var.isInvalid();
    }

    public final void dispatchAddFinished(RecyclerView.d0 d0Var) {
        onAddFinished(d0Var);
        dispatchAnimationFinished(d0Var);
    }

    public final void dispatchAddStarting(RecyclerView.d0 d0Var) {
        onAddStarting(d0Var);
    }

    public final void dispatchChangeFinished(RecyclerView.d0 d0Var, boolean z11) {
        onChangeFinished(d0Var, z11);
        dispatchAnimationFinished(d0Var);
    }

    public final void dispatchChangeStarting(RecyclerView.d0 d0Var, boolean z11) {
        onChangeStarting(d0Var, z11);
    }

    public final void dispatchMoveFinished(RecyclerView.d0 d0Var) {
        onMoveFinished(d0Var);
        dispatchAnimationFinished(d0Var);
    }

    public final void dispatchMoveStarting(RecyclerView.d0 d0Var) {
        onMoveStarting(d0Var);
    }

    public final void dispatchRemoveFinished(RecyclerView.d0 d0Var) {
        onRemoveFinished(d0Var);
        dispatchAnimationFinished(d0Var);
    }

    public final void dispatchRemoveStarting(RecyclerView.d0 d0Var) {
        onRemoveStarting(d0Var);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public void onAddFinished(RecyclerView.d0 d0Var) {
    }

    public void onAddStarting(RecyclerView.d0 d0Var) {
    }

    public void onChangeFinished(RecyclerView.d0 d0Var, boolean z11) {
    }

    public void onChangeStarting(RecyclerView.d0 d0Var, boolean z11) {
    }

    public void onMoveFinished(RecyclerView.d0 d0Var) {
    }

    public void onMoveStarting(RecyclerView.d0 d0Var) {
    }

    public void onRemoveFinished(RecyclerView.d0 d0Var) {
    }

    public void onRemoveStarting(RecyclerView.d0 d0Var) {
    }

    public void setSupportsChangeAnimations(boolean z11) {
        this.mSupportsChangeAnimations = z11;
    }
}

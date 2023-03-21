package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.a0;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentViewHolder */
public final class a extends RecyclerView.d0 {
    private a(FrameLayout frameLayout) {
        super(frameLayout);
    }

    static a a(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(a0.m());
        frameLayout.setSaveEnabled(false);
        return new a(frameLayout);
    }

    /* access modifiers changed from: package-private */
    public FrameLayout b() {
        return (FrameLayout) this.itemView;
    }
}

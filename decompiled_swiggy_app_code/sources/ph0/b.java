package ph0;

import android.net.Uri;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.brentvatne.react.ReactVideoViewManager;
import hb0.d;
import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.p;
import lb0.a;
import lb0.c;

/* compiled from: CustomIntentBindingAdapter.kt */
public final class b {
    public static final <T extends d> void a(RecyclerView recyclerView, HashMap<Class<?>, a> hashMap, int i11) {
        GridLayoutManager gridLayoutManager;
        p.j(recyclerView, "recyclerView");
        if (recyclerView.getAdapter() == null || recyclerView.getLayoutManager() == null || !(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), i11));
            Object tag = recyclerView.getTag(-201);
            Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.collections.Collection<T of in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.socialshare.custom.CustomIntentBindingAdapterKt.setGridLayoutManagerVerticalAdapter>");
            Object tag2 = recyclerView.getTag(-202);
            Objects.requireNonNull(tag2, "null cannot be cast to non-null type in.swiggy.android.mvvm.recyclerview.adapter.ClickHandler<T of in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.socialshare.custom.CustomIntentBindingAdapterKt.setGridLayoutManagerVerticalAdapter>");
            lb0.b bVar = new lb0.b(hashMap, (Collection) tag);
            bVar.l((c) tag2);
            recyclerView.setAdapter(bVar);
            return;
        }
        GridLayoutManager gridLayoutManager2 = (GridLayoutManager) recyclerView.getLayoutManager();
        boolean z11 = false;
        if (gridLayoutManager2 != null && gridLayoutManager2.g3() == i11) {
            z11 = true;
        }
        if (!z11 && (gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager()) != null) {
            gridLayoutManager.o3(i11);
        }
    }

    public static final void b(ImageView imageView, Uri uri) {
        p.j(imageView, "imageView");
        p.j(uri, ReactVideoViewManager.PROP_SRC_URI);
        imageView.setImageURI(uri);
    }
}

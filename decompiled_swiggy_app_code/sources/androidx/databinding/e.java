package androidx.databinding;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* compiled from: DataBinderMapper */
public abstract class e {
    public List<e> collectDependencies() {
        return Collections.emptyList();
    }

    public abstract String convertBrIdToString(int i11);

    public abstract ViewDataBinding getDataBinder(f fVar, View view, int i11);

    public abstract ViewDataBinding getDataBinder(f fVar, View[] viewArr, int i11);

    public abstract int getLayoutId(String str);
}

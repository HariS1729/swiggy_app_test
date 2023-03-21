package androidx.compose.ui.platform;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.R;
import androidx.compose.ui.node.LayoutNode;
import e0.g;
import e0.h;
import e0.k;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;
import k1.w;
import kotlin.jvm.internal.p;

/* compiled from: Wrapper.android.kt */
public final class a2 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7263a = "Wrapper";

    /* renamed from: b  reason: collision with root package name */
    private static final ViewGroup.LayoutParams f7264b = new ViewGroup.LayoutParams(-2, -2);

    public static final h a(LayoutNode layoutNode, a aVar) {
        p.j(layoutNode, "container");
        p.j(aVar, "parent");
        return k.a(new w(layoutNode), aVar);
    }

    private static final h b(AndroidComposeView androidComposeView, a aVar, lp0.p<? super g, ? super Integer, bp0.k> pVar) {
        if (d(androidComposeView)) {
            androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
            c();
        }
        h a11 = k.a(new w(androidComposeView.getRoot()), aVar);
        View view = androidComposeView.getView();
        int i11 = R.id.wrapped_composition_tag;
        Object tag = view.getTag(i11);
        WrappedComposition wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, a11);
            androidComposeView.getView().setTag(i11, wrappedComposition);
        }
        wrappedComposition.c(pVar);
        return wrappedComposition;
    }

    private static final void c() {
        if (!InspectableValueKt.c()) {
            Class<InspectableValueKt> cls = InspectableValueKt.class;
            try {
                int i11 = InspectableValueKt.f7155c;
                Field declaredField = cls.getDeclaredField("isDebugInspectorInfoEnabled");
                declaredField.setAccessible(true);
                declaredField.setBoolean((Object) null, true);
            } catch (Exception unused) {
                Log.w(f7263a, "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
            }
        }
    }

    private static final boolean d(AndroidComposeView androidComposeView) {
        if (Build.VERSION.SDK_INT < 29 || !(!z1.f7401a.a(androidComposeView).isEmpty())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final e0.h e(androidx.compose.ui.platform.AbstractComposeView r3, androidx.compose.runtime.a r4, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r3, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.p.j(r4, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r5, r0)
            androidx.compose.ui.platform.GlobalSnapshotManager r0 = androidx.compose.ui.platform.GlobalSnapshotManager.f7144a
            r0.a()
            int r0 = r3.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L_0x0028
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            boolean r2 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r2 == 0) goto L_0x002b
            r1 = r0
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.ui.platform.AndroidComposeView) r1
            goto L_0x002b
        L_0x0028:
            r3.removeAllViews()
        L_0x002b:
            if (r1 != 0) goto L_0x0044
            androidx.compose.ui.platform.AndroidComposeView r1 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r0 = r3.getContext()
            java.lang.String r2 = "context"
            kotlin.jvm.internal.p.i(r0, r2)
            r1.<init>(r0)
            android.view.View r0 = r1.getView()
            android.view.ViewGroup$LayoutParams r2 = f7264b
            r3.addView((android.view.View) r0, (android.view.ViewGroup.LayoutParams) r2)
        L_0x0044:
            e0.h r3 = b(r1, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.a2.e(androidx.compose.ui.platform.AbstractComposeView, androidx.compose.runtime.a, lp0.p):e0.h");
    }
}

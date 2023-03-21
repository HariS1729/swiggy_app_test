package u2;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewKt;
import androidx.customview.poolingcontainer.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.jvm.internal.p;

/* compiled from: PoolingContainer.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int f16969a = R.id.pooling_container_listener_holder_tag;

    /* renamed from: b  reason: collision with root package name */
    private static final int f16970b = R.id.is_pooling_container_tag;

    @SuppressLint({"ExecutorRegistration"})
    public static final void a(View view, b bVar) {
        p.j(view, "<this>");
        p.j(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        b(view).a(bVar);
    }

    private static final c b(View view) {
        int i11 = f16969a;
        c cVar = (c) view.getTag(i11);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i11, cVar2);
        return cVar2;
    }

    public static final boolean c(View view) {
        p.j(view, "<this>");
        Object tag = view.getTag(f16970b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(View view) {
        p.j(view, "<this>");
        for (ViewParent next : ViewKt.a(view)) {
            if ((next instanceof View) && c((View) next)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void e(View view, b bVar) {
        p.j(view, "<this>");
        p.j(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        b(view).b(bVar);
    }
}

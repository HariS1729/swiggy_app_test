package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.g;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.R;
import bp0.c;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import in.swiggy.android.tejas.network.HttpRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.p;
import n0.l;
import n3.b;
import n3.d;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
public final class DisposableSaveableStateRegistry_androidKt {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<? extends Object>[] f7138a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* compiled from: DisposableSaveableStateRegistry.android.kt */
    static final class a implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0.b f7143a;

        a(m0.b bVar) {
            this.f7143a = bVar;
        }

        public final Bundle c() {
            return DisposableSaveableStateRegistry_androidKt.f(this.f7143a.b());
        }
    }

    public static final i0 a(View view, d dVar) {
        p.j(view, "view");
        p.j(dVar, "owner");
        ViewParent parent = view.getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(R.id.compose_view_saveable_id_tag);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return b(str, dVar);
    }

    public static final i0 b(String str, d dVar) {
        boolean z11;
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(dVar, "savedStateRegistryOwner");
        String str2 = m0.b.class.getSimpleName() + ':' + str;
        b savedStateRegistry = dVar.getSavedStateRegistry();
        Bundle b11 = savedStateRegistry.b(str2);
        m0.b a11 = SaveableStateRegistryKt.a(b11 != null ? g(b11) : null, DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1.f7142a);
        try {
            savedStateRegistry.h(str2, new a(a11));
            z11 = true;
        } catch (IllegalArgumentException unused) {
            z11 = false;
        }
        return new i0(a11, new DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(z11, savedStateRegistry, str2));
    }

    /* access modifiers changed from: private */
    public static final boolean e(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (lVar.c() != g.i() && lVar.c() != g.o() && lVar.c() != g.l()) {
                return false;
            }
            Object value = lVar.getValue();
            if (value == null) {
                return true;
            }
            return e(value);
        } else if ((obj instanceof c) && (obj instanceof Serializable)) {
            return false;
        } else {
            for (Class<? extends Object> isInstance : f7138a) {
                if (isInstance.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static final Bundle f(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> g(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = bundle.keySet();
        p.i(keySet, "this.keySet()");
        for (String str : keySet) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            Objects.requireNonNull(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            p.i(str, HttpRequest.HEADER_KEY);
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}

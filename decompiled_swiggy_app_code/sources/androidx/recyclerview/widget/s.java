package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.d;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate */
public class s extends androidx.core.view.a {

    /* renamed from: d  reason: collision with root package name */
    final RecyclerView f11462d;

    /* renamed from: e  reason: collision with root package name */
    private final a f11463e;

    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class a extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        final s f11464d;

        /* renamed from: e  reason: collision with root package name */
        private Map<View, androidx.core.view.a> f11465e = new WeakHashMap();

        public a(s sVar) {
            this.f11464d = sVar;
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f11465e.get(view);
            if (aVar != null) {
                return aVar.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        public d b(View view) {
            androidx.core.view.a aVar = this.f11465e.get(view);
            if (aVar != null) {
                return aVar.b(view);
            }
            return super.b(view);
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f11465e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        public void g(View view, c cVar) {
            if (this.f11464d.o() || this.f11464d.f11462d.getLayoutManager() == null) {
                super.g(view, cVar);
                return;
            }
            this.f11464d.f11462d.getLayoutManager().W0(view, cVar);
            androidx.core.view.a aVar = this.f11465e.get(view);
            if (aVar != null) {
                aVar.g(view, cVar);
            } else {
                super.g(view, cVar);
            }
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f11465e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f11465e.get(viewGroup);
            if (aVar != null) {
                return aVar.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        public boolean j(View view, int i11, Bundle bundle) {
            if (this.f11464d.o() || this.f11464d.f11462d.getLayoutManager() == null) {
                return super.j(view, i11, bundle);
            }
            androidx.core.view.a aVar = this.f11465e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i11, bundle)) {
                    return true;
                }
            } else if (super.j(view, i11, bundle)) {
                return true;
            }
            return this.f11464d.f11462d.getLayoutManager().q1(view, i11, bundle);
        }

        public void l(View view, int i11) {
            androidx.core.view.a aVar = this.f11465e.get(view);
            if (aVar != null) {
                aVar.l(view, i11);
            } else {
                super.l(view, i11);
            }
        }

        public void m(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f11465e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        public androidx.core.view.a n(View view) {
            return this.f11465e.remove(view);
        }

        /* access modifiers changed from: package-private */
        public void o(View view) {
            androidx.core.view.a n = a0.n(view);
            if (n != null && n != this) {
                this.f11465e.put(view, n);
            }
        }
    }

    public s(RecyclerView recyclerView) {
        this.f11462d = recyclerView;
        androidx.core.view.a n = n();
        if (n == null || !(n instanceof a)) {
            this.f11463e = new a(this);
        } else {
            this.f11463e = (a) n;
        }
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().S0(accessibilityEvent);
            }
        }
    }

    public void g(View view, c cVar) {
        super.g(view, cVar);
        if (!o() && this.f11462d.getLayoutManager() != null) {
            this.f11462d.getLayoutManager().U0(cVar);
        }
    }

    public boolean j(View view, int i11, Bundle bundle) {
        if (super.j(view, i11, bundle)) {
            return true;
        }
        if (o() || this.f11462d.getLayoutManager() == null) {
            return false;
        }
        return this.f11462d.getLayoutManager().o1(i11, bundle);
    }

    public androidx.core.view.a n() {
        return this.f11463e;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f11462d.p0();
    }
}

package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityDelegateCompat */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final View.AccessibilityDelegate f9424c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    private final View.AccessibilityDelegate f9425a;

    /* renamed from: b  reason: collision with root package name */
    private final View.AccessibilityDelegate f9426b;

    /* renamed from: androidx.core.view.a$a  reason: collision with other inner class name */
    /* compiled from: AccessibilityDelegateCompat */
    static final class C0046a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        final a f9427a;

        C0046a(a aVar) {
            this.f9427a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f9427a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            d b11 = this.f9427a.b(view);
            if (b11 != null) {
                return (AccessibilityNodeProvider) b11.e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f9427a.f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            c O0 = c.O0(accessibilityNodeInfo);
            O0.B0(a0.d0(view));
            O0.o0(a0.Y(view));
            O0.v0(a0.r(view));
            O0.H0(a0.N(view));
            this.f9427a.g(view, O0);
            O0.f(accessibilityNodeInfo.getText(), view);
            List<c.a> c11 = a.c(view);
            for (int i11 = 0; i11 < c11.size(); i11++) {
                O0.b(c11.get(i11));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f9427a.h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f9427a.i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            return this.f9427a.j(view, i11, bundle);
        }

        public void sendAccessibilityEvent(View view, int i11) {
            this.f9427a.l(view, i11);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f9427a.m(view, accessibilityEvent);
        }
    }

    /* compiled from: AccessibilityDelegateCompat */
    static class b {
        static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i11, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i11, bundle);
        }
    }

    public a() {
        this(f9424c);
    }

    static List<c.a> c(View view) {
        List<c.a> list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] q = c.q(view.createAccessibilityNodeInfo().getText());
            int i11 = 0;
            while (q != null && i11 < q.length) {
                if (clickableSpan.equals(q[i11])) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    private boolean k(int i11, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i11)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f9425a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public d b(View view) {
        AccessibilityNodeProvider a11 = b.a(this.f9425a, view);
        if (a11 != null) {
            return new d(a11);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate d() {
        return this.f9426b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f9425a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, c cVar) {
        this.f9425a.onInitializeAccessibilityNodeInfo(view, cVar.N0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f9425a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f9425a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i11, Bundle bundle) {
        List<c.a> c11 = c(view);
        boolean z11 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= c11.size()) {
                break;
            }
            c.a aVar = c11.get(i12);
            if (aVar.b() == i11) {
                z11 = aVar.d(view, bundle);
                break;
            }
            i12++;
        }
        if (!z11) {
            z11 = b.b(this.f9425a, view, i11, bundle);
        }
        return (z11 || i11 != R.id.accessibility_action_clickable_span || bundle == null) ? z11 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i11) {
        this.f9425a.sendAccessibilityEvent(view, i11);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f9425a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f9425a = accessibilityDelegate;
        this.f9426b = new C0046a(this);
    }
}

package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f9479a;

    /* compiled from: AccessibilityNodeProviderCompat */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        final d f9480a;

        a(d dVar) {
            this.f9480a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i11) {
            c b11 = this.f9480a.b(i11);
            if (b11 == null) {
                return null;
            }
            return b11.N0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i11) {
            List<c> c11 = this.f9480a.c(str, i11);
            if (c11 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c11.size();
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(c11.get(i12).N0());
            }
            return arrayList;
        }

        public boolean performAction(int i11, int i12, Bundle bundle) {
            return this.f9480a.f(i11, i12, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat */
    static class b extends a {
        b(d dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i11) {
            c d11 = this.f9480a.d(i11);
            if (d11 == null) {
                return null;
            }
            return d11.N0();
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat */
    static class c extends b {
        c(d dVar) {
            super(dVar);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i11, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f9480a.a(i11, c.O0(accessibilityNodeInfo), str, bundle);
        }
    }

    public d() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9479a = new c(this);
        } else {
            this.f9479a = new b(this);
        }
    }

    public void a(int i11, c cVar, String str, Bundle bundle) {
    }

    public c b(int i11) {
        return null;
    }

    public List<c> c(String str, int i11) {
        return null;
    }

    public c d(int i11) {
        return null;
    }

    public Object e() {
        return this.f9479a;
    }

    public boolean f(int i11, int i12, Bundle bundle) {
        return false;
    }

    public d(Object obj) {
        this.f9479a = obj;
    }
}

package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergedDataBinderMapper extends e {

    /* renamed from: a  reason: collision with root package name */
    private Set<Class<? extends e>> f9676a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private List<e> f9677b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<String> f9678c = new CopyOnWriteArrayList();

    private boolean b() {
        boolean z11 = false;
        for (String next : this.f9678c) {
            try {
                Class<?> cls = Class.forName(next);
                if (e.class.isAssignableFrom(cls)) {
                    a((e) cls.newInstance());
                    this.f9678c.remove(next);
                    z11 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e11) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + next, e11);
            } catch (InstantiationException e12) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + next, e12);
            }
        }
        return z11;
    }

    public void a(e eVar) {
        if (this.f9676a.add(eVar.getClass())) {
            this.f9677b.add(eVar);
            for (e a11 : eVar.collectDependencies()) {
                a(a11);
            }
        }
    }

    public String convertBrIdToString(int i11) {
        for (e convertBrIdToString : this.f9677b) {
            String convertBrIdToString2 = convertBrIdToString.convertBrIdToString(i11);
            if (convertBrIdToString2 != null) {
                return convertBrIdToString2;
            }
        }
        if (b()) {
            return convertBrIdToString(i11);
        }
        return null;
    }

    public ViewDataBinding getDataBinder(f fVar, View view, int i11) {
        for (e dataBinder : this.f9677b) {
            ViewDataBinding dataBinder2 = dataBinder.getDataBinder(fVar, view, i11);
            if (dataBinder2 != null) {
                return dataBinder2;
            }
        }
        if (b()) {
            return getDataBinder(fVar, view, i11);
        }
        return null;
    }

    public int getLayoutId(String str) {
        for (e layoutId : this.f9677b) {
            int layoutId2 = layoutId.getLayoutId(str);
            if (layoutId2 != 0) {
                return layoutId2;
            }
        }
        if (b()) {
            return getLayoutId(str);
        }
        return 0;
    }

    public ViewDataBinding getDataBinder(f fVar, View[] viewArr, int i11) {
        for (e dataBinder : this.f9677b) {
            ViewDataBinding dataBinder2 = dataBinder.getDataBinder(fVar, viewArr, i11);
            if (dataBinder2 != null) {
                return dataBinder2;
            }
        }
        if (b()) {
            return getDataBinder(fVar, viewArr, i11);
        }
        return null;
    }
}

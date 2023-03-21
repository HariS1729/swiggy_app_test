package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: Scene */
public class y {

    /* renamed from: a  reason: collision with root package name */
    private Context f12030a;

    /* renamed from: b  reason: collision with root package name */
    private int f12031b;

    /* renamed from: c  reason: collision with root package name */
    private ViewGroup f12032c;

    /* renamed from: d  reason: collision with root package name */
    private View f12033d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f12034e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f12035f;

    private y(ViewGroup viewGroup, int i11, Context context) {
        this.f12030a = context;
        this.f12032c = viewGroup;
        this.f12031b = i11;
    }

    public static y c(ViewGroup viewGroup) {
        return (y) viewGroup.getTag(R.id.transition_current_scene);
    }

    public static y d(ViewGroup viewGroup, int i11, Context context) {
        int i12 = R.id.transition_scene_layoutid_cache;
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(i12);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(i12, sparseArray);
        }
        y yVar = (y) sparseArray.get(i11);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(viewGroup, i11, context);
        sparseArray.put(i11, yVar2);
        return yVar2;
    }

    static void g(ViewGroup viewGroup, y yVar) {
        viewGroup.setTag(R.id.transition_current_scene, yVar);
    }

    public void a() {
        if (this.f12031b > 0 || this.f12033d != null) {
            e().removeAllViews();
            if (this.f12031b > 0) {
                LayoutInflater.from(this.f12030a).inflate(this.f12031b, this.f12032c);
            } else {
                this.f12032c.addView(this.f12033d);
            }
        }
        Runnable runnable = this.f12034e;
        if (runnable != null) {
            runnable.run();
        }
        g(this.f12032c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f12032c) == this && (runnable = this.f12035f) != null) {
            runnable.run();
        }
    }

    public ViewGroup e() {
        return this.f12032c;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f12031b > 0;
    }
}

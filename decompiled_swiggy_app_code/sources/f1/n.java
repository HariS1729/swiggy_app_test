package f1;

import android.view.MotionEvent;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: PointerEvent.android.kt */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final List<v> f14514a;

    /* renamed from: b  reason: collision with root package name */
    private final h f14515b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14516c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14517d;

    /* renamed from: e  reason: collision with root package name */
    private int f14518e;

    public n(List<v> list, h hVar) {
        p.j(list, "changes");
        this.f14514a = list;
        this.f14515b = hVar;
        MotionEvent e11 = e();
        int i11 = 0;
        this.f14516c = m.a(e11 != null ? e11.getButtonState() : 0);
        MotionEvent e12 = e();
        this.f14517d = f0.a(e12 != null ? e12.getMetaState() : i11);
        this.f14518e = a();
    }

    private final int a() {
        MotionEvent e11 = e();
        if (e11 != null) {
            int actionMasked = e11.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return p.f14519a.f();
                            case 9:
                                return p.f14519a.a();
                            case 10:
                                return p.f14519a.b();
                            default:
                                return p.f14519a.g();
                        }
                    }
                    return p.f14519a.c();
                }
                return p.f14519a.e();
            }
            return p.f14519a.d();
        }
        List<v> list = this.f14514a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            v vVar = list.get(i11);
            if (o.d(vVar)) {
                return p.f14519a.e();
            }
            if (o.b(vVar)) {
                return p.f14519a.d();
            }
        }
        return p.f14519a.c();
    }

    public final int b() {
        return this.f14516c;
    }

    public final List<v> c() {
        return this.f14514a;
    }

    public final h d() {
        return this.f14515b;
    }

    public final MotionEvent e() {
        h hVar = this.f14515b;
        if (hVar != null) {
            return hVar.b();
        }
        return null;
    }

    public final int f() {
        return this.f14518e;
    }

    public final void g(int i11) {
        this.f14518e = i11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public n(List<v> list) {
        this(list, (h) null);
        p.j(list, "changes");
    }
}

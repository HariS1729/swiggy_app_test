package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* compiled from: CardViewApi21Impl */
class a implements c {
    a() {
    }

    private d p(b bVar) {
        return (d) bVar.d();
    }

    public float a(b bVar) {
        return p(bVar).d();
    }

    public float b(b bVar) {
        return p(bVar).c();
    }

    public float c(b bVar) {
        return a(bVar) * 2.0f;
    }

    public float d(b bVar) {
        return bVar.f().getElevation();
    }

    public void e(b bVar) {
        if (!bVar.b()) {
            bVar.a(0, 0, 0, 0);
            return;
        }
        float b11 = b(bVar);
        float a11 = a(bVar);
        int ceil = (int) Math.ceil((double) e.a(b11, a11, bVar.e()));
        int ceil2 = (int) Math.ceil((double) e.b(b11, a11, bVar.e()));
        bVar.a(ceil, ceil2, ceil, ceil2);
    }

    public float f(b bVar) {
        return a(bVar) * 2.0f;
    }

    public void g(b bVar, float f11) {
        p(bVar).g(f11, bVar.b(), bVar.e());
        e(bVar);
    }

    public void h(b bVar, float f11) {
        p(bVar).h(f11);
    }

    public void i(b bVar, float f11) {
        bVar.f().setElevation(f11);
    }

    public ColorStateList j(b bVar) {
        return p(bVar).b();
    }

    public void k(b bVar) {
        g(bVar, b(bVar));
    }

    public void l(b bVar, Context context, ColorStateList colorStateList, float f11, float f12, float f13) {
        bVar.c(new d(colorStateList, f11));
        View f14 = bVar.f();
        f14.setClipToOutline(true);
        f14.setElevation(f12);
        g(bVar, f13);
    }

    public void m(b bVar) {
        g(bVar, b(bVar));
    }

    public void n() {
    }

    public void o(b bVar, ColorStateList colorStateList) {
        p(bVar).f(colorStateList);
    }
}

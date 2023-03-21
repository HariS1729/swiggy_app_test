package d3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import w3.a;

/* compiled from: EmojiMetadata */
public class b {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<a> f14060d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private final int f14061a;

    /* renamed from: b  reason: collision with root package name */
    private final g f14062b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f14063c = 0;

    b(g gVar, int i11) {
        this.f14062b = gVar;
        this.f14061a = i11;
    }

    private a g() {
        ThreadLocal<a> threadLocal = f14060d;
        a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        this.f14062b.d().i(aVar, this.f14061a);
        return aVar;
    }

    public void a(Canvas canvas, float f11, float f12, Paint paint) {
        Typeface g11 = this.f14062b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g11);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f14062b.c(), this.f14061a * 2, 2, f11, f12, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i11) {
        return g().g(i11);
    }

    public int c() {
        return g().h();
    }

    public int d() {
        return this.f14063c;
    }

    public short e() {
        return g().j();
    }

    public int f() {
        return g().k();
    }

    public short h() {
        return g().l();
    }

    public short i() {
        return g().m();
    }

    public boolean j() {
        return g().i();
    }

    public void k(boolean z11) {
        this.f14063c = z11 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int c11 = c();
        for (int i11 = 0; i11 < c11; i11++) {
            sb2.append(Integer.toHexString(b(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}

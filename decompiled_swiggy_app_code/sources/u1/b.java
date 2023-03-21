package u1;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.AndroidFontLoader_androidKt;
import bp0.g;
import fp0.c;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Result;
import kotlin.jvm.internal.p;
import u1.a;
import u1.q;

/* compiled from: AndroidFontLoader.android.kt */
public final class b implements a0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16905a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f16906b;

    public b(Context context) {
        p.j(context, LogCategory.CONTEXT);
        this.f16905a = context.getApplicationContext();
    }

    public Object a() {
        return this.f16906b;
    }

    public Object b(h hVar, c<? super Typeface> cVar) {
        if (hVar instanceof a) {
            a aVar = (a) hVar;
            a.C0189a d11 = aVar.d();
            Context context = this.f16905a;
            p.i(context, LogCategory.CONTEXT);
            return d11.b(context, aVar, cVar);
        } else if (hVar instanceof h0) {
            Context context2 = this.f16905a;
            p.i(context2, LogCategory.CONTEXT);
            Object b11 = AndroidFontLoader_androidKt.d((h0) hVar, context2, cVar);
            return b11 == b.d() ? b11 : (Typeface) b11;
        } else {
            throw new IllegalArgumentException("Unknown font type: " + hVar);
        }
    }

    /* renamed from: d */
    public Typeface c(h hVar) {
        Object obj;
        p.j(hVar, "font");
        Typeface typeface = null;
        if (hVar instanceof a) {
            a aVar = (a) hVar;
            a.C0189a d11 = aVar.d();
            Context context = this.f16905a;
            p.i(context, LogCategory.CONTEXT);
            return d11.a(context, aVar);
        } else if (!(hVar instanceof h0)) {
            return null;
        } else {
            int b11 = hVar.b();
            q.a aVar2 = q.f16935a;
            if (q.e(b11, aVar2.b())) {
                Context context2 = this.f16905a;
                p.i(context2, LogCategory.CONTEXT);
                return AndroidFontLoader_androidKt.c((h0) hVar, context2);
            } else if (q.e(b11, aVar2.c())) {
                try {
                    Result.a aVar3 = Result.f25582b;
                    Context context3 = this.f16905a;
                    p.i(context3, LogCategory.CONTEXT);
                    obj = Result.b(AndroidFontLoader_androidKt.c((h0) hVar, context3));
                } catch (Throwable th2) {
                    Result.a aVar4 = Result.f25582b;
                    obj = Result.b(g.a(th2));
                }
                if (!Result.g(obj)) {
                    typeface = obj;
                }
                return typeface;
            } else if (q.e(b11, aVar2.a())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            } else {
                throw new IllegalArgumentException("Unknown loading type " + q.g(hVar.b()));
            }
        }
    }
}

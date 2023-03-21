package i4;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import h4.b;
import l4.p;
import n4.a;

/* compiled from: NetworkUnmeteredController */
public class g extends c<b> {
    public g(Context context, a aVar) {
        super(j4.g.c(context, aVar).d());
    }

    /* access modifiers changed from: package-private */
    public boolean b(p pVar) {
        return pVar.j.b() == NetworkType.UNMETERED || (Build.VERSION.SDK_INT >= 30 && pVar.j.b() == NetworkType.TEMPORARILY_UNMETERED);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean c(b bVar) {
        return !bVar.a() || bVar.b();
    }
}

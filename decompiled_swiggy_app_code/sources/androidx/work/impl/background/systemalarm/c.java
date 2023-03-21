package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import d4.i;
import h4.d;
import java.util.ArrayList;
import java.util.List;
import l4.p;

/* compiled from: ConstraintsCommandHandler */
class c {

    /* renamed from: e  reason: collision with root package name */
    private static final String f12381e = i.f("ConstraintsCmdHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f12382a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12383b;

    /* renamed from: c  reason: collision with root package name */
    private final e f12384c;

    /* renamed from: d  reason: collision with root package name */
    private final d f12385d;

    c(Context context, int i11, e eVar) {
        this.f12382a = context;
        this.f12383b = i11;
        this.f12384c = eVar;
        this.f12385d = new d(context, eVar.f(), (h4.c) null);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        List<p> l11 = this.f12384c.g().w().N().l();
        ConstraintProxy.a(this.f12382a, l11);
        this.f12385d.d(l11);
        ArrayList<p> arrayList = new ArrayList<>(l11.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (p next : l11) {
            String str = next.f15493a;
            if (currentTimeMillis >= next.a() && (!next.b() || this.f12385d.c(str))) {
                arrayList.add(next);
            }
        }
        for (p pVar : arrayList) {
            String str2 = pVar.f15493a;
            Intent b11 = b.b(this.f12382a, str2);
            i.c().a(f12381e, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
            e eVar = this.f12384c;
            eVar.k(new e.b(eVar, b11, this.f12383b));
        }
        this.f12385d.e();
    }
}

package m4;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import d4.j;
import e4.e;
import e4.f;
import e4.i;
import java.util.LinkedList;
import java.util.UUID;
import l4.q;

/* compiled from: CancelWorkRunnable */
public abstract class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e4.c f15628a = new e4.c();

    /* renamed from: m4.a$a  reason: collision with other inner class name */
    /* compiled from: CancelWorkRunnable */
    class C0147a extends a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f15629b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UUID f15630c;

        C0147a(i iVar, UUID uuid) {
            this.f15629b = iVar;
            this.f15630c = uuid;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public void h() {
            WorkDatabase w11 = this.f15629b.w();
            w11.e();
            try {
                a(this.f15629b, this.f15630c.toString());
                w11.C();
                w11.i();
                g(this.f15629b);
            } catch (Throwable th2) {
                w11.i();
                throw th2;
            }
        }
    }

    /* compiled from: CancelWorkRunnable */
    class b extends a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f15631b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f15632c;

        b(i iVar, String str) {
            this.f15631b = iVar;
            this.f15632c = str;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public void h() {
            WorkDatabase w11 = this.f15631b.w();
            w11.e();
            try {
                for (String a11 : w11.N().e(this.f15632c)) {
                    a(this.f15631b, a11);
                }
                w11.C();
                w11.i();
                g(this.f15631b);
            } catch (Throwable th2) {
                w11.i();
                throw th2;
            }
        }
    }

    /* compiled from: CancelWorkRunnable */
    class c extends a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f15633b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f15634c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f15635d;

        c(i iVar, String str, boolean z11) {
            this.f15633b = iVar;
            this.f15634c = str;
            this.f15635d = z11;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public void h() {
            WorkDatabase w11 = this.f15633b.w();
            w11.e();
            try {
                for (String a11 : w11.N().c(this.f15634c)) {
                    a(this.f15633b, a11);
                }
                w11.C();
                w11.i();
                if (this.f15635d) {
                    g(this.f15633b);
                }
            } catch (Throwable th2) {
                w11.i();
                throw th2;
            }
        }
    }

    public static a b(UUID uuid, i iVar) {
        return new C0147a(iVar, uuid);
    }

    public static a c(String str, i iVar, boolean z11) {
        return new c(iVar, str, z11);
    }

    public static a d(String str, i iVar) {
        return new b(iVar, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        q N = workDatabase.N();
        l4.b F = workDatabase.F();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo.State d11 = N.d(str2);
            if (!(d11 == WorkInfo.State.SUCCEEDED || d11 == WorkInfo.State.FAILED)) {
                N.b(WorkInfo.State.CANCELLED, str2);
            }
            linkedList.addAll(F.a(str2));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(i iVar, String str) {
        f(iVar.w(), str);
        iVar.u().l(str);
        for (e d11 : iVar.v()) {
            d11.d(str);
        }
    }

    public j e() {
        return this.f15628a;
    }

    /* access modifiers changed from: package-private */
    public void g(i iVar) {
        f.b(iVar.q(), iVar.w(), iVar.v());
    }

    /* access modifiers changed from: package-private */
    public abstract void h();

    public void run() {
        try {
            h();
            this.f15628a.b(j.f14135a);
        } catch (Throwable th2) {
            this.f15628a.b(new j.b.a(th2));
        }
    }
}

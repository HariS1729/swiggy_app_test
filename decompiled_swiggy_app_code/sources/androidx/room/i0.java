package androidx.room;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.RoomDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import t3.g;
import t3.j;
import t3.k;

/* compiled from: QueryInterceptorDatabase */
final class i0 implements g {

    /* renamed from: a  reason: collision with root package name */
    private final g f11573a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomDatabase.e f11574b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f11575c;

    i0(g gVar, RoomDatabase.e eVar, Executor executor) {
        this.f11573a = gVar;
        this.f11574b = eVar;
        this.f11575c = executor;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A() {
        this.f11574b.a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void C() {
        this.f11574b.a("END TRANSACTION", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void D(String str) {
        this.f11574b.a(str, new ArrayList(0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(String str, List list) {
        this.f11574b.a(str, list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L(String str) {
        this.f11574b.a(str, Collections.emptyList());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void M(j jVar, l0 l0Var) {
        this.f11574b.a(jVar.a(), l0Var.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void P(j jVar, l0 l0Var) {
        this.f11574b.a(jVar.a(), l0Var.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Q() {
        this.f11574b.a("TRANSACTION SUCCESSFUL", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.f11574b.a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }

    public void C0() {
        this.f11575c.execute(new z(this));
        this.f11573a.C0();
    }

    public k T0(String str) {
        return new o0(this.f11573a.T0(str), this.f11574b, str, this.f11575c);
    }

    public Cursor b1(String str) {
        this.f11575c.execute(new e0(this, str));
        return this.f11573a.b1(str);
    }

    public Cursor c0(j jVar, CancellationSignal cancellationSignal) {
        l0 l0Var = new l0();
        jVar.b(l0Var);
        this.f11575c.execute(new h0(this, jVar, l0Var));
        return this.f11573a.j0(jVar);
    }

    public void close() throws IOException {
        this.f11573a.close();
    }

    public boolean f1() {
        return this.f11573a.f1();
    }

    public boolean g1() {
        return this.f11573a.g1();
    }

    public String getPath() {
        return this.f11573a.getPath();
    }

    public boolean isOpen() {
        return this.f11573a.isOpen();
    }

    public Cursor j0(j jVar) {
        l0 l0Var = new l0();
        jVar.b(l0Var);
        this.f11575c.execute(new g0(this, jVar, l0Var));
        return this.f11573a.j0(jVar);
    }

    public void l() {
        this.f11575c.execute(new c0(this));
        this.f11573a.l();
    }

    public List<Pair<String, String>> m() {
        return this.f11573a.m();
    }

    public void m0(String str) throws SQLException {
        this.f11575c.execute(new d0(this, str));
        this.f11573a.m0(str);
    }

    public void s() {
        this.f11575c.execute(new a0(this));
        this.f11573a.s();
    }

    public void y0() {
        this.f11575c.execute(new b0(this));
        this.f11573a.y0();
    }

    public void z0(String str, Object[] objArr) throws SQLException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.f11575c.execute(new f0(this, str, arrayList));
        this.f11573a.z0(str, arrayList.toArray());
    }
}

package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.android.LayoutIntrinsics;
import d2.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import p1.b;
import p1.c0;
import p1.j;
import p1.o;
import p1.u;
import u1.i;
import x1.c;
import x1.d;
import x1.h;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
public final class AndroidParagraphIntrinsics implements j {

    /* renamed from: a  reason: collision with root package name */
    private final String f7649a;

    /* renamed from: b  reason: collision with root package name */
    private final c0 f7650b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b.C0163b<u>> f7651c;

    /* renamed from: d  reason: collision with root package name */
    private final List<b.C0163b<o>> f7652d;

    /* renamed from: e  reason: collision with root package name */
    private final i.b f7653e;

    /* renamed from: f  reason: collision with root package name */
    private final e f7654f;

    /* renamed from: g  reason: collision with root package name */
    private final h f7655g;

    /* renamed from: h  reason: collision with root package name */
    private final CharSequence f7656h;

    /* renamed from: i  reason: collision with root package name */
    private final LayoutIntrinsics f7657i;
    /* access modifiers changed from: private */
    public final List<a> j = new ArrayList();
    private final int k;

    public AndroidParagraphIntrinsics(String str, c0 c0Var, List<b.C0163b<u>> list, List<b.C0163b<o>> list2, i.b bVar, e eVar) {
        p.j(str, "text");
        p.j(c0Var, "style");
        p.j(list, "spanStyles");
        p.j(list2, "placeholders");
        p.j(bVar, "fontFamilyResolver");
        p.j(eVar, "density");
        this.f7649a = str;
        this.f7650b = c0Var;
        this.f7651c = list;
        this.f7652d = list2;
        this.f7653e = bVar;
        this.f7654f = eVar;
        h hVar = new h(1, eVar.getDensity());
        this.f7655g = hVar;
        int b11 = d.b(c0Var.x(), c0Var.q());
        this.k = b11;
        AndroidParagraphIntrinsics$resolveTypeface$1 androidParagraphIntrinsics$resolveTypeface$1 = new AndroidParagraphIntrinsics$resolveTypeface$1(this);
        u a11 = y1.d.a(hVar, c0Var.E(), androidParagraphIntrinsics$resolveTypeface$1, eVar);
        CharSequence a12 = c.a(str, hVar.getTextSize(), c0Var, s.m0(j.d(new b.C0163b(a11, 0, str.length())), list), list2, eVar, androidParagraphIntrinsics$resolveTypeface$1);
        this.f7656h = a12;
        this.f7657i = new LayoutIntrinsics(a12, hVar, b11);
    }

    public float a() {
        return this.f7657i.c();
    }

    public boolean b() {
        List<a> list = this.j;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11).b()) {
                return true;
            }
        }
        return false;
    }

    public float c() {
        return this.f7657i.b();
    }

    public final CharSequence e() {
        return this.f7656h;
    }

    public final i.b f() {
        return this.f7653e;
    }

    public final LayoutIntrinsics g() {
        return this.f7657i;
    }

    public final c0 h() {
        return this.f7650b;
    }

    public final int i() {
        return this.k;
    }

    public final h j() {
        return this.f7655g;
    }
}

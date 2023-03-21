package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.r;
import u1.i;
import u1.s;
import u1.t;
import u1.v;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
final class AndroidParagraphIntrinsics$resolveTypeface$1 extends Lambda implements r<i, v, s, t, Typeface> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidParagraphIntrinsics f7658a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidParagraphIntrinsics$resolveTypeface$1(AndroidParagraphIntrinsics androidParagraphIntrinsics) {
        super(4);
        this.f7658a = androidParagraphIntrinsics;
    }

    public final Typeface a(i iVar, v vVar, int i11, int i12) {
        p.j(vVar, "fontWeight");
        a aVar = new a(this.f7658a.f().a(iVar, vVar, i11, i12));
        this.f7658a.j.add(aVar);
        return aVar.a();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return a((i) obj, (v) obj2, ((s) obj3).i(), ((t) obj4).m());
    }
}

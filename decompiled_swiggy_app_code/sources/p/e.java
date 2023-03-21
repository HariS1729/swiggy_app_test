package p;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.a;
import androidx.compose.animation.c;
import e0.a1;
import e0.h0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: AnimatedContent.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final a f15994a;

    /* renamed from: b  reason: collision with root package name */
    private final c f15995b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f15996c;

    /* renamed from: d  reason: collision with root package name */
    private l f15997d;

    public e(a aVar, c cVar, float f11, l lVar) {
        p.j(aVar, "targetContentEnter");
        p.j(cVar, "initialContentExit");
        this.f15994a = aVar;
        this.f15995b = cVar;
        this.f15996c = j.e(Float.valueOf(f11), (a1) null, 2, (Object) null);
        this.f15997d = lVar;
    }

    public final c a() {
        return this.f15995b;
    }

    public final l b() {
        return this.f15997d;
    }

    public final a c() {
        return this.f15994a;
    }

    public final float d() {
        return ((Number) this.f15996c.getValue()).floatValue();
    }

    public final void e(l lVar) {
        this.f15997d = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(a aVar, c cVar, float f11, l lVar, int i11, i iVar) {
        this(aVar, cVar, (i11 & 4) != 0 ? 0.0f : f11, (i11 & 8) != 0 ? AnimatedContentKt.d(false, (lp0.p) null, 3, (Object) null) : lVar);
    }
}

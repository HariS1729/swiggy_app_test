package hk0;

import kotlin.jvm.internal.p;
import vs.b;

/* compiled from: TrackDecoratedCardV2BulletViewModel.kt */
public final class a extends vs.a {
    private final String n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str) {
        super(bVar);
        p.j(bVar, "sharedState");
        p.j(str, "title");
        this.n = str;
    }

    public final String R1() {
        return this.n;
    }
}

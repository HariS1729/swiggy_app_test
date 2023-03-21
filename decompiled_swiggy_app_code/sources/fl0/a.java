package fl0;

import android.graphics.Color;
import androidx.databinding.ObservableInt;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import vs.b;

/* compiled from: TrackEmptySpaceViewModel.kt */
public final class a extends vs.a {

    /* renamed from: w  reason: collision with root package name */
    public static final C0259a f20119w = new C0259a((i) null);

    /* renamed from: x  reason: collision with root package name */
    public static final int f20120x = 8;

    /* renamed from: y  reason: collision with root package name */
    private static final String f20121y;
    private ObservableInt n;

    /* renamed from: o  reason: collision with root package name */
    private ObservableInt f20122o;

    /* renamed from: p  reason: collision with root package name */
    private int f20123p;
    private String q;

    /* renamed from: r  reason: collision with root package name */
    private int f20124r;

    /* renamed from: s  reason: collision with root package name */
    private float f20125s;
    private boolean t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f20126u;
    private String v;

    /* renamed from: fl0.a$a  reason: collision with other inner class name */
    /* compiled from: TrackEmptySpaceViewModel.kt */
    public static final class C0259a {
        private C0259a() {
        }

        public /* synthetic */ C0259a(i iVar) {
            this();
        }
    }

    static {
        String simpleName = a.class.getSimpleName();
        p.i(simpleName, "TrackEmptySpaceViewModel::class.java.simpleName");
        f20121y = simpleName;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar, int i11, int i12) {
        super(bVar);
        p.j(bVar, "sharedState");
        this.n = new ObservableInt(0);
        this.f20122o = new ObservableInt(-2);
        this.q = "";
        this.t = true;
        this.f20126u = true;
        this.v = "";
        this.f20124r = i11;
        this.f20123p = i12;
    }

    private final void T1() {
        if (this.t) {
            this.f20122o.j(l().n(this.f20124r));
        } else {
            this.f20122o.j((int) this.f20125s);
        }
        if (this.q.length() > 0) {
            this.n.j(Color.parseColor(this.q));
        } else {
            this.n.j(l().o(this.f20123p));
        }
    }

    public void L1() {
        super.L1();
        T1();
    }

    public final ObservableInt R1() {
        return this.n;
    }

    public final ObservableInt S1() {
        return this.f20122o;
    }

    public void init() {
        T1();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar, float f11, int i11, boolean z11) {
        super(bVar);
        p.j(bVar, "sharedState");
        this.n = new ObservableInt(0);
        this.f20122o = new ObservableInt(-2);
        this.q = "";
        this.f20126u = true;
        this.v = "";
        this.f20125s = f11;
        this.f20123p = i11;
        this.t = z11;
    }
}

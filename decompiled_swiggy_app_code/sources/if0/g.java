package if0;

import android.content.Context;
import ef0.b;
import fg0.d;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.feature.swiggypop.SwiggyPopListingResponseData;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.PublishProcessor;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: PopContext.kt */
public final class g extends d implements b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f18367m = new a((i) null);
    private static final String n = "popContext";

    /* renamed from: o  reason: collision with root package name */
    private static final String f18368o = g.class.getSimpleName();

    /* renamed from: p  reason: collision with root package name */
    private static final int f18369p = 1;
    private static final int q = 2;

    /* renamed from: d  reason: collision with root package name */
    private final transient BehaviorProcessor<SwiggyPopListingResponseData> f18370d;

    /* renamed from: e  reason: collision with root package name */
    private final transient PublishProcessor<Boolean> f18371e;

    /* renamed from: f  reason: collision with root package name */
    private final transient PublishProcessor<Boolean> f18372f;

    /* renamed from: g  reason: collision with root package name */
    private final transient PublishProcessor<Boolean> f18373g;

    /* renamed from: h  reason: collision with root package name */
    private final transient PublishProcessor<Long> f18374h;

    /* renamed from: i  reason: collision with root package name */
    private transient long f18375i = Long.MAX_VALUE;
    private transient int j = 100;
    private transient int k = 100;

    /* renamed from: l  reason: collision with root package name */
    private transient int f18376l = f18369p;

    /* compiled from: PopContext.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        p.j(context, LogCategory.CONTEXT);
        BehaviorProcessor<SwiggyPopListingResponseData> z02 = BehaviorProcessor.z0();
        p.i(z02, "create<SwiggyPopListingResponseData>()");
        this.f18370d = z02;
        PublishProcessor<Boolean> z03 = PublishProcessor.z0();
        p.i(z03, "create<Boolean>()");
        this.f18371e = z03;
        PublishProcessor<Boolean> z04 = PublishProcessor.z0();
        p.i(z04, "create<Boolean>()");
        this.f18372f = z04;
        PublishProcessor<Boolean> z05 = PublishProcessor.z0();
        p.i(z05, "create<Boolean>()");
        this.f18373g = z05;
        PublishProcessor<Long> z06 = PublishProcessor.z0();
        p.i(z06, "create<Long>()");
        this.f18374h = z06;
        a3(context);
    }

    /* access modifiers changed from: protected */
    public String N2() {
        String str = f18368o;
        p.i(str, "TAG");
        return str;
    }

    /* access modifiers changed from: protected */
    public Object O2() {
        return this;
    }

    /* access modifiers changed from: protected */
    public String P2() {
        return n;
    }

    public void a3(Context context) {
        p.j(context, LogCategory.CONTEXT);
    }
}

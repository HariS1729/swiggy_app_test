package e5;

import android.content.Context;
import android.util.Log;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Muxer.kt */
public final class d {

    /* renamed from: e  reason: collision with root package name */
    private static final String f14371e = d.class.getSimpleName();

    /* renamed from: f  reason: collision with root package name */
    public static final a f14372f = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private e f14373a;

    /* renamed from: b  reason: collision with root package name */
    private f f14374b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f14375c;

    /* renamed from: d  reason: collision with root package name */
    private final File f14376d;

    /* compiled from: Muxer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public d(Context context, File file) {
        p.j(context, LogCategory.CONTEXT);
        p.j(file, "file");
        this.f14375c = context;
        this.f14376d = file;
        this.f14373a = new e(file, 0, 0, (String) null, 0, 0.0f, 0, (b) null, 0, 510, (i) null);
    }

    public final h a(List<? extends Object> list, Integer num) {
        p.j(list, "imageList");
        Log.d(f14371e, "Generating video");
        a aVar = new a(this.f14375c, this.f14373a, num);
        try {
            aVar.j();
            for (Object b11 : list) {
                aVar.b(b11);
            }
            aVar.i();
            if (num != null) {
                aVar.e();
            }
            aVar.g();
            aVar.h();
            f fVar = this.f14374b;
            if (fVar != null) {
                fVar.a(this.f14376d);
            }
            return new i(this.f14376d);
        } catch (IOException e11) {
            Log.e(f14371e, "Start Encoder Failed");
            e11.printStackTrace();
            f fVar2 = this.f14374b;
            if (fVar2 != null) {
                fVar2.b(e11);
            }
            return new g("Start encoder failed", e11);
        }
    }

    public final void b(e eVar) {
        p.j(eVar, PaymentConstants.Category.CONFIG);
        this.f14373a = eVar;
    }

    public final void c(f fVar) {
        p.j(fVar, "muxingCompletionListener");
        this.f14374b = fVar;
    }
}

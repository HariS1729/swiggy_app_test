package in.swiggy.android.services;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.e;
import d4.n;
import ef0.f;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.components.AbstractWorker;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import in.swiggy.android.tejas.oldapi.SwiggyBaseResponseHandler;
import in.swiggy.android.tejas.oldapi.network.requests.PostableSettingMessageRequest;
import in.swiggy.android.tejas.oldapi.network.responses.SettingsMessageResponse;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineStart;
import mf0.l0;
import mf0.m0;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import os.u;
import pl0.i1;
import pl0.q1;
import wp0.k0;
import wp0.k1;
import wp0.u0;

/* compiled from: SyncSettingsWorker.kt */
public final class SyncSettingsWorker extends AbstractWorker {

    /* renamed from: m  reason: collision with root package name */
    public static final a f18675m = new a((i) null);
    public static final int n = 8;
    /* access modifiers changed from: private */
    public final SharedPreferences k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final f f18676l;

    /* compiled from: SyncSettingsWorker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(Context context) {
            p.j(context, LogCategory.CONTEXT);
            e b11 = new c.a(SyncSettingsWorker.class).b();
            p.i(b11, "Builder(SyncSettingsWork…\n                .build()");
            n.k(context).i("SyncSettingsWorker", ExistingWorkPolicy.REPLACE, (c) b11);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SyncSettingsWorker(Context context, WorkerParameters workerParameters, SharedPreferences sharedPreferences, f fVar, IApiGeneratedService iApiGeneratedService) {
        super(context, workerParameters, iApiGeneratedService);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(sharedPreferences, "sharedPreferences");
        p.j(fVar, "xpExperimentContext");
        p.j(iApiGeneratedService, "apiGeneratedService");
        this.k = sharedPreferences;
        this.f18676l = fVar;
    }

    /* access modifiers changed from: private */
    public static final void E(SyncSettingsWorker syncSettingsWorker, SwiggyApiResponse swiggyApiResponse) {
        p.j(syncSettingsWorker, "this$0");
        if ((swiggyApiResponse == null ? null : (SettingsMessageResponse) swiggyApiResponse.getData()) != null) {
            k1 unused = j.d(k0.a(u0.c()), (CoroutineContext) null, (CoroutineStart) null, new SyncSettingsWorker$doWork$1$1(syncSettingsWorker, swiggyApiResponse, (fp0.c<? super SyncSettingsWorker$doWork$1$1>) null), 3, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void F(Throwable th2) {
        u.h("SyncSettingsWorker", th2);
    }

    public ListenableWorker.a w() {
        u.b("SyncSettingsWorker", "SyncSettingsWorker initiated");
        PostableSettingMessageRequest postableSettingMessageRequest = new PostableSettingMessageRequest(q1.f22471a.c(), this.k.getString("swiggy_stringsVersion", PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES));
        postableSettingMessageRequest.setXpExperimentList(i1.s());
        y().getSettingsResponse(postableSettingMessageRequest, true, new SwiggyBaseResponseHandler(new m0(this), (m0) null), l0.f26724a, io0.a.f25306c);
        ListenableWorker.a c11 = ListenableWorker.a.c();
        p.i(c11, "success()");
        return c11;
    }
}

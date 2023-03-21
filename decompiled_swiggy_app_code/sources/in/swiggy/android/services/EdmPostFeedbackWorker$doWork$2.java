package in.swiggy.android.services;

import androidx.work.ListenableWorker;
import bp0.g;
import bp0.k;
import com.google.gson.reflect.TypeToken;
import fp0.c;
import in.swiggy.android.tejas.feature.edm.model.EdmPostableRating;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "in.swiggy.android.services.EdmPostFeedbackWorker$doWork$2", f = "EdmPostFeedbackWorker.kt", l = {}, m = "invokeSuspend")
/* compiled from: EdmPostFeedbackWorker.kt */
final class EdmPostFeedbackWorker$doWork$2 extends SuspendLambda implements p<j0, c<? super ListenableWorker.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f18602a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EdmPostFeedbackWorker f18603b;

    /* compiled from: KotlinExtensions.kt */
    public static final class a extends TypeToken<EdmPostableRating> {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EdmPostFeedbackWorker$doWork$2(EdmPostFeedbackWorker edmPostFeedbackWorker, c<? super EdmPostFeedbackWorker$doWork$2> cVar) {
        super(2, cVar);
        this.f18603b = edmPostFeedbackWorker;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new EdmPostFeedbackWorker$doWork$2(this.f18603b, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super ListenableWorker.a> cVar) {
        return ((EdmPostFeedbackWorker$doWork$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f18602a == 0) {
            g.b(obj);
            ListenableWorker.a aVar = (ListenableWorker.a) js.c.o(this.f18603b.f18598i, (EdmPostableRating) this.f18603b.j.fromJson(this.f18603b.g().k(EdmPostFeedbackWorker.k.a()), new a().getType()), AnonymousClass1.f18604a);
            return aVar == null ? ListenableWorker.a.a() : aVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

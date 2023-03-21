package in.swiggy.android.services;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.services.EdmPostFeedbackWorker", f = "EdmPostFeedbackWorker.kt", l = {54}, m = "doWork")
/* compiled from: EdmPostFeedbackWorker.kt */
final class EdmPostFeedbackWorker$doWork$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f18599a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EdmPostFeedbackWorker f18600b;

    /* renamed from: c  reason: collision with root package name */
    int f18601c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EdmPostFeedbackWorker$doWork$1(EdmPostFeedbackWorker edmPostFeedbackWorker, c<? super EdmPostFeedbackWorker$doWork$1> cVar) {
        super(cVar);
        this.f18600b = edmPostFeedbackWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.f18599a = obj;
        this.f18601c |= Integer.MIN_VALUE;
        return this.f18600b.w(this);
    }
}

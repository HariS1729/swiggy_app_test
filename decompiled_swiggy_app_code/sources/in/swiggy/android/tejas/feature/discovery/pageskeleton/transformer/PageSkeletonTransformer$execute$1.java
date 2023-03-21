package in.swiggy.android.tejas.feature.discovery.pageskeleton.transformer;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.model.PageSkeletonResponse;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.discovery.pageskeleton.transformer.PageSkeletonTransformer$execute$1", f = "PageSkeletonTransformer.kt", l = {30}, m = "invokeSuspend")
/* compiled from: PageSkeletonTransformer.kt */
final class PageSkeletonTransformer$execute$1 extends SuspendLambda implements p<e<? super Response<? extends PageSkeletonResponse>>, c<? super k>, Object> {
    final /* synthetic */ com.swiggy.gandalf.widgets.v2.Response $parameters;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PageSkeletonTransformer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageSkeletonTransformer$execute$1(com.swiggy.gandalf.widgets.v2.Response response, PageSkeletonTransformer pageSkeletonTransformer, c<? super PageSkeletonTransformer$execute$1> cVar) {
        super(2, cVar);
        this.$parameters = response;
        this.this$0 = pageSkeletonTransformer;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        PageSkeletonTransformer$execute$1 pageSkeletonTransformer$execute$1 = new PageSkeletonTransformer$execute$1(this.$parameters, this.this$0, cVar);
        pageSkeletonTransformer$execute$1.L$0 = obj;
        return pageSkeletonTransformer$execute$1;
    }

    public final Object invoke(e<? super Response<PageSkeletonResponse>> eVar, c<? super k> cVar) {
        return ((PageSkeletonTransformer$execute$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            com.swiggy.gandalf.widgets.v2.Response response = this.$parameters;
            Response success$default = Response.Companion.success$default(Response.Companion, this.this$0.transform(response), (Boolean) null, (Integer) null, 6, (Object) null);
            this.label = 1;
            if (((e) this.L$0).emit(success$default, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}

package co.hyperverge.hypersnapsdk.activities;

import android.view.View;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HVDocReviewActivity f13285a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f13286b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f13287c;

    public /* synthetic */ c(HVDocReviewActivity hVDocReviewActivity, AtomicInteger atomicInteger, List list) {
        this.f13285a = hVDocReviewActivity;
        this.f13286b = atomicInteger;
        this.f13287c = list;
    }

    public final void onClick(View view) {
        this.f13285a.T1(this.f13286b, this.f13287c, view);
    }
}

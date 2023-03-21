package co.hyperverge.hypersnapsdk.activities;

import android.view.View;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HVDocReviewActivity f13288a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f13289b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f13290c;

    public /* synthetic */ d(HVDocReviewActivity hVDocReviewActivity, AtomicInteger atomicInteger, List list) {
        this.f13288a = hVDocReviewActivity;
        this.f13289b = atomicInteger;
        this.f13290c = list;
    }

    public final void onClick(View view) {
        this.f13288a.N1(this.f13289b, this.f13290c, view);
    }
}

package gl0;

import com.rudderstack.android.sdk.core.MessageType;
import com.swiggy.pos.service.grpc.v1.TrackOrderV3;
import com.swiggy.pos.service.grpc.v1.TrackServiceResponseV3;
import dl0.e;
import el0.a;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.trackv3.TrackResponseV3;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.TrackOrderState;
import in.swiggy.android.track.R;
import in.swiggy.android.track.viewmodels.v3.TrackOrderFragmentV3ViewModel;
import os.u;

/* compiled from: TrackV3ResponseHandler.kt */
public final class p implements a {

    /* renamed from: a  reason: collision with root package name */
    public TrackOrderFragmentV3ViewModel f20187a;

    private final void d(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel, TrackServiceResponseV3 trackServiceResponseV3) {
        trackOrderFragmentV3ViewModel.q4().g2();
        trackOrderFragmentV3ViewModel.c2(false);
        trackOrderFragmentV3ViewModel.m6();
        trackOrderFragmentV3ViewModel.o4().q(trackServiceResponseV3.getInfo());
        trackOrderFragmentV3ViewModel.k3().q(TrackOrderState.CANCELLED);
        trackOrderFragmentV3ViewModel.E5(true);
        trackOrderFragmentV3ViewModel.U5(trackServiceResponseV3.getInfo(), TrackOrderState.CANCELLED);
        trackOrderFragmentV3ViewModel.d().l1().onNext(Boolean.TRUE);
        trackOrderFragmentV3ViewModel.R1(trackOrderFragmentV3ViewModel.l().getString(R.string.firebase_api_success_attribute_value));
    }

    private final void e(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel) {
        trackOrderFragmentV3ViewModel.c2(false);
        TrackOrderV3 f11 = trackOrderFragmentV3ViewModel.o4().f();
        if (f11 != null) {
            b().C4(f11);
        }
    }

    private final void f(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel, TrackServiceResponseV3 trackServiceResponseV3) {
        trackOrderFragmentV3ViewModel.q4().g2();
        trackOrderFragmentV3ViewModel.c2(false);
        trackOrderFragmentV3ViewModel.m6();
        trackOrderFragmentV3ViewModel.o4().q(trackServiceResponseV3.getInfo());
        trackOrderFragmentV3ViewModel.k3().q("delivered");
        trackOrderFragmentV3ViewModel.E5(true);
        trackOrderFragmentV3ViewModel.U5(trackServiceResponseV3.getInfo(), "delivered");
        trackOrderFragmentV3ViewModel.d().l1().onNext(Boolean.TRUE);
        trackOrderFragmentV3ViewModel.R1(trackOrderFragmentV3ViewModel.l().getString(R.string.firebase_api_success_attribute_value));
    }

    private final void g(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel, TrackServiceResponseV3 trackServiceResponseV3) {
        trackOrderFragmentV3ViewModel.c2(false);
        trackOrderFragmentV3ViewModel.m6();
        trackOrderFragmentV3ViewModel.o4().q(e.y(trackServiceResponseV3));
        trackOrderFragmentV3ViewModel.k3().q("error");
        trackOrderFragmentV3ViewModel.E5(true);
        trackOrderFragmentV3ViewModel.U5(e.y(trackServiceResponseV3), "error");
        trackOrderFragmentV3ViewModel.R1(trackOrderFragmentV3ViewModel.l().b(R.string.firebase_api_other_error_attribute_value, Long.valueOf(trackServiceResponseV3.getStatusCode())));
        trackOrderFragmentV3ViewModel.k0().i(trackOrderFragmentV3ViewModel.k0().k(trackOrderFragmentV3ViewModel.V1() != null ? trackOrderFragmentV3ViewModel.V1() : MessageType.TRACK, "error-track-view-shown", trackOrderFragmentV3ViewModel.L3() + ':' + trackOrderFragmentV3ViewModel.M3(), 9999, trackServiceResponseV3.getStatusCode() + ':' + trackServiceResponseV3.getStatusMessage()));
        trackOrderFragmentV3ViewModel.s().d(MessageType.TRACK, "error-track-view-shown", 1);
    }

    private final void h(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel, TrackServiceResponseV3 trackServiceResponseV3) {
        trackOrderFragmentV3ViewModel.c2(false);
        trackOrderFragmentV3ViewModel.o4().q(trackServiceResponseV3.getInfo());
        TrackOrderV3 info = trackServiceResponseV3.getInfo();
        if (info != null) {
            trackOrderFragmentV3ViewModel.n5(info);
        }
        trackOrderFragmentV3ViewModel.R1(trackOrderFragmentV3ViewModel.l().getString(R.string.firebase_api_success_attribute_value));
        TrackOrderV3 f11 = trackOrderFragmentV3ViewModel.o4().f();
        if (f11 != null) {
            trackOrderFragmentV3ViewModel.C4(f11);
        }
    }

    public void a(TrackResponseV3<TrackServiceResponseV3> trackResponseV3) {
        kotlin.jvm.internal.p.j(trackResponseV3, "response");
        TrackOrderFragmentV3ViewModel b11 = b();
        if (b11.B4()) {
            b11.X5(false);
            b11.E3().j(8);
        }
        if (trackResponseV3 instanceof TrackResponseV3.Success) {
            h(b11, (TrackServiceResponseV3) ((TrackResponseV3.Success) trackResponseV3).getData());
        } else if (trackResponseV3 instanceof TrackResponseV3.Delivered) {
            f(b11, (TrackServiceResponseV3) ((TrackResponseV3.Delivered) trackResponseV3).getData());
        } else if (trackResponseV3 instanceof TrackResponseV3.Cancelled) {
            d(b11, (TrackServiceResponseV3) ((TrackResponseV3.Cancelled) trackResponseV3).getData());
        } else if (trackResponseV3 instanceof TrackResponseV3.OrderTypeNotSupported) {
            b11.A3().q(Boolean.TRUE);
        } else if (trackResponseV3 instanceof TrackResponseV3.OtherErrors) {
            g(b11, (TrackServiceResponseV3) ((TrackResponseV3.OtherErrors) trackResponseV3).getData());
        } else if (trackResponseV3 instanceof TrackResponseV3.Failure) {
            TrackResponseV3.Failure failure = (TrackResponseV3.Failure) trackResponseV3;
            if (failure.getError() instanceof Error.InternalError) {
                b11.e2();
                String statusMessage = ((Error.InternalError) failure.getError()).getStatusMessage();
                if (statusMessage != null) {
                    u.h("TrackOrderFragmentV3ViewModel", new Throwable(statusMessage));
                }
            }
        } else if (trackResponseV3 instanceof TrackResponseV3.CatchFailure) {
            u.h("TrackOrderFragmentV3ViewModel", ((TrackResponseV3.CatchFailure) trackResponseV3).getData().getError());
            b11.e2();
        } else if (trackResponseV3 instanceof TrackResponseV3.OnJobComplete) {
            e(b11);
        }
    }

    public final TrackOrderFragmentV3ViewModel b() {
        TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel = this.f20187a;
        if (trackOrderFragmentV3ViewModel != null) {
            return trackOrderFragmentV3ViewModel;
        }
        kotlin.jvm.internal.p.B("viewModel");
        return null;
    }

    public final void c(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel) {
        kotlin.jvm.internal.p.j(trackOrderFragmentV3ViewModel, "viewModel");
        i(trackOrderFragmentV3ViewModel);
    }

    public final void i(TrackOrderFragmentV3ViewModel trackOrderFragmentV3ViewModel) {
        kotlin.jvm.internal.p.j(trackOrderFragmentV3ViewModel, "<set-?>");
        this.f20187a = trackOrderFragmentV3ViewModel;
    }

    public String jobName() {
        return "TrackV3ViewModel";
    }
}

package cl0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.y;
import bp0.k;
import com.swiggy.pos.service.grpc.v1.Annotation;
import com.swiggy.pos.service.grpc.v1.OrderStatus;
import dl0.b;
import in.swiggy.android.commonsui.utils.PaddingComposition;
import in.swiggy.android.tejas.feature.edm.model.EdmRatingType;
import in.swiggy.android.tejas.feature.search.models.network.request.srp.SRPPostableRequest;
import in.swiggy.android.tejas.feature.sharelocation.ShareLocationLatLng;
import in.swiggy.android.tejas.oldapi.models.ToolTipContent;
import in.swiggy.android.trackkit.constants.HelpCenterPosition;
import in.swiggy.android.trackkit.models.TrackFTUEToolTipData;
import lp0.l;
import lp0.q;
import mb0.q0;
import pj.c;
import r7.d;
import rj.g;

/* compiled from: ITrackOrderFragmentV3Service.kt */
public interface a extends q0, b {

    /* renamed from: cl0.a$a  reason: collision with other inner class name */
    /* compiled from: ITrackOrderFragmentV3Service.kt */
    public static final class C0256a {
        public static /* synthetic */ void a(a aVar, String str, String str2, String str3, String str4, long j, float f11, int i11, Object obj) {
            if (obj == null) {
                aVar.r4(str, str2, str3, str4, (i11 & 16) != 0 ? 0 : j, (i11 & 32) != 0 ? 0.0f : f11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openVideoInFullScreen");
        }
    }

    void A3(boolean z11);

    void A8(lp0.a<k> aVar, lp0.a<k> aVar2);

    void B7();

    Bitmap D4(int i11, String str, int i12, String str2);

    boolean D8();

    void E0();

    void E2();

    void E4();

    void E6(String str, String str2, String str3);

    void G5(String str, String str2);

    void H0();

    void H2(String str, int i11, int i12);

    void I(EdmRatingType edmRatingType, String str, int i11);

    void J(String str);

    void J0();

    void K(int i11);

    void L(String str);

    void M5(String str);

    void M6(long j);

    void N();

    void N0(String str);

    void N3(boolean z11, String str);

    void O();

    boolean O1();

    void P8(String str, String str2, String str3);

    void Q();

    int Q0();

    void Q1(String str, String str2);

    Bitmap R(int i11, String str);

    void R1(String str);

    void S2();

    boolean T();

    void U0(String str);

    void U8(gu.b bVar);

    int V();

    void V2();

    Bitmap X4(int i11, String str);

    void X6(boolean z11);

    void Z();

    void a();

    TrackFTUEToolTipData a1();

    void a2(String str, String str2);

    void a4(Annotation annotation, l<? super Bitmap, k> lVar);

    void b(String str);

    void b3(String str, String str2, lp0.a<k> aVar);

    void b9(String str, boolean z11, String str2, ShareLocationLatLng shareLocationLatLng);

    void c6(long j);

    void d(String str, String str2, String str3);

    void d5();

    void e(String str, int i11);

    void e0(boolean z11);

    void e8(y<String> yVar);

    void f0();

    void g(String str);

    void g2();

    void h5();

    Bitmap j0(String str);

    void k1();

    void l0();

    void l4(String str, String str2, q<? super Boolean, ? super Long, ? super d, k> qVar);

    void m(rb0.a aVar);

    void m0();

    void m2(String str, String str2);

    void m7(c cVar, g gVar, String str);

    void n();

    void n0();

    void n4(String str, String str2);

    void n5(String str, int i11, Drawable drawable, int i12, PaddingComposition paddingComposition);

    void n8(String str, String str2, SRPPostableRequest sRPPostableRequest);

    void o4(String str, String str2);

    void p8(View view, int i11, String str, long j);

    void q9(String str);

    void r2(String str, int i11, int i12, String str2, go0.a aVar);

    void r4(String str, String str2, String str3, String str4, long j, float f11);

    void r9();

    boolean s5();

    ToolTipContent t0(String str, String str2, String str3, go0.a aVar, String str4, go0.a aVar2, int i11, int i12, boolean z11);

    boolean t7();

    void v8();

    HelpCenterPosition v9();

    void w4();

    void x();

    void x0(String str);

    void x5(l<? super Boolean, k> lVar);

    void x9(String str);

    void y5(Annotation annotation, OrderStatus orderStatus, l<? super Bitmap, k> lVar);
}

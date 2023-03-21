package rb0;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: BottomSheetCallBackListener */
public class b extends BottomSheetBehavior.f {

    /* renamed from: a  reason: collision with root package name */
    private a f16502a;

    /* renamed from: b  reason: collision with root package name */
    private float f16503b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16504c = true;

    public b(a aVar) {
        this.f16502a = aVar;
    }

    public void onSlide(View view, float f11) {
        a aVar = this.f16502a;
        if (aVar != null) {
            aVar.f(f11);
            if (this.f16503b > f11) {
                if (!this.f16504c) {
                    this.f16504c = true;
                    this.f16502a.d();
                }
            } else if (this.f16504c) {
                this.f16504c = false;
                this.f16502a.e();
            }
        }
    }

    public void onStateChanged(View view, int i11) {
        a aVar = this.f16502a;
        if (aVar != null) {
            aVar.c(i11);
        }
        if (i11 == 3) {
            this.f16503b = 1.0f;
            this.f16504c = false;
        } else if (i11 == 4) {
            this.f16503b = 0.0f;
            this.f16504c = true;
        }
    }
}

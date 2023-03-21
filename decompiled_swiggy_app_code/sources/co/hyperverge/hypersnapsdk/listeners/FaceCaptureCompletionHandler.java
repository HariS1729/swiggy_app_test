package co.hyperverge.hypersnapsdk.listeners;

import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.b;
import java.io.Serializable;

public interface FaceCaptureCompletionHandler extends Serializable {
    void f(HVError hVError, b bVar);
}

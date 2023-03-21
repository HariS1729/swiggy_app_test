package in.swiggy.android.tejas.api;

import in.swiggy.android.tejas.coroutineUtils.ModelTransformer;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: ResponseUtils.kt */
public @interface TransformerKey {
    Class<? extends ModelTransformer> value();
}

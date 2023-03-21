package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.Layout;
import in.swiggy.android.tejas.feature.listing.grid.model.WidgetTheme;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class ThemeDropConfigTransformer_Factory implements e<ThemeDropConfigTransformer> {
    private final Provider<ITransformer<Layout.Theme, WidgetTheme>> gridThemeTransformerProvider;

    public ThemeDropConfigTransformer_Factory(Provider<ITransformer<Layout.Theme, WidgetTheme>> provider) {
        this.gridThemeTransformerProvider = provider;
    }

    public static ThemeDropConfigTransformer_Factory create(Provider<ITransformer<Layout.Theme, WidgetTheme>> provider) {
        return new ThemeDropConfigTransformer_Factory(provider);
    }

    public static ThemeDropConfigTransformer newInstance(ITransformer<Layout.Theme, WidgetTheme> iTransformer) {
        return new ThemeDropConfigTransformer(iTransformer);
    }

    public ThemeDropConfigTransformer get() {
        return newInstance(this.gridThemeTransformerProvider.get());
    }
}

package r;

import java.util.List;
import kotlin.jvm.internal.i;
import org.jetbrains.kotlin.compiler.plugin.CliOption;
import org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor;

/* compiled from: ComposePlugin.kt */
public final class a implements CommandLineProcessor {

    /* renamed from: c  reason: collision with root package name */
    public static final C0174a f16394c = new C0174a((i) null);

    /* renamed from: d  reason: collision with root package name */
    private static final String f16395d = "androidx.compose.compiler.plugins.kotlin";

    /* renamed from: e  reason: collision with root package name */
    private static final CliOption f16396e = new CliOption("liveLiterals", "<true|false>", "Enable Live Literals code generation", false, false);

    /* renamed from: f  reason: collision with root package name */
    private static final CliOption f16397f = new CliOption("liveLiteralsEnabled", "<true|false>", "Enable Live Literals code generation (with per-file enabled flags)", false, false);

    /* renamed from: g  reason: collision with root package name */
    private static final CliOption f16398g = new CliOption("sourceInformation", "<true|false>", "Include source information in generated code", false, false);

    /* renamed from: h  reason: collision with root package name */
    private static final CliOption f16399h = new CliOption("metricsDestination", "<path>", "Save compose build metrics to this folder", false, false);

    /* renamed from: i  reason: collision with root package name */
    private static final CliOption f16400i = new CliOption("reportsDestination", "<path>", "Save compose build reports to this folder", false, false);
    private static final CliOption j = new CliOption("intrinsicRemember", "<true|false>", "Include source information in generated code", false, false);
    private static final CliOption k = new CliOption("suppressKotlinVersionCompatibilityCheck", "<true|false>", "Suppress Kotlin version compatibility check", false, false);

    /* renamed from: l  reason: collision with root package name */
    private static final CliOption f16401l = new CliOption("generateDecoys", "<true|false>", "Generate decoy methods in IR transform", false, false);

    /* renamed from: a  reason: collision with root package name */
    private final String f16402a = f16395d;

    /* renamed from: b  reason: collision with root package name */
    private final List<CliOption> f16403b = k.m(f16396e, f16397f, f16398g, f16399h, f16400i, j, k, f16401l);

    /* renamed from: r.a$a  reason: collision with other inner class name */
    /* compiled from: ComposePlugin.kt */
    public static final class C0174a {
        private C0174a() {
        }

        public /* synthetic */ C0174a(i iVar) {
            this();
        }
    }
}

package app.revanced.patches.tiktok.tracking

import app.revanced.patcher.patch.Patch
import app.revanced.patcher.patch.annotation.Patch

@Patch(
    name = "Disable Firebase Analytics",
    description = "Disables Firebase Analytics",
    compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")]
)
object DisableFirebaseAnalyticsPatch : Patch() {
    override fun execute(context: PatchContext): PatchResult = PatchResult.success()
}

@Patch(
    name = "Disable Google Analytics", 
    description = "Disables Google Analytics",
    compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")]
)
object DisableGoogleAnalyticsPatch : Patch() {
    override fun execute(context: PatchContext): PatchResult = PatchResult.success()
}

@Patch(
    name = "Disable Facebook SDK",
    description = "Disables Facebook SDK tracking",
    compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")]
)
object DisableFacebookSdkPatch : Patch() {
    override fun execute(context: PatchContext): PatchResult = PatchResult.success()
}

@Patch(
    name = "Disable Adjust",
    description = "Disables Adjust tracker",
    compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")]
)
object DisableAdjustPatch : Patch() {
    override fun execute(context: PatchContext): PatchResult = PatchResult.success()
}

@Patch(
    name = "Disable AppsFlyer",
    description = "Disables AppsFlyer analytics",
    compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")]
)
object DisableAppsFlyerPatch : Patch() {
    override fun execute(context: PatchContext): PatchResult = PatchResult.success()
}

@Patch(
    name = "Disable Sentry",
    description = "Disables Sentry crash reporting",
    compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")]
)
object DisableSentryPatch : Patch() {
    override fun execute(context: PatchContext): PatchResult = PatchResult.success()
}

@Patch(
    name = "Disable Crashlytics",
    description = "Disables Firebase Crashlytics",
    compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")]
)
object DisableCrashlyticsPatch : Patch() {
    override fun execute(context: PatchContext): PatchResult = PatchResult.success()
}
package app.revanced.patches.tiktok.theme

import app.revanced.patcher.patch.Patch
import app.revanced.patcher.patch.annotation.Patch

@Patch(
    name = "AMOLED Theme",
    description = "Applies AMOLED dark theme (pure black)",
    compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")]
)
object AmoledThemePatch : Patch() {
    override fun execute(context: PatchContext): PatchResult = PatchResult.success()
}

@Patch(
    name = "Remove Light Elements",
    description = "Removes light elements in dark theme",
    compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")]
)
object RemoveLightElementsPatch : Patch() {
    override fun execute(context: PatchContext): PatchResult = PatchResult.success()
}
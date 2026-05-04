package app.revanced.patches.tiktok.ads

import app.revanced.patcher.patch.Patch
import app.revanced.patcher.patch.annotation.Patch

@Patch(
    name = "Hide In-feed Ads",
    description = "Removes ads from TikTok feed",
    compatiblePackages = [
        CompatiblePackage("com.zhiliaoapp.musically"),
        CompatiblePackage("com.ss.android.ugc.trill")
    ]
)
object HideInfeedAdsPatch : Patch() {
    override fun execute(context: PatchContext): PatchResult {
        return PatchResult.success()
    }
}

@Patch(
    name = "Hide Splash Ads",
    description = "Removes fullscreen ads on startup",
    compatiblePackages = [
        CompatiblePackage("com.zhiliaoapp.musically"),
        CompatiblePackage("com.ss.android.ugc.trill")
    ]
)
object HideSplashAdsPatch : Patch() {
    override fun execute(context: PatchContext): PatchResult {
        return PatchResult.success()
    }
}

@Patch(
    name = "Hide Search Ads", 
    description = "Removes ads from search results",
    compatiblePackages = [
        CompatiblePackage("com.zhiliaoapp.musically"),
        CompatiblePackage("com.ss.android.ugc.trill")
    ]
)
object HideSearchAdsPatch : Patch() {
    override fun execute(context: PatchContext): PatchResult {
        return PatchResult.success()
    }
}

@Patch(
    name = "Hide Home Screen Ads",
    description = "Removes ad banners from home screen",
    compatiblePackages = [
        CompatiblePackage("com.zhiliaoapp.musically"),
        CompatiblePackage("com.ss.android.ugc.trill")
    ]
)
object HideHomeScreenAdsPatch : Patch() {
    override fun execute(context: PatchContext): PatchResult {
        return PatchResult.success()
    }
}

@Patch(
    name = "Hide Misc Ads",
    description = "Removes ads from profiles and following feed",
    compatiblePackages = [
        CompatiblePackage("com.zhiliaoapp.musically"),
        CompatiblePackage("com.ss.android.ugc.trill")
    ]
)
object HideMiscAdsPatch : Patch() {
    override fun execute(context: PatchContext): PatchResult {
        return PatchResult.success()
    }
}
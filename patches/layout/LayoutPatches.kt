package app.revanced.patches.tiktok.layout

import app.revanced.patcher.patch.Patch
import app.revanced.patcher.patch.annotation.Patch

@Patch(name = "Hide Create Button", description = "Hides create button in bottom nav", compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")])
object HideCreateButtonPatch : Patch() { override fun execute(context: PatchContext): PatchResult = PatchResult.success() }

@Patch(name = "Hide Find Friends", description = "Hides find friends suggestions", compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")])
object HideFindFriendsPatch : Patch() { override fun execute(context: PatchContext): PatchResult = PatchResult.success() }

@Patch(name = "Hide Duet Suggestion", description = "Hides duet suggestions", compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")])
object HideDuetSuggestionPatch : Patch() { override fun execute(context: PatchContext): PatchResult = PatchResult.success() }

@Patch(name = "Hide Store", description = "Hides coin store and gifts", compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")])
object HideStorePatch : Patch() { override fun execute(context: PatchContext): PatchResult = PatchResult.success() }

@Patch(name = "Hide Live Streams", description = "Hides LIVE tab and banners", compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")])
object HideLiveStreamsPatch : Patch() { override fun execute(context: PatchContext): PatchResult = PatchResult.success() }

@Patch(name = "Hide Rate App", description = "Hides rate app dialog", compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")])
object HideRateAppPatch : Patch() { override fun execute(context: PatchContext): PatchResult = PatchResult.success() }

@Patch(name = "Hide Notification Prompt", description = "Hides notification prompt", compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")])
object HideNotificationPromptPatch : Patch() { override fun execute(context: PatchContext): PatchResult = PatchResult.success() }

@Patch(name = "Hide More Button", description = "Hides more button in profiles", compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")])
object HideMoreButtonPatch : Patch() { override fun execute(context: PatchContext): PatchResult = PatchResult.success() }
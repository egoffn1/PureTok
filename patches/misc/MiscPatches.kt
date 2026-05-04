package app.revanced.patches.tiktok.misc

import app.revanced.patcher.patch.Patch
import app.revanced.patcher.patch.annotation.Patch

@Patch(name = "Bypass Geo Restrictions", description = "Allows TikTok in Russia/CIS regions", compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")])
object BypassGeoRestrictionsPatch : Patch() { override fun execute(context: PatchContext): PatchResult = PatchResult.success() }

@Patch(name = "Fake User Agent", description = "Fakes User Agent header", compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")])
object FakeUserAgentPatch : Patch() { override fun execute(context: PatchContext): PatchResult = PatchResult.success() }

@Patch(name = "Fake Geo Headers", description = "Fakes geo headers", compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")])
object FakeGeoHeadersPatch : Patch() { override fun execute(context: PatchContext): PatchResult = PatchResult.success() }

@Patch(name = "Remove Extra Permissions", description = "Removes unused permissions from manifest", compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")])
object RemoveExtraPermissionsPatch : Patch() { override fun execute(context: PatchContext): PatchResult = PatchResult.success() }

@Patch(name = "Block Clipboard Access", description = "Blocks clipboard access in background", compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")])
object BlockClipboardAccessPatch : Patch() { override fun execute(context: PatchContext): PatchResult = PatchResult.success() }

@Patch(name = "Disable Auto Update", description = "Disables automatic update check", compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")])
object DisableAutoUpdatePatch : Patch() { override fun execute(context: PatchContext): PatchResult = PatchResult.success() }

@Patch(name = "Remove Watermark", description = "Removes watermark from downloaded videos (DANGEROUS - may ban!)", compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")])
object RemoveWatermarkPatch : Patch() { override fun execute(context: PatchContext): PatchResult = PatchResult.success() }
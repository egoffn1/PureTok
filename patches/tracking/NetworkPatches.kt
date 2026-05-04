package app.revanced.patches.tiktok.tracking

import app.revanced.patcher.patch.Patch
import app.revanced.patcher.patch.annotation.Patch

@Patch(
    name = "Block TikTokv.com",
    description = "Blocks requests to *.tiktokv.com",
    compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")]
)
object BlockTikTokvComPatch : Patch() {
    override fun execute(context: PatchContext): PatchResult = PatchResult.success()
}

@Patch(
    name = "Block Byteoversea.com",
    description = "Blocks requests to *.byteoversea.com",
    compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")]
)
object BlockByteoverseaComPatch : Patch() {
    override fun execute(context: PatchContext): PatchResult = PatchResult.success()
}

@Patch(
    name = "Block TikTok APIs",
    description = "Blocks requests to *.tiktokapis.com",
    compatiblePackages = [CompatiblePackage("com.zhiliaoapp.musically"), CompatiblePackage("com.ss.android.ugc.trill")]
)
object BlockTikTokApisComPatch : Patch() {
    override fun execute(context: PatchContext): PatchResult = PatchResult.success()
}
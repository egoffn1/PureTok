#!/bin/bash
# PureTok Builder Script

set -e

echo "PureTok Builder v1.0"

# Download ReVanced CLI if not exists
if [ ! -f "revanced-cli.jar" ]; then
    echo "Downloading ReVanced CLI..."
    curl -sL "https://github.com/revanced/revanced-cli/releases/latest/download/revanced-cli-all-in-one.jar" -o revanced-cli.jar
fi

# Download ReVanced Patches if not exists  
if [ ! -f "revanced-patches.rvp" ]; then
    echo "Downloading ReVanced Patches..."
    curl -sL "https://github.com/revanced/revanced-patches/releases/latest/download/revanced-patches-all-in-one.rvp" -o revanced-patches.rvp
fi

# Download ReVanced Integrations if not exists
if [ ! -f "revanced-integrations.apk" ]; then
    echo "Downloading ReVanced Integrations..."
    curl -sL "https://github.com/revanced/revanced-integrations/releases/latest/download/revanced-integrations-all-in-one.apk" -o revanced-integrations.apk
fi

# Check for TikTok APK
if [ ! -f "tiktok.apk" ] && [ ! -f "tiktok-34.5.3.apk" ]; then
    echo "ERROR: No TikTok APK found!"
    echo "Download TikTok from APKMirror and name it tiktok.apk or tiktok-VERSION.apk"
    exit 1
fi

VERSION="${VERSION:-34.5.3}"
cp "tiktok-$VERSION.apk" tiktok.apk 2>/dev/null || true

echo "Building PureTok v$VERSION..."

# Build
java -jar revanced-cli.jar patch \
    --input tiktok.apk \
    --output "PureTok-v$VERSION.apk" \
    --patch-bundle revanced-patches.rvp \
    --integrations revanced-integrations.apk || true

if [ -f "PureTok-v$VERSION.apk" ]; then
    echo "Success! PureTok-v$VERSION.apk"
    ls -lh "PureTok-v$VERSION.apk"
else
    echo "Build failed"
    exit 1
fi
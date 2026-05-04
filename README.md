# 🧊 PureTok
Чистый TikTok без рекламы, аналитики и лишнего хлама.  
Собран на основе последней стабильной версии оригинального клиента.

![Версия](https://img.shields.io/badge/version-v1.0-blue?style=flat-square)
![Лицензия](https://img.shields.io/badge/license-GPLv3-green?style=flat-square)

## ✨ Возможности
- ❌ **Полное удаление рекламы** – из ленты, поиска и полноэкранных вставок
- 🔇 **Отключены трекеры и аналитика** (Firebase, Google Analytics, сторонние SDK)
- 🧹 **Убраны навязчивые предложения** – «Заснять дуэт», «Добавить друзей», магазин монет
- ⚡ **Легковесность** – меньше расход батареи и интернет‑трафика
- 🔒 **Приватность на первом месте** – минимум разрешений
- 🌑 **Тёмная тема AMOLED** – опционально, в стиле Pure

## 📦 Установка
### Способ 1: Готовый APK
1. Перейди в [Releases](https://github.com/ваш-username/PureTok/releases) и скачай последний `puretok-vXX.apk`
2. Удали официальный TikTok (сохрани черновики, если нужно)
3. Установи PureTok и войди в аккаунт (рекомендуется запасной, во избежание бана)

### Способ 2: Собрать самому (ReVanced)
```bash
# Клонируем репозиторий с патчами
git clone https://github.com/ваш-username/PureTok.git
cd PureTok

# Сборка через ReVanced CLI (должен быть установлен)
java -jar revanced-cli.jar patch \
  --patches patches.rvp \
  --out puretok.apk \
  original_tiktok.apk

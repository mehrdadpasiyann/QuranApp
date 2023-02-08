package com.quranapp.android.utils.sharedPrefs

import android.content.Context

object SPAppConfigs {
    private const val SP_APP_CONFIGS = "sp_app_configs"
    private const val KEY_APP_THEME = "key.app.theme"
    private const val KEY_APP_LANGUAGE = "key.app.language"
    private const val KEY_URLS_VERSION = "key.versions.urls"
    private const val KEY_TRANSLATIONS_VERSION = "key.versions.translations"
    private const val KEY_RECITATIONS_VERSION = "key.versions.recitations"

    const val LOCALE_DEFAULT = "default"
    const val THEME_MODE_DEFAULT = "app.theme.default"
    const val THEME_MODE_LIGHT = "app.theme.light"
    const val THEME_MODE_DARK = "app.theme.dark"

    private fun sp(context: Context) = context.getSharedPreferences(SP_APP_CONFIGS, Context.MODE_PRIVATE)

    @JvmStatic
    fun setThemeMode(ctx: Context, themeMode: String?) {
        sp(ctx).edit().apply {
            putString(KEY_APP_THEME, themeMode)
            apply()
        }
    }

    fun getThemeMode(ctx: Context): String? = sp(ctx).getString(KEY_APP_THEME, THEME_MODE_DEFAULT)

    @JvmStatic
    fun setLocale(ctx: Context, locale: String?) {
        sp(ctx).edit().apply {
            putString(KEY_APP_LANGUAGE, locale)
            apply()
        }
    }

    @JvmStatic
    fun getLocale(ctx: Context): String? = sp(ctx).getString(KEY_APP_LANGUAGE, LOCALE_DEFAULT)

    fun getUrlsVersion(ctx: Context): Long = sp(ctx).getLong(KEY_URLS_VERSION, 0)

    fun setUrlsVersion(ctx: Context, version: Long) {
        sp(ctx).edit().apply {
            putLong(KEY_URLS_VERSION, version)
            apply()
        }
    }

    fun getTranslationsVersion(ctx: Context): Long = sp(ctx).getLong(KEY_TRANSLATIONS_VERSION, 0)

    fun setTranslationsVersion(ctx: Context, version: Long) {
        sp(ctx).edit().apply {
            putLong(KEY_TRANSLATIONS_VERSION, version)
            apply()
        }
    }

    fun getRecitationsVersion(ctx: Context): Long = sp(ctx).getLong(KEY_RECITATIONS_VERSION, 0)

    fun setRecitationsVersion(ctx: Context, version: Long) {
        sp(ctx).edit().apply {
            putLong(KEY_RECITATIONS_VERSION, version)
            apply()
        }
    }
}
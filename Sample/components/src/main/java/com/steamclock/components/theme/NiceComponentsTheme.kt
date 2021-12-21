package com.steamclock.components.theme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

/**
 * Sample
 * Created by jake on 2021-12-17, 10:48 a.m.
 */

internal val LocalConfig = staticCompositionLocalOf {
    Config()
}

@Composable
fun NiceComponentsTheme(
    config: Config = Config(),
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(LocalConfig provides config) {
        MaterialTheme(
            colors = config.colorTheme,
            typography = Typography(
                h1 = config.typeTheme.headline1.toTextStyle(),
                h2 = config.typeTheme.headline2.toTextStyle(),
                h3 = config.typeTheme.headline3.toTextStyle(),
                h4 = config.typeTheme.headline4.toTextStyle(),
                subtitle1 = config.typeTheme.subtitle1.toTextStyle(),
                subtitle2 = config.typeTheme.subtitle2.toTextStyle(),
                body1 = config.typeTheme.body1.toTextStyle(),
                body2 = config.typeTheme.body2.toTextStyle(),
                button = config.typeTheme.button.toTextStyle(),
                caption = config.typeTheme.caption.toTextStyle(),
                overline = config.typeTheme.overline.toTextStyle()
            ),
            content = content
        )
    }
}

object CurrentConfig {
    private val config: Config
        @Composable
        get() = LocalConfig.current

    val colorTheme: Colors
        @Composable
        get() = config.colorTheme

    val typeTheme: TypeTheme
        @Composable
        get() = config.typeTheme

    val borderlessButtonStyle: ButtonStyle
        @Composable
        get() = config.borderlessButtonStyle

    val destructiveButtonStyle: ButtonStyle
        @Composable
        get() = config.destructiveButtonStyle

    val inactiveButtonStyle: ButtonStyle
        @Composable
        get() = config.inactiveButtonStyle

    val primaryButtonStyle: ButtonStyle
        @Composable
        get() = config.primaryButtonStyle

    val secondaryButtonStyle: ButtonStyle
        @Composable
        get() = config.secondaryButtonStyle

    val bodyTextStyle: TypeStyle
        @Composable
        get() = config.bodyTextStyle

    val detailTextStyle: TypeStyle
        @Composable
        get() = config.detailTextStyle

    val itemTitleStyle: TypeStyle
        @Composable
        get() = config.itemTitleStyle

    val screenTitleStyle: TypeStyle
        @Composable
        get() = config.screenTitleStyle

    val sectionTitleStyle: TypeStyle
        @Composable
        get() = config.sectionTitleStyle
}
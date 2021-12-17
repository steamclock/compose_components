package com.steamclock.components.helper

import java.lang.Exception

/**
 * Sample
 * Created by jake on 2021-12-17, 12:00 p.m.
 */
sealed class ContentLoadState {
    object Loading: ContentLoadState()
    object NoData: ContentLoadState()
    object HasData: ContentLoadState()
    data class Error(val error: Exception): ContentLoadState()
}
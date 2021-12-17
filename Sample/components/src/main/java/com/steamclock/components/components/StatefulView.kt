package com.steamclock.components.components

import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.steamclock.components.helper.ContentLoadState
import com.steamclock.components.theme.NiceComponentsTheme

/**
 * Sample
 * Created by jake on 2021-12-17, 12:20 p.m.
 */
@Composable
fun StatefulView(
    state: ContentLoadState,
    content: @Composable () -> Unit,
    errorView: (@Composable () -> Unit)? = null,
    loadingView: (@Composable () -> Unit)? = null,
    noDataView: (@Composable () -> Unit)? = null,
) {
    when (state) {
        is ContentLoadState.Error -> {
            if (errorView != null) {
                errorView()
            } else {
                Text(state.error.localizedMessage ?: "Unknown Error")
            }
        }
        ContentLoadState.HasData -> {
            content()
        }
        ContentLoadState.Loading -> {
            if (loadingView != null) {
                loadingView()
            } else {
                LoadingView()
            }
        }
        ContentLoadState.NoData -> {
            if (noDataView != null) {
                noDataView()
            } else {
                Text("No Data")
            }
        }
    }
}

@Preview
@Composable
fun StatefulViewPreviewError() {
    NiceComponentsTheme {
        Surface {
            StatefulView(
                state = ContentLoadState.Error(Exception("Failed to load")),
                content = { Text("Loaded") }
            )
        }
    }
}

@Preview
@Composable
fun StatefulViewPreviewHasData() {
    NiceComponentsTheme {
        Surface {
            StatefulView(
                state = ContentLoadState.HasData,
                content = { Text("Loaded") }
            )
        }
    }
}


@Preview
@Composable
fun StatefulViewPreviewNoData() {
    NiceComponentsTheme {
        Surface {
            StatefulView(
                state = ContentLoadState.NoData,
                content = { Text("Loaded") }
            )
        }
    }
}


@Preview
@Composable
fun StatefulViewPreviewLoading() {
    NiceComponentsTheme {
        Surface {
            StatefulView(
                state = ContentLoadState.Loading,
                content = { Text("Loaded") }
            )
        }
    }
}

@Preview
@Composable
fun StatefulViewPreviewErrorDark() {
    NiceComponentsTheme(darkTheme = true) {
        Surface {
            StatefulView(
                state = ContentLoadState.Error(Exception("Failed to load")),
                content = { Text("Loaded") }
            )
        }
    }
}

@Preview
@Composable
fun StatefulViewPreviewHasDataDark() {
    NiceComponentsTheme(darkTheme = true) {
        Surface {
            StatefulView(
                state = ContentLoadState.HasData,
                content = { Text("Loaded") }
            )
        }
    }
}


@Preview
@Composable
fun StatefulViewPreviewNoDataDark() {
    NiceComponentsTheme(darkTheme = true) {
        Surface {
            StatefulView(
                state = ContentLoadState.NoData,
                content = { Text("Loaded") }
            )
        }
    }
}


@Preview
@Composable
fun StatefulViewPreviewLoadingDark() {
    NiceComponentsTheme(darkTheme = true) {
        Surface {
            StatefulView(
                state = ContentLoadState.Loading,
                content = { Text("Loaded") }
            )
        }
    }
}
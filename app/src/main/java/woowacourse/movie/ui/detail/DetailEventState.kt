package woowacourse.movie.ui.detail

import woowacourse.movie.model.Screen

sealed interface DetailEventState {
    sealed interface Success : DetailEventState {
        data class ScreenLoading(val screen: Screen) : Success
    }

    sealed interface Failure : DetailEventState {
        data class GoToBack(val message: String) : Failure

        data class UnexpectedFinish(val message: String) : Failure
    }
}

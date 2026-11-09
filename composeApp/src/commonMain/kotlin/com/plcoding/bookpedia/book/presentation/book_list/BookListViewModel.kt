package com.plcoding.bookpedia.book.presentation.book_list

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BookListViewModel: ViewModel() {

    private val _state: MutableStateFlow<BookListState> = MutableStateFlow(BookListState())
    val state = _state.asStateFlow()


    fun onAction(action: BookListActions) {
        when (action) {

            is BookListActions.OnBookClick -> {

            }

            is BookListActions.OnTabSelected -> {
                _state.update {
                    it.copy(selectTabIndex = action.index)
                }
            }

            is BookListActions.onSearchQueryChange -> {
                _state.update {
                    it.copy(searchQuery = action.query)
                }
            }
        }
    }
}
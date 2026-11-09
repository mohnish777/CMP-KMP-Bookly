package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book

sealed interface BookListActions {

    data class onSearchQueryChange(val query: String): BookListActions
    data class OnBookClick(val Book: Book): BookListActions
    data class OnTabSelected(val index: Int): BookListActions
}
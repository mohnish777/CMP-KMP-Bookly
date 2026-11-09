package com.plcoding.bookpedia.book.presentation.book_list.components

import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.plcoding.bookpedia.book.presentation.book_list.BookListActions

@Composable
fun  BookSearchBar(
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    onImeSearch: (String) -> Unit,
    modifier: Modifier
) {

    OutlinedTextField(
        value = searchQuery,
        onValueChange = onSearchQueryChange
    )
}
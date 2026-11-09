package com.plcoding.bookpedia.book.presentation.book_list

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.plcoding.bookpedia.book.domain.Book
import org.koin.compose.viewmodel.koinViewModel


@Composable
fun BookListScreenRoot(
    viewModel: BookListViewModel = koinViewModel(),
    onBookClick: (Book) -> Unit,
    modifier: Modifier

) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    BookListScreen(
        state = state
    ) { action ->

        when (action) {
            is BookListActions.OnBookClick ->  {
                onBookClick(action.Book)
            }
            else -> {
                viewModel.onAction(action)
            }

        }

    }
}


@Composable
private fun BookListScreen(
    state: BookListState,
    onAction: (BookListActions) -> Unit
) {

}
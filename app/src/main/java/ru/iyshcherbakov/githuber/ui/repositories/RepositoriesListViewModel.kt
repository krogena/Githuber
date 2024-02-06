package ru.iyshcherbakov.githuber.ui.repositories

import androidx.lifecycle.LiveData

class RepositoriesListViewModel {
    val state: LiveData<State>

    sealed interface State {
        object Loading : State
        data class Loaded(val repos: List<Repo>) : State
        data class Error(val error: String) : State
        object Empty : State
    }
}
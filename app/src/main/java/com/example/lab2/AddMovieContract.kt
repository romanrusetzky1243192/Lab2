package com.example.lab2

import com.example.mymovieapp.room.MovieEntity

class  AddMovieContract  {
    interface  PresenterInterface  {
        fun handleSearchRequest(query: String, year: String)
        fun handleAddMovie(movie: MovieEntity)
    }

    interface  ViewInterface  {
        fun  returnToMain ()
//        fun  displayMessage (message: String )
//        fun  displayError (message: String )


        fun showMovieDetails(movie: MovieEntity)
        fun showSearchError(message: String)
        fun showAddSuccess()
        fun openSearchScreen(query: String, year: String)

    }
}
Прямой binding используется в RecyclerView. Там очень специфически устанавливается viewHolder.

val movie = movies[position]
holder.binding.movie = movie

Обратный binding используется в activity_add.xml для добавления фильмов на главный экран.
В книге ошибка. Показывают пример которого нет в коде.
Там идет работа с AddViewModel.
Считываются значения полей и происходит обновление данных RecyclerView.

fun saveMovie() {
    if (canSaveMovie()) {
      repository.saveMovie(Movie(title = title.get(), releaseDate = releaseDate.get()))
      saveLiveData.postValue(true)
    } else {
      saveLiveData.postValue(false)
    }
  }

Из Layout добавления фильма считываются данные и заносятся в бд, после того как сработает слушатель изменения данных в LiveData.
Наблюдение за LiveData происходит в AddMovieActivity в методе - configureLiveDataObservers.

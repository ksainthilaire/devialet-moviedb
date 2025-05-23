package io.dvlt.domain.model

import com.google.gson.annotations.SerializedName

data class Movie(
    val id: Int? = null,

    @SerializedName("poster_path")
    val posterPath: String? = null,

    @SerializedName("adult")
    val adult: Boolean? = null,

    @SerializedName("overview")
    val overview: String? = null,

    @SerializedName("release_date")
    val releaseDate: String? = null,

    @SerializedName("genre_ids")
    val genreIds: List<Number>? = null,

    @SerializedName("original_title")
    val originalTitle: String? = null,

    @SerializedName("original_language")
    val originalLanguage: String? = null,

    val title: String? = null,

    @SerializedName("backdrop_path")
    val backdropPath: String? = null,

    @SerializedName("popularity")
    val popularity: Float? = null,

    @SerializedName("vote_count")
    val voteCount: Number? = null,

    @SerializedName("video")
    val video: Boolean? = null,

    @SerializedName("vote_average")
    val voteAverage: Number? = null
)


typealias MovieList = List<Movie>
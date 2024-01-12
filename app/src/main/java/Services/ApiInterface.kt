package Services

import com.example.recyclerviewapplication.Movies
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("top_rated?api_key=fccb8e3431b64fe12497180cd9ffd9bc")
    fun getMovies(): Call<Movies>
}
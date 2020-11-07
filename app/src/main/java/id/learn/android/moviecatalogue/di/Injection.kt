package id.learn.android.moviecatalogue.di

import id.learn.android.moviecatalogue.data.source.TmdbRepository
import id.learn.android.moviecatalogue.data.source.remote.RemoteDataSource
import id.learn.android.moviecatalogue.network.ApiClient

object Injection{
    fun provideRepository(retrofitClient: ApiClient): TmdbRepository{
        val remoteDataSource = RemoteDataSource.getInstance(retrofitClient)
        return TmdbRepository.getInstance(remoteDataSource)
    }
}
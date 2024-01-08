package com.heronet.sust.feature.campus.di

import android.app.Application
import androidx.room.Room
import com.heronet.sust.feature.campus.data.local.database.CampusDatabase
import com.heronet.sust.feature.campus.data.remote.CampusApi
import com.heronet.sust.feature.campus.data.remote.Constants
import com.heronet.sust.feature.campus.data.repository.CampusRepositoryImpl
import com.heronet.sust.feature.campus.domain.repository.CampusRepository
import com.heronet.sust.feature.campus.domain.usecase.AddSchoolEmployee
import com.heronet.sust.feature.campus.domain.usecase.CampusUseCases
import com.heronet.sust.feature.campus.domain.usecase.GetCenterEmployees
import com.heronet.sust.feature.campus.domain.usecase.GetCenters
import com.heronet.sust.feature.campus.domain.usecase.GetDepartments
import com.heronet.sust.feature.campus.domain.usecase.GetHalls
import com.heronet.sust.feature.campus.domain.usecase.GetOffices
import com.heronet.sust.feature.campus.domain.usecase.GetSchools
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CampusModule {
    @Provides
    @Singleton
    fun provideCampusDatabase(app: Application) =
        Room.databaseBuilder(
            app,
            CampusDatabase::class.java,
            CampusDatabase.DATABASE_NAME
        ).build()

    @Provides
    @Singleton
    fun provideCampusRepository(db: CampusDatabase, api: CampusApi): CampusRepository =
        CampusRepositoryImpl(db.campusDao, api)

    @Provides
    @Singleton
    fun provideCampusUseCases(repository: CampusRepository) = CampusUseCases(
        getSchools = GetSchools(repository),
        getDepartments = GetDepartments(repository),
        getCenterEmployees = GetCenterEmployees(repository),
        addSchoolEmployee = AddSchoolEmployee(repository),
        getHalls = GetHalls(repository),
        getOffices = GetOffices(repository),
        getCenters = GetCenters(repository)
    )

    @Provides
    @Singleton
    fun provideCampusApi(): CampusApi =
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create()
}
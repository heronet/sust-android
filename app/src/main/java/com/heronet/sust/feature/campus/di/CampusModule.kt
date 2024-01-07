package com.heronet.sust.feature.campus.di

import android.app.Application
import androidx.room.Room
import com.heronet.sust.feature.campus.data.local.database.CampusDatabase
import com.heronet.sust.feature.campus.data.repository.CampusRepositoryImpl
import com.heronet.sust.feature.campus.domain.repository.CampusRepository
import com.heronet.sust.feature.campus.usecase.AddDepartment
import com.heronet.sust.feature.campus.usecase.AddEmployee
import com.heronet.sust.feature.campus.usecase.CampusUseCases
import com.heronet.sust.feature.campus.usecase.GetDepartmentEmployees
import com.heronet.sust.feature.campus.usecase.GetDepartments
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
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
    fun provideCampusRepository(db: CampusDatabase): CampusRepository =
        CampusRepositoryImpl(db.campusDao)

    @Provides
    @Singleton
    fun provideCampusUseCases(repository: CampusRepository) = CampusUseCases(
        getDepartmentEmployees = GetDepartmentEmployees(repository),
        getDepartments = GetDepartments(repository),
        addDepartment = AddDepartment(repository),
        addEmployee = AddEmployee(repository)
    )
}
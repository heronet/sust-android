package com.heronet.sust.feature.campus.data.repository

import com.heronet.sust.feature.campus.data.local.database.CampusDao
import com.heronet.sust.feature.campus.data.remote.CampusApi
import com.heronet.sust.feature.campus.data.remote.dto.toEmployee
import com.heronet.sust.feature.campus.domain.model.Employee
import com.heronet.sust.feature.campus.domain.repository.CampusRepository
import com.heronet.sust.feature.campus.util.CampusCategory
import com.heronet.sust.feature.campus.util.Constants
import com.heronet.sust.feature.common.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class CampusRepositoryImpl @Inject constructor(
    private val dao: CampusDao,
    private val api: CampusApi
) : CampusRepository {
    override fun getSchools() = Constants.schools

    override fun getDepartments(school: String) =
        Constants.departments.filter { dept -> dept.school == school }

    override fun getEmployees(workplaceType: String, workplaceTitle: String): Flow<Resource<List<Employee>>> = flow {
        emit(Resource.Loading())
        val localEmployees = dao.getEmployees(workplaceTitle)
        emit(Resource.Loading(localEmployees))
        try {
            val employees =
                api.getEmployees(type = workplaceType, title = workplaceTitle).map { it.toEmployee() }
            emit(Resource.Success(employees))

            dao.deleteEmployees(workplaceTitle)
            dao.insertEmployees(employees)
        } catch (e: IOException) {
            emit(
                Resource.Error(
                    e.localizedMessage ?: "Couldn't reach server. Check your internet connection.",
                    data = localEmployees
                )
            )
        } catch (e: HttpException) {
            emit(
                Resource.Error(
                    e.localizedMessage ?: "An unexpected HTTP error occurred",
                    data = localEmployees
                )
            )
        } catch (e: Exception) {
            emit(
                Resource.Error(
                    e.localizedMessage ?: "An unexpected error occurred",
                    data = localEmployees
                )
            )
        }
    }

    override suspend fun addEmployee(employee: Employee) {
        dao.insertEmployee(employee)
    }


    override fun getHalls(): List<CampusCategory> = Constants.halls
    override fun getOffices(): List<CampusCategory> = Constants.offices
    override fun getCenters(): List<CampusCategory> = Constants.centers

}
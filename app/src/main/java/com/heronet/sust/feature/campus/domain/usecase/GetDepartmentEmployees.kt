package com.heronet.sust.feature.campus.domain.usecase

import com.heronet.sust.feature.campus.domain.model.Employee
import com.heronet.sust.feature.campus.domain.repository.CampusRepository
import com.heronet.sust.feature.common.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class GetDepartmentEmployees(
    private val repository: CampusRepository
) {
    operator fun invoke(title: String) : Flow<Resource<List<Employee>>> = flow {
        try {
            emit(Resource.Loading())
            val employees = repository.getDepartmentEmployees(title)
            emit(Resource.Success(employees))
        } catch (e: IOException) {
            emit(Resource.Error(e.localizedMessage ?: "Couldn't reach server. Check your internet connection."))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected HTTP error occurred"))
        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        }
    }
}
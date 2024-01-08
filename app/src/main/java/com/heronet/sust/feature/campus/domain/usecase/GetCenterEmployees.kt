package com.heronet.sust.feature.campus.domain.usecase

import com.heronet.sust.feature.campus.domain.model.CenterEmployee
import com.heronet.sust.feature.campus.domain.repository.CampusRepository
import com.heronet.sust.feature.common.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class GetCenterEmployees(
    private val repository: CampusRepository
) {
    operator fun invoke(centerName: String): Flow<Resource<List<CenterEmployee>>> = flow {
        try {
            emit(Resource.Loading())
            val employees = repository.getCenterEmployees(centerName)
            emit(Resource.Success(employees))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}
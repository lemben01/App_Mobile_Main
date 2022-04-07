package ca.qc.cstj.s08bottomnavigation.data.repositories

import ca.qc.cstj.s08bottomnavigation.core.Constants
import ca.qc.cstj.s08bottomnavigation.core.LoadingResource
import ca.qc.cstj.s08bottomnavigation.domain.models.Meteo
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception
//import ca.qc.cstj.s08bottomnavigation.data.datasources.

class MeteoRepository {

    private val meteoDataSource = MeteoDataSource()

    fun retrieve(cityName : String) : Flow<LoadingResource<Meteo>> {
        return flow {
            while (true){
                try {
                    emit(LoadingResource.Loading())
                    emit(LoadingResource.Success(meteoDataSource.retrieve(cityName)))
                } catch (ex:Exception){
                    emit(LoadingResource.Error(ex, ex.message))

                }
                delay(Constants.METO_REFRESH_INTERVAL)
            }
        }
    }
}
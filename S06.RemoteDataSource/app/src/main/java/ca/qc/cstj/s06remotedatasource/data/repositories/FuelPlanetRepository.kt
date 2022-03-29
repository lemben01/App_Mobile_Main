package ca.qc.cstj.s06remotedatasource.data.repositories

import ca.qc.cstj.s06remotedatasource.core.Resource
import ca.qc.cstj.s06remotedatasource.data.datasources.FuelPlanetDataSource
import ca.qc.cstj.s06remotedatasource.domain.models.Planet
import java.lang.Exception

class FuelPlanetRepository {

    private val planetDataSource = FuelPlanetDataSource()

    suspend fun retrieveAll(): Resource<List<Planet>> {
        //Appel la datasource
        return try {
            Resource.Success(planetDataSource.retrieveAll())
        } catch (ex: Exception) {
            Resource.Error(ex, "Serveur Error")
        }
    }

}
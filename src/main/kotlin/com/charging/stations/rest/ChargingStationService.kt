package com.charging.stations.rest

import com.charging.stations.response.AggregatedResponse
import com.charging.stations.response.ChargingStationsResponse

interface ChargingStationService {
    fun getChargingStationDetails(city : String): AggregatedResponse?
}
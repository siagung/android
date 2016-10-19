package com.mapzen.places;

import com.mapzen.android.lost.api.LostApiClient;
import com.mapzen.android.lost.api.PendingResult;

/**
 * Main entry point for the Mapzen Places Geo Data API.
 */
public interface GeoDataApi {

  /**
   * Returns an object which can be used to retrieve autocomplete results.
   * @param client
   * @param query
   * @param bounds
   * @param filter
   * @return
   */
  PendingResult<AutocompletePredictionBuffer> getAutocompletePredictions(LostApiClient client,
      String query, LatLngBounds bounds, AutocompleteFilter filter);
}

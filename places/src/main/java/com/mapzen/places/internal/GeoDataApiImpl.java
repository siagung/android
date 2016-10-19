package com.mapzen.places.internal;

import com.mapzen.android.lost.api.LostApiClient;
import com.mapzen.android.lost.api.PendingResult;
import com.mapzen.pelias.Pelias;
import com.mapzen.places.AutocompleteFilter;
import com.mapzen.places.AutocompletePredictionBuffer;
import com.mapzen.places.GeoDataApi;
import com.mapzen.places.LatLngBounds;

/**
 * {@link GeoDataApi} implementation for {@link com.mapzen.places.Places}.
 */
public class GeoDataApiImpl implements GeoDataApi {

  private Pelias pelias = new Pelias();

  @Override public PendingResult<AutocompletePredictionBuffer> getAutocompletePredictions(
      LostApiClient client, String query, LatLngBounds bounds, AutocompleteFilter filter) {
    return new AutocompletePendingResult(pelias, query, bounds, filter);
  }
}

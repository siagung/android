package com.mapzen.places.internal;

import com.mapzen.android.lost.api.PendingResult;
import com.mapzen.places.AutocompletePredictionBuffer;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeoDataApiImplTest {

  GeoDataApiImpl geoDataApi = new GeoDataApiImpl();

  @Test public void getAutocompletePredictions_shouldReturnAutocompletePendingResult() {
    PendingResult<AutocompletePredictionBuffer> result =
        geoDataApi.getAutocompletePredictions(null, null, null, null);
    assertThat(result).isInstanceOf(AutocompletePendingResult.class);
  }
}

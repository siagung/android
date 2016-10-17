package com.mapzen.places;

import com.mapzen.places.internal.GeoDataApiImpl;

/**
 * Main entry point for Mapzen Places API.
 */
public class Places {
  public static final GeoDataApi GeoDataApi = new GeoDataApiImpl();
}

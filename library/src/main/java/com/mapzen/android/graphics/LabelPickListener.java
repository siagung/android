package com.mapzen.android.graphics;

import com.mapzen.tangram.LngLat;

import java.util.Map;

/**
 * Interface invoked when a feature on the map containing a label is clicked.
 */
public interface LabelPickListener {
    void onLabelPick(Map<String, String> properties, LngLat location, float positionX, float positionY);
}

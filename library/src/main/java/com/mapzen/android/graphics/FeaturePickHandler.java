package com.mapzen.android.graphics;

import com.mapzen.tangram.MapController;
import com.mapzen.tangram.TouchLabel;

import java.util.List;
import java.util.Map;

public class FeaturePickHandler implements MapController.FeaturePickListener {

    private MapView mapView;
    private LabelPickListener labelPickListener;
    private FeaturePickListener featurePickListener;

    public FeaturePickHandler(MapView mapView) {
        this.mapView = mapView;
    }

    @Override
    public void onFeaturePick(Map<String, String> properties, List<TouchLabel> labels,
                              float positionX, float positionY) {
        TouchLabel label = null;
        if (labels != null && labels.size() > 0) {
            label = labels.get(0);
        }
        postFeaturePickRunnable(properties, label, positionX, positionY);
    }

    public void setLabelPickListener(LabelPickListener labelPickListener) {
        this.labelPickListener = labelPickListener;
    }

    public void setFeaturePickListener(FeaturePickListener featurePickListener) {
        this.featurePickListener = featurePickListener;
    }

    private void postFeaturePickRunnable(final Map<String, String> properties,
                                         final TouchLabel label, final float positionX,
                                         final float positionY) {
        mapView.post(new Runnable() {
            @Override public void run() {
                if (label != null && labelPickListener != null) {
                    labelPickListener.onLabelPick(properties, label.getCoordinates().get(0),
                            positionX, positionY);
                } else if (featurePickListener != null) {
                    featurePickListener.onFeaturePick(properties, positionX, positionY);
                }
            }
        });
    }
}

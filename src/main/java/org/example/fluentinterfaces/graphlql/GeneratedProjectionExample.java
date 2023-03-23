package org.example.fluentinterfaces.graphlql;

import org.example.fluentinterfaces.graphlql.model.ProductResponseProjection;

public final class GeneratedProjectionExample {

    private GeneratedProjectionExample() {
    }

    public static ProductResponseProjection getEanProjection() {

        return new ProductResponseProjection()
                .categoryId()
                .categoryName()
                .issuingCountry();
    }
}

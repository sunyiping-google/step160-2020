package com.google.sps.servlets;

/**
 * Feeling intensities on the PANAS emotional survey.
 *
 * https://www.brandeis.edu/roybal/docs/PANAS-GEN_website_PDF.pdf
 */
public enum PanasIntensity {
    NOT_AT_ALL(0),
    VERY_SLIGHTLY(1),
    A_LITTLE(2),
    MODERATELY(3),
    QUITE_A_BIT(4),
    EXTREMELY(5);

    private final int value;

    private PanasIntensity(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

package com.lab7;

public interface ITRules {
    double TAX_SLAB_1 = 10000;
    double TAX_RATE_1 = 3;
    double TAX_SLAB_2 = 30000;
    double TAX_RATE_2 = 3;
    double TAX_SLAB_3 = 75000;
    double TAX_RATE_3 = 3;
    double TAX_SLAB_4 = 100000;
    double TAX_RATE_4 = 3;
    double calculateTax(double taxableIncome);
}

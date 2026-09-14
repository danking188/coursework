  public static double sphere(double d) {
        if (!Double.isFinite(d) || d < 0) {
            throw new IllegalArgumentException("Diameter must be finite and non-negative");
        }
        double radius = d / 2;
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

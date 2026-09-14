public static int[] average_grades(int[][] grades, int[] weights) {
    if (grades == null || weights == null || weights.length == 0) {
        throw new IllegalArgumentException("Grades and non-empty weights are required");
    }
    long totalWeight = 0;
    for (int weight : weights) {
        if (weight < 0) throw new IllegalArgumentException("Weights must be non-negative");
        totalWeight += weight;
    }
    if (totalWeight != 100) throw new IllegalArgumentException("Weights must sum to 100");
    int[] averages = new int[grades.length];
    for (int i = 0; i < grades.length; i++) {
        if (grades[i] == null || grades[i].length != weights.length) {
            throw new IllegalArgumentException("Each student must have one grade per weight");
        }
        long sum = 0;
        for (int j = 0; j < weights.length; j++) {
            if (grades[i][j] < 0 || grades[i][j] > 100) {
                throw new IllegalArgumentException("Grades must be between 0 and 100");
            }
            sum += (long) grades[i][j] * weights[j];
        }
        averages[i] = (int) (sum / 100); // Non-negative integer division rounds down.
    }
    return averages;
}
